package typings.firebaseApp

import typings.firebaseAppTypes.mod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseNamespaceMod {
  
  @JSImport("@firebase/app/dist/packages/app/src/firebaseNamespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFirebaseNamespace(): FirebaseNamespace = ^.asInstanceOf[js.Dynamic].applyDynamic("createFirebaseNamespace")().asInstanceOf[FirebaseNamespace]
  
  @JSImport("@firebase/app/dist/packages/app/src/firebaseNamespace", "firebase")
  @js.native
  val firebase: FirebaseNamespace = js.native
}
