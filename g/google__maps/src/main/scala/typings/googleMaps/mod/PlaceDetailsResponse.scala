package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceDetailsResponse extends js.Object {
  /** contains a set of attributions about this listing which must be displayed to the user. */
  var html_attributions: js.Array[String]
  /**
    * When the Google Places service returns a status code other than `OK`, there may be an additional `error_message` field
    * within the details response object. This field contains more detailed information about the reasons behind the given status code.
    */
  /** contains the detailed information about the place requested. */
  var result: PlaceDetailsResult
  /** contains metadata on the request. */
  var status: PlaceDetailsResponseStatus
}

object PlaceDetailsResponse {
  @scala.inline
  def apply(
    html_attributions: js.Array[String],
    result: PlaceDetailsResult,
    status: PlaceDetailsResponseStatus
  ): PlaceDetailsResponse = {
    val __obj = js.Dynamic.literal(html_attributions = html_attributions.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaceDetailsResponse]
  }
}

