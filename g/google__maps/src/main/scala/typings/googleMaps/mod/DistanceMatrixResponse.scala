package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceMatrixResponse extends js.Object {
  
  /**
    * contains an array of addresses as returned by the API from your original request.
    * As with origin_addresses, these are localized if appropriate.
    */
  var destination_addresses: js.Array[String] = js.native
  
  /**
    * When the top-level status code is other than `OK`, this field contains more detailed information
    * about the reasons behind the given status code.
    */
  var error_message: String = js.native
  
  /**
    * contains an array of addresses as returned by the API from your original request.
    * These are formatted by the geocoder and localized according to the language parameter passed with the request.
    */
  var origin_addresses: js.Array[String] = js.native
  
  /** contains an array of elements, which in turn each contain a status, duration, and distance element. */
  var rows: js.Array[DistanceMatrixRow] = js.native
  
  /** contains metadata on the request. See Status Codes below. */
  var status: DistanceMatrixResponseTopLevelStatus = js.native
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
  
  @scala.inline
  implicit class DistanceMatrixResponseOps[Self <: DistanceMatrixResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestination_addressesVarargs(value: String*): Self = this.set("destination_addresses", js.Array(value :_*))
    
    @scala.inline
    def setDestination_addresses(value: js.Array[String]): Self = this.set("destination_addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin_addressesVarargs(value: String*): Self = this.set("origin_addresses", js.Array(value :_*))
    
    @scala.inline
    def setOrigin_addresses(value: js.Array[String]): Self = this.set("origin_addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: DistanceMatrixRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[DistanceMatrixRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DistanceMatrixResponseTopLevelStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
