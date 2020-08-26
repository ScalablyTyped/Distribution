package typings.gfc.mod

import typings.gfc.anon.Contents
import typings.gfc.gfcBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[TExecOptions] extends js.Object {
  var commit: js.UndefOr[Boolean] = js.native
  var cwd: js.UndefOr[String] = js.native
  var exec: js.UndefOr[TExecOptions] = js.native
  var file: js.UndefOr[Contents | `false`] = js.native
  var forceFile: js.UndefOr[Boolean] = js.native
  var message: js.UndefOr[String] = js.native
  var push: js.UndefOr[Boolean] = js.native
  var remote: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply[TExecOptions](): Options[TExecOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TExecOptions]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], TExecOptions] (val x: Self with Options[TExecOptions]) extends AnyVal {
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
    def setCommit(value: Boolean): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setExec(value: TExecOptions): Self = this.set("exec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    @scala.inline
    def setFile(value: Contents | `false`): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setForceFile(value: Boolean): Self = this.set("forceFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceFile: Self = this.set("forceFile", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPush(value: Boolean): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
  }
  
}

