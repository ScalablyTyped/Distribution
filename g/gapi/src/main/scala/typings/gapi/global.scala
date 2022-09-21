package typings.gapi

import typings.gapi.anon.ApiKey
import typings.gapi.anon.Apppackagename
import typings.gapi.anon.Clientid
import typings.gapi.gapi.CallbackOrConfig
import typings.gapi.gapi.client.RequestOptions
import typings.gapi.gapi.client.RpcRequest
import typings.gapi.gapi.client.TokenObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Fix for #8215
    * https://github.com/DefinitelyTyped/DefinitelyTyped/issues/8215
    *
    * Usage example:
    * https://developers.google.com/identity/sign-in/web/session-state
    */
  object gapi {
    
    @JSGlobal("gapi")
    @js.native
    val ^ : js.Any = js.native
    
    object auth {
      
      @JSGlobal("gapi.auth")
      @js.native
      val ^ : js.Any = js.native
      
      inline def authorize(params: Clientid, callback: js.Function1[/* token */ GoogleApiOAuth2TokenObject, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def getToken(): GoogleApiOAuth2TokenObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")().asInstanceOf[GoogleApiOAuth2TokenObject]
      
      inline def init(callback: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setToken(token: GoogleApiOAuth2TokenObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def signIn(params: Apppackagename): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def signOut(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")().asInstanceOf[Unit]
    }
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("gapi.client.HttpBatch")
      @js.native
      open class HttpBatch ()
        extends StObject
           with typings.gapi.gapi.client.HttpBatch
      
      @JSGlobal("gapi.client.HttpRequest")
      @js.native
      open class HttpRequest[T] ()
        extends StObject
           with typings.gapi.gapi.client.HttpRequest[T]
      
      /**
        * HttpRequest supports promises.
        * See Google API Client JavaScript Using Promises https://developers.google.com/api-client-library/javascript/features/promises
        */
      @JSGlobal("gapi.client.HttpRequestPromise")
      @js.native
      open class HttpRequestPromise[T] ()
        extends StObject
           with typings.gapi.gapi.client.HttpRequestPromise[T]
      
      @JSGlobal("gapi.client.RpcRequest")
      @js.native
      open class RpcRequest_ ()
        extends StObject
           with RpcRequest {
        
        /**
          * Executes the request and runs the supplied callback with the response.
          * @param callback The callback function which executes when the request succeeds or fails.
          */
        /* CompleteClass */
        override def callback(callback: js.Function2[/* jsonResp */ Any, /* rawResp */ String, Unit]): Unit = js.native
      }
      
      inline def getToken(): GoogleApiOAuth2TokenObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")().asInstanceOf[GoogleApiOAuth2TokenObject]
      
      inline def init(args: ApiKey): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
      
      inline def load(name: String, version: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def load(name: String, version: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def load(name: String, version: String, callback: js.Function0[Any], url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def request(args: RequestOptions): typings.gapi.gapi.client.HttpRequest[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(args.asInstanceOf[js.Any]).asInstanceOf[typings.gapi.gapi.client.HttpRequest[Any]]
      
      inline def rpcRequest(method: String): RpcRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcRequest")(method.asInstanceOf[js.Any]).asInstanceOf[RpcRequest]
      inline def rpcRequest(method: String, version: String): RpcRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("rpcRequest")(method.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[RpcRequest]
      inline def rpcRequest(method: String, version: String, rpcParams: Any): RpcRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("rpcRequest")(method.asInstanceOf[js.Any], version.asInstanceOf[js.Any], rpcParams.asInstanceOf[js.Any])).asInstanceOf[RpcRequest]
      inline def rpcRequest(method: String, version: Unit, rpcParams: Any): RpcRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("rpcRequest")(method.asInstanceOf[js.Any], version.asInstanceOf[js.Any], rpcParams.asInstanceOf[js.Any])).asInstanceOf[RpcRequest]
      
      inline def setApiKey(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setToken(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setToken")().asInstanceOf[Unit]
      inline def setToken(token: TokenObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    inline def load(apiName: String, callback: CallbackOrConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(apiName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
