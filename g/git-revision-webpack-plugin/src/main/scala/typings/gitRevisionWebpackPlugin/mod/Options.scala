package typings.gitRevisionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var branch: js.UndefOr[Boolean] = js.native
  var branchCommand: js.UndefOr[String] = js.native
  var commithashCommand: js.UndefOr[String] = js.native
  var gitWorkTree: js.UndefOr[String] = js.native
  var lightweightTags: js.UndefOr[Boolean] = js.native
  var versionCommand: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBranch(value: Boolean): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    @scala.inline
    def setBranchCommand(value: String): Self = this.set("branchCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranchCommand: Self = this.set("branchCommand", js.undefined)
    @scala.inline
    def setCommithashCommand(value: String): Self = this.set("commithashCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommithashCommand: Self = this.set("commithashCommand", js.undefined)
    @scala.inline
    def setGitWorkTree(value: String): Self = this.set("gitWorkTree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitWorkTree: Self = this.set("gitWorkTree", js.undefined)
    @scala.inline
    def setLightweightTags(value: Boolean): Self = this.set("lightweightTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightweightTags: Self = this.set("lightweightTags", js.undefined)
    @scala.inline
    def setVersionCommand(value: String): Self = this.set("versionCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCommand: Self = this.set("versionCommand", js.undefined)
  }
  
}

