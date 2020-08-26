package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for an automated build in response to source repository
  * changes.
  */
@js.native
trait SchemaBuildTrigger extends js.Object {
  /**
    * Contents of the build template.
    */
  var build: js.UndefOr[SchemaBuild] = js.native
  /**
    * Output only. Time when the trigger was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Human-readable description of this trigger.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If true, the trigger will never result in a build.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Path, from the source root, to a file whose contents is used for the
    * template.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * GitHubEventsConfig describes the configuration of a trigger that creates
    * a build whenever a GitHub event is received.
    */
  var github: js.UndefOr[SchemaGitHubEventsConfig] = js.native
  /**
    * Output only. Unique identifier of the trigger.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * ignored_files and included_files are file glob matches using
    * http://godoc/pkg/path/filepath#Match extended with support for
    * &quot;**&quot;.  If ignored_files and changed files are both empty, then
    * they are not used to determine whether or not to trigger a build.  If
    * ignored_files is not empty, then we ignore any files that match any of
    * the ignored_file globs. If the change has no files that are outside of
    * the ignored_files globs, then we do not trigger a build.
    */
  var ignoredFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * If any of the files altered in the commit pass the ignored_files filter
    * and included_files is empty, then as far as this filter is concerned, we
    * should trigger the build.  If any of the files altered in the commit pass
    * the ignored_files filter and included_files is not empty, then we make
    * sure that at least one of those files matches a included_files glob. If
    * not, then we do not trigger a build.
    */
  var includedFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Substitutions data for Build resource.
    */
  var substitutions: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Template describing the types of source changes to trigger a build.
    * Branch and tag names in trigger templates are interpreted as regular
    * expressions. Any branch or tag change that matches that regular
    * expression will trigger a build.
    */
  var triggerTemplate: js.UndefOr[SchemaRepoSource] = js.native
}

object SchemaBuildTrigger {
  @scala.inline
  def apply(): SchemaBuildTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildTrigger]
  }
  @scala.inline
  implicit class SchemaBuildTriggerOps[Self <: SchemaBuildTrigger] (val x: Self) extends AnyVal {
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
    def setBuild(value: SchemaBuild): Self = this.set("build", value.asInstanceOf[js.Any])
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
    def setGithub(value: SchemaGitHubEventsConfig): Self = this.set("github", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGithub: Self = this.set("github", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIgnoredFilesVarargs(value: String*): Self = this.set("ignoredFiles", js.Array(value :_*))
    @scala.inline
    def setIgnoredFiles(value: js.Array[String]): Self = this.set("ignoredFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoredFiles: Self = this.set("ignoredFiles", js.undefined)
    @scala.inline
    def setIncludedFilesVarargs(value: String*): Self = this.set("includedFiles", js.Array(value :_*))
    @scala.inline
    def setIncludedFiles(value: js.Array[String]): Self = this.set("includedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedFiles: Self = this.set("includedFiles", js.undefined)
    @scala.inline
    def setSubstitutions(value: StringDictionary[String]): Self = this.set("substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("substitutions", js.undefined)
    @scala.inline
    def setTriggerTemplate(value: SchemaRepoSource): Self = this.set("triggerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerTemplate: Self = this.set("triggerTemplate", js.undefined)
  }
  
}

