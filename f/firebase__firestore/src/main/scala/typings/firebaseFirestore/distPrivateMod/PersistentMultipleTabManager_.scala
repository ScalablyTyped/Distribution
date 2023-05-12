package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.PersistentMultipleTab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentMultipleTabManager_
  extends StObject
     with PersistentTabManager {
  
  var kind: PersistentMultipleTab
}
object PersistentMultipleTabManager_ {
  
  inline def apply(): PersistentMultipleTabManager_ = {
    val __obj = js.Dynamic.literal(kind = "PersistentMultipleTab")
    __obj.asInstanceOf[PersistentMultipleTabManager_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentMultipleTabManager_] (val x: Self) extends AnyVal {
    
    inline def setKind(value: PersistentMultipleTab): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
