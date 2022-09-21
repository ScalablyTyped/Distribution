package typings.firebaseFirestoreCompat

import typings.firebaseAppTypes.mod.FirebaseNamespace
import typings.firebaseFirestore.mod.Firestore
import typings.firebaseFirestoreCompat.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureForFirebase(
    firebase: FirebaseNamespace,
    firestoreFactory: js.Function2[
      /* app */ FirebaseApp, 
      /* firestoreExp */ Firestore, 
      typings.firebaseFirestoreCompat.databaseMod.Firestore
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureForFirebase")(firebase.asInstanceOf[js.Any], firestoreFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
