package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripOptionsResponse extends js.Object {
  /** Informational data global to list of solutions. */
  var data: js.UndefOr[Data] = js.native
  /** Identifies this as a QPX Express trip response object, which consists of zero or more solutions. Value: the fixed string qpxexpress#tripOptions. */
  var kind: js.UndefOr[String] = js.native
  /** An identifier uniquely identifying this response. */
  var requestId: js.UndefOr[String] = js.native
  /** A list of priced itinerary solutions to the QPX Express query. */
  var tripOption: js.UndefOr[js.Array[TripOption]] = js.native
}

object TripOptionsResponse {
  @scala.inline
  def apply(): TripOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOptionsResponse]
  }
  @scala.inline
  implicit class TripOptionsResponseOps[Self <: TripOptionsResponse] (val x: Self) extends AnyVal {
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
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setTripOptionVarargs(value: TripOption*): Self = this.set("tripOption", js.Array(value :_*))
    @scala.inline
    def setTripOption(value: js.Array[TripOption]): Self = this.set("tripOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTripOption: Self = this.set("tripOption", js.undefined)
  }
  
}

