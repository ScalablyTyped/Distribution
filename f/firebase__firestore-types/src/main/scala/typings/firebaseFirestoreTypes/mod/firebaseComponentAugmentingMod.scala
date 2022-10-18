package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object firebaseComponentAugmentingMod {
  
  trait NameServiceMapping extends StObject {
    
    var `firestore-compat`: FirebaseFirestore
  }
  object NameServiceMapping {
    
    inline def apply(`firestore-compat`: FirebaseFirestore): NameServiceMapping = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("firestore-compat")(`firestore-compat`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    extension [Self <: NameServiceMapping](x: Self) {
      
      inline def `setFirestore-compat`(value: FirebaseFirestore): Self = StObject.set(x, "firestore-compat", value.asInstanceOf[js.Any])
    }
  }
}
