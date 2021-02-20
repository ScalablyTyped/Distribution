package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends StObject {
  
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
  implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: NarrowRecordShortRecord): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: NarrowRecord): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: ShortRecord): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: LongRecordNarrowRecord): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
