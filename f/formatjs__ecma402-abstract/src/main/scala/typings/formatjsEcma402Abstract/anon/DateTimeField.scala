package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeField extends StObject {
  
  var calendar: `2`
  
  var currency: `1`
  
  var dateTimeField: `3`
  
  /**
    * Maps language subtag like `zh-CN` to their display names.
    */
  var language: DialectStandard
  
  var region: NarrowRecordShortRecord
  
  var script: LongRecordNarrowRecordShortRecord
}
object DateTimeField {
  
  inline def apply(
    calendar: `2`,
    currency: `1`,
    dateTimeField: `3`,
    language: DialectStandard,
    region: NarrowRecordShortRecord,
    script: LongRecordNarrowRecordShortRecord
  ): DateTimeField = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], dateTimeField = dateTimeField.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeField] (val x: Self) extends AnyVal {
    
    inline def setCalendar(value: `2`): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: `1`): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDateTimeField(value: `3`): Self = StObject.set(x, "dateTimeField", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: DialectStandard): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: NarrowRecordShortRecord): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setScript(value: LongRecordNarrowRecordShortRecord): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
