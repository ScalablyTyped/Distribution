package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoResizeDimensionsRequest extends js.Object {
  var dimensions: js.UndefOr[DimensionRange] = js.native
}

object AutoResizeDimensionsRequest {
  @scala.inline
  def apply(): AutoResizeDimensionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoResizeDimensionsRequest]
  }
  @scala.inline
  implicit class AutoResizeDimensionsRequestOps[Self <: AutoResizeDimensionsRequest] (val x: Self) extends AnyVal {
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
    def setDimensions(value: DimensionRange): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
  }
  
}

