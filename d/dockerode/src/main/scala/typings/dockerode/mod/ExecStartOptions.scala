package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecStartOptions extends js.Object {
  // Detach and Tty are used by Docker's API
  var Detach: js.UndefOr[Boolean] = js.native
  var Tty: js.UndefOr[Boolean] = js.native
  // hijack and stdin are used by docker-modem
  var hijack: js.UndefOr[Boolean] = js.native
  var stdin: js.UndefOr[Boolean] = js.native
}

object ExecStartOptions {
  @scala.inline
  def apply(): ExecStartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecStartOptions]
  }
  @scala.inline
  implicit class ExecStartOptionsOps[Self <: ExecStartOptions] (val x: Self) extends AnyVal {
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
    def setDetach(value: Boolean): Self = this.set("Detach", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetach: Self = this.set("Detach", js.undefined)
    @scala.inline
    def setTty(value: Boolean): Self = this.set("Tty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTty: Self = this.set("Tty", js.undefined)
    @scala.inline
    def setHijack(value: Boolean): Self = this.set("hijack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHijack: Self = this.set("hijack", js.undefined)
    @scala.inline
    def setStdin(value: Boolean): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
  }
  
}

