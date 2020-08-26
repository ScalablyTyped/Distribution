package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cwd extends js.Object {
  var customFds: js.UndefOr[js.Any] = js.native
  var cwd: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var env: js.UndefOr[js.Any] = js.native
  var killSignal: js.UndefOr[String] = js.native
  var maxBuffer: js.UndefOr[String] = js.native
  var stdio: js.UndefOr[js.Any] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object Cwd {
  @scala.inline
  def apply(): Cwd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cwd]
  }
  @scala.inline
  implicit class CwdOps[Self <: Cwd] (val x: Self) extends AnyVal {
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
    def setCustomFds(value: js.Any): Self = this.set("customFds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFds: Self = this.set("customFds", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setKillSignal(value: String): Self = this.set("killSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKillSignal: Self = this.set("killSignal", js.undefined)
    @scala.inline
    def setMaxBuffer(value: String): Self = this.set("maxBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBuffer: Self = this.set("maxBuffer", js.undefined)
    @scala.inline
    def setStdio(value: js.Any): Self = this.set("stdio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

