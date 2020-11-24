package typings.devexpressUtils

import typings.devexpressUtils.optionsMod.IDateFormatterOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/formatters/date-time-field", JSImport.Namespace)
@js.native
object dateTimeFieldMod extends js.Object {
  
  @js.native
  class DateTimeFieldFormatter protected () extends js.Object {
    def this(options: IDateFormatterOptions) = this()
    
    var AMPMKeyword: js.Any = js.native
    
    var charsAreEqual: js.Any = js.native
    
    var charsAreNotEqual: js.Any = js.native
    
    var date: js.Any = js.native
    
    def format(date: Date, formatString: String): String = js.native
    
    var formatNext: js.Any = js.native
    
    var formatString: js.Any = js.native
    
    var getCharacterSequenceLength: js.Any = js.native
    
    var isKeyword: js.Any = js.native
    
    val options: js.Any = js.native
    
    var processAsAMPMKeyword: js.Any = js.native
    
    var processAsEmbedText: js.Any = js.native
    
    var processAsFormattingItem: js.Any = js.native
    
    var processAsSingleCharacter: js.Any = js.native
    
    var result: js.Any = js.native
    
    var tryCreateFormattingItem: js.Any = js.native
  }
}
