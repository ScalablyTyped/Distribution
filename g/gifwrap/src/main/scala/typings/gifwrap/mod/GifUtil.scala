package typings.gifwrap.mod

import typings.gifwrap.anon.Colors
import typings.gifwrap.anon.MaxHeight
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gifwrap", "GifUtil")
@js.native
object GifUtil extends js.Object {
  def cloneFrames(frames: js.Array[GifFrame]): js.Array[GifFrame] = js.native
  def copyAsJimp(jimp: js.Any, bitmapImageToCopy: BitmapImage): js.Any = js.native
  def getColorInfo(frames: js.Array[GifFrame]): Colors = js.native
  def getColorInfo(frames: js.Array[GifFrame], maxGlobalIndex: Double): Colors = js.native
  def getMaxDimensions(frames: js.Array[GifFrame]): MaxHeight = js.native
  def quantizeDekker(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double): Unit = js.native
  def quantizeDekker(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, dither: Dither): Unit = js.native
  def quantizeDekker(imageOrImages: BitmapImage, maxColorIndexes: Double): Unit = js.native
  def quantizeDekker(imageOrImages: BitmapImage, maxColorIndexes: Double, dither: Dither): Unit = js.native
  def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double): Unit = js.native
  def quantizeSorokin(
    imageOrImages: js.Array[BitmapImage],
    maxColorIndexes: Double,
    histogram: js.UndefOr[scala.Nothing],
    dither: Dither
  ): Unit = js.native
  def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, histogram: String): Unit = js.native
  def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, histogram: String, dither: Dither): Unit = js.native
  def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double): Unit = js.native
  def quantizeSorokin(
    imageOrImages: BitmapImage,
    maxColorIndexes: Double,
    histogram: js.UndefOr[scala.Nothing],
    dither: Dither
  ): Unit = js.native
  def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double, histogram: String): Unit = js.native
  def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double, histogram: String, dither: Dither): Unit = js.native
  def quantizeWu(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double): Unit = js.native
  def quantizeWu(
    imageOrImages: js.Array[BitmapImage],
    maxColorIndexes: Double,
    significantBits: js.UndefOr[scala.Nothing],
    dither: Dither
  ): Unit = js.native
  def quantizeWu(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, significantBits: Double): Unit = js.native
  def quantizeWu(
    imageOrImages: js.Array[BitmapImage],
    maxColorIndexes: Double,
    significantBits: Double,
    dither: Dither
  ): Unit = js.native
  def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double): Unit = js.native
  def quantizeWu(
    imageOrImages: BitmapImage,
    maxColorIndexes: Double,
    significantBits: js.UndefOr[scala.Nothing],
    dither: Dither
  ): Unit = js.native
  def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double, significantBits: Double): Unit = js.native
  def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double, significantBits: Double, dither: Dither): Unit = js.native
  def read(source: String): js.Promise[Gif] = js.native
  def read(source: String, decoder: GifDecoder): js.Promise[Gif] = js.native
  def read(source: Buffer): js.Promise[Gif] = js.native
  def read(source: Buffer, decoder: GifDecoder): js.Promise[Gif] = js.native
  def shareAsJimp(jimp: js.Any, bitmapImageToCopy: BitmapImage): js.Any = js.native
  def write(path: String, frames: js.Array[GifFrame]): js.Promise[Gif] = js.native
  def write(path: String, frames: js.Array[GifFrame], spec: js.UndefOr[scala.Nothing], encoder: GifEncoder): js.Promise[Gif] = js.native
  def write(path: String, frames: js.Array[GifFrame], spec: GifSpec): js.Promise[Gif] = js.native
  def write(path: String, frames: js.Array[GifFrame], spec: GifSpec, encoder: GifEncoder): js.Promise[Gif] = js.native
}

