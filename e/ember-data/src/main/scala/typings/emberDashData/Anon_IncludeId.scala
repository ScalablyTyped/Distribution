package typings.emberDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeId extends js.Object {
  var includeId: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeId {
  @scala.inline
  def apply(includeId: js.UndefOr[Boolean] = js.undefined): Anon_IncludeId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeId)) __obj.updateDynamic("includeId")(includeId)
    __obj.asInstanceOf[Anon_IncludeId]
  }
}

