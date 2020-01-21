package typings.gapiClientPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMajor extends js.Object {
  /** The major version number of PageSpeed used to generate these results. */
  var major: js.UndefOr[Double] = js.undefined
  /** The minor version number of PageSpeed used to generate these results. */
  var minor: js.UndefOr[Double] = js.undefined
}

object AnonMajor {
  @scala.inline
  def apply(major: Int | Double = null, minor: Int | Double = null): AnonMajor = {
    val __obj = js.Dynamic.literal()
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMajor]
  }
}

