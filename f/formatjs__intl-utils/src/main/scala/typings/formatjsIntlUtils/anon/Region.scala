package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Region extends js.Object {
  var currency: LongRecordNarrowRecordShortRecord = js.native
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: ShortRecord = js.native
  var region: LongRecordNarrowRecord = js.native
  var script: NarrowRecordShortRecord = js.native
}

object Region {
  @scala.inline
  def apply(
    currency: LongRecordNarrowRecordShortRecord,
    language: ShortRecord,
    region: LongRecordNarrowRecord,
    script: NarrowRecordShortRecord
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
    def setCurrency(value: LongRecordNarrowRecordShortRecord): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: ShortRecord): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: LongRecordNarrowRecord): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: NarrowRecordShortRecord): Self = this.set("script", value.asInstanceOf[js.Any])
  }
  
}

