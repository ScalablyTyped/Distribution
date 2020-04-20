package typings.githubUrlToObject.mod

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
    val __obj = js.Dynamic.literal(api_url = api_url.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], clone_url = clone_url.asInstanceOf[js.Any], https_url = https_url.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], travis_url = travis_url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], zip_url = zip_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

