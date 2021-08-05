package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseComponentAugmentingMod {
  
  trait NameServiceMapping extends StObject {
    
    var firestore: FirebaseFirestore
  }
  object NameServiceMapping {
    
    inline def apply(firestore: FirebaseFirestore): NameServiceMapping = {
      val __obj = js.Dynamic.literal(firestore = firestore.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    extension [Self <: NameServiceMapping](x: Self) {
      
      inline def setFirestore(value: FirebaseFirestore): Self = StObject.set(x, "firestore", value.asInstanceOf[js.Any])
    }
  }
}
