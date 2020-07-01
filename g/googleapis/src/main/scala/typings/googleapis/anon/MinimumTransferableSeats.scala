package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumTransferableSeats extends js.Object {
  var minimumTransferableSeats: js.UndefOr[Double] = js.native
  var transferabilityExpirationTime: js.UndefOr[String] = js.native
}

object MinimumTransferableSeats {
  @scala.inline
  def apply(
    minimumTransferableSeats: js.UndefOr[Double] = js.undefined,
    transferabilityExpirationTime: String = null
  ): MinimumTransferableSeats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minimumTransferableSeats)) __obj.updateDynamic("minimumTransferableSeats")(minimumTransferableSeats.get.asInstanceOf[js.Any])
    if (transferabilityExpirationTime != null) __obj.updateDynamic("transferabilityExpirationTime")(transferabilityExpirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumTransferableSeats]
  }
}

