package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseComponentAugmentingMod {
  
  @js.native
  trait NameServiceMapping extends StObject {
    
    var firestore: FirebaseFirestore = js.native
  }
  object NameServiceMapping {
    
    @scala.inline
    def apply(firestore: FirebaseFirestore): NameServiceMapping = {
      val __obj = js.Dynamic.literal(firestore = firestore.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    @scala.inline
    implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirestore(value: FirebaseFirestore): Self = StObject.set(x, "firestore", value.asInstanceOf[js.Any])
    }
  }
}
