package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequesterPays extends js.Object {
  /** When set to true, bucket is requester pays. */
  var requesterPays: js.UndefOr[Boolean] = js.undefined
}

object AnonRequesterPays {
  @scala.inline
  def apply(requesterPays: js.UndefOr[Boolean] = js.undefined): AnonRequesterPays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requesterPays)) __obj.updateDynamic("requesterPays")(requesterPays.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequesterPays]
  }
}

