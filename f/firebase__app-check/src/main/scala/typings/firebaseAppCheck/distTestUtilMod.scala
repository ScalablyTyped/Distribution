package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.distSrcMod.CustomProvider
import typings.firebaseAppCheck.srcPublicTypesMod.AppCheck
import typings.firebaseAppCheck.srcRecaptchaMod.GreCAPTCHA
import typings.firebaseAppCheck.srcRecaptchaMod.GreCAPTCHATopLevel
import typings.std.HTMLScriptElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestUtilMod {
  
  @JSImport("@firebase/app-check/dist/test/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app-check/dist/test/util", "FAKE_SITE_KEY")
  @js.native
  val FAKE_SITE_KEY: /* "fake-site-key" */ String = js.native
  
  inline def findgreCAPTCHAScriptsOnPage(): js.Array[HTMLScriptElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("findgreCAPTCHAScriptsOnPage")().asInstanceOf[js.Array[HTMLScriptElement]]
  
  inline def getFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")().asInstanceOf[FirebaseApp]
  inline def getFakeApp(overrides: Record[String, Any]): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")(overrides.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  inline def getFakeAppCheck(app: FirebaseApp): AppCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeAppCheck")(app.asInstanceOf[js.Any]).asInstanceOf[AppCheck]
  
  inline def getFakeCustomTokenProvider(): CustomProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeCustomTokenProvider")().asInstanceOf[CustomProvider]
  
  inline def getFakeGreCAPTCHA(): GreCAPTCHATopLevel | GreCAPTCHA = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeGreCAPTCHA")().asInstanceOf[GreCAPTCHATopLevel | GreCAPTCHA]
  inline def getFakeGreCAPTCHA(isTopLevel: Boolean): GreCAPTCHATopLevel | GreCAPTCHA = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeGreCAPTCHA")(isTopLevel.asInstanceOf[js.Any]).asInstanceOf[GreCAPTCHATopLevel | GreCAPTCHA]
  
  inline def getFakeHeartbeatServiceProvider(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeHeartbeatServiceProvider")().asInstanceOf[Any]
  inline def getFakeHeartbeatServiceProvider(fakeLogString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeHeartbeatServiceProvider")(fakeLogString.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getFullApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullApp")().asInstanceOf[FirebaseApp]
  
  inline def removegreCAPTCHAScriptsOnPage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removegreCAPTCHAScriptsOnPage")().asInstanceOf[Unit]
}
