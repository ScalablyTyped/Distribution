package typings.errorCause

import org.scalablytyped.runtime.Shortcut
import typings.errorCause.anon.Cause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseErrorMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("error-cause/base/Error", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Error {
    def this(reason: String) = this()
    def this(reason: String, options: Cause) = this()
    
    /* CompleteClass */
    var cause: Any = js.native
  }
  @JSImport("error-cause/base/Error", JSImport.Default)
  @js.native
  val default: ErrorConstructor = js.native
  
  type _To = ErrorConstructor
  
  /* This means you don't have to write `default`, but can instead just say `baseErrorMod.foo` */
  override def _to: ErrorConstructor = default
}
