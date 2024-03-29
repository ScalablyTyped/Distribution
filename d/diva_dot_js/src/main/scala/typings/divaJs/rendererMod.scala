package typings.divaJs

import typings.divaJs.interfacesMod.RendererConfig
import typings.divaJs.interfacesMod.SourceProvider
import typings.divaJs.interfacesMod.ViewportPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("diva.js/renderer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Renderer {
    def this(options: RendererConfig, hooks: js.Object) = this()
    
    /* CompleteClass */
    override def adjust(): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getRenderedPages(): Any = js.native
    
    /* CompleteClass */
    override def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit = js.native
    
    /* CompleteClass */
    override def isPageVisible(pageIndex: Double): Boolean = js.native
    
    /* CompleteClass */
    var layout: typings.divaJs.documentLayoutMod.default | Null = js.native
    
    /* CompleteClass */
    override def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit = js.native
    
    /* CompleteClass */
    override def transitionViewportPosition(options: js.Object): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("diva.js/renderer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCompatibilityErrors(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompatibilityErrors")().asInstanceOf[String | Null]
  }
  
  trait Renderer extends StObject {
    
    def adjust(): Unit
    
    def destroy(): Unit
    
    def getRenderedPages(): Any
    
    def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit
    
    def isPageVisible(pageIndex: Double): Boolean
    
    var layout: typings.divaJs.documentLayoutMod.default | Null
    
    def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit
    
    def transitionViewportPosition(options: js.Object): Unit
  }
  object Renderer {
    
    inline def apply(
      adjust: () => Unit,
      destroy: () => Unit,
      getRenderedPages: () => Any,
      goto: (Double, Double, Double) => Unit,
      isPageVisible: Double => Boolean,
      load: (js.Object, ViewportPosition, SourceProvider) => Unit,
      transitionViewportPosition: js.Object => Unit
    ): Renderer = {
      val __obj = js.Dynamic.literal(adjust = js.Any.fromFunction0(adjust), destroy = js.Any.fromFunction0(destroy), getRenderedPages = js.Any.fromFunction0(getRenderedPages), goto = js.Any.fromFunction3(goto), isPageVisible = js.Any.fromFunction1(isPageVisible), load = js.Any.fromFunction3(load), transitionViewportPosition = js.Any.fromFunction1(transitionViewportPosition), layout = null)
      __obj.asInstanceOf[Renderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
      
      inline def setAdjust(value: () => Unit): Self = StObject.set(x, "adjust", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetRenderedPages(value: () => Any): Self = StObject.set(x, "getRenderedPages", js.Any.fromFunction0(value))
      
      inline def setGoto(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "goto", js.Any.fromFunction3(value))
      
      inline def setIsPageVisible(value: Double => Boolean): Self = StObject.set(x, "isPageVisible", js.Any.fromFunction1(value))
      
      inline def setLayout(value: typings.divaJs.documentLayoutMod.default): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutNull: Self = StObject.set(x, "layout", null)
      
      inline def setLoad(value: (js.Object, ViewportPosition, SourceProvider) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction3(value))
      
      inline def setTransitionViewportPosition(value: js.Object => Unit): Self = StObject.set(x, "transitionViewportPosition", js.Any.fromFunction1(value))
    }
  }
}
