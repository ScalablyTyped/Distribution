package typings.githubUrlFromGit.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("github-url-from-git", "re")
@js.native
object re extends js.Object {
  /**
    * Create a regular expression to parse GitHub URLs
    *
    * @param opts options for regular expression generator
    */
  def apply(): RegExp = js.native
  def apply(opts: githubUrlFromGitOptions): RegExp = js.native
}

