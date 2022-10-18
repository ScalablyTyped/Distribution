package typings.errorCause

import org.scalablytyped.runtime.Shortcut
import typings.std.ErrorOptions
import typings.std.EvalErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseEvalErrorMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("error-cause/base/EvalError", JSImport.Default)
  @js.native
  /* standard es5 */
  open class default ()
    extends StObject
       with typings.std.Error {
    def this(message: String) = this()
    def this(message: String, options: ErrorOptions) = this()
    def this(message: Unit, options: ErrorOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  @JSImport("error-cause/base/EvalError", JSImport.Default)
  @js.native
  val default: EvalErrorConstructor = js.native
  
  type _To = EvalErrorConstructor
  
  /* This means you don't have to write `default`, but can instead just say `baseEvalErrorMod.foo` */
  override def _to: EvalErrorConstructor = default
}
