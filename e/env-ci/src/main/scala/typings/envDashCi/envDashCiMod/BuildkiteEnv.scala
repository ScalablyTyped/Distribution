package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiBooleans.`true`
import typings.envDashCi.envDashCiStrings.Buildkite
import typings.envDashCi.envDashCiStrings.buildkite_
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
  var service: buildkite_
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
    service: buildkite_,
    slug: String,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): BuildkiteEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildkiteEnv]
  }
}

