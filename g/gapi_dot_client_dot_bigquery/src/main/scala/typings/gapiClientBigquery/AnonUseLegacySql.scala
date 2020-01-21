package typings.gapiClientBigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUseLegacySql extends js.Object {
  /** True if view is defined in legacy SQL dialect, false if in standard SQL. */
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
}

object AnonUseLegacySql {
  @scala.inline
  def apply(useLegacySql: js.UndefOr[Boolean] = js.undefined): AnonUseLegacySql = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUseLegacySql]
  }
}

