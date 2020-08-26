package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteControl extends js.Object {
  var requiredRevisionId: js.UndefOr[String] = js.native
}

object WriteControl {
  @scala.inline
  def apply(): WriteControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteControl]
  }
  @scala.inline
  implicit class WriteControlOps[Self <: WriteControl] (val x: Self) extends AnyVal {
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
    def setRequiredRevisionId(value: String): Self = this.set("requiredRevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredRevisionId: Self = this.set("requiredRevisionId", js.undefined)
  }
  
}

