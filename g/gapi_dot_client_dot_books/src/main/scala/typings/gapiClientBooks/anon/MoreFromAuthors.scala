package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoreFromAuthors extends js.Object {
  var moreFromAuthors: js.UndefOr[Optedstate] = js.native
  var moreFromSeries: js.UndefOr[Optedstate] = js.native
  var rewardExpirations: js.UndefOr[Optedstate] = js.native
}

object MoreFromAuthors {
  @scala.inline
  def apply(): MoreFromAuthors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoreFromAuthors]
  }
  @scala.inline
  implicit class MoreFromAuthorsOps[Self <: MoreFromAuthors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMoreFromAuthors(value: Optedstate): Self = this.set("moreFromAuthors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoreFromAuthors: Self = this.set("moreFromAuthors", js.undefined)
    @scala.inline
    def setMoreFromSeries(value: Optedstate): Self = this.set("moreFromSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoreFromSeries: Self = this.set("moreFromSeries", js.undefined)
    @scala.inline
    def setRewardExpirations(value: Optedstate): Self = this.set("rewardExpirations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewardExpirations: Self = this.set("rewardExpirations", js.undefined)
  }
  
}

