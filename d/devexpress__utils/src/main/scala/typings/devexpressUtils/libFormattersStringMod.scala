package typings.devexpressUtils

import typings.devexpressUtils.libFormattersDateMod.DateFormatter
import typings.devexpressUtils.libFormattersNumberMod.NumberFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormattersStringMod {
  
  @JSImport("@devexpress/utils/lib/formatters/string", "StringFormatter")
  @js.native
  open class StringFormatter protected () extends StObject {
    def this(dateFormatter: DateFormatter, numberFormatter: NumberFormatter) = this()
    
    /* private */ var activeDateFormat: Any = js.native
    
    /* private */ val dateFormatter: Any = js.native
    
    def format(pattern: String, args: Any*): String = js.native
    
    /* private */ val numberFormatter: Any = js.native
    
    /* private */ var parseSpec: Any = js.native
  }
}
