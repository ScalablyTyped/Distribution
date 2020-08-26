package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarriersCarrier extends js.Object {
  var country: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var services: js.UndefOr[js.Array[String]] = js.native
}

object CarriersCarrier {
  @scala.inline
  def apply(): CarriersCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarriersCarrier]
  }
  @scala.inline
  implicit class CarriersCarrierOps[Self <: CarriersCarrier] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setServicesVarargs(value: String*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
  
}

