package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAuthRequirements extends js.Object {
  /**
    * A configuration string containing connection information for the
    * authentication provider, typically formatted as a SmartService string
    * (go/smartservice).
    */
  var provider: js.UndefOr[String] = js.native
}

object CustomAuthRequirements {
  @scala.inline
  def apply(): CustomAuthRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAuthRequirements]
  }
  @scala.inline
  implicit class CustomAuthRequirementsOps[Self <: CustomAuthRequirements] (val x: Self) extends AnyVal {
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
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
  
}

