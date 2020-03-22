package typings.escpos.mod

import typings.escpos.AnonColors
import typings.escpos.AnonData
import typings.escpos.AnonHeight
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "Image")
@js.native
class Image protected () extends js.Object {
  def this(pixels: js.Any) = this()
  def size(): AnonColors = js.native
  def toBitmap(): AnonData = js.native
  def toBitmap(density: Double): AnonData = js.native
  def toRaster(): AnonHeight = js.native
}

/* static members */
@JSImport("escpos", "Image")
@js.native
object Image extends js.Object {
  def load(url: String): Unit = js.native
  def load(url: String, callback: js.Function1[/* result */ this.type | Error, Unit]): Unit = js.native
  def load(url: String, `type`: MIME_TYPE): Unit = js.native
  def load(url: String, `type`: MIME_TYPE, callback: js.Function1[/* result */ this.type | Error, Unit]): Unit = js.native
}

