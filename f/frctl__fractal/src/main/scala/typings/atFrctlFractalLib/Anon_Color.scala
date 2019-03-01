package typings
package atFrctlFractalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: java.lang.String | scala.Null
  var mode: java.lang.String
  var name: java.lang.String
  var scope: java.lang.String | scala.Null
}

object Anon_Color {
  @scala.inline
  def apply(
    mode: java.lang.String,
    name: java.lang.String,
    color: java.lang.String = null,
    scope: java.lang.String = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("name")(name)
    if (color != null) __obj.updateDynamic("color")(color)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_Color]
  }
}

