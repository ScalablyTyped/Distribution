package typings.gapiDrive.anon

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var image: Uint8Array
  var mimType: String
}

object Image {
  @scala.inline
  def apply(image: Uint8Array, mimType: String): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mimType = mimType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

