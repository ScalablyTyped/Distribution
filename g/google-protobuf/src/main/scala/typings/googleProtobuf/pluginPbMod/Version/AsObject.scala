package typings.googleProtobuf.pluginPbMod.Version

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var major: js.UndefOr[Double] = js.undefined
  var minor: js.UndefOr[Double] = js.undefined
  var patch: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    major: js.UndefOr[Double] = js.undefined,
    minor: js.UndefOr[Double] = js.undefined,
    patch: js.UndefOr[Double] = js.undefined,
    suffix: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(major)) __obj.updateDynamic("major")(major.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minor)) __obj.updateDynamic("minor")(minor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

