package typings
package gapiDotClientLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  def load(name: java.lang.String, version: java.lang.String): js.Thenable[scala.Unit] = js.native
  /**
    * Loads the client library interface to a particular API. The new API interface will be in the form gapi.client.api.collection.method.
    * @param name The name of the API to load.
    * @param version The version of the API to load
    * @param callback the function that is called once the API interface is loaded
    */
  def load(name: java.lang.String, version: java.lang.String, callback: js.Function0[_]): scala.Unit = js.native
  /**
    * Creates a batch object for batching individual requests.
    */
  def newBatch[T](): Batch[T] = js.native
  /**
    * Creates a HTTP request for making RESTful requests.
    * An object encapsulating the various arguments for this method.
    */
  def request[T](args: gapiDotClientLib.Anon_Body): Request[T] = js.native
  /**
    * Sets the API key for the application.
    * @param apiKey The API key to set
    */
  def setApiKey(apiKey: java.lang.String): scala.Unit = js.native
}

