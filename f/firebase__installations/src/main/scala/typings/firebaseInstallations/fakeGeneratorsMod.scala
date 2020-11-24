package typings.firebaseInstallations

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallations.anon.PartialAppConfig
import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/installations/dist/src/testing/fake-generators", JSImport.Namespace)
@js.native
object fakeGeneratorsMod extends js.Object {
  
  def getFakeApp(): FirebaseApp = js.native
  
  def getFakeAppConfig(): AppConfig = js.native
  def getFakeAppConfig(customValues: PartialAppConfig): AppConfig = js.native
  
  def getFakeDependencies(): FirebaseDependencies = js.native
}
