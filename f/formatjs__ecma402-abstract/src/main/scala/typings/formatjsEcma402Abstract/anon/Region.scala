package typings.formatjsEcma402Abstract.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends js.Object {
  
  var currency: NarrowRecordShortRecord = js.native
  
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: NarrowRecord = js.native
  
  var region: ShortRecord = js.native
  
  var script: LongRecordNarrowRecord = js.native
}
object Region {
  
  @scala.inline
  def apply(
    currency: NarrowRecordShortRecord,
    language: NarrowRecord,
    region: ShortRecord,
    script: LongRecordNarrowRecord
  ): Region = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: NarrowRecordShortRecord): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: NarrowRecord): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: ShortRecord): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: LongRecordNarrowRecord): Self = this.set("script", value.asInstanceOf[js.Any])
  }
}
