package typings.formatjsIntl.libSrcTypesMod

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typings.formatjsIntlDisplaynames.mod.DisplayNames
import typings.formatjsIntlListformat.mod.default
import typings.intlMessageformat.mod.IntlMessageFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import typings.std.Intl.RelativeTimeFormat
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntlCache extends StObject {
  
  var dateTime: Record[String, DateTimeFormat]
  
  var displayNames: Record[String, DisplayNames]
  
  var list: Record[String, default]
  
  var message: Record[String, IntlMessageFormat]
  
  var number: Record[String, NumberFormat]
  
  var pluralRules: Record[String, PluralRules]
  
  var relativeTime: Record[String, RelativeTimeFormat]
}
object IntlCache {
  
  inline def apply(
    dateTime: Record[String, DateTimeFormat],
    displayNames: Record[String, DisplayNames],
    list: Record[String, default],
    message: Record[String, IntlMessageFormat],
    number: Record[String, NumberFormat],
    pluralRules: Record[String, PluralRules],
    relativeTime: Record[String, RelativeTimeFormat]
  ): IntlCache = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlCache]
  }
  
  extension [Self <: IntlCache](x: Self) {
    
    inline def setDateTime(value: Record[String, DateTimeFormat]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDisplayNames(value: Record[String, DisplayNames]): Self = StObject.set(x, "displayNames", value.asInstanceOf[js.Any])
    
    inline def setList(value: Record[String, default]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Record[String, IntlMessageFormat]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Record[String, NumberFormat]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPluralRules(value: Record[String, PluralRules]): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
    
    inline def setRelativeTime(value: Record[String, RelativeTimeFormat]): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
  }
}
