package typings.emailAddresses.emailAddresses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var input: String = js.native
  var oneResult: js.UndefOr[Boolean] = js.native
  var partial: js.UndefOr[Boolean] = js.native
  var rejectTLD: js.UndefOr[Boolean] = js.native
  var rfc6532: js.UndefOr[Boolean] = js.native
  var simple: js.UndefOr[Boolean] = js.native
  var startAt: js.UndefOr[String] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(input: String): Options = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneResult(value: Boolean): Self = this.set("oneResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneResult: Self = this.set("oneResult", js.undefined)
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
    @scala.inline
    def setRejectTLD(value: Boolean): Self = this.set("rejectTLD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectTLD: Self = this.set("rejectTLD", js.undefined)
    @scala.inline
    def setRfc6532(value: Boolean): Self = this.set("rfc6532", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRfc6532: Self = this.set("rfc6532", js.undefined)
    @scala.inline
    def setSimple(value: Boolean): Self = this.set("simple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimple: Self = this.set("simple", js.undefined)
    @scala.inline
    def setStartAt(value: String): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

