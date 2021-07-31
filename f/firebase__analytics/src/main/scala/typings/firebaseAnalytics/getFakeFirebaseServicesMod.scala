package typings.firebaseAnalytics

import typings.firebaseAnalytics.anon.ApiKey
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFakeFirebaseServicesMod {
  
  @JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")().asInstanceOf[FirebaseApp]
  @scala.inline
  def getFakeApp(fakeAppParams: ApiKey): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")(fakeAppParams.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  @scala.inline
  def getFakeInstallations(): FirebaseInstallations = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")().asInstanceOf[FirebaseInstallations]
  @scala.inline
  def getFakeInstallations(fid: String): FirebaseInstallations = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")(fid.asInstanceOf[js.Any]).asInstanceOf[FirebaseInstallations]
  @scala.inline
  def getFakeInstallations(fid: String, onFidResolve: js.Function): FirebaseInstallations = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")(fid.asInstanceOf[js.Any], onFidResolve.asInstanceOf[js.Any])).asInstanceOf[FirebaseInstallations]
  @scala.inline
  def getFakeInstallations(fid: Unit, onFidResolve: js.Function): FirebaseInstallations = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")(fid.asInstanceOf[js.Any], onFidResolve.asInstanceOf[js.Any])).asInstanceOf[FirebaseInstallations]
}
