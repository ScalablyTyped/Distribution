package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.Buddy
import typings.envDashCi.envDashCiStrings.buddy
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
  var service: buddy
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
    service: buddy,
    slug: String,
    branch: String = null,
    pr: String = null,
    tag: String = null
  ): BuddyEnv = {
    val __obj = js.Dynamic.literal(build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, name = name, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[BuddyEnv]
  }
}

