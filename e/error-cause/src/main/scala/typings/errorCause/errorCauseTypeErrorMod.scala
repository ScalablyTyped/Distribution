package typings.errorCause

import typings.errorCause.anon.Cause
import typings.std.TypeErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorCauseTypeErrorMod {
  
  @JSImport("error-cause/TypeError", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TypeError {
    def this(reason: String) = this()
    def this(reason: String, options: Cause) = this()
    def this(reason: Unit, options: Cause) = this()
  }
  
  @js.native
  trait TypeError
    extends StObject
       with TypeErrorConstructor {
    
    var cause: Any = js.native
  }
}
