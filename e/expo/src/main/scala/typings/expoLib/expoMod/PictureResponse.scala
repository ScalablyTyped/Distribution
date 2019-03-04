package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureResponse extends js.Object {
  var base64: java.lang.String
  var exif: java.lang.String
  var height: scala.Double
  var uri: java.lang.String
  var width: scala.Double
}

object PictureResponse {
  @scala.inline
  def apply(
    base64: java.lang.String,
    exif: java.lang.String,
    height: scala.Double,
    uri: java.lang.String,
    width: scala.Double
  ): PictureResponse = {
    val __obj = js.Dynamic.literal(base64 = base64, exif = exif, height = height, uri = uri, width = width)
  
    __obj.asInstanceOf[PictureResponse]
  }
}

