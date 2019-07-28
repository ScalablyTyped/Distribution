package typings.atFrctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: String | Null
  var mode: String
  var name: String
  var scope: String | Null
}

object Anon_Color {
  @scala.inline
  def apply(mode: String, name: String, color: String = null, scope: String = null): Anon_Color = {
    val __obj = js.Dynamic.literal(mode = mode, name = name)
    if (color != null) __obj.updateDynamic("color")(color)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_Color]
  }
}

