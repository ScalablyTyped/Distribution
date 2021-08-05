package typings.gherkin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenScannerMod {
  
  @JSImport("gherkin/dist/src/TokenScanner", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with TokenScanner {
    def this(source: String) = this()
    
    /* private */ /* CompleteClass */
    var lineNumber: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var lines: js.Any = js.native
    
    /* CompleteClass */
    override def read(): typings.gherkin.tokenMod.default = js.native
  }
  
  trait TokenScanner extends StObject {
    
    /* private */ var lineNumber: js.Any
    
    /* private */ var lines: js.Any
    
    def read(): typings.gherkin.tokenMod.default
  }
  object TokenScanner {
    
    inline def apply(lineNumber: js.Any, lines: js.Any, read: () => typings.gherkin.tokenMod.default): TokenScanner = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[TokenScanner]
    }
    
    extension [Self <: TokenScanner](x: Self) {
      
      inline def setLineNumber(value: js.Any): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLines(value: js.Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setRead(value: () => typings.gherkin.tokenMod.default): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    }
  }
}
