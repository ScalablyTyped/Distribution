package typings
package gapiDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: stdLib.Uint8Array
  var mimType: java.lang.String
}

object Anon_Image {
  @scala.inline
  def apply(image: stdLib.Uint8Array, mimType: java.lang.String): Anon_Image = {
    val __obj = js.Dynamic.literal(image = image, mimType = mimType)
  
    __obj.asInstanceOf[Anon_Image]
  }
}

