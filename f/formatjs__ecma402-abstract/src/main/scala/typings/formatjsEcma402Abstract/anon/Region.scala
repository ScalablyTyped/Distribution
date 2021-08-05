package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var currency: NarrowRecordShortRecord
  
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: NarrowRecord
  
  var region: ShortRecord
  
  var script: LongRecordNarrowRecord
}
object Region {
  
  inline def apply(
    currency: NarrowRecordShortRecord,
    language: NarrowRecord,
    region: ShortRecord,
    script: LongRecordNarrowRecord
  ): Region = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  extension [Self <: Region](x: Self) {
    
    inline def setCurrency(value: NarrowRecordShortRecord): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: NarrowRecord): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: ShortRecord): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setScript(value: LongRecordNarrowRecord): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
