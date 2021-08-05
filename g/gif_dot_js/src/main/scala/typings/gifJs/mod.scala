package typings.gifJs

import typings.gifJs.gifJsStrings.abort
import typings.gifJs.gifJsStrings.finished
import typings.gifJs.gifJsStrings.progress
import typings.gifJs.gifJsStrings.start
import typings.node.eventsMod.EventEmitter
import typings.std.Blob
import typings.std.CanvasImageSource
import typings.std.CanvasRenderingContext2D
import typings.std.ImageData
import typings.std.Uint8Array
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gif.js", JSImport.Namespace)
  @js.native
  class ^ () extends GIF {
    def this(options: Options) = this()
  }
  
  trait AddFrameOptions extends StObject {
    
    var copy: js.UndefOr[Boolean] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var dispose: js.UndefOr[Double] = js.undefined
  }
  object AddFrameOptions {
    
    inline def apply(): AddFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddFrameOptions]
    }
    
    extension [Self <: AddFrameOptions](x: Self) {
      
      inline def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDispose(value: Double): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    }
  }
  
  @js.native
  trait GIF extends EventEmitter {
    
    def addFrame(image: CanvasImageSource): Unit = js.native
    def addFrame(image: CanvasImageSource, options: AddFrameOptions): Unit = js.native
    def addFrame(image: CanvasRenderingContext2D): Unit = js.native
    def addFrame(image: CanvasRenderingContext2D, options: AddFrameOptions): Unit = js.native
    def addFrame(image: ImageData): Unit = js.native
    def addFrame(image: ImageData, options: AddFrameOptions): Unit = js.native
    def addFrame(image: WebGLRenderingContext): Unit = js.native
    def addFrame(image: WebGLRenderingContext, options: AddFrameOptions): Unit = js.native
    
    @JSName("on")
    def on_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_finished(event: finished, listener: js.Function2[/* blob */ Blob, /* data */ Uint8Array, Unit]): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_start(event: start, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_finished(event: finished, listener: js.Function2[/* blob */ Blob, /* data */ Uint8Array, Unit]): this.type = js.native
    @JSName("once")
    def once_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_start(event: start, listener: js.Function0[Unit]): this.type = js.native
    
    def render(): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var dither: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double | Null] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var repeat: js.UndefOr[Double] = js.undefined
    
    var transparent: js.UndefOr[String | Null] = js.undefined
    
    var width: js.UndefOr[Double | Null] = js.undefined
    
    var workerScript: js.UndefOr[String] = js.undefined
    
    var workers: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDither(value: Boolean): Self = StObject.set(x, "dither", value.asInstanceOf[js.Any])
      
      inline def setDitherUndefined: Self = StObject.set(x, "dither", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setTransparent(value: String): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentNull: Self = StObject.set(x, "transparent", null)
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWorkerScript(value: String): Self = StObject.set(x, "workerScript", value.asInstanceOf[js.Any])
      
      inline def setWorkerScriptUndefined: Self = StObject.set(x, "workerScript", js.undefined)
      
      inline def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
}
