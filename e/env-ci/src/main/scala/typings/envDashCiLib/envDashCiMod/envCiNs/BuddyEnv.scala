package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuddyEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var name: envDashCiLib.envDashCiLibStrings.Buddy
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var service: envDashCiLib.envDashCiLibStrings.buddy
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object BuddyEnv {
  @scala.inline
  def apply(
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    isPr: scala.Boolean,
    name: envDashCiLib.envDashCiLibStrings.Buddy,
    service: envDashCiLib.envDashCiLibStrings.buddy,
    slug: java.lang.String,
    branch: java.lang.String = null,
    pr: java.lang.String = null,
    tag: java.lang.String = null
  ): BuddyEnv = {
    val __obj = js.Dynamic.literal(build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, name = name, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[BuddyEnv]
  }
}

