package typings
package googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.VersionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var major: js.UndefOr[scala.Double] = js.undefined
  var minor: js.UndefOr[scala.Double] = js.undefined
  var patch: js.UndefOr[scala.Double] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    major: scala.Int | scala.Double = null,
    minor: scala.Int | scala.Double = null,
    patch: scala.Int | scala.Double = null,
    suffix: java.lang.String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[AsObject]
  }
}

