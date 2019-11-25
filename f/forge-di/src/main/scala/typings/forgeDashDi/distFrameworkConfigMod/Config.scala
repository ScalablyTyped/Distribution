package typings.forgeDashDi.distFrameworkConfigMod

import typings.forgeDashDi.distInspectorsInspectorMod.Inspector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var inspector: js.UndefOr[Inspector] = js.undefined
}

object Config {
  @scala.inline
  def apply(inspector: Inspector = null): Config = {
    val __obj = js.Dynamic.literal()
    if (inspector != null) __obj.updateDynamic("inspector")(inspector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

