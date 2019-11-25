package typings.findDashVersions.findDashVersionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Also match non-semver versions like `1.88`. They're coerced into semver compliant versions.
  		@default false
  		*/
  val loose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(loose: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

