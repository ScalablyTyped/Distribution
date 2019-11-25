package typings.electronDashPackager.electronDashPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsarOptions extends js.Object {
  var ordering: js.UndefOr[String] = js.undefined
  var unpack: js.UndefOr[String] = js.undefined
  var unpackDir: js.UndefOr[String] = js.undefined
}

object AsarOptions {
  @scala.inline
  def apply(ordering: String = null, unpack: String = null, unpackDir: String = null): AsarOptions = {
    val __obj = js.Dynamic.literal()
    if (ordering != null) __obj.updateDynamic("ordering")(ordering.asInstanceOf[js.Any])
    if (unpack != null) __obj.updateDynamic("unpack")(unpack.asInstanceOf[js.Any])
    if (unpackDir != null) __obj.updateDynamic("unpackDir")(unpackDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsarOptions]
  }
}

