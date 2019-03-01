package typings
package gfcLib.gfcMod.gitFirstCommitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TExecOptions] extends js.Object {
  var commit: js.UndefOr[scala.Boolean] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var exec: js.UndefOr[TExecOptions] = js.undefined
  var file: js.UndefOr[gfcLib.Anon_Contents | gfcLib.gfcLibNumbers.`false`] = js.undefined
  var forceFile: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var push: js.UndefOr[scala.Boolean] = js.undefined
  var remote: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply[TExecOptions](
    commit: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    exec: TExecOptions = null,
    file: gfcLib.Anon_Contents | gfcLib.gfcLibNumbers.`false` = null,
    forceFile: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    push: js.UndefOr[scala.Boolean] = js.undefined,
    remote: java.lang.String = null
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

