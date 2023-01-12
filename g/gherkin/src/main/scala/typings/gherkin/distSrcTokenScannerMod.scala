package typings.gherkin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTokenScannerMod {
  
  @JSImport("gherkin/dist/src/TokenScanner", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TokenScanner {
    def this(source: String) = this()
    
    /* private */ /* CompleteClass */
    var lineNumber: Any = js.native
    
    /* private */ /* CompleteClass */
    var lines: Any = js.native
    
    /* CompleteClass */
    override def read(): typings.gherkin.distSrcTokenMod.default = js.native
  }
  
  trait TokenScanner extends StObject {
    
    /* private */ var lineNumber: Any
    
    /* private */ var lines: Any
    
    def read(): typings.gherkin.distSrcTokenMod.default
  }
  object TokenScanner {
    
    inline def apply(lineNumber: Any, lines: Any, read: () => typings.gherkin.distSrcTokenMod.default): TokenScanner = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[TokenScanner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenScanner] (val x: Self) extends AnyVal {
      
      inline def setLineNumber(value: Any): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setRead(value: () => typings.gherkin.distSrcTokenMod.default): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    }
  }
}
