package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.CircleCI
import typings.envDashCi.envDashCiStrings.circleci
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleCiEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[String] = js.undefined
  var build: String
  var buildUrl: String
  var commit: String
  var isPr: Boolean
  var job: String
  var name: CircleCI
  var pr: js.UndefOr[String] = js.undefined
  var prBranch: js.UndefOr[String] = js.undefined
  var service: circleci
  var slug: String
  var tag: js.UndefOr[String] = js.undefined
}

object CircleCiEnv {
  @scala.inline
  def apply(
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    name: CircleCI,
    service: circleci,
    slug: String,
    branch: String = null,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): CircleCiEnv = {
    val __obj = js.Dynamic.literal(build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, job = job, name = name, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[CircleCiEnv]
  }
}

