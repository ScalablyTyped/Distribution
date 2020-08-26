package typings.expressWs.mod

import typings.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var leaveRouterUntouched: js.UndefOr[Boolean] = js.native
  var wsOptions: js.UndefOr[ServerOptions] = js.native
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
    def setLeaveRouterUntouched(value: Boolean): Self = this.set("leaveRouterUntouched", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaveRouterUntouched: Self = this.set("leaveRouterUntouched", js.undefined)
    @scala.inline
    def setWsOptions(value: ServerOptions): Self = this.set("wsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWsOptions: Self = this.set("wsOptions", js.undefined)
  }
  
}

