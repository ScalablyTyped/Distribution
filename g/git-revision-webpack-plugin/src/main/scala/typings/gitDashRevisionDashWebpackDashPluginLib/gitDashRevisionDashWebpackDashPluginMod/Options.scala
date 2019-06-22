package typings
package gitDashRevisionDashWebpackDashPluginLib.gitDashRevisionDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var branch: js.UndefOr[scala.Boolean] = js.undefined
  var branchCommand: js.UndefOr[java.lang.String] = js.undefined
  var commithashCommand: js.UndefOr[java.lang.String] = js.undefined
  var gitWorkTree: js.UndefOr[java.lang.String] = js.undefined
  var lightweightTags: js.UndefOr[scala.Boolean] = js.undefined
  var versionCommand: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    branch: js.UndefOr[scala.Boolean] = js.undefined,
    branchCommand: java.lang.String = null,
    commithashCommand: java.lang.String = null,
    gitWorkTree: java.lang.String = null,
    lightweightTags: js.UndefOr[scala.Boolean] = js.undefined,
    versionCommand: java.lang.String = null
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

