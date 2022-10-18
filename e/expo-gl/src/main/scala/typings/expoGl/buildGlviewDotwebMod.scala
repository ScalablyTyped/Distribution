package typings.expoGl

import typings.expoGl.buildGlviewDottypesMod.BaseGLViewProps
import typings.expoGl.buildGlviewDottypesMod.ComponentOrHandle
import typings.expoGl.buildGlviewDottypesMod.GLSnapshot
import typings.expoGl.buildGlviewDottypesMod.SnapshotOptions
import typings.expoGl.buildGlviewMod.WebGLObject
import typings.react.mod.Component
import typings.std.HTMLCanvasElement
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGlviewDotwebMod {
  
  @JSImport("expo-gl/build/GLView.web", "GLView")
  @js.native
  open class GLView protected ()
    extends Component[GLViewProps, js.Object, Any] {
    def this(props: GLViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewProps, context: Any) = this()
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MGLView(prevProps: GLViewProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGLView(): Unit = js.native
    
    def createCameraTextureAsync(): js.Promise[Unit] = js.native
    
    def destroyObjectAsync(glObject: WebGLObject): js.Promise[Unit] = js.native
    
    /* private */ var getGLContext: Any = js.native
    
    /* private */ var getGLContextOrReject: Any = js.native
    
    var gl: js.UndefOr[WebGLRenderingContext] = js.native
    
    /* private */ var onContextLost: Any = js.native
    
    /* private */ var onContextRestored: Any = js.native
    
    /* private */ var setCanvasRef: Any = js.native
    
    def startARSessionAsync(): js.Promise[Unit] = js.native
    
    def takeSnapshotAsync(): js.Promise[GLSnapshot] = js.native
    def takeSnapshotAsync(options: SnapshotOptions): js.Promise[GLSnapshot] = js.native
  }
  /* static members */
  object GLView {
    
    @JSImport("expo-gl/build/GLView.web", "GLView")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createContextAsync(): js.Promise[WebGLRenderingContext | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContextAsync")().asInstanceOf[js.Promise[WebGLRenderingContext | Null]]
    
    inline def destroyContextAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyContextAsync")().asInstanceOf[js.Promise[Boolean]]
    inline def destroyContextAsync(exgl: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyContextAsync")(exgl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def destroyContextAsync(exgl: WebGLRenderingContext): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyContextAsync")(exgl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def takeSnapshotAsync(gl: WebGLRenderingContext): js.Promise[GLSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeSnapshotAsync")(gl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GLSnapshot]]
    inline def takeSnapshotAsync(gl: WebGLRenderingContext, options: SnapshotOptions): js.Promise[GLSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeSnapshotAsync")(gl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GLSnapshot]]
  }
  
  trait GLViewProps
    extends StObject
       with BaseGLViewProps {
    
    /**
      * [iOS only] Number of samples for Apple's built-in multisampling.
      */
    @JSName("msaaSamples")
    var msaaSamples_GLViewProps: Double
    
    /**
      * A ref callback for the native GLView
      */
    var nativeRef_EXPERIMENTAL: js.UndefOr[js.Function1[/* callback */ ComponentOrHandle | HTMLCanvasElement | Null, Any]] = js.undefined
    
    def onContextCreate(gl: WebGLRenderingContext): Unit
    
    var onContextLost: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onContextRestored: js.UndefOr[js.Function1[/* gl */ js.UndefOr[WebGLRenderingContext], Unit]] = js.undefined
    
    var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.undefined
  }
  object GLViewProps {
    
    inline def apply(msaaSamples: Double, onContextCreate: WebGLRenderingContext => Unit): GLViewProps = {
      val __obj = js.Dynamic.literal(msaaSamples = msaaSamples.asInstanceOf[js.Any], onContextCreate = js.Any.fromFunction1(onContextCreate))
      __obj.asInstanceOf[GLViewProps]
    }
    
    extension [Self <: GLViewProps](x: Self) {
      
      inline def setMsaaSamples(value: Double): Self = StObject.set(x, "msaaSamples", value.asInstanceOf[js.Any])
      
      inline def setNativeRef_EXPERIMENTAL(value: /* callback */ ComponentOrHandle | HTMLCanvasElement | Null => Any): Self = StObject.set(x, "nativeRef_EXPERIMENTAL", js.Any.fromFunction1(value))
      
      inline def setNativeRef_EXPERIMENTALUndefined: Self = StObject.set(x, "nativeRef_EXPERIMENTAL", js.undefined)
      
      inline def setOnContextCreate(value: WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1(value))
      
      inline def setOnContextLost(value: () => Unit): Self = StObject.set(x, "onContextLost", js.Any.fromFunction0(value))
      
      inline def setOnContextLostUndefined: Self = StObject.set(x, "onContextLost", js.undefined)
      
      inline def setOnContextRestored(value: /* gl */ js.UndefOr[WebGLRenderingContext] => Unit): Self = StObject.set(x, "onContextRestored", js.Any.fromFunction1(value))
      
      inline def setOnContextRestoredUndefined: Self = StObject.set(x, "onContextRestored", js.undefined)
      
      inline def setWebglContextAttributes(value: WebGLContextAttributes): Self = StObject.set(x, "webglContextAttributes", value.asInstanceOf[js.Any])
      
      inline def setWebglContextAttributesUndefined: Self = StObject.set(x, "webglContextAttributes", js.undefined)
    }
  }
}
