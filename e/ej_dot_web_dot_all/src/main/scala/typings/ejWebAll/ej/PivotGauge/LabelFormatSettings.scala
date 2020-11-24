package typings.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelFormatSettings extends js.Object {
  
  /** Allows you to set the number of digits displayed after decimal point.
    * @Default {5}
    */
  var decimalPlaces: js.UndefOr[Double] = js.native
  
  /** Allows the user to change the number format of the label values in PivotGauge.
    * @Default {ej.PivotGauge.NumberFormat.Default}
    */
  var numberFormat: js.UndefOr[NumberFormat | String] = js.native
  
  /** Allows you to add a text at the beginning of the label.
    */
  var prefixText: js.UndefOr[String] = js.native
  
  /** Allows you to add text at the end of the label.
    */
  var suffixText: js.UndefOr[String] = js.native
}
object LabelFormatSettings {
  
  @scala.inline
  def apply(): LabelFormatSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelFormatSettings]
  }
  
  @scala.inline
  implicit class LabelFormatSettingsOps[Self <: LabelFormatSettings] (val x: Self) extends AnyVal {
    
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
    def setNumberFormat(value: NumberFormat | String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    
    @scala.inline
    def setPrefixText(value: String): Self = this.set("prefixText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixText: Self = this.set("prefixText", js.undefined)
    
    @scala.inline
    def setSuffixText(value: String): Self = this.set("suffixText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffixText: Self = this.set("suffixText", js.undefined)
  }
}
