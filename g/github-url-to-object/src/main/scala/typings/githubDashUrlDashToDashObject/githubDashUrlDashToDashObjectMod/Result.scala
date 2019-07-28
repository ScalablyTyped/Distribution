package typings.githubDashUrlDashToDashObject.githubDashUrlDashToDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var api_url: String
  var branch: String
  var clone_url: String
  var https_url: String
  var repo: String
  var tarball_url: String
  var travis_url: String
  var user: String
  var zip_url: String
}

object Result {
  @scala.inline
  def apply(
    api_url: String,
    branch: String,
    clone_url: String,
    https_url: String,
    repo: String,
    tarball_url: String,
    travis_url: String,
    user: String,
    zip_url: String
  ): Result = {
    val __obj = js.Dynamic.literal(api_url = api_url, branch = branch, clone_url = clone_url, https_url = https_url, repo = repo, tarball_url = tarball_url, travis_url = travis_url, user = user, zip_url = zip_url)
  
    __obj.asInstanceOf[Result]
  }
}

