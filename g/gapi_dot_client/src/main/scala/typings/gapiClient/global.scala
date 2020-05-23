package typings.gapiClient

import typings.gapiClient.anon.Body
import typings.gapiClient.anon.Clientid
import typings.gapiClient.gapi.auth.GoogleApiOAuth2TokenObject
import typings.gapiClient.gapi.client.Batch
import typings.gapiClient.gapi.client.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    /**
      * Pragmatically initialize gapi class member.
      */
    def load(api: String, callback: js.Function0[Unit]): Unit = js.native
    @js.native
    object auth extends js.Object {
      /**
        * Initiates the OAuth 2.0 authorization process. The browser displays a popup window prompting the user authenticate and authorize.
        * After the user authorizes, the popup closes and the callback function fires.
        * @param params A key/value map of parameters for the request. If the key is not one of the expected OAuth 2.0 parameters, it is added to the
        * URI as a query parameter.
        * @param callback The function to call once the login process is complete. The function takes an OAuth 2.0 token object as its only parameter.
        */
      def authorize(params: Clientid, callback: js.Function1[/* authResult */ GoogleApiOAuth2TokenObject, Unit]): Unit = js.native
      /**
        * Retrieves the OAuth 2.0 token for the application.
        * @return The OAuth 2.0 token.
        */
      def getToken(): GoogleApiOAuth2TokenObject = js.native
      /**
        * Initializes the authorization feature. Call this when the client loads to prevent popup blockers from blocking the auth window on gapi.auth.authorize calls.
        * @param callback A callback to execute when the auth feature is ready to make authorization calls.
        */
      def init(callback: js.Function0[_]): Unit = js.native
      /**
        * Sets the OAuth 2.0 token for the application.
        * @param token The token to set.
        */
      def setToken(token: GoogleApiOAuth2TokenObject): Unit = js.native
    }
    
    @js.native
    object client extends js.Object {
      def load(name: String, version: String): js.Promise[Unit] = js.native
      /**
        * Loads the client library interface to a particular API. The new API interface will be in the form gapi.client.api.collection.method.
        * @param name The name of the API to load.
        * @param version The version of the API to load
        * @param callback the function that is called once the API interface is loaded
        */
      def load(name: String, version: String, callback: js.Function0[_]): Unit = js.native
      /**
        * Creates a batch object for batching individual requests.
        */
      def newBatch(): Batch[_] = js.native
      /**
        * Creates a HTTP request for making RESTful requests.
        * An object encapsulating the various arguments for this method.
        */
      def request(args: Body): Request[_] = js.native
      /**
        * Sets the API key for the application.
        * @param apiKey The API key to set
        */
      def setApiKey(apiKey: String): Unit = js.native
    }
    
  }
  
}

