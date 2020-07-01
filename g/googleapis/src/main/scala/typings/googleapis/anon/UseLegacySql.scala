package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseLegacySql extends js.Object {
  var useLegacySql: js.UndefOr[Boolean] = js.native
}

object UseLegacySql {
  @scala.inline
  def apply(useLegacySql: js.UndefOr[Boolean] = js.undefined): UseLegacySql = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseLegacySql]
  }
}

