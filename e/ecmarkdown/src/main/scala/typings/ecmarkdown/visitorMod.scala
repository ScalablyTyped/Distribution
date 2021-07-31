package typings.ecmarkdown

import typings.ecmarkdown.nodeTypesMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visitorMod {
  
  @JSImport("ecmarkdown/dist/visitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def visit(node: Node, observer: Observer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Observer extends StObject {
    
    var enter: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
    
    var exit: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  }
  object Observer {
    
    @scala.inline
    def apply(): Observer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Observer]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnter(value: /* node */ Node => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: /* node */ Node => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
}
