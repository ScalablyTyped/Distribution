package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.`Sail CI`
import typings.envDashCi.envDashCiStrings.sail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SailEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[String] = js.undefined
  var commit: String
  var isPr: Boolean
  var name: `Sail CI`
  var pr: js.UndefOr[String] = js.undefined
  var root: String
  var service: sail
  var slug: String
}

object SailEnv {
  @scala.inline
  def apply(
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: `Sail CI`,
    root: String,
    service: sail,
    slug: String,
    branch: String = null,
    pr: String = null
  ): SailEnv = {
    val __obj = js.Dynamic.literal(commit = commit, isCi = isCi, isPr = isPr, name = name, root = root, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    __obj.asInstanceOf[SailEnv]
  }
}

