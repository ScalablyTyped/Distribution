package typings.atFirebaseApp

import org.scalablytyped.runtime.Instantiable3
import typings.atFirebaseApp.distAppSrcFirebaseAppMod.FirebaseAppImpl
import typings.atFirebaseApp.distAppSrcLiteFirebaseAppLiteMod.FirebaseAppLiteImpl
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseAppConfig
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseNamespace
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseOptions
import typings.atFirebaseAppDashTypes.privateMod._FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/app/dist/app/src/firebaseNamespaceCore", JSImport.Namespace)
@js.native
object distAppSrcFirebaseNamespaceCoreMod extends js.Object {
  def createFirebaseNamespaceCore(
    firebaseAppImpl: Instantiable3[
      /* options */ FirebaseOptions, 
      /* config */ FirebaseAppConfig, 
      /* firebase_ */ _FirebaseNamespace, 
      FirebaseAppImpl | FirebaseAppLiteImpl
    ]
  ): FirebaseNamespace = js.native
}

