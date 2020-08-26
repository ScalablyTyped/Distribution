package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFilterViewRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var filter: js.UndefOr[FilterView] = js.native
}

object UpdateFilterViewRequest {
  @scala.inline
  def apply(): UpdateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFilterViewRequest]
  }
  @scala.inline
  implicit class UpdateFilterViewRequestOps[Self <: UpdateFilterViewRequest] (val x: Self) extends AnyVal {
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
    def setFilter(value: FilterView): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
  
}

