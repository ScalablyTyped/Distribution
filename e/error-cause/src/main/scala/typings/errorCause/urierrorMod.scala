package typings.errorCause

import typings.errorCause.anon.Cause
import typings.std.URIErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urierrorMod {
  
  @JSImport("error-cause/URIError", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with URIError {
    def this(reason: String) = this()
    def this(reason: String, options: Cause) = this()
    def this(reason: Unit, options: Cause) = this()
  }
  
  @js.native
  trait URIError
    extends StObject
       with URIErrorConstructor {
    
    var cause: Any = js.native
  }
}
