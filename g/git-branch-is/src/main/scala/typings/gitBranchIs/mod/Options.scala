package typings.gitBranchIs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for {@link gitBranchIs}.
  */
@js.native
trait Options extends js.Object {
  /**
    * Current working directory where the branch name is
    * tested
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Extra arguments to pass to git
    */
  var gitArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Path to the repository (i.e.
    * <code>--git-dir=</code> option to <code>git</code>).
    */
  var gitDir: js.UndefOr[String] = js.native
  /**
    * Git binary name or path to use (default:
    * <code>'git'</code>).
    */
  var gitPath: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setGitArgsVarargs(value: String*): Self = this.set("gitArgs", js.Array(value :_*))
    @scala.inline
    def setGitArgs(value: js.Array[String]): Self = this.set("gitArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitArgs: Self = this.set("gitArgs", js.undefined)
    @scala.inline
    def setGitDir(value: String): Self = this.set("gitDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitDir: Self = this.set("gitDir", js.undefined)
    @scala.inline
    def setGitPath(value: String): Self = this.set("gitPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitPath: Self = this.set("gitPath", js.undefined)
  }
  
}

