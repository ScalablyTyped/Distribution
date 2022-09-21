package typings.firebaseFirestore

import typings.firebaseFirestore.liteApiDatabaseMod.Firestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagesFirestoreLiteRegisterMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/lite/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerFirestore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFirestore")().asInstanceOf[Unit]
  
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
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setFirestoreSlashlite(value: Firestore): Self = StObject.set(x, "firestore/lite", value.asInstanceOf[js.Any])
      }
    }
  }
}
