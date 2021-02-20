package typings.firebaseMessaging

import typings.firebaseMessaging.anon.ApplicationPubKey
import typings.firebaseMessaging.anon.Message
import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.tokenDetailsMod.SubscriptionOptions
import typings.firebaseMessaging.tokenDetailsMod.TokenDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("@firebase/messaging/dist/core/api", "requestDeleteToken")
  @js.native
  def requestDeleteToken(firebaseDependencies: FirebaseInternalDependencies, token: String): js.Promise[Unit] = js.native
  
  @JSImport("@firebase/messaging/dist/core/api", "requestGetToken")
  @js.native
  def requestGetToken(firebaseDependencies: FirebaseInternalDependencies, subscriptionOptions: SubscriptionOptions): js.Promise[String] = js.native
  
  @JSImport("@firebase/messaging/dist/core/api", "requestUpdateToken")
  @js.native
  def requestUpdateToken(firebaseDependencies: FirebaseInternalDependencies, tokenDetails: TokenDetails): js.Promise[String] = js.native
  
  @js.native
  trait ApiRequestBody extends StObject {
    
    var web: ApplicationPubKey = js.native
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
  
  @js.native
  trait ApiResponse extends StObject {
    
    var error: js.UndefOr[Message] = js.native
    
    var token: js.UndefOr[String] = js.native
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
