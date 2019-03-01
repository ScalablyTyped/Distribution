package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

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
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** Human-readable description of this trigger. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** If true, the trigger will never result in a build. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Path, from the source root, to a file whose contents is used for the
    * template.
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique identifier of the trigger.
    *
    * @OutputOnly
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Substitutions data for Build resource. */
  var substitutions: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
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
    createTime: java.lang.String = null,
    description: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    filename: java.lang.String = null,
    id: java.lang.String = null,
    substitutions: stdLib.Record[java.lang.String, java.lang.String] = null,
    triggerTemplate: RepoSource = null
  ): BuildTrigger = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (id != null) __obj.updateDynamic("id")(id)
    if (substitutions != null) __obj.updateDynamic("substitutions")(substitutions)
    if (triggerTemplate != null) __obj.updateDynamic("triggerTemplate")(triggerTemplate)
    __obj.asInstanceOf[BuildTrigger]
  }
}

