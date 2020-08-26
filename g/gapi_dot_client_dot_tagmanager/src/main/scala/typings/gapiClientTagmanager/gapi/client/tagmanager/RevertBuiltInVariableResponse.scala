package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevertBuiltInVariableResponse extends js.Object {
  /** Whether the built-in variable is enabled after reversion. */
  var enabled: js.UndefOr[Boolean] = js.native
}

object RevertBuiltInVariableResponse {
  @scala.inline
  def apply(): RevertBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertBuiltInVariableResponse]
  }
  @scala.inline
  implicit class RevertBuiltInVariableResponseOps[Self <: RevertBuiltInVariableResponse] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

