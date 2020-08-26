package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListForwardingAddressesResponse extends js.Object {
  var forwardingAddresses: js.UndefOr[js.Array[ForwardingAddress]] = js.native
}

object ListForwardingAddressesResponse {
  @scala.inline
  def apply(): ListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListForwardingAddressesResponse]
  }
  @scala.inline
  implicit class ListForwardingAddressesResponseOps[Self <: ListForwardingAddressesResponse] (val x: Self) extends AnyVal {
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
    def setForwardingAddressesVarargs(value: ForwardingAddress*): Self = this.set("forwardingAddresses", js.Array(value :_*))
    @scala.inline
    def setForwardingAddresses(value: js.Array[ForwardingAddress]): Self = this.set("forwardingAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardingAddresses: Self = this.set("forwardingAddresses", js.undefined)
  }
  
}

