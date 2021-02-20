package typings.firebaseInstallations

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallations.anon.PartialAppConfig
import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fakeGeneratorsMod {
  
  @JSImport("@firebase/installations/dist/src/testing/fake-generators", "getFakeApp")
  @js.native
  def getFakeApp(): FirebaseApp = js.native
  
  @JSImport("@firebase/installations/dist/src/testing/fake-generators", "getFakeAppConfig")
  @js.native
  def getFakeAppConfig(): AppConfig = js.native
  @JSImport("@firebase/installations/dist/src/testing/fake-generators", "getFakeAppConfig")
  @js.native
  def getFakeAppConfig(customValues: PartialAppConfig): AppConfig = js.native
  
  @JSImport("@firebase/installations/dist/src/testing/fake-generators", "getFakeDependencies")
  @js.native
  def getFakeDependencies(): FirebaseDependencies = js.native
}
