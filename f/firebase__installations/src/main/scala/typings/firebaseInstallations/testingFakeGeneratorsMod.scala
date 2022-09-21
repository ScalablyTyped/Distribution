package typings.firebaseInstallations

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseInstallations.anon.PartialAppConfig
import typings.firebaseInstallations.interfacesInstallationImplMod.AppConfig
import typings.firebaseInstallations.interfacesInstallationImplMod.FirebaseInstallationsImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingFakeGeneratorsMod {
  
  @JSImport("@firebase/installations/dist/src/testing/fake-generators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")().asInstanceOf[FirebaseApp]
  
  inline def getFakeAppConfig(): AppConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeAppConfig")().asInstanceOf[AppConfig]
  inline def getFakeAppConfig(customValues: PartialAppConfig): AppConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeAppConfig")(customValues.asInstanceOf[js.Any]).asInstanceOf[AppConfig]
  
  inline def getFakeInstallations(): FirebaseInstallationsImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")().asInstanceOf[FirebaseInstallationsImpl]
}
