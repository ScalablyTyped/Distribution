package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.`GitLab CI/CD`
import typings.envDashCi.envDashCiStrings.gitlab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitLabEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var job: String
  var jobUrl: String
  var name: `GitLab CI/CD`
  var root: String
  var service: gitlab
  var slug: String
  var tag: js.UndefOr[String] = js.undefined
}

object GitLabEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    job: String,
    jobUrl: String,
    name: `GitLab CI/CD`,
    root: String,
    service: gitlab,
    slug: String,
    tag: String = null
  ): GitLabEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, job = job, jobUrl = jobUrl, name = name, root = root, service = service, slug = slug)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[GitLabEnv]
  }
}

