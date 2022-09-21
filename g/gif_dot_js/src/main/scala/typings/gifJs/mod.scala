package typings.gifJs

import typings.gifJs.gifJsStrings.abort
import typings.gifJs.gifJsStrings.background
import typings.gifJs.gifJsStrings.debug
import typings.gifJs.gifJsStrings.dither
import typings.gifJs.gifJsStrings.finished
import typings.gifJs.gifJsStrings.height
import typings.gifJs.gifJsStrings.progress
import typings.gifJs.gifJsStrings.quality
import typings.gifJs.gifJsStrings.repeat
import typings.gifJs.gifJsStrings.start
import typings.gifJs.gifJsStrings.transparent
import typings.gifJs.gifJsStrings.width
import typings.gifJs.gifJsStrings.workerScript
import typings.gifJs.gifJsStrings.workers
import typings.node.eventsMod.EventEmitter
import typings.std.Blob
import typings.std.CanvasImageSource
import typings.std.CanvasRenderingContext2D
import typings.std.ImageData
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gif.js", JSImport.Namespace)
  @js.native
  open class ^ () extends GIF {
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.gifJs.gifJsStrings.FloydSteinberg
    - typings.gifJs.gifJsStrings.`FloydSteinberg-serpentine`
    - typings.gifJs.gifJsStrings.FalseFloydSteinberg
    - typings.gifJs.gifJsStrings.`FalseFloydSteinberg-serpentine`
    - typings.gifJs.gifJsStrings.Stucki
    - typings.gifJs.gifJsStrings.`Stucki-serpentine`
    - typings.gifJs.gifJsStrings.Atkinson
    - typings.gifJs.gifJsStrings.`Atkinson-serpentine`
  */
  trait DitherMethod extends StObject
  object DitherMethod {
    
    inline def Atkinson: typings.gifJs.gifJsStrings.Atkinson = "Atkinson".asInstanceOf[typings.gifJs.gifJsStrings.Atkinson]
    
    inline def `Atkinson-serpentine`: typings.gifJs.gifJsStrings.`Atkinson-serpentine` = "Atkinson-serpentine".asInstanceOf[typings.gifJs.gifJsStrings.`Atkinson-serpentine`]
    
    inline def FalseFloydSteinberg: typings.gifJs.gifJsStrings.FalseFloydSteinberg = "FalseFloydSteinberg".asInstanceOf[typings.gifJs.gifJsStrings.FalseFloydSteinberg]
    
    inline def `FalseFloydSteinberg-serpentine`: typings.gifJs.gifJsStrings.`FalseFloydSteinberg-serpentine` = "FalseFloydSteinberg-serpentine".asInstanceOf[typings.gifJs.gifJsStrings.`FalseFloydSteinberg-serpentine`]
    
    inline def FloydSteinberg: typings.gifJs.gifJsStrings.FloydSteinberg = "FloydSteinberg".asInstanceOf[typings.gifJs.gifJsStrings.FloydSteinberg]
    
    inline def `FloydSteinberg-serpentine`: typings.gifJs.gifJsStrings.`FloydSteinberg-serpentine` = "FloydSteinberg-serpentine".asInstanceOf[typings.gifJs.gifJsStrings.`FloydSteinberg-serpentine`]
    
    inline def Stucki: typings.gifJs.gifJsStrings.Stucki = "Stucki".asInstanceOf[typings.gifJs.gifJsStrings.Stucki]
    
    inline def `Stucki-serpentine`: typings.gifJs.gifJsStrings.`Stucki-serpentine` = "Stucki-serpentine".asInstanceOf[typings.gifJs.gifJsStrings.`Stucki-serpentine`]
  }
  
  @js.native
  trait GIF extends EventEmitter {
    
    def abort(): Unit = js.native
    
    def addFrame(image: CanvasImageSource): Unit = js.native
    def addFrame(image: CanvasImageSource, options: AddFrameOptions): Unit = js.native
    def addFrame(image: CanvasRenderingContext2D): Unit = js.native
    def addFrame(image: CanvasRenderingContext2D, options: AddFrameOptions): Unit = js.native
    def addFrame(image: ImageData): Unit = js.native
    def addFrame(image: ImageData, options: AddFrameOptions): Unit = js.native
    def addFrame(image: WebGLRenderingContext): Unit = js.native
    def addFrame(image: WebGLRenderingContext, options: AddFrameOptions): Unit = js.native
    
    def on(event: abort | start, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_finished(
      event: finished,
      listener: js.Function2[/* blob */ Blob, /* data */ js.typedarray.Uint8Array, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
    
    def once(event: abort | start, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_finished(
      event: finished,
      listener: js.Function2[/* blob */ Blob, /* data */ js.typedarray.Uint8Array, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
    
    def render(): Unit = js.native
    
    val running: Boolean = js.native
    
    @JSName("setOption")
    def setOption_background(key: background): Unit = js.native
    @JSName("setOption")
    def setOption_background(key: background, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_debug(key: debug): Unit = js.native
    @JSName("setOption")
    def setOption_debug(key: debug, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_dither(key: dither): Unit = js.native
    @JSName("setOption")
    def setOption_dither(key: dither, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_dither(key: dither, value: DitherMethod): Unit = js.native
    @JSName("setOption")
    def setOption_height(key: height): Unit = js.native
    @JSName("setOption")
    def setOption_height(key: height, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_quality(key: quality): Unit = js.native
    @JSName("setOption")
    def setOption_quality(key: quality, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_repeat(key: repeat): Unit = js.native
    @JSName("setOption")
    def setOption_repeat(key: repeat, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_transparent(key: transparent): Unit = js.native
    @JSName("setOption")
    def setOption_transparent(key: transparent, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_width(key: width): Unit = js.native
    @JSName("setOption")
    def setOption_width(key: width, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_workerScript(key: workerScript): Unit = js.native
    @JSName("setOption")
    def setOption_workerScript(key: workerScript, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_workers(key: workers): Unit = js.native
    @JSName("setOption")
    def setOption_workers(key: workers, value: Double): Unit = js.native
    
    def setOptions(options: Options): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var dither: js.UndefOr[DitherMethod | Boolean] = js.undefined
    
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
      
      inline def setDither(value: DitherMethod | Boolean): Self = StObject.set(x, "dither", value.asInstanceOf[js.Any])
      
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
