package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationResponse extends js.Object {
  /**
    * When the status code is other than `OK`, there may be an additional `error_message` field within the Elevation response object.
    * This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String = js.native
  /** An Elevation results array. */
  var results: js.Array[ElevationResult] = js.native
  /** An Elevation status code. */
  var status: ElevationResponseStatus = js.native
}

object ElevationResponse {
  @scala.inline
  def apply(error_message: String, results: js.Array[ElevationResult], status: ElevationResponseStatus): ElevationResponse = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationResponse]
  }
  @scala.inline
  implicit class ElevationResponseOps[Self <: ElevationResponse] (val x: Self) extends AnyVal {
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
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: ElevationResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[ElevationResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ElevationResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

