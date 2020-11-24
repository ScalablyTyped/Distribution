package typings.gifwrap.mod

import typings.gifwrap.gifwrapNumbers.`0`
import typings.gifwrap.gifwrapNumbers.`1`
import typings.gifwrap.gifwrapNumbers.`2`
import typings.gifwrap.gifwrapNumbers.`3`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("gifwrap", "GifFrame")
@js.native
object GifFrame extends js.Object {
  
  val DisposeNothing: `1` = js.native
  
  val DisposeToAnything: `0` = js.native
  
  val DisposeToBackgroundColor: `2` = js.native
  
  val DisposeToPrevious: `3` = js.native
}
