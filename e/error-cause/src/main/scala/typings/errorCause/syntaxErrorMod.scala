package typings.errorCause

import typings.errorCause.anon.Cause
import typings.std.SyntaxErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntaxErrorMod {
  
  @JSImport("error-cause/SyntaxError", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SyntaxError {
    def this(reason: String) = this()
    def this(reason: String, options: Cause) = this()
    def this(reason: Unit, options: Cause) = this()
  }
  
  @js.native
  trait SyntaxError
    extends StObject
       with SyntaxErrorConstructor {
    
    var cause: Any = js.native
  }
}
