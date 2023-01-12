package typings.formatjsIntl.libSrcTypesMod

import typings.formatjsIntl.formatjsIntlStrings.conjunction
import typings.formatjsIntl.formatjsIntlStrings.disjunction
import typings.formatjsIntl.formatjsIntlStrings.long
import typings.formatjsIntl.formatjsIntlStrings.narrow
import typings.formatjsIntl.formatjsIntlStrings.short
import typings.formatjsIntl.formatjsIntlStrings.unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@formatjs/intl-listformat.@formatjs/intl-listformat.IntlListFormatOptions, 'localeMatcher'> */
trait FormatListOptions extends StObject {
  
  var style: js.UndefOr[long | short | narrow] = js.undefined
  
  var `type`: js.UndefOr[conjunction | disjunction | unit] = js.undefined
}
object FormatListOptions {
  
  inline def apply(): FormatListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatListOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatListOptions] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: conjunction | disjunction | unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
