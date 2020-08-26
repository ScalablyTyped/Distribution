package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateCompleted extends js.Object {
  var state: js.UndefOr[String] = js.native
  var timeCompleted: js.UndefOr[String] = js.native
}

object StateCompleted {
  @scala.inline
  def apply(): StateCompleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateCompleted]
  }
  @scala.inline
  implicit class StateCompletedOps[Self <: StateCompleted] (val x: Self) extends AnyVal {
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
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTimeCompleted(value: String): Self = this.set("timeCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCompleted: Self = this.set("timeCompleted", js.undefined)
  }
  
}

