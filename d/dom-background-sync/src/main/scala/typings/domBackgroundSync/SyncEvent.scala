package typings.domBackgroundSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://wicg.github.io/background-sync/spec/#syncevent
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent * / any */ trait SyncEvent extends StObject {
  
  val lastChance: Boolean
  
  val tag: String
}
object SyncEvent {
  
  inline def apply(lastChance: Boolean, tag: String): SyncEvent = {
    val __obj = js.Dynamic.literal(lastChance = lastChance.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEvent]
  }
  
  extension [Self <: SyncEvent](x: Self) {
    
    inline def setLastChance(value: Boolean): Self = StObject.set(x, "lastChance", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
