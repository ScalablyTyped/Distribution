package typings
package electronDashPackagerLib.electronDashPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsarOptions extends js.Object {
  var ordering: js.UndefOr[java.lang.String] = js.undefined
  var unpack: js.UndefOr[java.lang.String] = js.undefined
  var unpackDir: js.UndefOr[java.lang.String] = js.undefined
}

object AsarOptions {
  @scala.inline
  def apply(
    ordering: java.lang.String = null,
    unpack: java.lang.String = null,
    unpackDir: java.lang.String = null
  ): AsarOptions = {
    val __obj = js.Dynamic.literal()
    if (ordering != null) __obj.updateDynamic("ordering")(ordering)
    if (unpack != null) __obj.updateDynamic("unpack")(unpack)
    if (unpackDir != null) __obj.updateDynamic("unpackDir")(unpackDir)
    __obj.asInstanceOf[AsarOptions]
  }
}

