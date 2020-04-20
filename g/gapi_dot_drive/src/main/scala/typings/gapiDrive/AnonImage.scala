package typings.gapiDrive

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var image: Uint8Array
  var mimType: String
}

object AnonImage {
  @scala.inline
  def apply(image: Uint8Array, mimType: String): AnonImage = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mimType = mimType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

