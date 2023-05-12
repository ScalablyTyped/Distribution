package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calendar extends StObject {
  
  var calendar: NarrowRecord
  
  var currency: LongRecord
  
  var dateTimeField: ShortRecord
  
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: Dialect
  
  var region: NarrowShort
  
  var script: LongNarrowShort
}
object Calendar {
  
  inline def apply(
    calendar: NarrowRecord,
    currency: LongRecord,
    dateTimeField: ShortRecord,
    language: Dialect,
    region: NarrowShort,
    script: LongNarrowShort
  ): Calendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], dateTimeField = dateTimeField.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
    
    inline def setCalendar(value: NarrowRecord): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: LongRecord): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDateTimeField(value: ShortRecord): Self = StObject.set(x, "dateTimeField", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Dialect): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: NarrowShort): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setScript(value: LongNarrowShort): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
