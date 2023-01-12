package typings.formatThousands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FormatFourDigits extends StObject {
    
    var formatFourDigits: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object FormatFourDigits {
    
    inline def apply(): FormatFourDigits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatFourDigits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatFourDigits] (val x: Self) extends AnyVal {
      
      inline def setFormatFourDigits(value: Boolean): Self = StObject.set(x, "formatFourDigits", value.asInstanceOf[js.Any])
      
      inline def setFormatFourDigitsUndefined: Self = StObject.set(x, "formatFourDigits", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
