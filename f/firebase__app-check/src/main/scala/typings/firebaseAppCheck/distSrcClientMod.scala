package typings.firebaseAppCheck

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.distSrcTypesMod.AppCheckTokenInternal
import typings.firebaseAppCheck.firebaseAppCheckStrings.heartbeat
import typings.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClientMod {
  
  @JSImport("@firebase/app-check/dist/src/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exchangeToken_heartbeat(param0: AppCheckRequest, heartbeatServiceProvider: Provider[heartbeat]): js.Promise[AppCheckTokenInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("exchangeToken")(param0.asInstanceOf[js.Any], heartbeatServiceProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AppCheckTokenInternal]]
  
  inline def getExchangeDebugTokenRequest(app: FirebaseApp, debugToken: String): AppCheckRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getExchangeDebugTokenRequest")(app.asInstanceOf[js.Any], debugToken.asInstanceOf[js.Any])).asInstanceOf[AppCheckRequest]
  
  inline def getExchangeRecaptchaEnterpriseTokenRequest(app: FirebaseApp, reCAPTCHAToken: String): AppCheckRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getExchangeRecaptchaEnterpriseTokenRequest")(app.asInstanceOf[js.Any], reCAPTCHAToken.asInstanceOf[js.Any])).asInstanceOf[AppCheckRequest]
  
  inline def getExchangeRecaptchaV3TokenRequest(app: FirebaseApp, reCAPTCHAToken: String): AppCheckRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getExchangeRecaptchaV3TokenRequest")(app.asInstanceOf[js.Any], reCAPTCHAToken.asInstanceOf[js.Any])).asInstanceOf[AppCheckRequest]
  
  trait AppCheckRequest extends StObject {
    
    var body: StringDictionary[String]
    
    var url: String
  }
  object AppCheckRequest {
    
    inline def apply(body: StringDictionary[String], url: String): AppCheckRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckRequest] (val x: Self) extends AnyVal {
      
      inline def setBody(value: StringDictionary[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
