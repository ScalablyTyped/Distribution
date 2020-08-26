package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends js.Object {
  var currency: NarrowRecord = js.native
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: NarrowShort = js.native
  var region: LongNarrowShort = js.native
  var script: LongRecord = js.native
}

object Language {
  @scala.inline
  def apply(currency: NarrowRecord, language: NarrowShort, region: LongNarrowShort, script: LongRecord): Language = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
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
    def setCurrency(value: NarrowRecord): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: NarrowShort): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: LongNarrowShort): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: LongRecord): Self = this.set("script", value.asInstanceOf[js.Any])
  }
  
}

