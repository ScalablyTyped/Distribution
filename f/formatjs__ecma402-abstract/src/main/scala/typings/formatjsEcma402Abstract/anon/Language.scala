package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language extends StObject {
  
  var currency: LongRecord
  
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: LongNarrow
  
  var region: NarrowShort
  
  var script: LongNarrowShort
}
object Language {
  
  inline def apply(currency: LongRecord, language: LongNarrow, region: NarrowShort, script: LongNarrowShort): Language = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setCurrency(value: LongRecord): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: LongNarrow): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: NarrowShort): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setScript(value: LongNarrowShort): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
