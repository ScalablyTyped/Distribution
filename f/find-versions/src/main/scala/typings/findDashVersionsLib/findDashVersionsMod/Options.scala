package typings
package findDashVersionsLib.findDashVersionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Also match non-semver versions like `1.88`. They're coerced into semver compliant versions.
  		@default false
  		*/
  val loose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(loose: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose)
    __obj.asInstanceOf[Options]
  }
}

