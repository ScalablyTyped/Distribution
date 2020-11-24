package typings.formatjsEcma402Abstract.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Language extends js.Object {
  
  var currency: LongRecord = js.native
  
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: LongNarrow = js.native
  
  var region: NarrowShort = js.native
  
  var script: LongNarrowShort = js.native
}
object Language {
  
  @scala.inline
  def apply(currency: LongRecord, language: LongNarrow, region: NarrowShort, script: LongNarrowShort): Language = {
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
    def setCurrency(value: LongRecord): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: LongNarrow): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: NarrowShort): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: LongNarrowShort): Self = this.set("script", value.asInstanceOf[js.Any])
  }
}
