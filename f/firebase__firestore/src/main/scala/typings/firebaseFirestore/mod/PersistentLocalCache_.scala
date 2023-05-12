package typings.firebaseFirestore.mod

import typings.firebaseFirestore.firebaseFirestoreStrings.persistent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentLocalCache_
  extends StObject
     with FirestoreLocalCache {
  
  var kind: persistent
}
object PersistentLocalCache_ {
  
  inline def apply(): PersistentLocalCache_ = {
    val __obj = js.Dynamic.literal(kind = "persistent")
    __obj.asInstanceOf[PersistentLocalCache_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentLocalCache_] (val x: Self) extends AnyVal {
    
    inline def setKind(value: persistent): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
