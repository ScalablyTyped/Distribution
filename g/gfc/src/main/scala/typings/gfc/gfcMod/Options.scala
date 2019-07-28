package typings.gfc.gfcMod

import typings.gfc.Anon_Contents
import typings.gfc.gfcNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TExecOptions] extends js.Object {
  var commit: js.UndefOr[Boolean] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var exec: js.UndefOr[TExecOptions] = js.undefined
  var file: js.UndefOr[Anon_Contents | `false`] = js.undefined
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
    file: Anon_Contents | `false` = null,
    forceFile: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    remote: String = null
  ): Options[TExecOptions] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFile)) __obj.updateDynamic("forceFile")(forceFile)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (remote != null) __obj.updateDynamic("remote")(remote)
    __obj.asInstanceOf[Options[TExecOptions]]
  }
}

