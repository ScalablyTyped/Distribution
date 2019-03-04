package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitLabEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var job: java.lang.String
  var jobUrl: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.`GitLab CI/CD`
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.gitlab
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object GitLabEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    job: java.lang.String,
    jobUrl: java.lang.String,
    name: envDashCiLib.envDashCiLibStrings.`GitLab CI/CD`,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.gitlab,
    slug: java.lang.String,
    tag: java.lang.String = null
  ): GitLabEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, job = job, jobUrl = jobUrl, name = name, root = root, service = service, slug = slug)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[GitLabEnv]
  }
}

