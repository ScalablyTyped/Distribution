package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import typings.envCi.envCiStrings.`Visual Studio Team Services`
import typings.envCi.envCiStrings.vsts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VstsEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String = js.native
  var build: String = js.native
  var commit: String = js.native
  var isPr: Boolean = js.native
  var name: `Visual Studio Team Services` = js.native
  var pr: js.UndefOr[String] = js.native
  var prBranch: js.UndefOr[String] = js.native
  var root: String = js.native
  var service: vsts = js.native
}

object VstsEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: `Visual Studio Team Services`,
    root: String,
    service: vsts
  ): VstsEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[VstsEnv]
  }
  @scala.inline
  implicit class VstsEnvOps[Self <: VstsEnv] (val x: Self) extends AnyVal {
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
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPr(value: Boolean): Self = this.set("isPr", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: `Visual Studio Team Services`): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: vsts): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setPr(value: String): Self = this.set("pr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePr: Self = this.set("pr", js.undefined)
    @scala.inline
    def setPrBranch(value: String): Self = this.set("prBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrBranch: Self = this.set("prBranch", js.undefined)
  }
  
}

