package typings.funpermaproxy

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("funpermaproxy", JSImport.Namespace)
  @js.native
  val ^ : FunpermaproxyFunction = js.native
  
  @js.native
  trait FunpermaproxyFunction extends StObject {
    
    def apply[T](getter: js.Function0[T]): T = js.native
    
    def callable[T /* <: js.Function */](getter: js.Function0[T]): T = js.native
  }
  
  type _To = FunpermaproxyFunction
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FunpermaproxyFunction = ^
}
