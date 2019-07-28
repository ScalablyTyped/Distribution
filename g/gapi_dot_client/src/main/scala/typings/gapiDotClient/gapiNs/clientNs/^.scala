package typings.gapiDotClient.gapiNs.clientNs

import typings.gapiDotClient.Anon_Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  def load(name: String, version: String): js.Thenable[Unit] = js.native
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
  def newBatch[T](): Batch[T] = js.native
  /**
    * Creates a HTTP request for making RESTful requests.
    * An object encapsulating the various arguments for this method.
    */
  def request[T](args: Anon_Body): Request[T] = js.native
  /**
    * Sets the API key for the application.
    * @param apiKey The API key to set
    */
  def setApiKey(apiKey: String): Unit = js.native
}

