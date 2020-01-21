package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMatchMyInterests extends js.Object {
  var matchMyInterests: js.UndefOr[AnonOptedstate] = js.native
  var moreFromAuthors: js.UndefOr[AnonOptedstate] = js.native
  var moreFromSeries: js.UndefOr[AnonOptedstate] = js.native
  var priceDrop: js.UndefOr[AnonOptedstate] = js.native
  var rewardExpirations: js.UndefOr[AnonOptedstate] = js.native
}

object AnonMatchMyInterests {
  @scala.inline
  def apply(
    matchMyInterests: AnonOptedstate = null,
    moreFromAuthors: AnonOptedstate = null,
    moreFromSeries: AnonOptedstate = null,
    priceDrop: AnonOptedstate = null,
    rewardExpirations: AnonOptedstate = null
  ): AnonMatchMyInterests = {
    val __obj = js.Dynamic.literal()
    if (matchMyInterests != null) __obj.updateDynamic("matchMyInterests")(matchMyInterests.asInstanceOf[js.Any])
    if (moreFromAuthors != null) __obj.updateDynamic("moreFromAuthors")(moreFromAuthors.asInstanceOf[js.Any])
    if (moreFromSeries != null) __obj.updateDynamic("moreFromSeries")(moreFromSeries.asInstanceOf[js.Any])
    if (priceDrop != null) __obj.updateDynamic("priceDrop")(priceDrop.asInstanceOf[js.Any])
    if (rewardExpirations != null) __obj.updateDynamic("rewardExpirations")(rewardExpirations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatchMyInterests]
  }
}

