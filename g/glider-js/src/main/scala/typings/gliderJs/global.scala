package typings.gliderJs

import org.scalablytyped.runtime.Shortcut
import typings.gliderJs.mod.Options
import typings.gliderJs.mod.Static
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Glider extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Glider")
    @js.native
    class ^[T /* <: HTMLElement */] protected ()
      extends StObject
         with Static[T] {
      // tslint:disable-next-line no-misused-new
      def this(ref: T, options: Options) = this()
    }
    
    @JSGlobal("Glider")
    @js.native
    val ^ : Static[HTMLDivElement] = js.native
    
    type _To = Static[HTMLDivElement]
    
    /* This means you don't have to write `^`, but can instead just say `Glider.foo` */
    override def _to: Static[HTMLDivElement] = ^
  }
}
