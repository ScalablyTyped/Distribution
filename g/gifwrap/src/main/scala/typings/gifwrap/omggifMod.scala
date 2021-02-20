package typings.gifwrap

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object omggifMod {
  
  type ByteArray = Uint8Array | Buffer
  
  @js.native
  trait FrameInfo extends StObject {
    
    var data_length: Double = js.native
    
    var data_offset: Double = js.native
    
    var delay: Double = js.native
    
    // 100ths of a second
    var disposal: Double = js.native
    
    var has_local_palette: Boolean = js.native
    
    var height: Double = js.native
    
    var interlaced: Boolean = js.native
    
    var palette_offset: Double = js.native
    
    var transparent_index: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object FrameInfo {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FrameInfoMutableBuilder[Self <: FrameInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_length(value: Double): Self = StObject.set(x, "data_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_offset(value: Double): Self = StObject.set(x, "data_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisposal(value: Double): Self = StObject.set(x, "disposal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_local_palette(value: Boolean): Self = StObject.set(x, "has_local_palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterlaced(value: Boolean): Self = StObject.set(x, "interlaced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalette_offset(value: Double): Self = StObject.set(x, "palette_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparent_index(value: Double): Self = StObject.set(x, "transparent_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FrameOptions extends StObject {
    
    // RGB by color index
    var delay: js.UndefOr[Double] = js.native
    
    // duation in 100s of a second
    var disposal: js.UndefOr[Double] = js.native
    
    var palette: js.UndefOr[js.Array[Double]] = js.native
    
    // what to do with background color (0-3)
    var transparent: js.UndefOr[Double] = js.native
  }
  object FrameOptions {
    
    @scala.inline
    def apply(): FrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameOptions]
    }
    
    @scala.inline
    implicit class FrameOptionsMutableBuilder[Self <: FrameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDisposal(value: Double): Self = StObject.set(x, "disposal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisposalUndefined: Self = StObject.set(x, "disposal", js.undefined)
      
      @scala.inline
      def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value :_*))
      
      @scala.inline
      def setTransparent(value: Double): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
  
  @js.native
  trait GifReader extends Instantiable1[/* buffer */ ByteArray, GifReader] {
    
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
    extends Instantiable3[/* buffer */ ByteArray, /* width */ Double, /* height */ Double, GifWriter]
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
  
  @js.native
  trait GlobalOptions extends StObject {
    
    // global palette RGB by color index
    var background: js.UndefOr[Double] = js.native
    
    var loop: js.UndefOr[Double] = js.native
    
    // 0 = unending loop; n > 0 = (n+1) iterations; null = once
    var palette: js.UndefOr[js.Array[Double]] = js.native
  }
  object GlobalOptions {
    
    @scala.inline
    def apply(): GlobalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalOptions]
    }
    
    @scala.inline
    implicit class GlobalOptionsMutableBuilder[Self <: GlobalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Double): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OmggifModule extends StObject {
    
    var GifReader: typings.gifwrap.omggifMod.GifReader = js.native
    
    var GifWriter: typings.gifwrap.omggifMod.GifWriter = js.native
  }
  object OmggifModule {
    
    @scala.inline
    def apply(GifReader: GifReader, GifWriter: GifWriter): OmggifModule = {
      val __obj = js.Dynamic.literal(GifReader = GifReader.asInstanceOf[js.Any], GifWriter = GifWriter.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmggifModule]
    }
    
    @scala.inline
    implicit class OmggifModuleMutableBuilder[Self <: OmggifModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGifReader(value: GifReader): Self = StObject.set(x, "GifReader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGifWriter(value: GifWriter): Self = StObject.set(x, "GifWriter", value.asInstanceOf[js.Any])
    }
  }
}
