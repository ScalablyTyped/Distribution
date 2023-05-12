package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcApiMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("facebook-nodejs-business-sdk", "FacebookAdsApi")
@js.native
open class FacebookAdsApi protected () extends default {
  def this(accessToken: String) = this()
  def this(accessToken: String, locale: String) = this()
  def this(accessToken: String, locale: String, crash_log: Boolean) = this()
  def this(accessToken: String, locale: Unit, crash_log: Boolean) = this()
}
/* static members */
object FacebookAdsApi {
  
  @JSImport("facebook-nodejs-business-sdk", "FacebookAdsApi")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("facebook-nodejs-business-sdk", "FacebookAdsApi._defaultApi")
  @js.native
  def _defaultApi: typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi = js.native
  inline def _defaultApi_=(x: typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultApi")(x.asInstanceOf[js.Any])
  
  inline def _encodeParams(params: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_encodeParams")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDefaultApi(): typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultApi")().asInstanceOf[typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi]
  
  inline def init(accessToken: String): typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi]
  inline def init(accessToken: String, locale: String): typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(accessToken.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi]
  inline def init(accessToken: String, locale: String, crash_log: Boolean): typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(accessToken.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], crash_log.asInstanceOf[js.Any])).asInstanceOf[typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi]
  inline def init(accessToken: String, locale: Unit, crash_log: Boolean): typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(accessToken.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], crash_log.asInstanceOf[js.Any])).asInstanceOf[typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi]
  
  inline def setDefaultApi(api: typings.facebookNodejsBusinessSdk.srcApiMod.FacebookAdsApi): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultApi")(api.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
