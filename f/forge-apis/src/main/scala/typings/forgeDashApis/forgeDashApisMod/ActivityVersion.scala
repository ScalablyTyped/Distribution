package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityVersion extends js.Object {
  var Version: js.UndefOr[Double] = js.undefined
}

object ActivityVersion {
  @scala.inline
  def apply(Version: Int | Double = null): ActivityVersion = {
    val __obj = js.Dynamic.literal()
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityVersion]
  }
}

