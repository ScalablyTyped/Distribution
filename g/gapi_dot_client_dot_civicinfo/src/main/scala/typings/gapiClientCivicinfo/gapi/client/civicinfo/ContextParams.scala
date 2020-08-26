package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextParams extends js.Object {
  var clientProfile: js.UndefOr[String] = js.native
}

object ContextParams {
  @scala.inline
  def apply(): ContextParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextParams]
  }
  @scala.inline
  implicit class ContextParamsOps[Self <: ContextParams] (val x: Self) extends AnyVal {
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
    def setClientProfile(value: String): Self = this.set("clientProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientProfile: Self = this.set("clientProfile", js.undefined)
  }
  
}

