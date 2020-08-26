package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import typings.envCi.envCiStrings.Codeship
import typings.envCi.envCiStrings.codeship_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeshipEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String = js.native
  var build: String = js.native
  var buildUrl: String = js.native
  var commit: String = js.native
  var name: Codeship = js.native
  var service: codeship_ = js.native
  var slug: String = js.native
}

object CodeshipEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: Codeship,
    service: codeship_,
    slug: String
  ): CodeshipEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeshipEnv]
  }
  @scala.inline
  implicit class CodeshipEnvOps[Self <: CodeshipEnv] (val x: Self) extends AnyVal {
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
    def setName(value: Codeship): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: codeship_): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
  }
  
}

