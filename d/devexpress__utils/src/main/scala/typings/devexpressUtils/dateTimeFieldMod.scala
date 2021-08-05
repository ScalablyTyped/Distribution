package typings.devexpressUtils

import typings.devexpressUtils.optionsMod.IDateFormatterOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeFieldMod {
  
  @JSImport("@devexpress/utils/lib/formatters/date-time-field", "DateTimeFieldFormatter")
  @js.native
  class DateTimeFieldFormatter protected () extends StObject {
    def this(options: IDateFormatterOptions) = this()
    
    /* private */ var AMPMKeyword: js.Any = js.native
    
    /* private */ var charsAreEqual: js.Any = js.native
    
    /* private */ var charsAreNotEqual: js.Any = js.native
    
    /* private */ var date: js.Any = js.native
    
    def format(date: Date, formatString: String): String = js.native
    
    /* private */ var formatNext: js.Any = js.native
    
    /* private */ var formatString: js.Any = js.native
    
    /* private */ var getCharacterSequenceLength: js.Any = js.native
    
    /* private */ var isKeyword: js.Any = js.native
    
    /* private */ val options: js.Any = js.native
    
    /* private */ var processAsAMPMKeyword: js.Any = js.native
    
    /* private */ var processAsEmbedText: js.Any = js.native
    
    /* private */ var processAsFormattingItem: js.Any = js.native
    
    /* private */ var processAsSingleCharacter: js.Any = js.native
    
    /* private */ var result: js.Any = js.native
    
    /* private */ var tryCreateFormattingItem: js.Any = js.native
  }
}
