package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsRowsCellsFormat extends js.Object {
  
  /** Specifies the number of decimal places for the given input.
    * @Default {2}
    */
  var decimalPlaces: js.UndefOr[Double] = js.native
  
  /** Specifies the string format for the given input.
    */
  var formatStr: js.UndefOr[String] = js.native
  
  /** Specifies the thousand separator for the given input.
    * @Default {false}
    */
  var thousandSeparator: js.UndefOr[Boolean] = js.native
  
  /** Specifies the type of the format in Spreadsheet.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SheetsRowsCellsFormat {
  
  @scala.inline
  def apply(): SheetsRowsCellsFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRowsCellsFormat]
  }
  
  @scala.inline
  implicit class SheetsRowsCellsFormatOps[Self <: SheetsRowsCellsFormat] (val x: Self) extends AnyVal {
    
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
    def setDecimalPlaces(value: Double): Self = this.set("decimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalPlaces: Self = this.set("decimalPlaces", js.undefined)
    
    @scala.inline
    def setFormatStr(value: String): Self = this.set("formatStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatStr: Self = this.set("formatStr", js.undefined)
    
    @scala.inline
    def setThousandSeparator(value: Boolean): Self = this.set("thousandSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThousandSeparator: Self = this.set("thousandSeparator", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
