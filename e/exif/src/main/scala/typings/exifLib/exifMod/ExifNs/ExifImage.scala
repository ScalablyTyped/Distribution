package typings
package exifLib.exifMod.ExifNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExifImage extends js.Object {
  def loadImage(file: java.lang.String, callback: ExifImageCallback): scala.Unit = js.native
  def loadImage(file: nodeLib.Buffer, callback: ExifImageCallback): scala.Unit = js.native
}

