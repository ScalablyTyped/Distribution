package typings.firebaseInstallations

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallations.anon.PartialAppConfig
import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fakeGeneratorsMod {
  
  @JSImport("@firebase/installations/dist/src/testing/fake-generators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")().asInstanceOf[FirebaseApp]
  
  inline def getFakeAppConfig(): AppConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeAppConfig")().asInstanceOf[AppConfig]
  inline def getFakeAppConfig(customValues: PartialAppConfig): AppConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeAppConfig")(customValues.asInstanceOf[js.Any]).asInstanceOf[AppConfig]
  
  inline def getFakeDependencies(): FirebaseDependencies = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeDependencies")().asInstanceOf[FirebaseDependencies]
}
