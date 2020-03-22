package typings.forgeDi

import typings.forgeDi.modeMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<forge-di.forge-di/dist/framework/Dependency.default> */
trait Partialdefault extends js.Object {
  var hint: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Partialdefault {
  @scala.inline
  def apply(hint: String = null, mode: Mode = null, name: String = null): Partialdefault = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialdefault]
  }
}

