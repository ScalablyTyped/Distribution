package typings.expoGl

import typings.expoGl.anon.ExglCtxId
import typings.expoGl.anon.Height
import typings.expoGl.expoGlStrings.jpeg
import typings.expoGl.expoGlStrings.png
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ViewProps
import typings.std.Blob
import typings.std.WebGL2RenderingContext
import typings.std.WebGLFramebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGlviewDottypesMod {
  
  @js.native
  sealed trait GLLoggingOption extends StObject
  @JSImport("expo-gl/build/GLView.types", "GLLoggingOption")
  @js.native
  object GLLoggingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[GLLoggingOption & Double] = js.native
    
    /**
      * Enables all other options. It implies `GET_ERRORS` so be aware of the slowdown.
      */
    @js.native
    sealed trait ALL
      extends StObject
         with GLLoggingOption
    /* 15 */ val ALL: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.ALL & Double = js.native
    
    /**
      * Disables logging entirely.
      */
    @js.native
    sealed trait DISABLED
      extends StObject
         with GLLoggingOption
    /* 0 */ val DISABLED: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.DISABLED & Double = js.native
    
    /**
      * Calls `gl.getError()` after each other method call and prints an error if any is returned.
      * This option has a significant impact on the performance as this method is blocking.
      */
    @js.native
    sealed trait GET_ERRORS
      extends StObject
         with GLLoggingOption
    /* 2 */ val GET_ERRORS: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.GET_ERRORS & Double = js.native
    
    /**
      * Logs method calls, their parameters and results.
      */
    @js.native
    sealed trait METHOD_CALLS
      extends StObject
         with GLLoggingOption
    /* 1 */ val METHOD_CALLS: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.METHOD_CALLS & Double = js.native
    
    /**
      * Resolves parameters of type `number` to their constant names.
      */
    @js.native
    sealed trait RESOLVE_CONSTANTS
      extends StObject
         with GLLoggingOption
    /* 4 */ val RESOLVE_CONSTANTS: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.RESOLVE_CONSTANTS & Double = js.native
    
    /**
      * When this option is enabled, long strings will be truncated.
      * It's useful if your shaders are really big and logging them significantly reduces performance.
      */
    @js.native
    sealed trait TRUNCATE_STRINGS
      extends StObject
         with GLLoggingOption
    /* 8 */ val TRUNCATE_STRINGS: typings.expoGl.buildGlviewDottypesMod.GLLoggingOption.TRUNCATE_STRINGS & Double = js.native
  }
  
  trait BaseGLViewProps
    extends StObject
       with ViewProps {
    
    /**
      * [iOS only] Number of samples for Apple's built-in multisampling.
      */
    var msaaSamples: js.UndefOr[Double] = js.undefined
    
    /**
      * Called when the OpenGL context is created, with the context object as a parameter. The context
      * object has an API mirroring WebGL's WebGLRenderingContext.
      */
    def onContextCreate(gl: ExpoWebGLRenderingContext): Unit
  }
  object BaseGLViewProps {
    
    inline def apply(onContextCreate: ExpoWebGLRenderingContext => Unit): BaseGLViewProps = {
      val __obj = js.Dynamic.literal(onContextCreate = js.Any.fromFunction1(onContextCreate))
      __obj.asInstanceOf[BaseGLViewProps]
    }
    
    extension [Self <: BaseGLViewProps](x: Self) {
      
      inline def setMsaaSamples(value: Double): Self = StObject.set(x, "msaaSamples", value.asInstanceOf[js.Any])
      
      inline def setMsaaSamplesUndefined: Self = StObject.set(x, "msaaSamples", js.undefined)
      
      inline def setOnContextCreate(value: ExpoWebGLRenderingContext => Unit): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1(value))
    }
  }
  
  type ComponentOrHandle = Null | Double | (Component[Any, Any, Any]) | (ComponentClass[Any, ComponentState])
  
  @js.native
  trait ExpoWebGLRenderingContext
    extends StObject
       with WebGL2RenderingContext {
    
    def __expoSetLogging(option: GLLoggingOption): Unit = js.native
    
    var contextId: Double = js.native
    
    def endFrameEXP(): Unit = js.native
    
    def flushEXP(): Unit = js.native
  }
  
  trait GLSnapshot extends StObject {
    
    var height: Double
    
    var localUri: String
    
    var uri: String | Blob | Null
    
    var width: Double
  }
  object GLSnapshot {
    
    inline def apply(height: Double, localUri: String, width: Double): GLSnapshot = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], localUri = localUri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], uri = null)
      __obj.asInstanceOf[GLSnapshot]
    }
    
    extension [Self <: GLSnapshot](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLocalUri(value: String): Self = StObject.set(x, "localUri", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String | Blob): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriNull: Self = StObject.set(x, "uri", null)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SnapshotOptions extends StObject {
    
    var compress: js.UndefOr[Double] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[jpeg | png] = js.undefined
    
    var framebuffer: js.UndefOr[WebGLFramebuffer] = js.undefined
    
    var rect: js.UndefOr[Height] = js.undefined
  }
  object SnapshotOptions {
    
    inline def apply(): SnapshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotOptions]
    }
    
    extension [Self <: SnapshotOptions](x: Self) {
      
      inline def setCompress(value: Double): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFormat(value: jpeg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFramebuffer(value: WebGLFramebuffer): Self = StObject.set(x, "framebuffer", value.asInstanceOf[js.Any])
      
      inline def setFramebufferUndefined: Self = StObject.set(x, "framebuffer", js.undefined)
      
      inline def setRect(value: Height): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    }
  }
  
  trait SurfaceCreateEvent extends StObject {
    
    var nativeEvent: ExglCtxId
  }
  object SurfaceCreateEvent {
    
    inline def apply(nativeEvent: ExglCtxId): SurfaceCreateEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[SurfaceCreateEvent]
    }
    
    extension [Self <: SurfaceCreateEvent](x: Self) {
      
      inline def setNativeEvent(value: ExglCtxId): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
}
