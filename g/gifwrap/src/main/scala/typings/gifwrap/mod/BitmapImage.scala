package typings.gifwrap.mod

import typings.node.Buffer
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gifwrap", "BitmapImage")
@js.native
class BitmapImage protected () extends js.Object {
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
