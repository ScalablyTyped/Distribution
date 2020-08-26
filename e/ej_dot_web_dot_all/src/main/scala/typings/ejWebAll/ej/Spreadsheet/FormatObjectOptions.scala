package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatObjectOptions extends js.Object {
  /** Pass the decimal places in cell
    */
  var decimalPlaces: js.UndefOr[String] = js.native
  /** Pass the format str in cell
    */
  var formatStr: js.UndefOr[String] = js.native
  /** Pass the style object in a cell
    */
  var style: js.UndefOr[js.Any] = js.native
  /** Pass the thousand separator in cell
    */
  var thousandSeparator: js.UndefOr[String] = js.native
  /** Pass the type of cell
    */
  var `type`: js.UndefOr[String] = js.native
}

object FormatObjectOptions {
  @scala.inline
  def apply(): FormatObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatObjectOptions]
  }
  @scala.inline
  implicit class FormatObjectOptionsOps[Self <: FormatObjectOptions] (val x: Self) extends AnyVal {
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
    def setDecimalPlaces(value: String): Self = this.set("decimalPlaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalPlaces: Self = this.set("decimalPlaces", js.undefined)
    @scala.inline
    def setFormatStr(value: String): Self = this.set("formatStr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatStr: Self = this.set("formatStr", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setThousandSeparator(value: String): Self = this.set("thousandSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandSeparator: Self = this.set("thousandSeparator", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

