package typings.emberData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeId extends js.Object {
  var includeId: js.UndefOr[Boolean] = js.undefined
}

object IncludeId {
  @scala.inline
  def apply(includeId: js.UndefOr[Boolean] = js.undefined): IncludeId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeId)) __obj.updateDynamic("includeId")(includeId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeId]
  }
}

