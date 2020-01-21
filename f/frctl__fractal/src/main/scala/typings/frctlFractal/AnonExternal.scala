package typings.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExternal extends js.Object {
  var external: js.UndefOr[String] = js.undefined
  var local: js.UndefOr[String] = js.undefined
  var ui: js.UndefOr[String] = js.undefined
}

object AnonExternal {
  @scala.inline
  def apply(external: String = null, local: String = null, ui: String = null): AnonExternal = {
    val __obj = js.Dynamic.literal()
    if (external != null) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExternal]
  }
}

