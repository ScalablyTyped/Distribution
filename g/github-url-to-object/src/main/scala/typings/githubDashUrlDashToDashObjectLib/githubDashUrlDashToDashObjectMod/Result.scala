package typings
package githubDashUrlDashToDashObjectLib.githubDashUrlDashToDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var api_url: java.lang.String
  var branch: java.lang.String
  var clone_url: java.lang.String
  var https_url: java.lang.String
  var repo: java.lang.String
  var tarball_url: java.lang.String
  var travis_url: java.lang.String
  var user: java.lang.String
  var zip_url: java.lang.String
}

object Result {
  @scala.inline
  def apply(
    api_url: java.lang.String,
    branch: java.lang.String,
    clone_url: java.lang.String,
    https_url: java.lang.String,
    repo: java.lang.String,
    tarball_url: java.lang.String,
    travis_url: java.lang.String,
    user: java.lang.String,
    zip_url: java.lang.String
  ): Result = {
    val __obj = js.Dynamic.literal(api_url = api_url, branch = branch, clone_url = clone_url, https_url = https_url, repo = repo, tarball_url = tarball_url, travis_url = travis_url, user = user, zip_url = zip_url)
  
    __obj.asInstanceOf[Result]
  }
}

