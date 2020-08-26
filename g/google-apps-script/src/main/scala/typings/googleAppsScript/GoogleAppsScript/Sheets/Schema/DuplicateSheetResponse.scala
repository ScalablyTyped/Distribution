package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplicateSheetResponse extends js.Object {
  var properties: js.UndefOr[SheetProperties] = js.native
}

object DuplicateSheetResponse {
  @scala.inline
  def apply(): DuplicateSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateSheetResponse]
  }
  @scala.inline
  implicit class DuplicateSheetResponseOps[Self <: DuplicateSheetResponse] (val x: Self) extends AnyVal {
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
    def setProperties(value: SheetProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

