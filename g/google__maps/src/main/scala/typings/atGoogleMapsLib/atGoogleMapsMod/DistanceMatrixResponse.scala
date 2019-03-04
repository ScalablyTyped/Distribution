package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixResponse extends js.Object {
  /**
    * contains an array of addresses as returned by the API from your original request.
    * As with origin_addresses, these are localized if appropriate.
    */
  var destination_addresses: js.Array[java.lang.String]
  /**
    * When the top-level status code is other than `OK`, this field contains more detailed information
    * about the reasons behind the given status code.
    */
  var error_message: java.lang.String
  /**
    * contains an array of addresses as returned by the API from your original request.
    * These are formatted by the geocoder and localized according to the language parameter passed with the request.
    */
  var origin_addresses: java.lang.String
  /** contains an array of elements, which in turn each contain a status, duration, and distance element. */
  var rows: js.Array[DistanceMatrixRow]
  /** contains metadata on the request. See Status Codes below. */
  var status: DistanceMatrixResponseTopLevelStatus
}

object DistanceMatrixResponse {
  @scala.inline
  def apply(
    destination_addresses: js.Array[java.lang.String],
    error_message: java.lang.String,
    origin_addresses: java.lang.String,
    rows: js.Array[DistanceMatrixRow],
    status: DistanceMatrixResponseTopLevelStatus
  ): DistanceMatrixResponse = {
    val __obj = js.Dynamic.literal(destination_addresses = destination_addresses, error_message = error_message, origin_addresses = origin_addresses, rows = rows, status = status)
  
    __obj.asInstanceOf[DistanceMatrixResponse]
  }
}

