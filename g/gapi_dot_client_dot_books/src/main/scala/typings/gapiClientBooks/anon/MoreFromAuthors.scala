package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoreFromAuthors extends js.Object {
  var moreFromAuthors: js.UndefOr[Optedstate] = js.undefined
  var moreFromSeries: js.UndefOr[Optedstate] = js.undefined
  var rewardExpirations: js.UndefOr[Optedstate] = js.undefined
}

object MoreFromAuthors {
  @scala.inline
  def apply(
    moreFromAuthors: Optedstate = null,
    moreFromSeries: Optedstate = null,
    rewardExpirations: Optedstate = null
  ): MoreFromAuthors = {
    val __obj = js.Dynamic.literal()
    if (moreFromAuthors != null) __obj.updateDynamic("moreFromAuthors")(moreFromAuthors.asInstanceOf[js.Any])
    if (moreFromSeries != null) __obj.updateDynamic("moreFromSeries")(moreFromSeries.asInstanceOf[js.Any])
    if (rewardExpirations != null) __obj.updateDynamic("rewardExpirations")(rewardExpirations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreFromAuthors]
  }
}

