package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetupTag extends js.Object {
  var stopOnSetupFailure: js.UndefOr[Boolean] = js.native
  var tagName: js.UndefOr[String] = js.native
}

object SetupTag {
  @scala.inline
  def apply(): SetupTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupTag]
  }
  @scala.inline
  implicit class SetupTagOps[Self <: SetupTag] (val x: Self) extends AnyVal {
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
    def setStopOnSetupFailure(value: Boolean): Self = this.set("stopOnSetupFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOnSetupFailure: Self = this.set("stopOnSetupFailure", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
  
}

