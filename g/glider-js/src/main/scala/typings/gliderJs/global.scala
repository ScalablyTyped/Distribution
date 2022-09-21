package typings.gliderJs

import typings.gliderJs.mod.Options
import typings.gliderJs.mod.global.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Glider {
    
    inline def apply[T /* <: HTMLElement */](element: T): typings.gliderJs.mod.Glider[T] = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[typings.gliderJs.mod.Glider[T]]
    
    @JSGlobal("Glider")
    @js.native
    open class ^[T /* <: HTMLElement */] protected ()
      extends typings.gliderJs.mod.^[T] {
      def this(ref: T) = this()
      def this(ref: T, options: Options) = this()
    }
    
    @JSGlobal("Glider")
    @js.native
    val ^ : js.Any = js.native
  }
}
