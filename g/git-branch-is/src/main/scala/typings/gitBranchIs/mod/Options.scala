package typings.gitBranchIs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for {@link gitBranchIs}.
  */
trait Options extends js.Object {
  /**
    * Current working directory where the branch name is
    * tested
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Extra arguments to pass to git
    */
  var gitArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Path to the repository (i.e.
    * <code>--git-dir=</code> option to <code>git</code>).
    */
  var gitDir: js.UndefOr[String] = js.undefined
  /**
    * Git binary name or path to use (default:
    * <code>'git'</code>).
    */
  var gitPath: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: String = null,
    gitArgs: js.Array[String] = null,
    gitDir: String = null,
    gitPath: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (gitArgs != null) __obj.updateDynamic("gitArgs")(gitArgs.asInstanceOf[js.Any])
    if (gitDir != null) __obj.updateDynamic("gitDir")(gitDir.asInstanceOf[js.Any])
    if (gitPath != null) __obj.updateDynamic("gitPath")(gitPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

