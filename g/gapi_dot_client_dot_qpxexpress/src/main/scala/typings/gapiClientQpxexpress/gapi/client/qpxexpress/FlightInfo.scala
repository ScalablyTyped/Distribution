package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlightInfo extends js.Object {
  var carrier: js.UndefOr[String] = js.native
  /** The flight number. */
  var number: js.UndefOr[String] = js.native
}

object FlightInfo {
  @scala.inline
  def apply(): FlightInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlightInfo]
  }
  @scala.inline
  implicit class FlightInfoOps[Self <: FlightInfo] (val x: Self) extends AnyVal {
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
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
  }
  
}

