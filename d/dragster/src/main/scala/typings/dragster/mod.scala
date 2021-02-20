package typings.dragster

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dragster", JSImport.Namespace)
  @js.native
  class ^ protected () extends Dragster {
    def this(elem: HTMLElement) = this()
  }
  @JSImport("dragster", JSImport.Namespace)
  @js.native
  val ^ : DragsterStatic = js.native
  
  @js.native
  trait Dragster extends StObject {
    
    def removeListeners(): Unit = js.native
    
    def reset(): Unit = js.native
  }
  object Dragster {
    
    @scala.inline
    def apply(removeListeners: () => Unit, reset: () => Unit): Dragster = {
      val __obj = js.Dynamic.literal(removeListeners = js.Any.fromFunction0(removeListeners), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Dragster]
    }
    
    @scala.inline
    implicit class DragsterMutableBuilder[Self <: Dragster] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoveListeners(value: () => Unit): Self = StObject.set(x, "removeListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DragsterStatic extends Instantiable1[/* elem */ HTMLElement, Dragster] {
    
    def apply(elem: HTMLElement): Dragster = js.native
  }
  
  type _To = DragsterStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DragsterStatic = ^
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      def Dragster(elem: HTMLElement): typings.dragster.mod.Dragster = js.native
      @JSName("Dragster")
      var Dragster_Original: DragsterStatic = js.native
    }
  }
}
