package typings.flexmonster

import org.scalablytyped.runtime.Shortcut
import typings.flexmonster.mod.FlexmonsterConstructor
import typings.flexmonster.mod.Params
import typings.flexmonster.mod.Pivot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Flexmonster extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Flexmonster")
    @js.native
    open class ^ protected ()
      extends StObject
         with Pivot {
      def this(params: Params) = this()
    }
    
    @JSGlobal("Flexmonster")
    @js.native
    val ^ : FlexmonsterConstructor = js.native
    
    type _To = FlexmonsterConstructor
    
    /* This means you don't have to write `^`, but can instead just say `Flexmonster.foo` */
    override def _to: FlexmonsterConstructor = ^
  }
}
