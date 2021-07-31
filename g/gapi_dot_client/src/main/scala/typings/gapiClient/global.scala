package typings.gapiClient

import typings.gapiClient.anon.Body
import typings.gapiClient.anon.Clientid
import typings.gapiClient.gapi.auth.GoogleApiOAuth2TokenObject
import typings.gapiClient.gapi.client.Batch
import typings.gapiClient.gapi.client.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    @JSGlobal("gapi")
    @js.native
    val ^ : js.Any = js.native
    
    object auth {
      
      @JSGlobal("gapi.auth")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initiates the OAuth 2.0 authorization process. The browser displays a popup window prompting the user authenticate and authorize.
        * After the user authorizes, the popup closes and the callback function fires.
        * @param params A key/value map of parameters for the request. If the key is not one of the expected OAuth 2.0 parameters, it is added to the
        * URI as a query parameter.
        * @param callback The function to call once the login process is complete. The function takes an OAuth 2.0 token object as its only parameter.
        */
      @scala.inline
      def authorize(params: Clientid, callback: js.Function1[/* authResult */ GoogleApiOAuth2TokenObject, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Retrieves the OAuth 2.0 token for the application.
        * @return The OAuth 2.0 token.
        */
      @scala.inline
      def getToken(): GoogleApiOAuth2TokenObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")().asInstanceOf[GoogleApiOAuth2TokenObject]
      
      /**
        * Initializes the authorization feature. Call this when the client loads to prevent popup blockers from blocking the auth window on gapi.auth.authorize calls.
        * @param callback A callback to execute when the auth feature is ready to make authorization calls.
        */
      @scala.inline
      def init(callback: js.Function0[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Sets the OAuth 2.0 token for the application.
        * @param token The token to set.
        */
      @scala.inline
      def setToken(token: GoogleApiOAuth2TokenObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def load(name: String, version: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      /**
        * Loads the client library interface to a particular API. The new API interface will be in the form gapi.client.api.collection.method.
        * @param name The name of the API to load.
        * @param version The version of the API to load
        * @param callback the function that is called once the API interface is loaded
        */
      @scala.inline
      def load(name: String, version: String, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Creates a batch object for batching individual requests.
        */
      @scala.inline
      def newBatch(): Batch[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("newBatch")().asInstanceOf[Batch[js.Any]]
      
      /**
        * Creates a HTTP request for making RESTful requests.
        * An object encapsulating the various arguments for this method.
        */
      @scala.inline
      def request(args: Body): Request[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(args.asInstanceOf[js.Any]).asInstanceOf[Request[js.Any]]
      
      /**
        * Sets the API key for the application.
        * @param apiKey The API key to set
        */
      @scala.inline
      def setApiKey(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * Pragmatically initialize gapi class member.
      */
    @scala.inline
    def load(api: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
