package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_UseLegacySql extends js.Object {
  var useLegacySql: js.UndefOr[Boolean] = js.native
}

object Anon_UseLegacySql {
  @scala.inline
  def apply(useLegacySql: js.UndefOr[Boolean] = js.undefined): Anon_UseLegacySql = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_UseLegacySql]
  }
}

