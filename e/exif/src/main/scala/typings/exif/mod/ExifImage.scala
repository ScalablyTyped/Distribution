package typings.exif.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exif", "ExifImage")
@js.native
class ExifImage () extends js.Object {
  def this(options: String, callback: ExifImageCallback) = this()
  def this(options: ExifOptions, callback: ExifImageCallback) = this()
  def this(options: Buffer, callback: ExifImageCallback) = this()
  def loadImage(file: String, callback: ExifImageCallback): Unit = js.native
  def loadImage(file: Buffer, callback: ExifImageCallback): Unit = js.native
}

