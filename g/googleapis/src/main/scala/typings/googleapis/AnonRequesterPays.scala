package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequesterPays extends js.Object {
  var requesterPays: js.UndefOr[Boolean] = js.native
}

object AnonRequesterPays {
  @scala.inline
  def apply(requesterPays: js.UndefOr[Boolean] = js.undefined): AnonRequesterPays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requesterPays)) __obj.updateDynamic("requesterPays")(requesterPays.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequesterPays]
  }
}

