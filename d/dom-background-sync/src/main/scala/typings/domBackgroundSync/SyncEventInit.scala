package typings.domBackgroundSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEventInit * / any */ trait SyncEventInit extends StObject {
  
  var lastChance: js.UndefOr[Boolean] = js.undefined
  
  var tag: String
}
object SyncEventInit {
  
  inline def apply(tag: String): SyncEventInit = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventInit]
  }
  
  extension [Self <: SyncEventInit](x: Self) {
    
    inline def setLastChance(value: Boolean): Self = StObject.set(x, "lastChance", value.asInstanceOf[js.Any])
    
    inline def setLastChanceUndefined: Self = StObject.set(x, "lastChance", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
