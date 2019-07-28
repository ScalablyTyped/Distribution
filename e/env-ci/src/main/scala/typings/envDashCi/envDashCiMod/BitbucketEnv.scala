package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.`Bitbucket Pipelines`
import typings.envDashCi.envDashCiStrings.bitbucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitbucketEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var name: `Bitbucket Pipelines`
  var root: String
  var service: bitbucket
  var slug: String
  var tag: js.UndefOr[String] = js.undefined
}

object BitbucketEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: `Bitbucket Pipelines`,
    root: String,
    service: bitbucket,
    slug: String,
    tag: String = null
  ): BitbucketEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, name = name, root = root, service = service, slug = slug)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[BitbucketEnv]
  }
}

