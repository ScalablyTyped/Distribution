package typings.gfc.mod

import typings.gfc.AnonContents
import typings.gfc.gfcBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TExecOptions] extends js.Object {
  var commit: js.UndefOr[Boolean] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var exec: js.UndefOr[TExecOptions] = js.undefined
  var file: js.UndefOr[AnonContents | `false`] = js.undefined
  var forceFile: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var push: js.UndefOr[Boolean] = js.undefined
  var remote: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply[TExecOptions](
    commit: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    exec: TExecOptions = null,
    file: AnonContents | `false` = null,
    forceFile: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    remote: String = null
  ): Options[TExecOptions] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFile)) __obj.updateDynamic("forceFile")(forceFile.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TExecOptions]]
  }
}

