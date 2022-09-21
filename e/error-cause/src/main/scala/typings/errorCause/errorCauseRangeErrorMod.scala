package typings.errorCause

import typings.errorCause.anon.Cause
import typings.std.RangeErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorCauseRangeErrorMod {
  
  @JSImport("error-cause/RangeError", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RangeError {
    def this(reason: String) = this()
    def this(reason: String, options: Cause) = this()
    def this(reason: Unit, options: Cause) = this()
  }
  
  @js.native
  trait RangeError
    extends StObject
       with RangeErrorConstructor {
    
    var cause: Any = js.native
  }
}
