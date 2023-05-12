package typings.firebaseStorageTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object firebaseComponentAugmentingMod {
  
  trait NameServiceMapping extends StObject {
    
    var `storage-compat`: FirebaseStorage
  }
  object NameServiceMapping {
    
    inline def apply(`storage-compat`: FirebaseStorage): NameServiceMapping = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("storage-compat")(`storage-compat`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
      
      inline def `setStorage-compat`(value: FirebaseStorage): Self = StObject.set(x, "storage-compat", value.asInstanceOf[js.Any])
    }
  }
}
