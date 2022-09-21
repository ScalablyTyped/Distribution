package typings.formatjsIntl.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFormatConfig[Source] extends StObject {
  
  var format: js.UndefOr[
    String | (/* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats[Source] */ js.Any)
  ] = js.undefined
}
object CustomFormatConfig {
  
  inline def apply[Source](): CustomFormatConfig[Source] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFormatConfig[Source]]
  }
  
  extension [Self <: CustomFormatConfig[?], Source](x: Self & CustomFormatConfig[Source]) {
    
    inline def setFormat(
      value: String | (/* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats[Source] */ js.Any)
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
