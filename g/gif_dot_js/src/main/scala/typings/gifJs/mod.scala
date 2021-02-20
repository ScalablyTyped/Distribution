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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gif.js", JSImport.Namespace)
  @js.native
  class ^ () extends GIF {
    def this(options: Options) = this()
  }
  
  @js.native
  trait AddFrameOptions extends StObject {
    
    var copy: js.UndefOr[Boolean] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var dispose: js.UndefOr[Double] = js.native
  }
  object AddFrameOptions {
    
    @scala.inline
    def apply(): AddFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddFrameOptions]
    }
    
    @scala.inline
    implicit class AddFrameOptionsMutableBuilder[Self <: AddFrameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDispose(value: Double): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
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
  
  @js.native
  trait Options extends StObject {
    
    var background: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var dither: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double | Null] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var repeat: js.UndefOr[Double] = js.native
    
    var transparent: js.UndefOr[String | Null] = js.native
    
    var width: js.UndefOr[Double | Null] = js.native
    
    var workerScript: js.UndefOr[String] = js.native
    
    var workers: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDither(value: Boolean): Self = StObject.set(x, "dither", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDitherUndefined: Self = StObject.set(x, "dither", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightNull: Self = StObject.set(x, "height", null)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setTransparent(value: String): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentNull: Self = StObject.set(x, "transparent", null)
      
      @scala.inline
      def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthNull: Self = StObject.set(x, "width", null)
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWorkerScript(value: String): Self = StObject.set(x, "workerScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerScriptUndefined: Self = StObject.set(x, "workerScript", js.undefined)
      
      @scala.inline
      def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
}
