package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryAutocompleteResponse extends js.Object {
  /**
       * When the Places service returns a status code other than `OK`, there may be an additional `error_message` field
       * within the response object. This field contains more detailed information about the reasons behind the given status code.
       */
  var error_message: java.lang.String
  /** containing information about a single query prediction. */
  var predictions: js.Array[QueryAutocompleteResult]
  /** contains metadata on the request. */
  var status: QueryAutocompleteResponseStatus
}

