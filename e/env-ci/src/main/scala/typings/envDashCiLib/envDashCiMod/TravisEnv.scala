package typings
package envDashCiLib.envDashCiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TravisEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var job: java.lang.String
  var jobUrl: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.`Travis CI`
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var prBranch: java.lang.String
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.travis
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object TravisEnv {
  @scala.inline
  def apply(
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    isPr: scala.Boolean,
    job: java.lang.String,
    jobUrl: java.lang.String,
    name: envDashCiLib.envDashCiLibStrings.`Travis CI`,
    prBranch: java.lang.String,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.travis,
    slug: java.lang.String,
    branch: java.lang.String = null,
    pr: java.lang.String = null,
    tag: java.lang.String = null
  ): TravisEnv = {
    val __obj = js.Dynamic.literal(build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, job = job, jobUrl = jobUrl, name = name, prBranch = prBranch, root = root, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[TravisEnv]
  }
}

