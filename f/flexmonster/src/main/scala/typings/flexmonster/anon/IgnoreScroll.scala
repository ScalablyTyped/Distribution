package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreScroll extends js.Object {
  var ignoreScroll: js.UndefOr[Boolean] = js.native
  var ignoreSorting: js.UndefOr[Boolean] = js.native
  var partial: js.UndefOr[Boolean] = js.native
}

object IgnoreScroll {
  @scala.inline
  def apply(): IgnoreScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreScroll]
  }
  @scala.inline
  implicit class IgnoreScrollOps[Self <: IgnoreScroll] (val x: Self) extends AnyVal {
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
    def setIgnoreScroll(value: Boolean): Self = this.set("ignoreScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreScroll: Self = this.set("ignoreScroll", js.undefined)
    @scala.inline
    def setIgnoreSorting(value: Boolean): Self = this.set("ignoreSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSorting: Self = this.set("ignoreSorting", js.undefined)
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
  }
  
}

