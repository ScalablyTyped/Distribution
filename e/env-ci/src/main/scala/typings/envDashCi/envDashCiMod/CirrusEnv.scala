package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.`Cirrus CI`
import typings.envDashCi.envDashCiStrings.cirrus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirrusEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var isPr: Boolean
  var job: String
  var jobUrl: String
  var name: `Cirrus CI`
  var pr: js.UndefOr[String] = js.undefined
  var root: String
  var service: cirrus
  var slug: String
  var tag: js.UndefOr[String] = js.undefined
}

object CirrusEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    name: `Cirrus CI`,
    root: String,
    service: cirrus,
    slug: String,
    pr: String = null,
    tag: String = null
  ): CirrusEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, job = job, jobUrl = jobUrl, name = name, root = root, service = service, slug = slug)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[CirrusEnv]
  }
}

