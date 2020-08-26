package typings.finch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandedCallback extends js.Object {
  var load: js.UndefOr[FinchCallback] = js.native
  var setup: js.UndefOr[FinchCallback] = js.native
  var teardown: js.UndefOr[FinchCallback] = js.native
  var unload: js.UndefOr[FinchCallback] = js.native
}

object ExpandedCallback {
  @scala.inline
  def apply(): ExpandedCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandedCallback]
  }
  @scala.inline
  implicit class ExpandedCallbackOps[Self <: ExpandedCallback] (val x: Self) extends AnyVal {
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
    def setLoad(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = this.set("load", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setSetup(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = this.set("setup", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    @scala.inline
    def setTeardown(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = this.set("teardown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
    @scala.inline
    def setUnload(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = this.set("unload", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUnload: Self = this.set("unload", js.undefined)
  }
  
}

