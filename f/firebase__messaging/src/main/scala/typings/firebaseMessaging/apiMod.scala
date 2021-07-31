package typings.firebaseMessaging

import typings.firebaseMessaging.anon.ApplicationPubKey
import typings.firebaseMessaging.anon.Message
import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.tokenDetailsMod.SubscriptionOptions
import typings.firebaseMessaging.tokenDetailsMod.TokenDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("@firebase/messaging/dist/core/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def requestDeleteToken(firebaseDependencies: FirebaseInternalDependencies, token: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestDeleteToken")(firebaseDependencies.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def requestGetToken(firebaseDependencies: FirebaseInternalDependencies, subscriptionOptions: SubscriptionOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestGetToken")(firebaseDependencies.asInstanceOf[js.Any], subscriptionOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def requestUpdateToken(firebaseDependencies: FirebaseInternalDependencies, tokenDetails: TokenDetails): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestUpdateToken")(firebaseDependencies.asInstanceOf[js.Any], tokenDetails.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait ApiRequestBody extends StObject {
    
    var web: ApplicationPubKey
  }
  object ApiRequestBody {
    
    @scala.inline
    def apply(web: ApplicationPubKey): ApiRequestBody = {
      val __obj = js.Dynamic.literal(web = web.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiRequestBody]
    }
    
    @scala.inline
    implicit class ApiRequestBodyMutableBuilder[Self <: ApiRequestBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWeb(value: ApplicationPubKey): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApiResponse extends StObject {
    
    var error: js.UndefOr[Message] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object ApiResponse {
    
    @scala.inline
    def apply(): ApiResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiResponse]
    }
    
    @scala.inline
    implicit class ApiResponseMutableBuilder[Self <: ApiResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
