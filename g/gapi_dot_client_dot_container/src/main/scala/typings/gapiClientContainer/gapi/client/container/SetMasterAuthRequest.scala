package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetMasterAuthRequest extends js.Object {
  /** The exact form of action to be taken on the master auth. */
  var action: js.UndefOr[String] = js.native
  /** A description of the update. */
  var update: js.UndefOr[MasterAuth] = js.native
}

object SetMasterAuthRequest {
  @scala.inline
  def apply(): SetMasterAuthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetMasterAuthRequest]
  }
  @scala.inline
  implicit class SetMasterAuthRequestOps[Self <: SetMasterAuthRequest] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setUpdate(value: MasterAuth): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

