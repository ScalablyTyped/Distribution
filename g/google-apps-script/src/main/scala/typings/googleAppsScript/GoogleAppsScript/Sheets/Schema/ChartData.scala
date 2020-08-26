package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartData extends js.Object {
  var sourceRange: js.UndefOr[ChartSourceRange] = js.native
}

object ChartData {
  @scala.inline
  def apply(): ChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartData]
  }
  @scala.inline
  implicit class ChartDataOps[Self <: ChartData] (val x: Self) extends AnyVal {
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
    def setSourceRange(value: ChartSourceRange): Self = this.set("sourceRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRange: Self = this.set("sourceRange", js.undefined)
  }
  
}

