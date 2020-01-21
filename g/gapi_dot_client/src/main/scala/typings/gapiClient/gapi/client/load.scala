package typings.gapiClient.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  def apply(name: String, version: String): js.Thenable[Unit] = js.native
  /**
    * Loads the client library interface to a particular API. The new API interface will be in the form gapi.client.api.collection.method.
    * @param name The name of the API to load.
    * @param version The version of the API to load
    * @param callback the function that is called once the API interface is loaded
    */
  def apply(name: String, version: String, callback: js.Function0[_]): Unit = js.native
}

