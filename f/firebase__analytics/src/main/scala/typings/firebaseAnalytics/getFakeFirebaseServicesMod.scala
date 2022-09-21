package typings.firebaseAnalytics

import typings.firebaseAnalytics.anon.ApiKey
import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFakeFirebaseServicesMod {
  
  @JSImport("@firebase/analytics/dist/esm/testing/get-fake-firebase-services", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")().asInstanceOf[FirebaseApp]
  inline def getFakeApp(fakeAppParams: ApiKey): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")(fakeAppParams.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  inline def getFakeInstallations(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")().asInstanceOf[Any]
  inline def getFakeInstallations(fid: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")(fid.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getFakeInstallations(fid: String, onFidResolve: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")(fid.asInstanceOf[js.Any], onFidResolve.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getFakeInstallations(fid: Unit, onFidResolve: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")(fid.asInstanceOf[js.Any], onFidResolve.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getFullApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullApp")().asInstanceOf[FirebaseApp]
  inline def getFullApp(fakeAppParams: ApiKey): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullApp")(fakeAppParams.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
}
