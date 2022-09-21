package typings.firebaseMessaging

import typings.firebaseApp.mod.FirebaseOptions
import typings.firebaseMessaging.interfacesInternalDependenciesMod.FirebaseInternalDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fakesFirebaseDependenciesMod {
  
  @JSImport("@firebase/messaging/dist/src/testing/fakes/firebase-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFakeAnalyticsProvider(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeAnalyticsProvider")().asInstanceOf[Any]
  
  inline def getFakeApp(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")().asInstanceOf[Any]
  inline def getFakeApp(options: FirebaseOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getFakeFirebaseDependencies(): FirebaseInternalDependencies = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeFirebaseDependencies")().asInstanceOf[FirebaseInternalDependencies]
  inline def getFakeFirebaseDependencies(options: FirebaseOptions): FirebaseInternalDependencies = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeFirebaseDependencies")(options.asInstanceOf[js.Any]).asInstanceOf[FirebaseInternalDependencies]
  
  inline def getFakeInstallations(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")().asInstanceOf[Any]
}
