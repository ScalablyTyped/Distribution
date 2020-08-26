package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeOptions extends js.Object {
  /** Pass the datasource object values as settings
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Pass the showheader condition as settings
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /** Pass the startcell values as settings
    */
  var startCell: js.UndefOr[String] = js.native
}

object RangeOptions {
  @scala.inline
  def apply(): RangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOptions]
  }
  @scala.inline
  implicit class RangeOptionsOps[Self <: RangeOptions] (val x: Self) extends AnyVal {
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
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    @scala.inline
    def setStartCell(value: String): Self = this.set("startCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCell: Self = this.set("startCell", js.undefined)
  }
  
}

