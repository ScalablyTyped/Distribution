package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchOptions extends js.Object {
  var enabled: Boolean
  var version: js.UndefOr[String] = js.undefined
}

object PatchOptions {
  @scala.inline
  def apply(enabled: Boolean, version: String = null): PatchOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PatchOptions]
  }
}

