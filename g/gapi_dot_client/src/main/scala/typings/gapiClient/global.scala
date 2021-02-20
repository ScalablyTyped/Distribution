package typings.gapiClient

import typings.gapiClient.anon.Body
import typings.gapiClient.anon.Clientid
import typings.gapiClient.gapi.auth.GoogleApiOAuth2TokenObject
import typings.gapiClient.gapi.client.Batch
import typings.gapiClient.gapi.client.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object auth {
      
      /**
        * Initiates the OAuth 2.0 authorization process. The browser displays a popup window prompting the user authenticate and authorize.
        * After the user authorizes, the popup closes and the callback function fires.
        * @param params A key/value map of parameters for the request. If the key is not one of the expected OAuth 2.0 parameters, it is added to the
        * URI as a query parameter.
        * @param callback The function to call once the login process is complete. The function takes an OAuth 2.0 token object as its only parameter.
        */
      @JSGlobal("gapi.auth.authorize")
      @js.native
      def authorize(params: Clientid, callback: js.Function1[/* authResult */ GoogleApiOAuth2TokenObject, Unit]): Unit = js.native
      
      /**
        * Retrieves the OAuth 2.0 token for the application.
        * @return The OAuth 2.0 token.
        */
      @JSGlobal("gapi.auth.getToken")
      @js.native
      def getToken(): GoogleApiOAuth2TokenObject = js.native
      
      /**
        * Initializes the authorization feature. Call this when the client loads to prevent popup blockers from blocking the auth window on gapi.auth.authorize calls.
        * @param callback A callback to execute when the auth feature is ready to make authorization calls.
        */
      @JSGlobal("gapi.auth.init")
      @js.native
      def init(callback: js.Function0[_]): Unit = js.native
      
      /**
        * Sets the OAuth 2.0 token for the application.
        * @param token The token to set.
        */
      @JSGlobal("gapi.auth.setToken")
      @js.native
      def setToken(token: GoogleApiOAuth2TokenObject): Unit = js.native
    }
    
    object client {
      
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: String, version: String): js.Promise[Unit] = js.native
      /**
        * Loads the client library interface to a particular API. The new API interface will be in the form gapi.client.api.collection.method.
        * @param name The name of the API to load.
        * @param version The version of the API to load
        * @param callback the function that is called once the API interface is loaded
        */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: String, version: String, callback: js.Function0[_]): Unit = js.native
      
      /**
        * Creates a batch object for batching individual requests.
        */
      @JSGlobal("gapi.client.newBatch")
      @js.native
      def newBatch(): Batch[_] = js.native
      
      /**
        * Creates a HTTP request for making RESTful requests.
        * An object encapsulating the various arguments for this method.
        */
      @JSGlobal("gapi.client.request")
      @js.native
      def request(args: Body): Request[_] = js.native
      
      /**
        * Sets the API key for the application.
        * @param apiKey The API key to set
        */
      @JSGlobal("gapi.client.setApiKey")
      @js.native
      def setApiKey(apiKey: String): Unit = js.native
    }
    
    /**
      * Pragmatically initialize gapi class member.
      */
    @JSGlobal("gapi.load")
    @js.native
    def load(api: String, callback: js.Function0[Unit]): Unit = js.native
  }
}
