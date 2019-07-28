package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.VersionNs

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
    major: Int | Double = null,
    minor: Int | Double = null,
    patch: Int | Double = null,
    suffix: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[AsObject]
  }
}

