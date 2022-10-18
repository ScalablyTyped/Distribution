package typings.expoGl

import typings.expoGl.anon.MsaaSamples
import typings.expoGl.buildGlviewDottypesMod.ExpoWebGLRenderingContext
import typings.expoGl.buildGlviewDottypesMod.GLSnapshot
import typings.expoGl.buildGlviewDottypesMod.SnapshotOptions
import typings.expoGl.buildGlviewMod.GLViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-gl", "GLLoggingOption")
  @js.native
  object GLLoggingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoGl.buildGlviewDottypesMod.GLLoggingOption & Double] = js.native
    
    /* 15 */ val ALL: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.ALL & Double = js.native
    
    /* 0 */ val DISABLED: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.DISABLED & Double = js.native
    
    /* 2 */ val GET_ERRORS: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.GET_ERRORS & Double = js.native
    
    /* 1 */ val METHOD_CALLS: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.METHOD_CALLS & Double = js.native
    
    /* 4 */ val RESOLVE_CONSTANTS: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.RESOLVE_CONSTANTS & Double = js.native
    
    /* 8 */ val TRUNCATE_STRINGS: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.TRUNCATE_STRINGS & Double = js.native
  }
  
  @JSImport("expo-gl", "GLView")
  @js.native
  open class GLView protected ()
    extends typings.expoGl.buildGlviewMod.GLView {
    def this(props: GLViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewProps, context: Any) = this()
  }
  /* static members */
  object GLView {
    
    @JSImport("expo-gl", "GLView")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-gl", "GLView.NativeView")
    @js.native
    def NativeView: Any = js.native
    inline def NativeView_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativeView")(x.asInstanceOf[js.Any])
    
    inline def createContextAsync(): js.Promise[ExpoWebGLRenderingContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContextAsync")().asInstanceOf[js.Promise[ExpoWebGLRenderingContext]]
    
    @JSImport("expo-gl", "GLView.defaultProps")
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
}
