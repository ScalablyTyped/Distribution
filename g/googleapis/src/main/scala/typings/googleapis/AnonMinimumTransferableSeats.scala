package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMinimumTransferableSeats extends js.Object {
  var minimumTransferableSeats: js.UndefOr[Double] = js.native
  var transferabilityExpirationTime: js.UndefOr[String] = js.native
}

object AnonMinimumTransferableSeats {
  @scala.inline
  def apply(minimumTransferableSeats: Int | Double = null, transferabilityExpirationTime: String = null): AnonMinimumTransferableSeats = {
    val __obj = js.Dynamic.literal()
    if (minimumTransferableSeats != null) __obj.updateDynamic("minimumTransferableSeats")(minimumTransferableSeats.asInstanceOf[js.Any])
    if (transferabilityExpirationTime != null) __obj.updateDynamic("transferabilityExpirationTime")(transferabilityExpirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinimumTransferableSeats]
  }
}

