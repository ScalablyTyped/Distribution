package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchMyInterests extends js.Object {
  var matchMyInterests: js.UndefOr[Optedstate] = js.native
  var moreFromAuthors: js.UndefOr[Optedstate] = js.native
  var moreFromSeries: js.UndefOr[Optedstate] = js.native
  var priceDrop: js.UndefOr[Optedstate] = js.native
  var rewardExpirations: js.UndefOr[Optedstate] = js.native
}

object MatchMyInterests {
  @scala.inline
  def apply(
    matchMyInterests: Optedstate = null,
    moreFromAuthors: Optedstate = null,
    moreFromSeries: Optedstate = null,
    priceDrop: Optedstate = null,
    rewardExpirations: Optedstate = null
  ): MatchMyInterests = {
    val __obj = js.Dynamic.literal()
    if (matchMyInterests != null) __obj.updateDynamic("matchMyInterests")(matchMyInterests.asInstanceOf[js.Any])
    if (moreFromAuthors != null) __obj.updateDynamic("moreFromAuthors")(moreFromAuthors.asInstanceOf[js.Any])
    if (moreFromSeries != null) __obj.updateDynamic("moreFromSeries")(moreFromSeries.asInstanceOf[js.Any])
    if (priceDrop != null) __obj.updateDynamic("priceDrop")(priceDrop.asInstanceOf[js.Any])
    if (rewardExpirations != null) __obj.updateDynamic("rewardExpirations")(rewardExpirations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchMyInterests]
  }
}

