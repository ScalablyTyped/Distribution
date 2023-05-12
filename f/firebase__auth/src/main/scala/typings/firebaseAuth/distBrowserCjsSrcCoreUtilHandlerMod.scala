package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distBrowserCjsSrcModelPopupRedirectMod.AuthEventType
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.AuthProvider
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcCoreUtilHandlerMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/core/util/handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRedirectUrl(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getRedirectUrl(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType, redirectUrl: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: String,
    eventId: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: String,
    eventId: String,
    additionalParams: Record[String, String]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: String,
    eventId: Unit,
    additionalParams: Record[String, String]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: Unit,
    eventId: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: Unit,
    eventId: String,
    additionalParams: Record[String, String]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: Unit,
    eventId: Unit,
    additionalParams: Record[String, String]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
