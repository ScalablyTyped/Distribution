package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableColumnProperties extends js.Object {
  var width: js.UndefOr[Dimension] = js.native
  var widthType: js.UndefOr[String] = js.native
}

object TableColumnProperties {
  @scala.inline
  def apply(): TableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnProperties]
  }
  @scala.inline
  implicit class TableColumnPropertiesOps[Self <: TableColumnProperties] (val x: Self) extends AnyVal {
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
    def setWidth(value: Dimension): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthType(value: String): Self = this.set("widthType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthType: Self = this.set("widthType", js.undefined)
  }
  
}

