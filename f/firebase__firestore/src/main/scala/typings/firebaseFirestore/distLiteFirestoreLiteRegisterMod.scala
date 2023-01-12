package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreLiteRegisterMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerFirestore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFirestore")().asInstanceOf[Unit]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      @JSName("firestore/lite")
      var firestoreSlashlite: Firestore
    }
    object NameServiceMapping {
      
      inline def apply(firestoreSlashlite: Firestore): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("firestore/lite")(firestoreSlashlite.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        inline def setFirestoreSlashlite(value: Firestore): Self = StObject.set(x, "firestore/lite", value.asInstanceOf[js.Any])
      }
    }
  }
}
