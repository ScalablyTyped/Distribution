package typings.formatjsIntl.libSrcTypesMod

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.formatjsIntl.formatjsIntlStrings.date
import typings.formatjsIntl.formatjsIntlStrings.number
import typings.formatjsIntl.formatjsIntlStrings.time
import typings.intlMessageformat.srcFormattersMod.Format
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.RelativeTimeFormatOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<intl-messageformat.intl-messageformat.Formats> */
trait CustomFormats extends StObject {
  
  var date: js.UndefOr[
    Record[Format[typings.formatjsIntl.formatjsIntlStrings.date], DateTimeFormatOptions]
  ] = js.undefined
  
  var number: js.UndefOr[
    Record[Format[typings.formatjsIntl.formatjsIntlStrings.number], NumberFormatOptions]
  ] = js.undefined
  
  var relative: js.UndefOr[Record[String, RelativeTimeFormatOptions]] = js.undefined
  
  var time: js.UndefOr[
    Record[Format[typings.formatjsIntl.formatjsIntlStrings.time], DateTimeFormatOptions]
  ] = js.undefined
}
object CustomFormats {
  
  inline def apply(): CustomFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFormats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomFormats] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Record[Format[date], DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setNumber(value: Record[Format[number], NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setRelative(value: Record[String, RelativeTimeFormatOptions]): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setTime(value: Record[Format[time], DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
