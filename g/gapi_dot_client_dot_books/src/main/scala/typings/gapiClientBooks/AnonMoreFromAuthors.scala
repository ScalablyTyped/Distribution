package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMoreFromAuthors extends js.Object {
  var moreFromAuthors: js.UndefOr[AnonOptedstate] = js.undefined
  var moreFromSeries: js.UndefOr[AnonOptedstate] = js.undefined
  var rewardExpirations: js.UndefOr[AnonOptedstate] = js.undefined
}

object AnonMoreFromAuthors {
  @scala.inline
  def apply(
    moreFromAuthors: AnonOptedstate = null,
    moreFromSeries: AnonOptedstate = null,
    rewardExpirations: AnonOptedstate = null
  ): AnonMoreFromAuthors = {
    val __obj = js.Dynamic.literal()
    if (moreFromAuthors != null) __obj.updateDynamic("moreFromAuthors")(moreFromAuthors.asInstanceOf[js.Any])
    if (moreFromSeries != null) __obj.updateDynamic("moreFromSeries")(moreFromSeries.asInstanceOf[js.Any])
    if (rewardExpirations != null) __obj.updateDynamic("rewardExpirations")(rewardExpirations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMoreFromAuthors]
  }
}

