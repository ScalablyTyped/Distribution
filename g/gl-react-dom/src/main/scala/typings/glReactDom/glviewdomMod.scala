package typings.glReactDom

import typings.glReactDom.glReactDomNumbers.`0.0`
import typings.glReactDom.glReactDomNumbers.`0.1`
import typings.glReactDom.glReactDomNumbers.`0.2`
import typings.glReactDom.glReactDomNumbers.`0.3`
import typings.glReactDom.glReactDomNumbers.`0.4`
import typings.glReactDom.glReactDomNumbers.`0.5`
import typings.glReactDom.glReactDomNumbers.`0.6`
import typings.glReactDom.glReactDomNumbers.`0.7`
import typings.glReactDom.glReactDomNumbers.`0.8`
import typings.glReactDom.glReactDomNumbers.`0.9`
import typings.glReactDom.glReactDomNumbers.`1.0`
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

object glviewdomMod {
  
  @JSImport("gl-react-dom/GLViewDOM", "GLViewDOM")
  @js.native
  class GLViewDOM protected ()
    extends Component[GLViewDOMProps, GLViewDOMState, js.Any] {
    def this(props: GLViewDOMProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewDOMProps, context: js.Any) = this()
    
    var afterDraw: js.UndefOr[js.Function0[Unit]] = js.native
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.native
    
    def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit]): js.Promise[Blob] = js.native
    def captureAsBlob(
      callback: js.Function1[/* data */ Blob, Unit],
      `type`: js.UndefOr[scala.Nothing],
      quality: ValidQuality
    ): js.Promise[Blob] = js.native
    def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit], `type`: SupportedImage): js.Promise[Blob] = js.native
    def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit], `type`: SupportedImage, quality: ValidQuality): js.Promise[Blob] = js.native
    
    def captureAsDataURL(): String = js.native
    def captureAsDataURL(`type`: js.UndefOr[scala.Nothing], quality: ValidQuality): String = js.native
    def captureAsDataURL(`type`: SupportedImage): String = js.native
    def captureAsDataURL(`type`: SupportedImage, quality: ValidQuality): String = js.native
    
    var debugError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
    
    var gl: js.UndefOr[WebGLRenderingContext] = js.native
    
    def onRef(ref: HTMLCanvasElement): Unit = js.native
    
    var webglContextAttributes: WebGLContextAttributes = js.native
  }
  
  @js.native
  trait GLViewDOMProps extends StObject {
    
    var debug: js.UndefOr[Double] = js.native
    
    var height: Double = js.native
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
    
    var onContextFailure: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
    
    var onContextLost: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.native
    
    var width: Double = js.native
  }
  object GLViewDOMProps {
    
    @scala.inline
    def apply(height: Double, width: Double): GLViewDOMProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[GLViewDOMProps]
    }
    
    @scala.inline
    implicit class GLViewDOMPropsMutableBuilder[Self <: GLViewDOMProps] (val x: Self) extends AnyVal {
      
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
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWebglContextAttributes(value: WebGLContextAttributes): Self = StObject.set(x, "webglContextAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebglContextAttributesUndefined: Self = StObject.set(x, "webglContextAttributes", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GLViewDOMState extends StObject {
    
    var error: Error = js.native
  }
  object GLViewDOMState {
    
    @scala.inline
    def apply(error: Error): GLViewDOMState = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[GLViewDOMState]
    }
    
    @scala.inline
    implicit class GLViewDOMStateMutableBuilder[Self <: GLViewDOMState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def imageSlashbmp: typings.glReactDom.glReactDomStrings.imageSlashbmp = "image/bmp".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashbmp]
    
    @scala.inline
    def imageSlashico: typings.glReactDom.glReactDomStrings.imageSlashico = "image/ico".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashico]
    
    @scala.inline
    def imageSlashjpeg: typings.glReactDom.glReactDomStrings.imageSlashjpeg = "image/jpeg".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashjpeg]
    
    @scala.inline
    def imageSlashpng: typings.glReactDom.glReactDomStrings.imageSlashpng = "image/png".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashpng]
    
    @scala.inline
    def imageSlashwebp: typings.glReactDom.glReactDomStrings.imageSlashwebp = "image/webp".asInstanceOf[typings.glReactDom.glReactDomStrings.imageSlashwebp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glReactDom.glReactDomNumbers.`0.0`
    - typings.glReactDom.glReactDomNumbers.`0.1`
    - typings.glReactDom.glReactDomNumbers.`0.2`
    - typings.glReactDom.glReactDomNumbers.`0.3`
    - typings.glReactDom.glReactDomNumbers.`0.4`
    - typings.glReactDom.glReactDomNumbers.`0.5`
    - typings.glReactDom.glReactDomNumbers.`0.6`
    - typings.glReactDom.glReactDomNumbers.`0.7`
    - typings.glReactDom.glReactDomNumbers.`0.8`
    - typings.glReactDom.glReactDomNumbers.`0.9`
    - typings.glReactDom.glReactDomNumbers.`1.0`
  */
  trait ValidQuality extends StObject
  object ValidQuality {
    
    @scala.inline
    def `0Dot0`: `0.0` = 0.0.asInstanceOf[`0.0`]
    
    @scala.inline
    def `0Dot1`: `0.1` = 0.1.asInstanceOf[`0.1`]
    
    @scala.inline
    def `0Dot2`: `0.2` = 0.2.asInstanceOf[`0.2`]
    
    @scala.inline
    def `0Dot3`: `0.3` = 0.3.asInstanceOf[`0.3`]
    
    @scala.inline
    def `0Dot4`: `0.4` = 0.4.asInstanceOf[`0.4`]
    
    @scala.inline
    def `0Dot5`: `0.5` = 0.5.asInstanceOf[`0.5`]
    
    @scala.inline
    def `0Dot6`: `0.6` = 0.6.asInstanceOf[`0.6`]
    
    @scala.inline
    def `0Dot7`: `0.7` = 0.7.asInstanceOf[`0.7`]
    
    @scala.inline
    def `0Dot8`: `0.8` = 0.8.asInstanceOf[`0.8`]
    
    @scala.inline
    def `0Dot9`: `0.9` = 0.9.asInstanceOf[`0.9`]
    
    @scala.inline
    def `1Dot0`: `1.0` = 1.0.asInstanceOf[`1.0`]
  }
}
