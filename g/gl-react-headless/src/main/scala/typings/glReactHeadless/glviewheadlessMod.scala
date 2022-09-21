package typings.glReactHeadless

import typings.react.mod.Component
import typings.std.Blob
import typings.std.HTMLCanvasElement
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glviewheadlessMod {
  
  @JSImport("gl-react-headless/GLViewHeadless", "GLViewHeadless")
  @js.native
  open class GLViewHeadless protected ()
    extends Component[GLViewHeadlessProps, js.Object, Any] {
    def this(props: GLViewHeadlessProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewHeadlessProps, context: Any) = this()
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.native
    
    def captureAsBlob(): js.Promise[Blob] = js.native
    
    def captureAsDataURL(): String = js.native
    
    var gl: js.UndefOr[WebGLRenderingContext] = js.native
    
    def onRef(ref: HTMLCanvasElement): Unit = js.native
    
    def simulateContextLost(): Unit = js.native
    
    def simulateContextRestored(): Unit = js.native
    
    var webglContextAttributes: WebGLContextAttributes = js.native
  }
  
  trait GLViewHeadlessProps extends StObject {
    
    var height: Double
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
    
    var onContextFailure: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
    
    var onContextLost: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.undefined
    
    var width: Double
  }
  object GLViewHeadlessProps {
    
    inline def apply(height: Double, width: Double): GLViewHeadlessProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[GLViewHeadlessProps]
    }
    
    extension [Self <: GLViewHeadlessProps](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1(value))
      
      inline def setOnContextCreateUndefined: Self = StObject.set(x, "onContextCreate", js.undefined)
      
      inline def setOnContextFailure(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onContextFailure", js.Any.fromFunction1(value))
      
      inline def setOnContextFailureUndefined: Self = StObject.set(x, "onContextFailure", js.undefined)
      
      inline def setOnContextLost(value: () => Unit): Self = StObject.set(x, "onContextLost", js.Any.fromFunction0(value))
      
      inline def setOnContextLostUndefined: Self = StObject.set(x, "onContextLost", js.undefined)
      
      inline def setOnContextRestored(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextRestored", js.Any.fromFunction1(value))
      
      inline def setOnContextRestoredUndefined: Self = StObject.set(x, "onContextRestored", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setWebglContextAttributes(value: WebGLContextAttributes): Self = StObject.set(x, "webglContextAttributes", value.asInstanceOf[js.Any])
      
      inline def setWebglContextAttributesUndefined: Self = StObject.set(x, "webglContextAttributes", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
