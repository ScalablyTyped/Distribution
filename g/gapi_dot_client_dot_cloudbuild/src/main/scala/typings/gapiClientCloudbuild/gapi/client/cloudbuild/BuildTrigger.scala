package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildTrigger extends js.Object {
  /** Contents of the build template. */
  var build: js.UndefOr[Build] = js.native
  /**
    * Time when the trigger was created.
    *
    * @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  /** Human-readable description of this trigger. */
  var description: js.UndefOr[String] = js.native
  /** If true, the trigger will never result in a build. */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Path, from the source root, to a file whose contents is used for the
    * template.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Unique identifier of the trigger.
    *
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /** Substitutions data for Build resource. */
  var substitutions: js.UndefOr[Record[String, String]] = js.native
  /**
    * Template describing the types of source changes to trigger a build.
    *
    * Branch and tag names in trigger templates are interpreted as regular
    * expressions. Any branch or tag change that matches that regular expression
    * will trigger a build.
    */
  var triggerTemplate: js.UndefOr[RepoSource] = js.native
}

object BuildTrigger {
  @scala.inline
  def apply(): BuildTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildTrigger]
  }
  @scala.inline
  implicit class BuildTriggerOps[Self <: BuildTrigger] (val x: Self) extends AnyVal {
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
    def setBuild(value: Build): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setSubstitutions(value: Record[String, String]): Self = this.set("substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("substitutions", js.undefined)
    @scala.inline
    def setTriggerTemplate(value: RepoSource): Self = this.set("triggerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerTemplate: Self = this.set("triggerTemplate", js.undefined)
  }
  
}

