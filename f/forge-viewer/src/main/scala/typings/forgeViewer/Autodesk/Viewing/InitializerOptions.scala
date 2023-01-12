package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializerOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var api: js.UndefOr[String] = js.undefined
  
  var env: js.UndefOr[String] = js.undefined
  
  var getAccessToken: js.UndefOr[
    js.Function1[
      /* callback */ js.UndefOr[js.Function2[/* accessToken */ String, /* expires */ Double, Unit]], 
      Unit
    ]
  ] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var optOutTrackingByDefault: js.UndefOr[Boolean] = js.undefined
  
  var refreshToken: js.UndefOr[
    js.Function1[
      /* callback */ js.UndefOr[js.Function2[/* accessToken */ String, /* expires */ Double, Unit]], 
      Unit
    ]
  ] = js.undefined
  
  var shouldInitializeAuth: js.UndefOr[Boolean] = js.undefined
  
  var useADP: js.UndefOr[Boolean] = js.undefined
  
  var useConsolidation: js.UndefOr[Boolean] = js.undefined
  
  var useCredentials: js.UndefOr[Boolean] = js.undefined
  
  var webGLHelpLink: js.UndefOr[String] = js.undefined
}
object InitializerOptions {
  
  inline def apply(): InitializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitializerOptions] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setGetAccessToken(
      value: /* callback */ js.UndefOr[js.Function2[/* accessToken */ String, /* expires */ Double, Unit]] => Unit
    ): Self = StObject.set(x, "getAccessToken", js.Any.fromFunction1(value))
    
    inline def setGetAccessTokenUndefined: Self = StObject.set(x, "getAccessToken", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setOptOutTrackingByDefault(value: Boolean): Self = StObject.set(x, "optOutTrackingByDefault", value.asInstanceOf[js.Any])
    
    inline def setOptOutTrackingByDefaultUndefined: Self = StObject.set(x, "optOutTrackingByDefault", js.undefined)
    
    inline def setRefreshToken(
      value: /* callback */ js.UndefOr[js.Function2[/* accessToken */ String, /* expires */ Double, Unit]] => Unit
    ): Self = StObject.set(x, "refreshToken", js.Any.fromFunction1(value))
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setShouldInitializeAuth(value: Boolean): Self = StObject.set(x, "shouldInitializeAuth", value.asInstanceOf[js.Any])
    
    inline def setShouldInitializeAuthUndefined: Self = StObject.set(x, "shouldInitializeAuth", js.undefined)
    
    inline def setUseADP(value: Boolean): Self = StObject.set(x, "useADP", value.asInstanceOf[js.Any])
    
    inline def setUseADPUndefined: Self = StObject.set(x, "useADP", js.undefined)
    
    inline def setUseConsolidation(value: Boolean): Self = StObject.set(x, "useConsolidation", value.asInstanceOf[js.Any])
    
    inline def setUseConsolidationUndefined: Self = StObject.set(x, "useConsolidation", js.undefined)
    
    inline def setUseCredentials(value: Boolean): Self = StObject.set(x, "useCredentials", value.asInstanceOf[js.Any])
    
    inline def setUseCredentialsUndefined: Self = StObject.set(x, "useCredentials", js.undefined)
    
    inline def setWebGLHelpLink(value: String): Self = StObject.set(x, "webGLHelpLink", value.asInstanceOf[js.Any])
    
    inline def setWebGLHelpLinkUndefined: Self = StObject.set(x, "webGLHelpLink", js.undefined)
  }
}
