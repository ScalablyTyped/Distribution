package typings.escpos.escposMod

import typings.escpos.Anon_Colors
import typings.escpos.Anon_Data
import typings.escpos.Anon_DataHeight
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "Image")
@js.native
class Image protected () extends js.Object {
  def this(pixels: js.Any) = this()
  def size(): Anon_Colors = js.native
  def toBitmap(): Anon_Data = js.native
  def toBitmap(density: Double): Anon_Data = js.native
  def toRaster(): Anon_DataHeight = js.native
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

