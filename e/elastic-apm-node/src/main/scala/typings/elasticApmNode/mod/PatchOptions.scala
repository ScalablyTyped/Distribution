package typings.elasticApmNode.mod

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
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchOptions]
  }
}

