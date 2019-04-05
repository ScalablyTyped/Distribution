package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchOptions extends js.Object {
  var enabled: scala.Boolean
  var version: js.UndefOr[java.lang.String]
}

object PatchOptions {
  @scala.inline
  def apply(enabled: scala.Boolean, version: java.lang.String = null): PatchOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PatchOptions]
  }
}

