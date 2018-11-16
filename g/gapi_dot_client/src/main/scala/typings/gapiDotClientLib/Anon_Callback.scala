package typings
package gapiDotClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Callback[T] extends js.Object {
  /**
                   * Identifies the response for this request in the map of batch responses. If one is not provided, the system generates a random ID.
                   */
  var id: java.lang.String
  def callback(
    /**
                       * is the response for this request only. Its format is defined by the API method being called.
                       */
  individualResponse: gapiDotClientLib.gapiNs.clientNs.Response[T],
    /**
                       * is the raw batch ID-response map as a string. It contains all responses to all requests in the batch.
                       */
  rawBatchResponse: java.lang.String
  ): js.Any
}

