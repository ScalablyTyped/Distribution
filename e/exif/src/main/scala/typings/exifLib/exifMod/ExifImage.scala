package typings
package exifLib.exifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exif", "ExifImage")
@js.native
class ExifImage () extends js.Object {
  def this(options: ExifOptions, callback: ExifImageCallback) = this()
  def this(options: java.lang.String, callback: ExifImageCallback) = this()
  def this(options: nodeLib.Buffer, callback: ExifImageCallback) = this()
  def loadImage(file: java.lang.String, callback: ExifImageCallback): scala.Unit = js.native
  def loadImage(file: nodeLib.Buffer, callback: ExifImageCallback): scala.Unit = js.native
}

