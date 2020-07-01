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
  def apply(
    build: SchemaBuild = null,
    createTime: String = null,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    github: SchemaGitHubEventsConfig = null,
    id: String = null,
    ignoredFiles: js.Array[String] = null,
    includedFiles: js.Array[String] = null,
    substitutions: StringDictionary[String] = null,
    triggerTemplate: SchemaRepoSource = null
  ): SchemaBuildTrigger = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (github != null) __obj.updateDynamic("github")(github.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoredFiles != null) __obj.updateDynamic("ignoredFiles")(ignoredFiles.asInstanceOf[js.Any])
    if (includedFiles != null) __obj.updateDynamic("includedFiles")(includedFiles.asInstanceOf[js.Any])
    if (substitutions != null) __obj.updateDynamic("substitutions")(substitutions.asInstanceOf[js.Any])
    if (triggerTemplate != null) __obj.updateDynamic("triggerTemplate")(triggerTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildTrigger]
  }
}

