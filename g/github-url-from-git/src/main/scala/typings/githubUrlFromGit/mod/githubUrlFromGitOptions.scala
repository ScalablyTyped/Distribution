package typings.githubUrlFromGit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait githubUrlFromGitOptions extends js.Object {
  /**
    * additional URLs that should be treated as GitHub repos
    */
  var extraBaseUrls: js.UndefOr[js.Array[String]] = js.undefined
}

object githubUrlFromGitOptions {
  @scala.inline
  def apply(extraBaseUrls: js.Array[String] = null): githubUrlFromGitOptions = {
    val __obj = js.Dynamic.literal()
    if (extraBaseUrls != null) __obj.updateDynamic("extraBaseUrls")(extraBaseUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[githubUrlFromGitOptions]
  }
}

