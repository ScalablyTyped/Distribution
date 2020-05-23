package typings.gapiClientBigquery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseLegacySql extends js.Object {
  /** True if view is defined in legacy SQL dialect, false if in standard SQL. */
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
}

object UseLegacySql {
  @scala.inline
  def apply(useLegacySql: js.UndefOr[Boolean] = js.undefined): UseLegacySql = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseLegacySql]
  }
}

