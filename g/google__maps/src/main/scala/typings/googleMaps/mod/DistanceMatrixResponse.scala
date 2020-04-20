package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixResponse extends js.Object {
  /**
    * contains an array of addresses as returned by the API from your original request.
    * As with origin_addresses, these are localized if appropriate.
    */
  var destination_addresses: js.Array[String]
  /**
    * When the top-level status code is other than `OK`, this field contains more detailed information
    * about the reasons behind the given status code.
    */
  var error_message: String
  /**
    * contains an array of addresses as returned by the API from your original request.
    * These are formatted by the geocoder and localized according to the language parameter passed with the request.
    */
  var origin_addresses: js.Array[String]
  /** contains an array of elements, which in turn each contain a status, duration, and distance element. */
  var rows: js.Array[DistanceMatrixRow]
  /** contains metadata on the request. See Status Codes below. */
  var status: DistanceMatrixResponseTopLevelStatus
}

object DistanceMatrixResponse {
  @scala.inline
  def apply(
    destination_addresses: js.Array[String],
    error_message: String,
    origin_addresses: js.Array[String],
    rows: js.Array[DistanceMatrixRow],
    status: DistanceMatrixResponseTopLevelStatus
  ): DistanceMatrixResponse = {
    val __obj = js.Dynamic.literal(destination_addresses = destination_addresses.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], origin_addresses = origin_addresses.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponse]
  }
}

