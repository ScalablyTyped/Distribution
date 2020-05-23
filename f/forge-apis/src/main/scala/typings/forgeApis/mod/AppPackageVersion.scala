package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppPackageVersion extends js.Object {
  var version: js.UndefOr[Double] = js.undefined
}

object AppPackageVersion {
  @scala.inline
  def apply(version: js.UndefOr[Double] = js.undefined): AppPackageVersion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPackageVersion]
  }
}

