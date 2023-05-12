package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.distSrcFactoryMod.AppCheckService
import typings.firebaseAppCheck.distSrcPublicTypesMod.AppCheckTokenListener
import typings.firebaseAppCheck.distSrcTypesMod.AppCheckTokenInternal
import typings.firebaseAppCheck.distSrcTypesMod.AppCheckTokenResult
import typings.firebaseAppCheck.distSrcTypesMod.ListenerType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcInternalApiMod {
  
  @JSImport("@firebase/app-check/dist/src/internal-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTokenListener(appCheck: AppCheckService, `type`: ListenerType, listener: AppCheckTokenListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTokenListener")(appCheck.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTokenListener(
    appCheck: AppCheckService,
    `type`: ListenerType,
    listener: AppCheckTokenListener,
    onError: js.Function1[/* error */ js.Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTokenListener")(appCheck.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object defaultTokenErrorData {
    
    @JSImport("@firebase/app-check/dist/src/internal-api", "defaultTokenErrorData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/app-check/dist/src/internal-api", "defaultTokenErrorData.error")
    @js.native
    def error: String = js.native
    inline def error_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
  }
  
  inline def formatDummyToken(tokenErrorData: Record[String, String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDummyToken")(tokenErrorData.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getLimitedUseToken(appCheck: AppCheckService): js.Promise[AppCheckTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLimitedUseToken")(appCheck.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AppCheckTokenResult]]
  
  inline def getToken(appCheck: AppCheckService): js.Promise[AppCheckTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(appCheck.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AppCheckTokenResult]]
  inline def getToken(appCheck: AppCheckService, forceRefresh: Boolean): js.Promise[AppCheckTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(appCheck.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AppCheckTokenResult]]
  
  inline def isValid(token: AppCheckTokenInternal): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def notifyTokenListeners(app: FirebaseApp, token: AppCheckTokenResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifyTokenListeners")(app.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeTokenListener(app: FirebaseApp, listener: AppCheckTokenListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTokenListener")(app.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
