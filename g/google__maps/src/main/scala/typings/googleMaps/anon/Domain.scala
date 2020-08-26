package typings.googleMaps.anon

import typings.googleMaps.mod.GeolocationErrorReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends js.Object {
  var domain: String = js.native
  var message: String = js.native
  var reason: GeolocationErrorReason = js.native
}

object Domain {
  @scala.inline
  def apply(domain: String, message: String, reason: GeolocationErrorReason): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: GeolocationErrorReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

