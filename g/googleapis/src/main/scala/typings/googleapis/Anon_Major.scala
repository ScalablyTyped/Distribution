package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Major extends js.Object {
  var major: js.UndefOr[Double] = js.native
  var minor: js.UndefOr[Double] = js.native
}

object Anon_Major {
  @scala.inline
  def apply(major: Int | Double = null, minor: Int | Double = null): Anon_Major = {
    val __obj = js.Dynamic.literal()
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Major]
  }
}

