package typings.glReactDom

import typings.glReactDom.glviewdomMod.GLViewDOM
import typings.std.Error
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-react-dom", "Surface")
  @js.native
  class Surface protected ()
    extends typings.glReact.mod.Surface[GLViewDOM] {
    def this(props: typings.glReact.mod.SurfaceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.glReact.mod.SurfaceProps, context: js.Any) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.glReactDom.glviewdomMod.GLViewDOMProps because var conflicts: style. Inlined onContextCreate, onContextFailure, onContextLost, onContextRestored, webglContextAttributes, pixelRatio, width, height, debug */ trait SurfaceProps
    extends StObject
       with typings.glReact.mod.SurfaceProps {
    
    var debug: js.UndefOr[Double] = js.undefined
    
    var height: Double
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
    
    var onContextFailure: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
    
    var onContextLost: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.undefined
    
    var width: Double
  }
  object SurfaceProps {
    
    @scala.inline
    def apply(height: Double, width: Double): SurfaceProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SurfaceProps]
    }
    
    @scala.inline
    implicit class SurfacePropsMutableBuilder[Self <: SurfaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextCreateUndefined: Self = StObject.set(x, "onContextCreate", js.undefined)
      
      @scala.inline
      def setOnContextFailure(value: /* e */ Error => Unit): Self = StObject.set(x, "onContextFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextFailureUndefined: Self = StObject.set(x, "onContextFailure", js.undefined)
      
      @scala.inline
      def setOnContextLost(value: () => Unit): Self = StObject.set(x, "onContextLost", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnContextLostUndefined: Self = StObject.set(x, "onContextLost", js.undefined)
      
      @scala.inline
      def setOnContextRestored(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextRestored", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextRestoredUndefined: Self = StObject.set(x, "onContextRestored", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setWebglContextAttributes(value: WebGLContextAttributes): Self = StObject.set(x, "webglContextAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebglContextAttributesUndefined: Self = StObject.set(x, "webglContextAttributes", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
