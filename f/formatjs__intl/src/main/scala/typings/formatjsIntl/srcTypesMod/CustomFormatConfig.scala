package typings.formatjsIntl.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFormatConfig[Source] extends StObject {
  
  var format: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Source extends keyof @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats[Source] : string */ js.Any
  ] = js.undefined
}
object CustomFormatConfig {
  
  inline def apply[Source](): CustomFormatConfig[Source] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFormatConfig[Source]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomFormatConfig[?], Source] (val x: Self & CustomFormatConfig[Source]) extends AnyVal {
    
    inline def setFormat(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Source extends keyof @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats[Source] : string */ js.Any
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
