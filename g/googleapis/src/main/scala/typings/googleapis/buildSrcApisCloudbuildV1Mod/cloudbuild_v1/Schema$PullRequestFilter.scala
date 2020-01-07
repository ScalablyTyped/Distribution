package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PullRequestFilter contains filter properties for matching GitHub Pull
  * Requests.
  */
@js.native
trait Schema$PullRequestFilter extends js.Object {
  /**
    * Regex of branches to match.  The syntax of the regular expressions
    * accepted is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String] = js.native
  /**
    * Whether to block builds on a &quot;/gcbrun&quot; comment from a
    * repository owner or collaborator.
    */
  var commentControl: js.UndefOr[String] = js.native
}

object Schema$PullRequestFilter {
  @scala.inline
  def apply(branch: String = null, commentControl: String = null): Schema$PullRequestFilter = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (commentControl != null) __obj.updateDynamic("commentControl")(commentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PullRequestFilter]
  }
}

