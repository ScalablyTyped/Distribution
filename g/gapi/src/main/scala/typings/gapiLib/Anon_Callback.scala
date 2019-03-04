package typings
package gapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  /**
    * Identifies the response for this request in the map of batch responses. If one is not provided, the system generates a random ID.
    */
  var id: java.lang.String
  def callback(
    /**
    * is the response for this request only. Its format is defined by the API method being called.
    */
  individualResponse: js.Any,
    /**
    * is the raw batch ID-response map as a string. It contains all responses to all requests in the batch.
    */
  rawBatchResponse: js.Any
  ): js.Any
}

object Anon_Callback {
  @scala.inline
  def apply(callback: js.Function2[js.Any, js.Any, js.Any], id: java.lang.String): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = callback, id = id)
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

