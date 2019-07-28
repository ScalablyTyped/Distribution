package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.Bitrise
import typings.envDashCi.envDashCiStrings.bitrise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitriseEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var isPr: Boolean
  var name: Bitrise
  var pr: js.UndefOr[String] = js.undefined
  var prBranch: js.UndefOr[String] = js.undefined
  var service: bitrise
  var slug: String
  var tag: js.UndefOr[String] = js.undefined
}

object BitriseEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Bitrise,
    service: bitrise,
    slug: String,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): BitriseEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, name = name, service = service, slug = slug)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[BitriseEnv]
  }
}

