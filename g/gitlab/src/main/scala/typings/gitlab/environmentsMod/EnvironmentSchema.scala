package typings.gitlab.environmentsMod

import typings.gitlab.projectsMod.ProjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentSchema extends js.Object {
  var external_url: js.UndefOr[String] = js.undefined
  var id: Double
  var name: String
  var project: js.UndefOr[ProjectSchema] = js.undefined
  var slug: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object EnvironmentSchema {
  @scala.inline
  def apply(
    id: Double,
    name: String,
    external_url: String = null,
    project: ProjectSchema = null,
    slug: String = null,
    state: String = null
  ): EnvironmentSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (external_url != null) __obj.updateDynamic("external_url")(external_url.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentSchema]
  }
}

