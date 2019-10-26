package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityVersion extends js.Object {
  var version: js.UndefOr[Double] = js.undefined
}

object ActivityVersion {
  @scala.inline
  def apply(version: Int | Double = null): ActivityVersion = {
    val __obj = js.Dynamic.literal()
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityVersion]
  }
}

