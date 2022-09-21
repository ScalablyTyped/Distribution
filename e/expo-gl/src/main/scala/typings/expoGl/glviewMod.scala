package typings.expoGl

import typings.expoGl.anon.MsaaSamples
import typings.expoGl.glviewTypesMod.BaseGLViewProps
import typings.expoGl.glviewTypesMod.ComponentOrHandle
import typings.expoGl.glviewTypesMod.ExpoWebGLRenderingContext
import typings.expoGl.glviewTypesMod.GLSnapshot
import typings.expoGl.glviewTypesMod.SnapshotOptions
import typings.expoGl.glviewTypesMod.SurfaceCreateEvent
import typings.react.mod.Component
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glviewMod {
  
  @JSImport("expo-gl/build/GLView", "GLView")
  @js.native
  open class GLView protected ()
    extends Component[GLViewProps, js.Object, Any] {
    def this(props: GLViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewProps, context: Any) = this()
    
    def _onSurfaceCreate(hasHasExglCtxId: SurfaceCreateEvent): Unit = js.native
    
    def _setNativeRef(nativeRef: ComponentOrHandle): Unit = js.native
    
    def createCameraTextureAsync(cameraRefOrHandle: ComponentOrHandle): js.Promise[WebGLTexture] = js.native
    
    def destroyObjectAsync(glObject: WebGLObject): js.Promise[Boolean] = js.native
    
    var exglCtxId: js.UndefOr[Double] = js.native
    
    var nativeRef: ComponentOrHandle = js.native
    
    def startARSessionAsync(): js.Promise[Any] = js.native
    
    def takeSnapshotAsync(): js.Promise[GLSnapshot] = js.native
    def takeSnapshotAsync(options: SnapshotOptions): js.Promise[GLSnapshot] = js.native
  }
  /* static members */
  object GLView {
    
    @JSImport("expo-gl/build/GLView", "GLView")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-gl/build/GLView", "GLView.NativeView")
    @js.native
    def NativeView: Any = js.native
    inline def NativeView_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativeView")(x.asInstanceOf[js.Any])
    
    inline def createContextAsync(): js.Promise[ExpoWebGLRenderingContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContextAsync")().asInstanceOf[js.Promise[ExpoWebGLRenderingContext]]
    
    @JSImport("expo-gl/build/GLView", "GLView.defaultProps")
    @js.native
    def defaultProps: MsaaSamples = js.native
    inline def defaultProps_=(x: MsaaSamples): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def destroyContextAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyContextAsync")().asInstanceOf[js.Promise[Boolean]]
    inline def destroyContextAsync(exgl: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyContextAsync")(exgl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def destroyContextAsync(exgl: ExpoWebGLRenderingContext): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyContextAsync")(exgl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def getWorkletContext(contextId: Double): js.UndefOr[ExpoWebGLRenderingContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkletContext")(contextId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ExpoWebGLRenderingContext]]
    
    inline def takeSnapshotAsync(): js.Promise[GLSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeSnapshotAsync")().asInstanceOf[js.Promise[GLSnapshot]]
    inline def takeSnapshotAsync(exgl: Double): js.Promise[GLSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeSnapshotAsync")(exgl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GLSnapshot]]
    inline def takeSnapshotAsync(exgl: Double, options: SnapshotOptions): js.Promise[GLSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeSnapshotAsync")(exgl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GLSnapshot]]
    inline def takeSnapshotAsync(exgl: Unit, options: SnapshotOptions): js.Promise[GLSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeSnapshotAsync")(exgl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GLSnapshot]]
    inline def takeSnapshotAsync(exgl: ExpoWebGLRenderingContext): js.Promise[GLSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeSnapshotAsync")(exgl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GLSnapshot]]
    inline def takeSnapshotAsync(exgl: ExpoWebGLRenderingContext, options: SnapshotOptions): js.Promise[GLSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeSnapshotAsync")(exgl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GLSnapshot]]
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
    var nativeRef_EXPERIMENTAL: js.UndefOr[js.Function1[/* callback */ ComponentOrHandle | Null, Any]] = js.undefined
  }
  object GLViewProps {
    
    inline def apply(msaaSamples: Double, onContextCreate: ExpoWebGLRenderingContext => Unit): GLViewProps = {
      val __obj = js.Dynamic.literal(msaaSamples = msaaSamples.asInstanceOf[js.Any], onContextCreate = js.Any.fromFunction1(onContextCreate))
      __obj.asInstanceOf[GLViewProps]
    }
    
    extension [Self <: GLViewProps](x: Self) {
      
      inline def setMsaaSamples(value: Double): Self = StObject.set(x, "msaaSamples", value.asInstanceOf[js.Any])
      
      inline def setNativeRef_EXPERIMENTAL(value: /* callback */ ComponentOrHandle | Null => Any): Self = StObject.set(x, "nativeRef_EXPERIMENTAL", js.Any.fromFunction1(value))
      
      inline def setNativeRef_EXPERIMENTALUndefined: Self = StObject.set(x, "nativeRef_EXPERIMENTAL", js.undefined)
    }
  }
  
  trait WebGLObject extends StObject {
    
    var id: Double
  }
  object WebGLObject {
    
    inline def apply(id: Double): WebGLObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLObject]
    }
    
    extension [Self <: WebGLObject](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
