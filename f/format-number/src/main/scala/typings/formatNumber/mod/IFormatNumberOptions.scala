package typings.formatNumber.mod

import typings.formatNumber.formatNumberStrings.brackets
import typings.formatNumber.formatNumberStrings.left
import typings.formatNumber.formatNumberStrings.none
import typings.formatNumber.formatNumberStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormatNumberOptions extends js.Object {
  var decimal: js.UndefOr[String] = js.native
  var decimalsSeparator: js.UndefOr[String] = js.native
  var integerSeparator: js.UndefOr[String] = js.native
  var negativeLeftOut: js.UndefOr[Boolean] = js.native
  var negativeLeftSymbol: js.UndefOr[String] = js.native
  var negativeRightOut: js.UndefOr[Boolean] = js.native
  var negativeRightSymbol: js.UndefOr[String] = js.native
  var negativeType: js.UndefOr[right | left | brackets | none] = js.native
  var padLeft: js.UndefOr[Double] = js.native
  var padRight: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var round: js.UndefOr[Double] = js.native
  var suffix: js.UndefOr[String] = js.native
  var truncate: js.UndefOr[Double] = js.native
}

object IFormatNumberOptions {
  @scala.inline
  def apply(): IFormatNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormatNumberOptions]
  }
  @scala.inline
  implicit class IFormatNumberOptionsOps[Self <: IFormatNumberOptions] (val x: Self) extends AnyVal {
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
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setDecimalsSeparator(value: String): Self = this.set("decimalsSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalsSeparator: Self = this.set("decimalsSeparator", js.undefined)
    @scala.inline
    def setIntegerSeparator(value: String): Self = this.set("integerSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerSeparator: Self = this.set("integerSeparator", js.undefined)
    @scala.inline
    def setNegativeLeftOut(value: Boolean): Self = this.set("negativeLeftOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeLeftOut: Self = this.set("negativeLeftOut", js.undefined)
    @scala.inline
    def setNegativeLeftSymbol(value: String): Self = this.set("negativeLeftSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeLeftSymbol: Self = this.set("negativeLeftSymbol", js.undefined)
    @scala.inline
    def setNegativeRightOut(value: Boolean): Self = this.set("negativeRightOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeRightOut: Self = this.set("negativeRightOut", js.undefined)
    @scala.inline
    def setNegativeRightSymbol(value: String): Self = this.set("negativeRightSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeRightSymbol: Self = this.set("negativeRightSymbol", js.undefined)
    @scala.inline
    def setNegativeType(value: right | left | brackets | none): Self = this.set("negativeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeType: Self = this.set("negativeType", js.undefined)
    @scala.inline
    def setPadLeft(value: Double): Self = this.set("padLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadLeft: Self = this.set("padLeft", js.undefined)
    @scala.inline
    def setPadRight(value: Double): Self = this.set("padRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadRight: Self = this.set("padRight", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRound(value: Double): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setTruncate(value: Double): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
  }
  
}

