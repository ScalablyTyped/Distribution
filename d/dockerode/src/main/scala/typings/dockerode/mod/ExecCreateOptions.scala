package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecCreateOptions extends js.Object {
  var AttachStderr: js.UndefOr[Boolean] = js.native
  var AttachStdin: js.UndefOr[Boolean] = js.native
  var AttachStdout: js.UndefOr[Boolean] = js.native
  var Cmd: js.UndefOr[js.Array[String]] = js.native
  var DetachKeys: js.UndefOr[String] = js.native
  var Env: js.UndefOr[js.Array[String]] = js.native
  var Privileged: js.UndefOr[Boolean] = js.native
  var Tty: js.UndefOr[Boolean] = js.native
  var User: js.UndefOr[String] = js.native
  var WorkingDir: js.UndefOr[String] = js.native
}

object ExecCreateOptions {
  @scala.inline
  def apply(): ExecCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecCreateOptions]
  }
  @scala.inline
  implicit class ExecCreateOptionsOps[Self <: ExecCreateOptions] (val x: Self) extends AnyVal {
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
    def setAttachStderr(value: Boolean): Self = this.set("AttachStderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachStderr: Self = this.set("AttachStderr", js.undefined)
    @scala.inline
    def setAttachStdin(value: Boolean): Self = this.set("AttachStdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachStdin: Self = this.set("AttachStdin", js.undefined)
    @scala.inline
    def setAttachStdout(value: Boolean): Self = this.set("AttachStdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachStdout: Self = this.set("AttachStdout", js.undefined)
    @scala.inline
    def setCmdVarargs(value: String*): Self = this.set("Cmd", js.Array(value :_*))
    @scala.inline
    def setCmd(value: js.Array[String]): Self = this.set("Cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmd: Self = this.set("Cmd", js.undefined)
    @scala.inline
    def setDetachKeys(value: String): Self = this.set("DetachKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetachKeys: Self = this.set("DetachKeys", js.undefined)
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("Env", js.Array(value :_*))
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("Env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("Env", js.undefined)
    @scala.inline
    def setPrivileged(value: Boolean): Self = this.set("Privileged", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivileged: Self = this.set("Privileged", js.undefined)
    @scala.inline
    def setTty(value: Boolean): Self = this.set("Tty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTty: Self = this.set("Tty", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
    @scala.inline
    def setWorkingDir(value: String): Self = this.set("WorkingDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingDir: Self = this.set("WorkingDir", js.undefined)
  }
  
}

