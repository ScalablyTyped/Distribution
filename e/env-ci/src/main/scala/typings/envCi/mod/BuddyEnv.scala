package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import typings.envCi.envCiStrings.Buddy
import typings.envCi.envCiStrings.buddy_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuddyEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[String] = js.native
  var build: String = js.native
  var buildUrl: String = js.native
  var commit: String = js.native
  var isPr: Boolean = js.native
  var name: Buddy = js.native
  var pr: js.UndefOr[String] = js.native
  var service: buddy_ = js.native
  var slug: String = js.native
  var tag: js.UndefOr[String] = js.native
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
    slug: String
  ): BuddyEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuddyEnv]
  }
  @scala.inline
  implicit class BuddyEnvOps[Self <: BuddyEnv] (val x: Self) extends AnyVal {
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
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildUrl(value: String): Self = this.set("buildUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPr(value: Boolean): Self = this.set("isPr", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Buddy): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: buddy_): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    @scala.inline
    def setPr(value: String): Self = this.set("pr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePr: Self = this.set("pr", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

