package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiBooleans.`true`
import typings.envDashCi.envDashCiStrings.Codefresh
import typings.envDashCi.envDashCiStrings.codefresh_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodefreshEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var isPr: Boolean
  var name: Codefresh
  var pr: js.UndefOr[String] = js.undefined
  var prBranch: js.UndefOr[String] = js.undefined
  var root: String
  var service: codefresh_
  var slug: String
}

object CodefreshEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Codefresh,
    root: String,
    service: codefresh_,
    slug: String,
    pr: String = null,
    prBranch: String = null
  ): CodefreshEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodefreshEnv]
  }
}

