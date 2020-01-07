package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MatchMyInterests extends js.Object {
  var matchMyInterests: js.UndefOr[Anon_Optedstate] = js.native
  var moreFromAuthors: js.UndefOr[Anon_Optedstate] = js.native
  var moreFromSeries: js.UndefOr[Anon_Optedstate] = js.native
  var priceDrop: js.UndefOr[Anon_Optedstate] = js.native
  var rewardExpirations: js.UndefOr[Anon_Optedstate] = js.native
}

object Anon_MatchMyInterests {
  @scala.inline
  def apply(
    matchMyInterests: Anon_Optedstate = null,
    moreFromAuthors: Anon_Optedstate = null,
    moreFromSeries: Anon_Optedstate = null,
    priceDrop: Anon_Optedstate = null,
    rewardExpirations: Anon_Optedstate = null
  ): Anon_MatchMyInterests = {
    val __obj = js.Dynamic.literal()
    if (matchMyInterests != null) __obj.updateDynamic("matchMyInterests")(matchMyInterests.asInstanceOf[js.Any])
    if (moreFromAuthors != null) __obj.updateDynamic("moreFromAuthors")(moreFromAuthors.asInstanceOf[js.Any])
    if (moreFromSeries != null) __obj.updateDynamic("moreFromSeries")(moreFromSeries.asInstanceOf[js.Any])
    if (priceDrop != null) __obj.updateDynamic("priceDrop")(priceDrop.asInstanceOf[js.Any])
    if (rewardExpirations != null) __obj.updateDynamic("rewardExpirations")(rewardExpirations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MatchMyInterests]
  }
}

