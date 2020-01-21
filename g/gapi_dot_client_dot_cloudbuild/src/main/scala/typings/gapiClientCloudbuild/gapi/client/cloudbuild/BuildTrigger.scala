package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildTrigger extends js.Object {
  /** Contents of the build template. */
  var build: js.UndefOr[Build] = js.undefined
  /**
    * Time when the trigger was created.
    *
    * @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.undefined
  /** Human-readable description of this trigger. */
  var description: js.UndefOr[String] = js.undefined
  /** If true, the trigger will never result in a build. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Path, from the source root, to a file whose contents is used for the
    * template.
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier of the trigger.
    *
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.undefined
  /** Substitutions data for Build resource. */
  var substitutions: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Template describing the types of source changes to trigger a build.
    *
    * Branch and tag names in trigger templates are interpreted as regular
    * expressions. Any branch or tag change that matches that regular expression
    * will trigger a build.
    */
  var triggerTemplate: js.UndefOr[RepoSource] = js.undefined
}

object BuildTrigger {
  @scala.inline
  def apply(
    build: Build = null,
    createTime: String = null,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    id: String = null,
    substitutions: Record[String, String] = null,
    triggerTemplate: RepoSource = null
  ): BuildTrigger = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (substitutions != null) __obj.updateDynamic("substitutions")(substitutions.asInstanceOf[js.Any])
    if (triggerTemplate != null) __obj.updateDynamic("triggerTemplate")(triggerTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildTrigger]
  }
}

