package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedContentReference extends js.Object {
  var sheetsChartReference: js.UndefOr[SheetsChartReference] = js.native
}

object LinkedContentReference {
  @scala.inline
  def apply(): LinkedContentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedContentReference]
  }
  @scala.inline
  implicit class LinkedContentReferenceOps[Self <: LinkedContentReference] (val x: Self) extends AnyVal {
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
    def setSheetsChartReference(value: SheetsChartReference): Self = this.set("sheetsChartReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetsChartReference: Self = this.set("sheetsChartReference", js.undefined)
  }
  
}

