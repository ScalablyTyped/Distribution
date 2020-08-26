package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNamedRangeRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var namedRange: js.UndefOr[NamedRange] = js.native
}

object UpdateNamedRangeRequest {
  @scala.inline
  def apply(): UpdateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNamedRangeRequest]
  }
  @scala.inline
  implicit class UpdateNamedRangeRequestOps[Self <: UpdateNamedRangeRequest] (val x: Self) extends AnyVal {
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
    def setNamedRange(value: NamedRange): Self = this.set("namedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedRange: Self = this.set("namedRange", js.undefined)
  }
  
}

