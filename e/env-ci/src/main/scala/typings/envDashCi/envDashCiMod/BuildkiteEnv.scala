package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.Buildkite
import typings.envDashCi.envDashCiStrings.buildkite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildkiteEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var isPr: Boolean
  var name: Buildkite
  var pr: js.UndefOr[String] = js.undefined
  var prBranch: js.UndefOr[String] = js.undefined
  var root: String
  var service: buildkite
  var slug: String
  var tag: js.UndefOr[String] = js.undefined
}

object BuildkiteEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Buildkite,
    root: String,
    service: buildkite,
    slug: String,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): BuildkiteEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, name = name, root = root, service = service, slug = slug)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[BuildkiteEnv]
  }
}

