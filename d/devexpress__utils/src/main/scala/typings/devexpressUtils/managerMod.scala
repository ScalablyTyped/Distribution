package typings.devexpressUtils

import typings.devexpressUtils.dateMod.DateFormatter
import typings.devexpressUtils.numberMod.NumberFormatter
import typings.devexpressUtils.optionsMod.IFormattersOptions
import typings.devexpressUtils.stringMod.StringFormatter
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managerMod {
  
  @JSImport("@devexpress/utils/lib/formatters/manager", "SimpleFormattersManager")
  @js.native
  class SimpleFormattersManager protected () extends StObject {
    def this(options: IFormattersOptions) = this()
    
    var dateFormatter: DateFormatter = js.native
    
    def formatDate(format: String, date: Date): String = js.native
    
    def formatNumber(format: String, value: Double): String = js.native
    
    def formatString(pattern: String, args: js.Any*): String = js.native
    
    var numberFormatter: NumberFormatter = js.native
    
    var options: IFormattersOptions = js.native
    
    var stringFormatter: StringFormatter = js.native
  }
}
