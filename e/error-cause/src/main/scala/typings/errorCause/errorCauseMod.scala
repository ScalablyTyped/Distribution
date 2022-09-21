package typings.errorCause

import typings.errorCause.anon.Cause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorCauseMod {
  
  @JSImport("error-cause/Error", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with typings.errorCause.errorCauseMod.Error {
    def this(reason: String) = this()
    def this(reason: String, options: Cause) = this()
    def this(reason: Unit, options: Cause) = this()
  }
  
  @js.native
  trait Error
    extends StObject
       with ErrorConstructor {
    
    var cause: Any = js.native
  }
}
