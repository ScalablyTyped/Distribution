package typings.gifwrap

import typings.gifwrap.anon.Colors
import typings.gifwrap.anon.MaxHeight
import typings.gifwrap.gifwrapNumbers.`0`
import typings.gifwrap.gifwrapNumbers.`1`
import typings.gifwrap.gifwrapNumbers.`2`
import typings.gifwrap.gifwrapNumbers.`3`
import typings.node.Buffer
import typings.std.Error
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gifwrap", "BitmapImage")
  @js.native
  class BitmapImage protected () extends StObject {
    def this(bitmapImage: BitmapImage) = this()
    def this(bitmap: JimpBitmap) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, backgroundRGBA: Double) = this()
    def this(width: Double, height: Double, buffer: Buffer) = this()
    
    var bitmap: JimpBitmap = js.native
    
    def blit(
      toImage: BitmapImage,
      toX: Double,
      toY: Double,
      fromX: Double,
      fromY: Double,
      fromWidth: Double,
      fromHeight: Double
    ): this.type = js.native
    
    def fillRGBA(color: Double): this.type = js.native
    
    def getRGBA(x: Double, y: Double): Double = js.native
    
    def getRGBASet(): Set[Double] = js.native
    
    def greyscale(): this.type = js.native
    
    def reframe(xOffset: Double, yOffset: Double, width: Double, height: Double): this.type = js.native
    def reframe(xOffset: Double, yOffset: Double, width: Double, height: Double, fillRGBA: Double): this.type = js.native
    
    def scale(factor: Double): this.type = js.native
    
    def scanAllCoords(handler: js.Function3[/* x */ Double, /* y */ Double, /* bufferIndex */ Double, Unit]): Unit = js.native
    
    def scanAllIndexes(handler: js.Function1[/* bufferIndex */ Double, Unit]): Unit = js.native
  }
  
  @JSImport("gifwrap", "Gif")
  @js.native
  class Gif protected () extends GifSpec {
    def this(frames: js.Array[GifFrame], buffer: Buffer) = this()
    def this(frames: js.Array[GifFrame], buffer: Buffer, spec: GifSpec) = this()
    
    var buffer: Buffer = js.native
    
    @JSName("colorScope")
    var colorScope_Gif: `0` | `1` | `2` = js.native
    
    var frames: js.Array[GifFrame] = js.native
    
    var height: Double = js.native
    
    @JSName("loops")
    var loops_Gif: Double = js.native
    
    var usesTransparency: Boolean = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object Gif {
    
    @JSImport("gifwrap", "Gif.GlobalColorsOnly")
    @js.native
    val GlobalColorsOnly: `1` = js.native
    
    @JSImport("gifwrap", "Gif.GlobalColorsPreferred")
    @js.native
    val GlobalColorsPreferred: `0` = js.native
    
    @JSImport("gifwrap", "Gif.LocalColorsOnly")
    @js.native
    val LocalColorsOnly: `2` = js.native
  }
  
  @JSImport("gifwrap", "GifCodec")
  @js.native
  class GifCodec ()
    extends GifEncoder
       with GifDecoder {
    def this(options: GifCodecOptions) = this()
  }
  
  @JSImport("gifwrap", "GifError")
  @js.native
  class GifError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("gifwrap", "GifFrame")
  @js.native
  class GifFrame protected ()
    extends BitmapImage
       with GifFrameOptions {
    def this(bitmapImage: BitmapImage) = this()
    def this(bitmap: JimpBitmap) = this()
    def this(frame: GifFrame) = this()
    def this(bitmapImage: BitmapImage, options: GifFrameOptions) = this()
    def this(bitmap: JimpBitmap, options: GifFrameOptions) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, backgroundRGBA: Double) = this()
    def this(width: Double, height: Double, buffer: Buffer) = this()
    def this(width: Double, height: Double, backgroundRGBA: js.UndefOr[scala.Nothing], options: GifFrameOptions) = this()
    def this(width: Double, height: Double, backgroundRGBA: Double, options: GifFrameOptions) = this()
    def this(width: Double, height: Double, buffer: Buffer, options: GifFrameOptions) = this()
    
    @JSName("delayCentisecs")
    var delayCentisecs_GifFrame: Double = js.native
    
    @JSName("disposalMethod")
    var disposalMethod_GifFrame: `0` | `1` | `2` | `3` = js.native
    
    def getPalette(): GifPalette = js.native
    
    var interlaced: Boolean = js.native
    
    @JSName("xOffset")
    var xOffset_GifFrame: Double = js.native
    
    @JSName("yOffset")
    var yOffset_GifFrame: Double = js.native
  }
  /* static members */
  object GifFrame {
    
    @JSImport("gifwrap", "GifFrame.DisposeNothing")
    @js.native
    val DisposeNothing: `1` = js.native
    
    @JSImport("gifwrap", "GifFrame.DisposeToAnything")
    @js.native
    val DisposeToAnything: `0` = js.native
    
    @JSImport("gifwrap", "GifFrame.DisposeToBackgroundColor")
    @js.native
    val DisposeToBackgroundColor: `2` = js.native
    
    @JSImport("gifwrap", "GifFrame.DisposeToPrevious")
    @js.native
    val DisposeToPrevious: `3` = js.native
  }
  
  object GifUtil {
    
    @JSImport("gifwrap", "GifUtil.cloneFrames")
    @js.native
    def cloneFrames(frames: js.Array[GifFrame]): js.Array[GifFrame] = js.native
    
    @JSImport("gifwrap", "GifUtil.copyAsJimp")
    @js.native
    def copyAsJimp(jimp: js.Any, bitmapImageToCopy: BitmapImage): js.Any = js.native
    
    @JSImport("gifwrap", "GifUtil.getColorInfo")
    @js.native
    def getColorInfo(frames: js.Array[GifFrame]): Colors = js.native
    @JSImport("gifwrap", "GifUtil.getColorInfo")
    @js.native
    def getColorInfo(frames: js.Array[GifFrame], maxGlobalIndex: Double): Colors = js.native
    
    @JSImport("gifwrap", "GifUtil.getMaxDimensions")
    @js.native
    def getMaxDimensions(frames: js.Array[GifFrame]): MaxHeight = js.native
    
    @JSImport("gifwrap", "GifUtil.quantizeDekker")
    @js.native
    def quantizeDekker(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeDekker")
    @js.native
    def quantizeDekker(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, dither: Dither): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeDekker")
    @js.native
    def quantizeDekker(imageOrImages: BitmapImage, maxColorIndexes: Double): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeDekker")
    @js.native
    def quantizeDekker(imageOrImages: BitmapImage, maxColorIndexes: Double, dither: Dither): Unit = js.native
    
    @JSImport("gifwrap", "GifUtil.quantizeSorokin")
    @js.native
    def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeSorokin")
    @js.native
    def quantizeSorokin(
      imageOrImages: js.Array[BitmapImage],
      maxColorIndexes: Double,
      histogram: js.UndefOr[scala.Nothing],
      dither: Dither
    ): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeSorokin")
    @js.native
    def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, histogram: String): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeSorokin")
    @js.native
    def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, histogram: String, dither: Dither): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeSorokin")
    @js.native
    def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeSorokin")
    @js.native
    def quantizeSorokin(
      imageOrImages: BitmapImage,
      maxColorIndexes: Double,
      histogram: js.UndefOr[scala.Nothing],
      dither: Dither
    ): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeSorokin")
    @js.native
    def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double, histogram: String): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeSorokin")
    @js.native
    def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double, histogram: String, dither: Dither): Unit = js.native
    
    @JSImport("gifwrap", "GifUtil.quantizeWu")
    @js.native
    def quantizeWu(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeWu")
    @js.native
    def quantizeWu(
      imageOrImages: js.Array[BitmapImage],
      maxColorIndexes: Double,
      significantBits: js.UndefOr[scala.Nothing],
      dither: Dither
    ): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeWu")
    @js.native
    def quantizeWu(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, significantBits: Double): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeWu")
    @js.native
    def quantizeWu(
      imageOrImages: js.Array[BitmapImage],
      maxColorIndexes: Double,
      significantBits: Double,
      dither: Dither
    ): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeWu")
    @js.native
    def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeWu")
    @js.native
    def quantizeWu(
      imageOrImages: BitmapImage,
      maxColorIndexes: Double,
      significantBits: js.UndefOr[scala.Nothing],
      dither: Dither
    ): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeWu")
    @js.native
    def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double, significantBits: Double): Unit = js.native
    @JSImport("gifwrap", "GifUtil.quantizeWu")
    @js.native
    def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double, significantBits: Double, dither: Dither): Unit = js.native
    
    @JSImport("gifwrap", "GifUtil.read")
    @js.native
    def read(source: String): js.Promise[Gif] = js.native
    @JSImport("gifwrap", "GifUtil.read")
    @js.native
    def read(source: String, decoder: GifDecoder): js.Promise[Gif] = js.native
    @JSImport("gifwrap", "GifUtil.read")
    @js.native
    def read(source: Buffer): js.Promise[Gif] = js.native
    @JSImport("gifwrap", "GifUtil.read")
    @js.native
    def read(source: Buffer, decoder: GifDecoder): js.Promise[Gif] = js.native
    
    @JSImport("gifwrap", "GifUtil.shareAsJimp")
    @js.native
    def shareAsJimp(jimp: js.Any, bitmapImageToCopy: BitmapImage): js.Any = js.native
    
    @JSImport("gifwrap", "GifUtil.write")
    @js.native
    def write(path: String, frames: js.Array[GifFrame]): js.Promise[Gif] = js.native
    @JSImport("gifwrap", "GifUtil.write")
    @js.native
    def write(path: String, frames: js.Array[GifFrame], spec: js.UndefOr[scala.Nothing], encoder: GifEncoder): js.Promise[Gif] = js.native
    @JSImport("gifwrap", "GifUtil.write")
    @js.native
    def write(path: String, frames: js.Array[GifFrame], spec: GifSpec): js.Promise[Gif] = js.native
    @JSImport("gifwrap", "GifUtil.write")
    @js.native
    def write(path: String, frames: js.Array[GifFrame], spec: GifSpec, encoder: GifEncoder): js.Promise[Gif] = js.native
  }
  
  @js.native
  trait Dither extends StObject {
    
    // default = true
    var calculateErrorLikeGIMP: js.UndefOr[Boolean] = js.native
    
    var ditherAlgorithm: DitherAlgorithm = js.native
    
    var minimumColorDistanceToDither: js.UndefOr[Double] = js.native
    
    // default = 0
    var serpentine: js.UndefOr[Boolean] = js.native
  }
  object Dither {
    
    @scala.inline
    def apply(ditherAlgorithm: DitherAlgorithm): Dither = {
      val __obj = js.Dynamic.literal(ditherAlgorithm = ditherAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dither]
    }
    
    @scala.inline
    implicit class DitherMutableBuilder[Self <: Dither] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculateErrorLikeGIMP(value: Boolean): Self = StObject.set(x, "calculateErrorLikeGIMP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalculateErrorLikeGIMPUndefined: Self = StObject.set(x, "calculateErrorLikeGIMP", js.undefined)
      
      @scala.inline
      def setDitherAlgorithm(value: DitherAlgorithm): Self = StObject.set(x, "ditherAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumColorDistanceToDither(value: Double): Self = StObject.set(x, "minimumColorDistanceToDither", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumColorDistanceToDitherUndefined: Self = StObject.set(x, "minimumColorDistanceToDither", js.undefined)
      
      @scala.inline
      def setSerpentine(value: Boolean): Self = StObject.set(x, "serpentine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerpentineUndefined: Self = StObject.set(x, "serpentine", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gifwrap.gifwrapStrings.FloydSteinberg
    - typings.gifwrap.gifwrapStrings.FalseFloydSteinberg
    - typings.gifwrap.gifwrapStrings.Stucki
    - typings.gifwrap.gifwrapStrings.Atkinson
    - typings.gifwrap.gifwrapStrings.Jarvis
    - typings.gifwrap.gifwrapStrings.Burkes
    - typings.gifwrap.gifwrapStrings.Sierra
    - typings.gifwrap.gifwrapStrings.TwoSierra
    - typings.gifwrap.gifwrapStrings.SierraLite
  */
  trait DitherAlgorithm extends StObject
  object DitherAlgorithm {
    
    @scala.inline
    def Atkinson: typings.gifwrap.gifwrapStrings.Atkinson = "Atkinson".asInstanceOf[typings.gifwrap.gifwrapStrings.Atkinson]
    
    @scala.inline
    def Burkes: typings.gifwrap.gifwrapStrings.Burkes = "Burkes".asInstanceOf[typings.gifwrap.gifwrapStrings.Burkes]
    
    @scala.inline
    def FalseFloydSteinberg: typings.gifwrap.gifwrapStrings.FalseFloydSteinberg = "FalseFloydSteinberg".asInstanceOf[typings.gifwrap.gifwrapStrings.FalseFloydSteinberg]
    
    @scala.inline
    def FloydSteinberg: typings.gifwrap.gifwrapStrings.FloydSteinberg = "FloydSteinberg".asInstanceOf[typings.gifwrap.gifwrapStrings.FloydSteinberg]
    
    @scala.inline
    def Jarvis: typings.gifwrap.gifwrapStrings.Jarvis = "Jarvis".asInstanceOf[typings.gifwrap.gifwrapStrings.Jarvis]
    
    @scala.inline
    def Sierra: typings.gifwrap.gifwrapStrings.Sierra = "Sierra".asInstanceOf[typings.gifwrap.gifwrapStrings.Sierra]
    
    @scala.inline
    def SierraLite: typings.gifwrap.gifwrapStrings.SierraLite = "SierraLite".asInstanceOf[typings.gifwrap.gifwrapStrings.SierraLite]
    
    @scala.inline
    def Stucki: typings.gifwrap.gifwrapStrings.Stucki = "Stucki".asInstanceOf[typings.gifwrap.gifwrapStrings.Stucki]
    
    @scala.inline
    def TwoSierra: typings.gifwrap.gifwrapStrings.TwoSierra = "TwoSierra".asInstanceOf[typings.gifwrap.gifwrapStrings.TwoSierra]
  }
  
  @js.native
  trait GifCodecOptions extends StObject {
    
    var transparentRGB: js.UndefOr[Double] = js.native
  }
  object GifCodecOptions {
    
    @scala.inline
    def apply(): GifCodecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifCodecOptions]
    }
    
    @scala.inline
    implicit class GifCodecOptionsMutableBuilder[Self <: GifCodecOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransparentRGB(value: Double): Self = StObject.set(x, "transparentRGB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentRGBUndefined: Self = StObject.set(x, "transparentRGB", js.undefined)
    }
  }
  
  @js.native
  trait GifDecoder extends StObject {
    
    def decodeGif(buffer: Buffer): js.Promise[Gif] = js.native
  }
  object GifDecoder {
    
    @scala.inline
    def apply(decodeGif: Buffer => js.Promise[Gif]): GifDecoder = {
      val __obj = js.Dynamic.literal(decodeGif = js.Any.fromFunction1(decodeGif))
      __obj.asInstanceOf[GifDecoder]
    }
    
    @scala.inline
    implicit class GifDecoderMutableBuilder[Self <: GifDecoder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodeGif(value: Buffer => js.Promise[Gif]): Self = StObject.set(x, "decodeGif", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GifEncoder extends StObject {
    
    def encodeGif(frames: js.Array[GifFrame], spec: GifSpec): js.Promise[Gif] = js.native
  }
  object GifEncoder {
    
    @scala.inline
    def apply(encodeGif: (js.Array[GifFrame], GifSpec) => js.Promise[Gif]): GifEncoder = {
      val __obj = js.Dynamic.literal(encodeGif = js.Any.fromFunction2(encodeGif))
      __obj.asInstanceOf[GifEncoder]
    }
    
    @scala.inline
    implicit class GifEncoderMutableBuilder[Self <: GifEncoder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncodeGif(value: (js.Array[GifFrame], GifSpec) => js.Promise[Gif]): Self = StObject.set(x, "encodeGif", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait GifFrameOptions extends StObject {
    
    var delayCentisecs: js.UndefOr[Double] = js.native
    
    var disposalMethod: js.UndefOr[`0` | `1` | `2` | `3`] = js.native
    
    var isInterlaced: js.UndefOr[Boolean] = js.native
    
    var xOffset: js.UndefOr[Double] = js.native
    
    var yOffset: js.UndefOr[Double] = js.native
  }
  object GifFrameOptions {
    
    @scala.inline
    def apply(): GifFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifFrameOptions]
    }
    
    @scala.inline
    implicit class GifFrameOptionsMutableBuilder[Self <: GifFrameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayCentisecs(value: Double): Self = StObject.set(x, "delayCentisecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayCentisecsUndefined: Self = StObject.set(x, "delayCentisecs", js.undefined)
      
      @scala.inline
      def setDisposalMethod(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "disposalMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisposalMethodUndefined: Self = StObject.set(x, "disposalMethod", js.undefined)
      
      @scala.inline
      def setIsInterlaced(value: Boolean): Self = StObject.set(x, "isInterlaced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInterlacedUndefined: Self = StObject.set(x, "isInterlaced", js.undefined)
      
      @scala.inline
      def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
      
      @scala.inline
      def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
    }
  }
  
  @js.native
  trait GifPalette extends StObject {
    
    var colors: js.Array[Double] = js.native
    
    var indexCount: Double = js.native
    
    var usesTransparency: Boolean = js.native
  }
  object GifPalette {
    
    @scala.inline
    def apply(colors: js.Array[Double], indexCount: Double, usesTransparency: Boolean): GifPalette = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], indexCount = indexCount.asInstanceOf[js.Any], usesTransparency = usesTransparency.asInstanceOf[js.Any])
      __obj.asInstanceOf[GifPalette]
    }
    
    @scala.inline
    implicit class GifPaletteMutableBuilder[Self <: GifPalette] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setIndexCount(value: Double): Self = StObject.set(x, "indexCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsesTransparency(value: Boolean): Self = StObject.set(x, "usesTransparency", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GifSpec extends StObject {
    
    var colorScope: js.UndefOr[`0` | `1` | `2`] = js.native
    
    var loops: js.UndefOr[Double] = js.native
  }
  object GifSpec {
    
    @scala.inline
    def apply(): GifSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifSpec]
    }
    
    @scala.inline
    implicit class GifSpecMutableBuilder[Self <: GifSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorScope(value: `0` | `1` | `2`): Self = StObject.set(x, "colorScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorScopeUndefined: Self = StObject.set(x, "colorScope", js.undefined)
      
      @scala.inline
      def setLoops(value: Double): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopsUndefined: Self = StObject.set(x, "loops", js.undefined)
    }
  }
  
  @js.native
  trait JimpBitmap extends StObject {
    
    var data: Buffer = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object JimpBitmap {
    
    @scala.inline
    def apply(data: Buffer, height: Double, width: Double): JimpBitmap = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[JimpBitmap]
    }
    
    @scala.inline
    implicit class JimpBitmapMutableBuilder[Self <: JimpBitmap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
