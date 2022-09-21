package typings.devexpressUtils

import typings.devexpressUtils.optionsMod.IDateFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeFieldMod {
  
  @JSImport("@devexpress/utils/lib/formatters/date-time-field", "DateTimeFieldFormatter")
  @js.native
  open class DateTimeFieldFormatter protected () extends StObject {
    def this(options: IDateFormatterOptions) = this()
    
    /* private */ var AMPMKeyword: Any = js.native
    
    /* private */ var charsAreEqual: Any = js.native
    
    /* private */ var charsAreNotEqual: Any = js.native
    
    /* private */ var date: Any = js.native
    
    def format(date: js.Date, formatString: String): String = js.native
    
    /* private */ var formatNext: Any = js.native
    
    /* private */ var formatString: Any = js.native
    
    /* private */ var getCharacterSequenceLength: Any = js.native
    
    /* private */ var isKeyword: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ var processAsAMPMKeyword: Any = js.native
    
    /* private */ var processAsEmbedText: Any = js.native
    
    /* private */ var processAsFormattingItem: Any = js.native
    
    /* private */ var processAsSingleCharacter: Any = js.native
    
    /* private */ var result: Any = js.native
    
    /* private */ var tryCreateFormattingItem: Any = js.native
  }
}
