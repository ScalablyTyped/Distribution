package typings.gapiDotDrive

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: Uint8Array
  var mimType: String
}

object Anon_Image {
  @scala.inline
  def apply(image: Uint8Array, mimType: String): Anon_Image = {
    val __obj = js.Dynamic.literal(image = image, mimType = mimType)
  
    __obj.asInstanceOf[Anon_Image]
  }
}

