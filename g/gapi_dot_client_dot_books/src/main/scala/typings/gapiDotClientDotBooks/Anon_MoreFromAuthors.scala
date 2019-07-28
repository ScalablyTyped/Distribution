package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MoreFromAuthors extends js.Object {
  var moreFromAuthors: js.UndefOr[Anon_Optedstate] = js.undefined
  var moreFromSeries: js.UndefOr[Anon_Optedstate] = js.undefined
  var rewardExpirations: js.UndefOr[Anon_Optedstate] = js.undefined
}

object Anon_MoreFromAuthors {
  @scala.inline
  def apply(
    moreFromAuthors: Anon_Optedstate = null,
    moreFromSeries: Anon_Optedstate = null,
    rewardExpirations: Anon_Optedstate = null
  ): Anon_MoreFromAuthors = {
    val __obj = js.Dynamic.literal()
    if (moreFromAuthors != null) __obj.updateDynamic("moreFromAuthors")(moreFromAuthors)
    if (moreFromSeries != null) __obj.updateDynamic("moreFromSeries")(moreFromSeries)
    if (rewardExpirations != null) __obj.updateDynamic("rewardExpirations")(rewardExpirations)
    __obj.asInstanceOf[Anon_MoreFromAuthors]
  }
}

