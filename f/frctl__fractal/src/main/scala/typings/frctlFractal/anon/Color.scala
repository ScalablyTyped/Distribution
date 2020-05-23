package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String | Null
  var mode: String
  var name: String
  var scope: String | Null
}

object Color {
  @scala.inline
  def apply(mode: String, name: String, color: String = null, scope: String = null): Color = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

