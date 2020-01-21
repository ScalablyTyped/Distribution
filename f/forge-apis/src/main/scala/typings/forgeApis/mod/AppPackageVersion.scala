package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppPackageVersion extends js.Object {
  var version: js.UndefOr[Double] = js.undefined
}

object AppPackageVersion {
  @scala.inline
  def apply(version: Int | Double = null): AppPackageVersion = {
    val __obj = js.Dynamic.literal()
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPackageVersion]
  }
}

