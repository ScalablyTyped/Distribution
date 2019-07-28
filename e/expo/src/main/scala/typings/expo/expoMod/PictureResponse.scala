package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureResponse extends js.Object {
  var base64: String
  var exif: String
  var height: Double
  var uri: String
  var width: Double
}

object PictureResponse {
  @scala.inline
  def apply(base64: String, exif: String, height: Double, uri: String, width: Double): PictureResponse = {
    val __obj = js.Dynamic.literal(base64 = base64, exif = exif, height = height, uri = uri, width = width)
  
    __obj.asInstanceOf[PictureResponse]
  }
}

