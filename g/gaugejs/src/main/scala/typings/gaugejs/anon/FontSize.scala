package typings.gaugejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontSize extends js.Object {
  var fontSize: String
}

object FontSize {
  @scala.inline
  def apply(fontSize: String): FontSize = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSize]
  }
}

