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
import scala.scalajs.js.`|`
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
    
    object auth {
      
      @JSGlobal("gapi.auth.authorize")
      @js.native
      def authorize(params: Clientid, callback: js.Function1[/* token */ GoogleApiOAuth2TokenObject, _]): Unit = js.native
      
      @JSGlobal("gapi.auth.getToken")
      @js.native
      def getToken(): GoogleApiOAuth2TokenObject = js.native
      
      @JSGlobal("gapi.auth.init")
      @js.native
      def init(callback: js.Function0[_]): Unit = js.native
      
      @JSGlobal("gapi.auth.setToken")
      @js.native
      def setToken(token: GoogleApiOAuth2TokenObject): Unit = js.native
      
      @JSGlobal("gapi.auth.signIn")
      @js.native
      def signIn(params: Apppackagename): Unit = js.native
      
      @JSGlobal("gapi.auth.signOut")
      @js.native
      def signOut(): Unit = js.native
    }
    
    object client {
      
      @JSGlobal("gapi.client.HttpBatch")
      @js.native
      class HttpBatch ()
        extends typings.gapi.gapi.client.HttpBatch
      
      @JSGlobal("gapi.client.HttpRequest")
      @js.native
      class HttpRequest[T] ()
        extends typings.gapi.gapi.client.HttpRequest[T]
      
      /**
        * HttpRequest supports promises.
        * See Google API Client JavaScript Using Promises https://developers.google.com/api-client-library/javascript/features/promises
        */
      @JSGlobal("gapi.client.HttpRequestPromise")
      @js.native
      class HttpRequestPromise[T] ()
        extends typings.gapi.gapi.client.HttpRequestPromise[T]
      
      @JSGlobal("gapi.client.RpcRequest")
      @js.native
      class RpcRequest_ () extends RpcRequest
      
      @JSGlobal("gapi.client.getToken")
      @js.native
      def getToken(): GoogleApiOAuth2TokenObject = js.native
      
      @JSGlobal("gapi.client.init")
      @js.native
      def init(args: ApiKey): js.Promise[Unit] = js.native
      
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: String, version: String): js.Promise[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: String, version: String, callback: js.Function0[_]): Unit = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: String, version: String, callback: js.Function0[_], url: String): Unit = js.native
      
      @JSGlobal("gapi.client.request")
      @js.native
      def request(args: RequestOptions): typings.gapi.gapi.client.HttpRequest[_] = js.native
      
      @JSGlobal("gapi.client.rpcRequest")
      @js.native
      def rpcRequest(method: String): RpcRequest = js.native
      @JSGlobal("gapi.client.rpcRequest")
      @js.native
      def rpcRequest(method: String, version: js.UndefOr[scala.Nothing], rpcParams: js.Any): RpcRequest = js.native
      @JSGlobal("gapi.client.rpcRequest")
      @js.native
      def rpcRequest(method: String, version: String): RpcRequest = js.native
      @JSGlobal("gapi.client.rpcRequest")
      @js.native
      def rpcRequest(method: String, version: String, rpcParams: js.Any): RpcRequest = js.native
      
      @JSGlobal("gapi.client.setApiKey")
      @js.native
      def setApiKey(apiKey: String): Unit = js.native
      
      @JSGlobal("gapi.client.setToken")
      @js.native
      def setToken(): Unit = js.native
      @JSGlobal("gapi.client.setToken")
      @js.native
      def setToken(token: TokenObject): Unit = js.native
    }
    
    @JSGlobal("gapi.load")
    @js.native
    def load(apiName: String, callback: CallbackOrConfig): Unit = js.native
  }
}
