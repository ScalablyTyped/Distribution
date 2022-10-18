package typings.devexpressUtils

import typings.devexpressUtils.libFormattersDateMod.DateFormatter
import typings.devexpressUtils.libFormattersNumberMod.NumberFormatter
import typings.devexpressUtils.libFormattersOptionsMod.IFormattersOptions
import typings.devexpressUtils.libFormattersStringMod.StringFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormattersManagerMod {
  
  @JSImport("@devexpress/utils/lib/formatters/manager", "SimpleFormattersManager")
  @js.native
  open class SimpleFormattersManager protected () extends StObject {
    def this(options: IFormattersOptions) = this()
    
    var dateFormatter: DateFormatter = js.native
    
    def formatDate(format: String, date: js.Date): String = js.native
    
    def formatNumber(format: String, value: Double): String = js.native
    
    def formatString(pattern: String, args: Any*): String = js.native
    
    var numberFormatter: NumberFormatter = js.native
    
    var options: IFormattersOptions = js.native
    
    var stringFormatter: StringFormatter = js.native
  }
}
