package typings.firebaseFirestoreCompat

import typings.firebaseFirestoreCompat.anon.Blob
import typings.firebaseFirestoreTypes.mod.FirebaseFirestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appCompatMod {
  
  trait FirebaseApp extends StObject {
    
    var firestore: js.UndefOr[js.Function0[FirebaseFirestore]] = js.undefined
  }
  object FirebaseApp {
    
    inline def apply(): FirebaseApp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setFirestore(value: () => FirebaseFirestore): Self = StObject.set(x, "firestore", js.Any.fromFunction0(value))
      
      inline def setFirestoreUndefined: Self = StObject.set(x, "firestore", js.undefined)
    }
  }
  
  trait FirebaseNamespace extends StObject {
    
    def firestore(): FirebaseFirestore
    def firestore(app: FirebaseApp): FirebaseFirestore
    def firestore(app: typings.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp): FirebaseFirestore
    @JSName("firestore")
    var firestore_Original: Blob
  }
  object FirebaseNamespace {
    
    inline def apply(firestore: Blob): FirebaseNamespace = {
      val __obj = js.Dynamic.literal(firestore = firestore.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    extension [Self <: FirebaseNamespace](x: Self) {
      
      inline def setFirestore(value: Blob): Self = StObject.set(x, "firestore", value.asInstanceOf[js.Any])
    }
  }
}
