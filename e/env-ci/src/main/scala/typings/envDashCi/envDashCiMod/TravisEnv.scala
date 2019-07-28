package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.`Travis CI`
import typings.envDashCi.envDashCiStrings.travis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TravisEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[String] = js.undefined
  var build: String
  var buildUrl: String
  var commit: String
  var isPr: Boolean
  var job: String
  var jobUrl: String
  var name: `Travis CI`
  var pr: js.UndefOr[String] = js.undefined
  var prBranch: String
  var root: String
  var service: travis
  var slug: String
  var tag: js.UndefOr[String] = js.undefined
}

object TravisEnv {
  @scala.inline
  def apply(
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    name: `Travis CI`,
    prBranch: String,
    root: String,
    service: travis,
    slug: String,
    branch: String = null,
    pr: String = null,
    tag: String = null
  ): TravisEnv = {
    val __obj = js.Dynamic.literal(build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, job = job, jobUrl = jobUrl, name = name, prBranch = prBranch, root = root, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[TravisEnv]
  }
}

