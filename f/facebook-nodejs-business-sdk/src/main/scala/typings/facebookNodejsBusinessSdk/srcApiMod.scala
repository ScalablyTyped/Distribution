package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcApiMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/api", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FacebookAdsApi {
    def this(accessToken: String) = this()
    def this(accessToken: String, locale: String) = this()
    def this(accessToken: String, locale: String, crash_log: Boolean) = this()
    def this(accessToken: String, locale: Unit, crash_log: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("facebook-nodejs-business-sdk/src/api", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("facebook-nodejs-business-sdk/src/api", "default._defaultApi")
    @js.native
    def _defaultApi: FacebookAdsApi = js.native
    inline def _defaultApi_=(x: FacebookAdsApi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultApi")(x.asInstanceOf[js.Any])
    
    inline def _encodeParams(params: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_encodeParams")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getDefaultApi(): FacebookAdsApi = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultApi")().asInstanceOf[FacebookAdsApi]
    
    inline def init(accessToken: String): FacebookAdsApi = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(accessToken.asInstanceOf[js.Any]).asInstanceOf[FacebookAdsApi]
    inline def init(accessToken: String, locale: String): FacebookAdsApi = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(accessToken.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[FacebookAdsApi]
    inline def init(accessToken: String, locale: String, crash_log: Boolean): FacebookAdsApi = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(accessToken.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], crash_log.asInstanceOf[js.Any])).asInstanceOf[FacebookAdsApi]
    inline def init(accessToken: String, locale: Unit, crash_log: Boolean): FacebookAdsApi = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(accessToken.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], crash_log.asInstanceOf[js.Any])).asInstanceOf[FacebookAdsApi]
    
    inline def setDefaultApi(api: FacebookAdsApi): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultApi")(api.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait FacebookAdsApi extends StObject {
    
    var _debug: Boolean = js.native
    
    var _showHeader: Boolean = js.native
    
    var accessToken: String = js.native
    
    def call(method: String, path: String): js.Promise[Any] = js.native
    def call(method: String, path: String, params: Unit, files: Unit, useMultipartFormData: Boolean): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Unit,
      files: Unit,
      useMultipartFormData: Boolean,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Unit,
      files: Unit,
      useMultipartFormData: Unit,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(method: String, path: String, params: Unit, files: Record[String, Any]): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Unit,
      files: Record[String, Any],
      useMultipartFormData: Boolean
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Unit,
      files: Record[String, Any],
      useMultipartFormData: Boolean,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Unit,
      files: Record[String, Any],
      useMultipartFormData: Unit,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(method: String, path: String, params: Record[String, Any]): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Record[String, Any],
      files: Unit,
      useMultipartFormData: Boolean
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Record[String, Any],
      files: Unit,
      useMultipartFormData: Boolean,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Record[String, Any],
      files: Unit,
      useMultipartFormData: Unit,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(method: String, path: String, params: Record[String, Any], files: Record[String, Any]): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Record[String, Any],
      files: Record[String, Any],
      useMultipartFormData: Boolean
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Record[String, Any],
      files: Record[String, Any],
      useMultipartFormData: Boolean,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: String,
      params: Record[String, Any],
      files: Record[String, Any],
      useMultipartFormData: Unit,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(method: String, path: js.Array[String]): js.Promise[Any] = js.native
    def call(method: String, path: js.Array[String], params: Unit, files: Unit, useMultipartFormData: Boolean): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Unit,
      files: Unit,
      useMultipartFormData: Boolean,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Unit,
      files: Unit,
      useMultipartFormData: Unit,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(method: String, path: js.Array[String], params: Unit, files: Record[String, Any]): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Unit,
      files: Record[String, Any],
      useMultipartFormData: Boolean
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Unit,
      files: Record[String, Any],
      useMultipartFormData: Boolean,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Unit,
      files: Record[String, Any],
      useMultipartFormData: Unit,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(method: String, path: js.Array[String], params: Record[String, Any]): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Record[String, Any],
      files: Unit,
      useMultipartFormData: Boolean
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Record[String, Any],
      files: Unit,
      useMultipartFormData: Boolean,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Record[String, Any],
      files: Unit,
      useMultipartFormData: Unit,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(method: String, path: js.Array[String], params: Record[String, Any], files: Record[String, Any]): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Record[String, Any],
      files: Record[String, Any],
      useMultipartFormData: Boolean
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Record[String, Any],
      files: Record[String, Any],
      useMultipartFormData: Boolean,
      urlOverride: String
    ): js.Promise[Any] = js.native
    def call(
      method: String,
      path: js.Array[String],
      params: Record[String, Any],
      files: Record[String, Any],
      useMultipartFormData: Unit,
      urlOverride: String
    ): js.Promise[Any] = js.native
    
    def getAppID(): js.Promise[Any] = js.native
    
    var locale: String = js.native
    
    def setDebug(flag: Boolean): FacebookAdsApi = js.native
    
    def setShowHeader(flag: Boolean): FacebookAdsApi = js.native
  }
}
