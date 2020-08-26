package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetProperties extends js.Object {
  var gridProperties: js.UndefOr[GridProperties] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var rightToLeft: js.UndefOr[Boolean] = js.native
  var sheetId: js.UndefOr[Double] = js.native
  var sheetType: js.UndefOr[String] = js.native
  var tabColor: js.UndefOr[Color] = js.native
  var title: js.UndefOr[String] = js.native
}

object SheetProperties {
  @scala.inline
  def apply(): SheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetProperties]
  }
  @scala.inline
  implicit class SheetPropertiesOps[Self <: SheetProperties] (val x: Self) extends AnyVal {
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
    def setGridProperties(value: GridProperties): Self = this.set("gridProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridProperties: Self = this.set("gridProperties", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setRightToLeft(value: Boolean): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightToLeft: Self = this.set("rightToLeft", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
    @scala.inline
    def setSheetType(value: String): Self = this.set("sheetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetType: Self = this.set("sheetType", js.undefined)
    @scala.inline
    def setTabColor(value: Color): Self = this.set("tabColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabColor: Self = this.set("tabColor", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

