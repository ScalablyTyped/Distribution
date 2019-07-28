package typings.gitDashRevisionDashWebpackDashPlugin.gitDashRevisionDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var branch: js.UndefOr[Boolean] = js.undefined
  var branchCommand: js.UndefOr[String] = js.undefined
  var commithashCommand: js.UndefOr[String] = js.undefined
  var gitWorkTree: js.UndefOr[String] = js.undefined
  var lightweightTags: js.UndefOr[Boolean] = js.undefined
  var versionCommand: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    branch: js.UndefOr[Boolean] = js.undefined,
    branchCommand: String = null,
    commithashCommand: String = null,
    gitWorkTree: String = null,
    lightweightTags: js.UndefOr[Boolean] = js.undefined,
    versionCommand: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(branch)) __obj.updateDynamic("branch")(branch)
    if (branchCommand != null) __obj.updateDynamic("branchCommand")(branchCommand)
    if (commithashCommand != null) __obj.updateDynamic("commithashCommand")(commithashCommand)
    if (gitWorkTree != null) __obj.updateDynamic("gitWorkTree")(gitWorkTree)
    if (!js.isUndefined(lightweightTags)) __obj.updateDynamic("lightweightTags")(lightweightTags)
    if (versionCommand != null) __obj.updateDynamic("versionCommand")(versionCommand)
    __obj.asInstanceOf[Options]
  }
}

