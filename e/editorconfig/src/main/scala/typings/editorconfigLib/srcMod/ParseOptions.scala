package typings
package editorconfigLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var config: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(config: java.lang.String = null, root: java.lang.String = null, version: java.lang.String = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (root != null) __obj.updateDynamic("root")(root)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ParseOptions]
  }
}

