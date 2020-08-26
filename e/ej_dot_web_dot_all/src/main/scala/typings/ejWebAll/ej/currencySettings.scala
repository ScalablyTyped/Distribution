package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait currencySettings extends js.Object {
  var decimals: Double = js.native
  var groupSizes: js.Array[Double] = js.native
  var pattern: js.Array[String] = js.native
  var symbol: String = js.native
}

object currencySettings {
  @scala.inline
  def apply(decimals: Double, groupSizes: js.Array[Double], pattern: js.Array[String], symbol: String): currencySettings = {
    val __obj = js.Dynamic.literal(decimals = decimals.asInstanceOf[js.Any], groupSizes = groupSizes.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[currencySettings]
  }
  @scala.inline
  implicit class currencySettingsOps[Self <: currencySettings] (val x: Self) extends AnyVal {
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
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

