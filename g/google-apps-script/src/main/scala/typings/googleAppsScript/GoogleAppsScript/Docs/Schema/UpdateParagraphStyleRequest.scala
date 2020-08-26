package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateParagraphStyleRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.native
  var range: js.UndefOr[Range] = js.native
}

object UpdateParagraphStyleRequest {
  @scala.inline
  def apply(): UpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParagraphStyleRequest]
  }
  @scala.inline
  implicit class UpdateParagraphStyleRequestOps[Self <: UpdateParagraphStyleRequest] (val x: Self) extends AnyVal {
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setParagraphStyle(value: ParagraphStyle): Self = this.set("paragraphStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphStyle: Self = this.set("paragraphStyle", js.undefined)
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

