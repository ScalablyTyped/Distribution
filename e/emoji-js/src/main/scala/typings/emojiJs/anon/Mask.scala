package typings.emojiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mask extends js.Object {
  var mask: Double
  var path: String
  var sheet: String
  var sheet_size: Double
}

object Mask {
  @scala.inline
  def apply(mask: Double, path: String, sheet: String, sheet_size: Double): Mask = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], sheet_size = sheet_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mask]
  }
}

