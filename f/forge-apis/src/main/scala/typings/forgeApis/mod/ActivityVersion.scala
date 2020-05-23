package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityVersion extends js.Object {
  var Version: js.UndefOr[Double] = js.undefined
}

object ActivityVersion {
  @scala.inline
  def apply(Version: js.UndefOr[Double] = js.undefined): ActivityVersion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityVersion]
  }
}

