package typings.dragster

import org.scalablytyped.runtime.Shortcut
import typings.dragster.mod.DragsterStatic
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Dragster extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Dragster")
    @js.native
    open class ^ protected ()
      extends StObject
         with typings.dragster.mod.Dragster {
      def this(elem: HTMLElement) = this()
      
      /* CompleteClass */
      override def removeListeners(): Unit = js.native
      
      /* CompleteClass */
      override def reset(): Unit = js.native
    }
    
    @JSGlobal("Dragster")
    @js.native
    val ^ : DragsterStatic = js.native
    
    type _To = DragsterStatic
    
    /* This means you don't have to write `^`, but can instead just say `Dragster.foo` */
    override def _to: DragsterStatic = ^
  }
}
