package typings.formatjsIntl.srcTypesMod

import typings.formatjsIntl.formatjsIntlStrings.calendar
import typings.formatjsIntl.formatjsIntlStrings.code
import typings.formatjsIntl.formatjsIntlStrings.currency
import typings.formatjsIntl.formatjsIntlStrings.dateTimeField
import typings.formatjsIntl.formatjsIntlStrings.dialect
import typings.formatjsIntl.formatjsIntlStrings.language
import typings.formatjsIntl.formatjsIntlStrings.long
import typings.formatjsIntl.formatjsIntlStrings.narrow
import typings.formatjsIntl.formatjsIntlStrings.none
import typings.formatjsIntl.formatjsIntlStrings.region
import typings.formatjsIntl.formatjsIntlStrings.script
import typings.formatjsIntl.formatjsIntlStrings.short
import typings.formatjsIntl.formatjsIntlStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNamesOptions, 'localeMatcher'> */
trait FormatDisplayNameOptions extends StObject {
  
  var fallback: js.UndefOr[code | none] = js.undefined
  
  var languageDisplay: js.UndefOr[dialect | standard] = js.undefined
  
  var style: js.UndefOr[narrow | short | long] = js.undefined
  
  var `type`: language | region | script | currency | calendar | dateTimeField
}
object FormatDisplayNameOptions {
  
  inline def apply(`type`: language | region | script | currency | calendar | dateTimeField): FormatDisplayNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDisplayNameOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatDisplayNameOptions] (val x: Self) extends AnyVal {
    
    inline def setFallback(value: code | none): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setLanguageDisplay(value: dialect | standard): Self = StObject.set(x, "languageDisplay", value.asInstanceOf[js.Any])
    
    inline def setLanguageDisplayUndefined: Self = StObject.set(x, "languageDisplay", js.undefined)
    
    inline def setStyle(value: narrow | short | long): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: language | region | script | currency | calendar | dateTimeField): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
