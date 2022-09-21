package typings.firebaseFirestoreCompat

import typings.firebaseAppTypes.mod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexRnMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/index.rn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerFirestore(instance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFirestore")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
