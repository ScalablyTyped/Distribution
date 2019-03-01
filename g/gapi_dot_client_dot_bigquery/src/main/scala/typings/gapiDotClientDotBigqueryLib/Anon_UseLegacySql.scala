package typings
package gapiDotClientDotBigqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UseLegacySql extends js.Object {
  /** True if view is defined in legacy SQL dialect, false if in standard SQL. */
  var useLegacySql: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_UseLegacySql {
  @scala.inline
  def apply(useLegacySql: js.UndefOr[scala.Boolean] = js.undefined): Anon_UseLegacySql = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql)
    __obj.asInstanceOf[Anon_UseLegacySql]
  }
}

