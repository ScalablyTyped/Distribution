package typings.emberData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeId extends js.Object {
  var includeId: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeId {
  @scala.inline
  def apply(includeId: js.UndefOr[Boolean] = js.undefined): AnonIncludeId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeId)) __obj.updateDynamic("includeId")(includeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeId]
  }
}

