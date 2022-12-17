package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatDateOptions
  extends StObject
     with NativeFormatterOptions {
  
  var locale: js.UndefOr[String] = js.undefined
}
object FormatDateOptions {
  
  inline def apply(): FormatDateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatDateOptions]
  }
  
  extension [Self <: FormatDateOptions](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
