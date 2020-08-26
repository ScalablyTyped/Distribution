package typings.gitlab.environmentsMod

import typings.gitlab.projectsMod.ProjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentSchema extends js.Object {
  var external_url: js.UndefOr[String] = js.native
  var id: Double = js.native
  var name: String = js.native
  var project: js.UndefOr[ProjectSchema] = js.native
  var slug: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object EnvironmentSchema {
  @scala.inline
  def apply(id: Double, name: String): EnvironmentSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentSchema]
  }
  @scala.inline
  implicit class EnvironmentSchemaOps[Self <: EnvironmentSchema] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal_url(value: String): Self = this.set("external_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal_url: Self = this.set("external_url", js.undefined)
    @scala.inline
    def setProject(value: ProjectSchema): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlug: Self = this.set("slug", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

