package typings.dragster

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dragster", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Dragster {
    def this(elem: HTMLElement) = this()
    
    /* CompleteClass */
    override def removeListeners(): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  @JSImport("dragster", JSImport.Namespace)
  @js.native
  val ^ : DragsterStatic = js.native
  
  trait Dragster extends StObject {
    
    def removeListeners(): Unit
    
    def reset(): Unit
  }
  object Dragster {
    
    inline def apply(removeListeners: () => Unit, reset: () => Unit): Dragster = {
      val __obj = js.Dynamic.literal(removeListeners = js.Any.fromFunction0(removeListeners), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Dragster]
    }
    
    extension [Self <: Dragster](x: Self) {
      
      inline def setRemoveListeners(value: () => Unit): Self = StObject.set(x, "removeListeners", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DragsterStatic
    extends StObject
       with Instantiable1[/* elem */ HTMLElement, Dragster] {
    
    def apply(elem: HTMLElement): Dragster = js.native
  }
  
  type _To = DragsterStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DragsterStatic = ^
  
  object global {
    
    trait Window extends StObject {
      
      def Dragster(elem: HTMLElement): typings.dragster.mod.Dragster
      @JSName("Dragster")
      var Dragster_Original: DragsterStatic
    }
    object Window {
      
      inline def apply(Dragster: DragsterStatic): Window = {
        val __obj = js.Dynamic.literal(Dragster = Dragster.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setDragster(value: DragsterStatic): Self = StObject.set(x, "Dragster", value.asInstanceOf[js.Any])
      }
    }
  }
}
