package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptions extends js.Object {
  /** Pass the border condition
    */
  var border: js.UndefOr[Boolean] = js.native
  /** Pass the cell style to be removed
    */
  var cellStyle: js.UndefOr[Boolean] = js.native
  /** Pass the format
    */
  var format: js.UndefOr[Boolean] = js.native
  /** Pass the table style to be removed
    */
  var tableStyle: js.UndefOr[Boolean] = js.native
}

object FormatOptions {
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
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
    def setBorder(value: Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setCellStyle(value: Boolean): Self = this.set("cellStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellStyle: Self = this.set("cellStyle", js.undefined)
    @scala.inline
    def setFormat(value: Boolean): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setTableStyle(value: Boolean): Self = this.set("tableStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableStyle: Self = this.set("tableStyle", js.undefined)
  }
  
}

