package typings.firebaseMessaging

import typings.firebaseMessaging.anon.ApplicationPubKey
import typings.firebaseMessaging.anon.Message
import typings.firebaseMessaging.distSrcInterfacesInternalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.distSrcInterfacesTokenDetailsMod.SubscriptionOptions
import typings.firebaseMessaging.distSrcInterfacesTokenDetailsMod.TokenDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcInternalsRequestsMod {
  
  @JSImport("@firebase/messaging/dist/src/internals/requests", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requestDeleteToken(firebaseDependencies: FirebaseInternalDependencies, token: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestDeleteToken")(firebaseDependencies.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def requestGetToken(firebaseDependencies: FirebaseInternalDependencies, subscriptionOptions: SubscriptionOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestGetToken")(firebaseDependencies.asInstanceOf[js.Any], subscriptionOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def requestUpdateToken(firebaseDependencies: FirebaseInternalDependencies, tokenDetails: TokenDetails): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestUpdateToken")(firebaseDependencies.asInstanceOf[js.Any], tokenDetails.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait ApiRequestBody extends StObject {
    
    var web: ApplicationPubKey
  }
  object ApiRequestBody {
    
    inline def apply(web: ApplicationPubKey): ApiRequestBody = {
      val __obj = js.Dynamic.literal(web = web.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiRequestBody]
    }
    
    extension [Self <: ApiRequestBody](x: Self) {
      
      inline def setWeb(value: ApplicationPubKey): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApiResponse extends StObject {
    
    var error: js.UndefOr[Message] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object ApiResponse {
    
    inline def apply(): ApiResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiResponse]
    }
    
    extension [Self <: ApiResponse](x: Self) {
      
      inline def setError(value: Message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
