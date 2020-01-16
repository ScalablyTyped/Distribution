package typings.gitDashRawDashCommits.gitDashRawDashCommitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to `git` `childProcess`.
  */
trait ExecOptions extends js.Object {
  /**
    * Current working directory to execute git in.
    */
  var cwd: js.UndefOr[String] = js.undefined
}

object ExecOptions {
  @scala.inline
  def apply(cwd: String = null): ExecOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOptions]
  }
}

