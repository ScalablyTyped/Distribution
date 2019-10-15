package typings.emojiDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mask extends js.Object {
  var mask: Double
  var path: String
  var sheet: String
  var sheet_size: Double
}

object Anon_Mask {
  @scala.inline
  def apply(mask: Double, path: String, sheet: String, sheet_size: Double): Anon_Mask = {
    val __obj = js.Dynamic.literal(mask = mask, path = path, sheet = sheet, sheet_size = sheet_size)
  
    __obj.asInstanceOf[Anon_Mask]
  }
}

