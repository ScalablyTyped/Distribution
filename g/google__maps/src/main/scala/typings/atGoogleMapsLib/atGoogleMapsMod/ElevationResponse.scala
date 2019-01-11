package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationResponse extends js.Object {
  /**
    * When the status code is other than `OK`, there may be an additional `error_message` field within the Elevation response object.
    * This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: java.lang.String
  /** An Elevation results array. */
  var results: js.Array[ElevationResult]
  /** An Elevation status code. */
  var status: ElevationResponseStatus
}

