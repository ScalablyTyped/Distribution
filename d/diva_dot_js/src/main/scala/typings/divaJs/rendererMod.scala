package typings.divaJs

import typings.divaJs.interfacesMod.RendererConfig
import typings.divaJs.interfacesMod.SourceProvider
import typings.divaJs.interfacesMod.ViewportPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("diva.js/renderer", JSImport.Default)
  @js.native
  class default protected () extends Renderer {
    def this(options: RendererConfig, hooks: js.Object) = this()
  }
  /* static members */
  object default {
    
    @JSImport("diva.js/renderer", "default.getCompatibilityErrors")
    @js.native
    def getCompatibilityErrors(): String | Null = js.native
  }
  
  @js.native
  trait Renderer extends StObject {
    
    def adjust(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getRenderedPages(): js.Any = js.native
    
    def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit = js.native
    
    def isPageVisible(pageIndex: Double): Boolean = js.native
    
    var layout: typings.divaJs.documentLayoutMod.default | Null = js.native
    
    def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit = js.native
    
    def transitionViewportPosition(options: js.Object): Unit = js.native
  }
  object Renderer {
    
    @scala.inline
    def apply(
      adjust: () => Unit,
      destroy: () => Unit,
      getRenderedPages: () => js.Any,
      goto: (Double, Double, Double) => Unit,
      isPageVisible: Double => Boolean,
      load: (js.Object, ViewportPosition, SourceProvider) => Unit,
      transitionViewportPosition: js.Object => Unit
    ): Renderer = {
      val __obj = js.Dynamic.literal(adjust = js.Any.fromFunction0(adjust), destroy = js.Any.fromFunction0(destroy), getRenderedPages = js.Any.fromFunction0(getRenderedPages), goto = js.Any.fromFunction3(goto), isPageVisible = js.Any.fromFunction1(isPageVisible), load = js.Any.fromFunction3(load), transitionViewportPosition = js.Any.fromFunction1(transitionViewportPosition))
      __obj.asInstanceOf[Renderer]
    }
    
    @scala.inline
    implicit class RendererMutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjust(value: () => Unit): Self = StObject.set(x, "adjust", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRenderedPages(value: () => js.Any): Self = StObject.set(x, "getRenderedPages", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGoto(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "goto", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsPageVisible(value: Double => Boolean): Self = StObject.set(x, "isPageVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLayout(value: typings.divaJs.documentLayoutMod.default): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutNull: Self = StObject.set(x, "layout", null)
      
      @scala.inline
      def setLoad(value: (js.Object, ViewportPosition, SourceProvider) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransitionViewportPosition(value: js.Object => Unit): Self = StObject.set(x, "transitionViewportPosition", js.Any.fromFunction1(value))
    }
  }
}
