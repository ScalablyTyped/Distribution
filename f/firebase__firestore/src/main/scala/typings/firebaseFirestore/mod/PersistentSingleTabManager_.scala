package typings.firebaseFirestore.mod

import typings.firebaseFirestore.firebaseFirestoreStrings.persistentSingleTab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentSingleTabManager_
  extends StObject
     with PersistentTabManager {
  
  var kind: persistentSingleTab
}
object PersistentSingleTabManager_ {
  
  inline def apply(): PersistentSingleTabManager_ = {
    val __obj = js.Dynamic.literal(kind = "persistentSingleTab")
    __obj.asInstanceOf[PersistentSingleTabManager_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentSingleTabManager_] (val x: Self) extends AnyVal {
    
    inline def setKind(value: persistentSingleTab): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
