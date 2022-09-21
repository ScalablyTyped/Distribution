package typings.firebaseAppCompat

import typings.firebaseAppCompat.srcPublicTypesMod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFirebaseNamespaceMod {
  
  @JSImport("@firebase/app-compat/dist/src/firebaseNamespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFirebaseNamespace(): FirebaseNamespace = ^.asInstanceOf[js.Dynamic].applyDynamic("createFirebaseNamespace")().asInstanceOf[FirebaseNamespace]
  
  @JSImport("@firebase/app-compat/dist/src/firebaseNamespace", "firebase")
  @js.native
  val firebase: FirebaseNamespace = js.native
}
