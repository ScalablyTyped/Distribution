package typings.findDashJavaDashHome.findDashJavaDashHomeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var allowJre: Boolean
  var registry: js.UndefOr[RegArch] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(allowJre: Boolean, registry: RegArch = null): IOptions = {
    val __obj = js.Dynamic.literal(allowJre = allowJre)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[IOptions]
  }
}

