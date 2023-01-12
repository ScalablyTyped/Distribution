package typings.glReactDom

import typings.glReactDom.glReactDomDoubles.`0.0`
import typings.glReactDom.glReactDomDoubles.`0.1`
import typings.glReactDom.glReactDomDoubles.`0.2`
import typings.glReactDom.glReactDomDoubles.`0.3`
import typings.glReactDom.glReactDomDoubles.`0.4`
import typings.glReactDom.glReactDomDoubles.`0.5`
import typings.glReactDom.glReactDomDoubles.`0.6`
import typings.glReactDom.glReactDomDoubles.`0.7`
import typings.glReactDom.glReactDomDoubles.`0.8`
import typings.glReactDom.glReactDomDoubles.`0.9`
import typings.glReactDom.glReactDomDoubles.`1.0`
import typings.react.mod.Component
import typings.std.Blob
import typings.std.HTMLCanvasElement
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glviewdomMod {
  
  @JSImport("gl-react-dom/GLViewDOM", "GLViewDOM")
  @js.native
  open class GLViewDOM protected () extends Component[GLViewDOMProps, GLViewDOMState, Any] {
    def this(props: GLViewDOMProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewDOMProps, context: Any) = this()
    
    var afterDraw: js.UndefOr[js.Function0[Unit]] = js.native
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.native
    
    def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit]): js.Promise[Blob] = js.native
    def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit], `type`: Unit, quality: ValidQuality): js.Promise[Blob] = js.native
    def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit], `type`: SupportedImage): js.Promise[Blob] = js.native
    def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit], `type`: SupportedImage, quality: ValidQuality): js.Promise[Blob] = js.native
    
    def captureAsDataURL(): String = js.native
    def captureAsDataURL(`type`: Unit, quality: ValidQuality): String = js.native
    def captureAsDataURL(`type`: SupportedImage): String = js.native
    def captureAsDataURL(`type`: SupportedImage, quality: ValidQuality): String = js.native
    
    var debugError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
    
    var gl: js.UndefOr[WebGLRenderingContext] = js.native
    
    def onRef(ref: HTMLCanvasElement): Unit = js.native
    
    var webglContextAttributes: WebGLContextAttributes = js.native
  }
  
  trait GLViewDOMProps extends StObject {
    
    var debug: js.UndefOr[Double] = js.undefined
    
    var height: Double
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
    
    var onContextFailure: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
    
    var onContextLost: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.undefined
    
    var width: Double
  }
  object GLViewDOMProps {
    
    inline def apply(height: Double, width: Double): GLViewDOMProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[GLViewDOMProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GLViewDOMProps] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
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
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWebglContextAttributes(value: WebGLContextAttributes): Self = StObject.set(x, "webglContextAttributes", value.asInstanceOf[js.Any])
      
      inline def setWebglContextAttributesUndefined: Self = StObject.set(x, "webglContextAttributes", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait GLViewDOMState extends StObject {
    
    var error: js.Error
  }
  object GLViewDOMState {
    
    inline def apply(error: js.Error): GLViewDOMState = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[GLViewDOMState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GLViewDOMState] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glReactDom.glReactDomStrings.imageSlashpng
    - typings.glReactDom.glReactDomStrings.imageSlashjpeg
    - typings.glReactDom.glReactDomStrings.imageSlashbmp
    - typings.glReactDom.glReactDomStrings.imageSlashwebp
    - typings.glReactDom.glReactDomStrings.imageSlashico
  */
  trait SupportedImage extends StObject
  object SupportedImage {
    
    inline def imageSlashbmp: typings.glReactDom.glReactDomStrings.imageSlashbmp = "image/bmp".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashbmp]
    
    inline def imageSlashico: typings.glReactDom.glReactDomStrings.imageSlashico = "image/ico".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashico]
    
    inline def imageSlashjpeg: typings.glReactDom.glReactDomStrings.imageSlashjpeg = "image/jpeg".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashjpeg]
    
    inline def imageSlashpng: typings.glReactDom.glReactDomStrings.imageSlashpng = "image/png".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashpng]
    
    inline def imageSlashwebp: typings.glReactDom.glReactDomStrings.imageSlashwebp = "image/webp".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashwebp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glReactDom.glReactDomDoubles.`0.0`
    - typings.glReactDom.glReactDomDoubles.`0.1`
    - typings.glReactDom.glReactDomDoubles.`0.2`
    - typings.glReactDom.glReactDomDoubles.`0.3`
    - typings.glReactDom.glReactDomDoubles.`0.4`
    - typings.glReactDom.glReactDomDoubles.`0.5`
    - typings.glReactDom.glReactDomDoubles.`0.6`
    - typings.glReactDom.glReactDomDoubles.`0.7`
    - typings.glReactDom.glReactDomDoubles.`0.8`
    - typings.glReactDom.glReactDomDoubles.`0.9`
    - typings.glReactDom.glReactDomDoubles.`1.0`
  */
  trait ValidQuality extends StObject
  object ValidQuality {
    
    inline def `0Dot0`: `0.0` = 0.0d.asInstanceOf[`0.0`]
    
    inline def `0Dot1`: `0.1` = 0.1d.asInstanceOf[`0.1`]
    
    inline def `0Dot2`: `0.2` = 0.2d.asInstanceOf[`0.2`]
    
    inline def `0Dot3`: `0.3` = 0.3d.asInstanceOf[`0.3`]
    
    inline def `0Dot4`: `0.4` = 0.4d.asInstanceOf[`0.4`]
    
    inline def `0Dot5`: `0.5` = 0.5d.asInstanceOf[`0.5`]
    
    inline def `0Dot6`: `0.6` = 0.6d.asInstanceOf[`0.6`]
    
    inline def `0Dot7`: `0.7` = 0.7d.asInstanceOf[`0.7`]
    
    inline def `0Dot8`: `0.8` = 0.8d.asInstanceOf[`0.8`]
    
    inline def `0Dot9`: `0.9` = 0.9d.asInstanceOf[`0.9`]
    
    inline def `1Dot0`: `1.0` = 1.0d.asInstanceOf[`1.0`]
  }
}
