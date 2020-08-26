package typings.formatjsIntlDisplaynames.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currency extends js.Object {
  var currency: LongNarrow = js.native
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: Long = js.native
  var region: Narrow = js.native
  var script: Short = js.native
}

object Currency {
  @scala.inline
  def apply(currency: LongNarrow, language: Long, region: Narrow, script: Short): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
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
    def setCurrency(value: LongNarrow): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: Long): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: Narrow): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: Short): Self = this.set("script", value.asInstanceOf[js.Any])
  }
  
}

