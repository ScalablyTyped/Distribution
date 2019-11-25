package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationResponse extends js.Object {
  /**
    * When the status code is other than `OK`, there may be an additional `error_message` field within the Elevation response object.
    * This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String
  /** An Elevation results array. */
  var results: js.Array[ElevationResult]
  /** An Elevation status code. */
  var status: ElevationResponseStatus
}

object ElevationResponse {
  @scala.inline
  def apply(error_message: String, results: js.Array[ElevationResult], status: ElevationResponseStatus): ElevationResponse = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElevationResponse]
  }
}

