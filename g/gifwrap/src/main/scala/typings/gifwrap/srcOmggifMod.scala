package typings.gifwrap

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOmggifMod {
  
  type ByteArray = js.typedarray.Uint8Array | Buffer
  
  trait FrameInfo extends StObject {
    
    var data_length: Double
    
    var data_offset: Double
    
    var delay: Double
    
    // 100ths of a second
    var disposal: Double
    
    var has_local_palette: Boolean
    
    var height: Double
    
    var interlaced: Boolean
    
    var palette_offset: Double
    
    var transparent_index: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object FrameInfo {
    
    inline def apply(
      data_length: Double,
      data_offset: Double,
      delay: Double,
      disposal: Double,
      has_local_palette: Boolean,
      height: Double,
      interlaced: Boolean,
      palette_offset: Double,
      transparent_index: Double,
      width: Double,
      x: Double,
      y: Double
    ): FrameInfo = {
      val __obj = js.Dynamic.literal(data_length = data_length.asInstanceOf[js.Any], data_offset = data_offset.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], disposal = disposal.asInstanceOf[js.Any], has_local_palette = has_local_palette.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlaced = interlaced.asInstanceOf[js.Any], palette_offset = palette_offset.asInstanceOf[js.Any], transparent_index = transparent_index.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameInfo]
    }
    
    extension [Self <: FrameInfo](x: Self) {
      
      inline def setData_length(value: Double): Self = StObject.set(x, "data_length", value.asInstanceOf[js.Any])
      
      inline def setData_offset(value: Double): Self = StObject.set(x, "data_offset", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDisposal(value: Double): Self = StObject.set(x, "disposal", value.asInstanceOf[js.Any])
      
      inline def setHas_local_palette(value: Boolean): Self = StObject.set(x, "has_local_palette", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInterlaced(value: Boolean): Self = StObject.set(x, "interlaced", value.asInstanceOf[js.Any])
      
      inline def setPalette_offset(value: Double): Self = StObject.set(x, "palette_offset", value.asInstanceOf[js.Any])
      
      inline def setTransparent_index(value: Double): Self = StObject.set(x, "transparent_index", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrameOptions extends StObject {
    
    // RGB by color index
    var delay: js.UndefOr[Double] = js.undefined
    
    // duation in 100s of a second
    var disposal: js.UndefOr[Double] = js.undefined
    
    var palette: js.UndefOr[js.Array[Double]] = js.undefined
    
    // what to do with background color (0-3)
    var transparent: js.UndefOr[Double] = js.undefined
  }
  object FrameOptions {
    
    inline def apply(): FrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameOptions]
    }
    
    extension [Self <: FrameOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisposal(value: Double): Self = StObject.set(x, "disposal", value.asInstanceOf[js.Any])
      
      inline def setDisposalUndefined: Self = StObject.set(x, "disposal", js.undefined)
      
      inline def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setTransparent(value: Double): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
  
  @js.native
  trait GifReader
    extends StObject
       with Instantiable1[/* buffer */ ByteArray, GifReader] {
    
    def decodeAndBlitFrameBGRA(frameNumber: Double, pixels: js.Array[Double]): Unit = js.native
    
    def decodeAndBlitFrameRGBA(frameNumber: Double, pixels: js.Array[Double]): Unit = js.native
    
    def frameInfo(frameNumber: Double): FrameInfo = js.native
    
    var height: Double = js.native
    
    def loopCount(): Double = js.native
    
    def numFrames(): Double = js.native
    
    var width: Double = js.native
  }
  
  @js.native
  trait GifWriter
    extends StObject
       with Instantiable3[/* buffer */ ByteArray, /* width */ Double, /* height */ Double, GifWriter]
       with Instantiable4[
          /* buffer */ ByteArray, 
          /* width */ Double, 
          /* height */ Double, 
          /* gopts */ GlobalOptions, 
          GifWriter
        ] {
    
    def addFrame(x: Double, y: Double, width: Double, height: Double, indexedPixels: js.Array[Double]): Double = js.native
    def addFrame(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      indexedPixels: js.Array[Double],
      opts: FrameOptions
    ): Double = js.native
    
    def end(): Double = js.native
    
    // returns size of buffer at end of frame
    def getOutputBuffer(): ByteArray = js.native
    
    def getOutputBufferPosition(): Double = js.native
    
    def setOutputBuffer(buffer: ByteArray): Unit = js.native
    
    def setOutputBufferPosition(position: Double): Unit = js.native
  }
  
  trait GlobalOptions extends StObject {
    
    // global palette RGB by color index
    var background: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Double] = js.undefined
    
    // 0 = unending loop; n > 0 = (n+1) iterations; null = once
    var palette: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object GlobalOptions {
    
    inline def apply(): GlobalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalOptions]
    }
    
    extension [Self <: GlobalOptions](x: Self) {
      
      inline def setBackground(value: Double): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value*))
    }
  }
  
  trait OmggifModule extends StObject {
    
    var GifReader: typings.gifwrap.srcOmggifMod.GifReader
    
    var GifWriter: typings.gifwrap.srcOmggifMod.GifWriter
  }
  object OmggifModule {
    
    inline def apply(GifReader: GifReader, GifWriter: GifWriter): OmggifModule = {
      val __obj = js.Dynamic.literal(GifReader = GifReader.asInstanceOf[js.Any], GifWriter = GifWriter.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmggifModule]
    }
    
    extension [Self <: OmggifModule](x: Self) {
      
      inline def setGifReader(value: GifReader): Self = StObject.set(x, "GifReader", value.asInstanceOf[js.Any])
      
      inline def setGifWriter(value: GifWriter): Self = StObject.set(x, "GifWriter", value.asInstanceOf[js.Any])
    }
  }
}
