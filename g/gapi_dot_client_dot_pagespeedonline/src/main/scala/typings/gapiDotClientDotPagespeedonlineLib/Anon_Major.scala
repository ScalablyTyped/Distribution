package typings
package gapiDotClientDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  /** The major version number of PageSpeed used to generate these results. */
  var major: js.UndefOr[scala.Double] = js.undefined
  /** The minor version number of PageSpeed used to generate these results. */
  var minor: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Major {
  @scala.inline
  def apply(major: scala.Int | scala.Double = null, minor: scala.Int | scala.Double = null): Anon_Major = {
    val __obj = js.Dynamic.literal()
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Major]
  }
}

