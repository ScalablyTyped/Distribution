package typings.glReactHeadless

import typings.react.mod.Component
import typings.std.Blob
import typings.std.Error
import typings.std.HTMLCanvasElement
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glviewheadlessMod {
  
  @JSImport("gl-react-headless/GLViewHeadless", "GLViewHeadless")
  @js.native
  class GLViewHeadless protected ()
    extends Component[GLViewHeadlessProps, js.Object, js.Any] {
    def this(props: GLViewHeadlessProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewHeadlessProps, context: js.Any) = this()
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.native
    
    def captureAsBlob(): js.Promise[Blob] = js.native
    
    def captureAsDataURL(): String = js.native
    
    var gl: js.UndefOr[WebGLRenderingContext] = js.native
    
    def onRef(ref: HTMLCanvasElement): Unit = js.native
    
    def simulateContextLost(): Unit = js.native
    
    def simulateContextRestored(): Unit = js.native
    
    var webglContextAttributes: WebGLContextAttributes = js.native
  }
  
  @js.native
  trait GLViewHeadlessProps extends StObject {
    
    var height: Double = js.native
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
    
    var onContextFailure: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
    
    var onContextLost: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.native
    
    var width: Double = js.native
  }
  object GLViewHeadlessProps {
    
    @scala.inline
    def apply(height: Double, width: Double): GLViewHeadlessProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[GLViewHeadlessProps]
    }
    
    @scala.inline
    implicit class GLViewHeadlessPropsMutableBuilder[Self <: GLViewHeadlessProps] (val x: Self) extends AnyVal {
      
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
