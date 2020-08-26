package typings.execa.mod

import typings.execa.execaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KillOptions extends js.Object {
  /**
  		Milliseconds to wait for the child process to terminate before sending `SIGKILL`.
  		Can be disabled with `false`.
  		@default 5000
  		*/
  var forceKillAfterTimeout: js.UndefOr[Double | `false`] = js.native
}

object KillOptions {
  @scala.inline
  def apply(): KillOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KillOptions]
  }
  @scala.inline
  implicit class KillOptionsOps[Self <: KillOptions] (val x: Self) extends AnyVal {
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
    def setForceKillAfterTimeout(value: Double | `false`): Self = this.set("forceKillAfterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceKillAfterTimeout: Self = this.set("forceKillAfterTimeout", js.undefined)
  }
  
}

