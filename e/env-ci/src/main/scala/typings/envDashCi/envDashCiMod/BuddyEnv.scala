package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiBooleans.`true`
import typings.envDashCi.envDashCiStrings.Buddy
import typings.envDashCi.envDashCiStrings.buddy_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuddyEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[String] = js.undefined
  var build: String
  var buildUrl: String
  var commit: String
  var isPr: Boolean
  var name: Buddy
  var pr: js.UndefOr[String] = js.undefined
  var service: buddy_
  var slug: String
  var tag: js.UndefOr[String] = js.undefined
}

object BuddyEnv {
  @scala.inline
  def apply(
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Buddy,
    service: buddy_,
    slug: String,
    branch: String = null,
    pr: String = null,
    tag: String = null
  ): BuddyEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuddyEnv]
  }
}

