package typings.exaroton.mod

import typings.exaroton.exarotonStrings.Slashv1
import typings.exaroton.exarotonStrings.apiDotexarotonDotcom
import typings.exaroton.exarotonStrings.https
import typings.node.streamWebMod.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("exaroton", "Client")
@js.native
open class Client protected () extends StObject {
  /**
    *
    * @param apiToken string API token, create one here: https://exaroton.com/account/
    */
  def this(apiToken: String) = this()
  
  /**
    * API token used for authentication
    */
  /* private */ var apiToken: String | Null = js.native
  
  var basePath: String | Slashv1 = js.native
  
  /**
    * API base URL used for all requests
    */
  def baseUrl: String = js.native
  
  def getAPIToken(): String = js.native
  
  /**
    * Get account info for the current account
    *
    * @throws {RequestError}
    */
  def getAccount(): js.Promise[Account] = js.native
  
  /**
    * Get a list of all servers
    * @throws {RequestError}
    */
  def getServers(): js.Promise[js.Array[Server]] = js.native
  
  var host: String | apiDotexarotonDotcom = js.native
  
  var protocol: String | https = js.native
  
  /**
    * Send a {Request} to the API and get a {Response}
    *
    * @param request
    * @throws {RequestError}
    */
  def request(request: Request): js.Promise[Response] = js.native
  
  /**
    * Initialize a new server object
    *
    * @param id
    */
  def server(id: String): Server = js.native
  
  /**
    * Set the API token
    *
    * @param apiToken
    */
  def setAPIToken(apiToken: String): String = js.native
  
  /**
    * Set the user agent
    *
    * @param userAgent
    */
  def setUserAgent(userAgent: String): Client = js.native
  
  /**
    * @param url
    * @param gotOptions
    * @param outputStream
    */
  def streamResponse(url: String, gotOptions: js.Object, outputStream: WritableStream[Any]): js.Promise[Any] = js.native
  
  /**
    * User agent sent with all requests
    */
  /* private */ var userAgent: String = js.native
}
