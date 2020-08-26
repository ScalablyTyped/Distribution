package typings.enquireJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If set to true, defers execution of the setup function until the first time the media query is matched
    */
  var deferSetup: js.UndefOr[Boolean] = js.native
  /**
    * If supplied, triggered when handler is unregistered. Place cleanup code here
    */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If supplied, triggered when a media query matches.
    */
  var `match`: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If supplied, triggered once, when the handler is registered.
    */
  var setup: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If supplied, triggered when the media query transitions from a matched state to an unmatched state.
    */
  var unmatch: js.UndefOr[js.Function0[Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setDeferSetup(value: Boolean): Self = this.set("deferSetup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferSetup: Self = this.set("deferSetup", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setMatch(value: () => Unit): Self = this.set("match", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setSetup(value: () => Unit): Self = this.set("setup", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    @scala.inline
    def setUnmatch(value: () => Unit): Self = this.set("unmatch", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUnmatch: Self = this.set("unmatch", js.undefined)
  }
  
}

