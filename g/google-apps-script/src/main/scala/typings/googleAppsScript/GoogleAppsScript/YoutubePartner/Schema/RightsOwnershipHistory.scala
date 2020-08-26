package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsOwnershipHistory extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var origination: js.UndefOr[Origination] = js.native
  var ownership: js.UndefOr[RightsOwnership] = js.native
  var timeProvided: js.UndefOr[String] = js.native
}

object RightsOwnershipHistory {
  @scala.inline
  def apply(): RightsOwnershipHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsOwnershipHistory]
  }
  @scala.inline
  implicit class RightsOwnershipHistoryOps[Self <: RightsOwnershipHistory] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrigination(value: Origination): Self = this.set("origination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigination: Self = this.set("origination", js.undefined)
    @scala.inline
    def setOwnership(value: RightsOwnership): Self = this.set("ownership", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnership: Self = this.set("ownership", js.undefined)
    @scala.inline
    def setTimeProvided(value: String): Self = this.set("timeProvided", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeProvided: Self = this.set("timeProvided", js.undefined)
  }
  
}

