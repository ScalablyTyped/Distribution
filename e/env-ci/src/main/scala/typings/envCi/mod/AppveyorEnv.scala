package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import typings.envCi.envCiStrings.Appveyor
import typings.envCi.envCiStrings.appveyor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppveyorEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String = js.native
  var build: String = js.native
  var buildUrl: String = js.native
  var commit: String = js.native
  var isPr: Boolean = js.native
  var job: String = js.native
  var jobUrl: String = js.native
  var name: Appveyor = js.native
  var pr: js.UndefOr[String] = js.native
  var prBranch: js.UndefOr[String] = js.native
  var root: String = js.native
  var service: appveyor_ = js.native
  var slug: String = js.native
  var tag: js.UndefOr[String] = js.native
}

object AppveyorEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    name: Appveyor,
    root: String,
    service: appveyor_,
    slug: String
  ): AppveyorEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppveyorEnv]
  }
  @scala.inline
  implicit class AppveyorEnvOps[Self <: AppveyorEnv] (val x: Self) extends AnyVal {
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
    def setBuildUrl(value: String): Self = this.set("buildUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPr(value: Boolean): Self = this.set("isPr", value.asInstanceOf[js.Any])
    @scala.inline
    def setJob(value: String): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobUrl(value: String): Self = this.set("jobUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Appveyor): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: appveyor_): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setPr(value: String): Self = this.set("pr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePr: Self = this.set("pr", js.undefined)
    @scala.inline
    def setPrBranch(value: String): Self = this.set("prBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrBranch: Self = this.set("prBranch", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

