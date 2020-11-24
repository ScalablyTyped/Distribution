package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait formatSettings extends js.Object {
  
  var currency: currencySettings = js.native
  
  var decimals: Double = js.native
  
  var groupSizes: js.Array[Double] = js.native
  
  var pattern: js.Array[String] = js.native
  
  var percent: percentSettings = js.native
}
object formatSettings {
  
  @scala.inline
  def apply(
    currency: currencySettings,
    decimals: Double,
    groupSizes: js.Array[Double],
    pattern: js.Array[String],
    percent: percentSettings
  ): formatSettings = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSizes = groupSizes.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[formatSettings]
  }
  
  @scala.inline
  implicit class formatSettingsOps[Self <: formatSettings] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: currencySettings): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSizesVarargs(value: Double*): Self = this.set("groupSizes", js.Array(value :_*))
    
    @scala.inline
    def setGroupSizes(value: js.Array[Double]): Self = this.set("groupSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternVarargs(value: String*): Self = this.set("pattern", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: js.Array[String]): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: percentSettings): Self = this.set("percent", value.asInstanceOf[js.Any])
  }
}
