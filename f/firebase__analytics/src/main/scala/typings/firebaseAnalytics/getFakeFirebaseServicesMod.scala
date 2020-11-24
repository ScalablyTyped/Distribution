package typings.firebaseAnalytics

import typings.firebaseAnalytics.anon.ApiKey
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", JSImport.Namespace)
@js.native
object getFakeFirebaseServicesMod extends js.Object {
  
  def getFakeApp(): FirebaseApp = js.native
  def getFakeApp(fakeAppParams: ApiKey): FirebaseApp = js.native
  
  def getFakeInstallations(): FirebaseInstallations = js.native
  def getFakeInstallations(fid: js.UndefOr[scala.Nothing], onFidResolve: js.Function): FirebaseInstallations = js.native
  def getFakeInstallations(fid: String): FirebaseInstallations = js.native
  def getFakeInstallations(fid: String, onFidResolve: js.Function): FirebaseInstallations = js.native
}
