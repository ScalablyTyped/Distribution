package typings.gitlab.groupsMod

import typings.gitlab.projectsMod.ProjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupDetailSchema extends GroupSchema {
  
  var projects: js.Array[ProjectSchema] = js.native
  
  var runners_token: String = js.native
  
  var shared_projects: js.Array[ProjectSchema] = js.native
}
object GroupDetailSchema {
  
  @scala.inline
  def apply(
    avatar_url: String,
    description: String,
    full_name: String,
    full_path: String,
    id: Double,
    lfs_enabled: Boolean,
    name: String,
    path: String,
    project_creation_level: String,
    projects: js.Array[ProjectSchema],
    request_access_enabled: Boolean,
    require_two_factor_authentication: Boolean,
    runners_token: String,
    share_with_group_lock: Boolean,
    shared_projects: js.Array[ProjectSchema],
    subgroup_creation_level: String,
    two_factor_grace_period: Double,
    visibility: String,
    web_url: String
  ): GroupDetailSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], full_path = full_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lfs_enabled = lfs_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project_creation_level = project_creation_level.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], request_access_enabled = request_access_enabled.asInstanceOf[js.Any], require_two_factor_authentication = require_two_factor_authentication.asInstanceOf[js.Any], runners_token = runners_token.asInstanceOf[js.Any], share_with_group_lock = share_with_group_lock.asInstanceOf[js.Any], shared_projects = shared_projects.asInstanceOf[js.Any], subgroup_creation_level = subgroup_creation_level.asInstanceOf[js.Any], two_factor_grace_period = two_factor_grace_period.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupDetailSchema]
  }
  
  @scala.inline
  implicit class GroupDetailSchemaOps[Self <: GroupDetailSchema] (val x: Self) extends AnyVal {
    
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
    def setProjectsVarargs(value: ProjectSchema*): Self = this.set("projects", js.Array(value :_*))
    
    @scala.inline
    def setProjects(value: js.Array[ProjectSchema]): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunners_token(value: String): Self = this.set("runners_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_projectsVarargs(value: ProjectSchema*): Self = this.set("shared_projects", js.Array(value :_*))
    
    @scala.inline
    def setShared_projects(value: js.Array[ProjectSchema]): Self = this.set("shared_projects", value.asInstanceOf[js.Any])
  }
}
