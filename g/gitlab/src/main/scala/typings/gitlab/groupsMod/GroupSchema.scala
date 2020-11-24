package typings.gitlab.groupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupSchema extends js.Object {
  
  var auto_devops_enabled: js.UndefOr[Boolean] = js.native
  
  var avatar_url: String = js.native
  
  var description: String = js.native
  
  var emails_disabled: js.UndefOr[Boolean] = js.native
  
  var full_name: String = js.native
  
  var full_path: String = js.native
  
  var id: Double = js.native
  
  var lfs_enabled: Boolean = js.native
  
  var name: String = js.native
  
  var parent_id: js.UndefOr[Double] = js.native
  
  var path: String = js.native
  
  var project_creation_level: String = js.native
  
  var request_access_enabled: Boolean = js.native
  
  var require_two_factor_authentication: Boolean = js.native
  
  var share_with_group_lock: Boolean = js.native
  
  var subgroup_creation_level: String = js.native
  
  var two_factor_grace_period: Double = js.native
  
  var visibility: String = js.native
  
  var web_url: String = js.native
}
object GroupSchema {
  
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
    request_access_enabled: Boolean,
    require_two_factor_authentication: Boolean,
    share_with_group_lock: Boolean,
    subgroup_creation_level: String,
    two_factor_grace_period: Double,
    visibility: String,
    web_url: String
  ): GroupSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], full_path = full_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lfs_enabled = lfs_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project_creation_level = project_creation_level.asInstanceOf[js.Any], request_access_enabled = request_access_enabled.asInstanceOf[js.Any], require_two_factor_authentication = require_two_factor_authentication.asInstanceOf[js.Any], share_with_group_lock = share_with_group_lock.asInstanceOf[js.Any], subgroup_creation_level = subgroup_creation_level.asInstanceOf[js.Any], two_factor_grace_period = two_factor_grace_period.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupSchema]
  }
  
  @scala.inline
  implicit class GroupSchemaOps[Self <: GroupSchema] (val x: Self) extends AnyVal {
    
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
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_path(value: String): Self = this.set("full_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLfs_enabled(value: Boolean): Self = this.set("lfs_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject_creation_level(value: String): Self = this.set("project_creation_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_access_enabled(value: Boolean): Self = this.set("request_access_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_two_factor_authentication(value: Boolean): Self = this.set("require_two_factor_authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare_with_group_lock(value: Boolean): Self = this.set("share_with_group_lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubgroup_creation_level(value: String): Self = this.set("subgroup_creation_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwo_factor_grace_period(value: Double): Self = this.set("two_factor_grace_period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb_url(value: String): Self = this.set("web_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_devops_enabled(value: Boolean): Self = this.set("auto_devops_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto_devops_enabled: Self = this.set("auto_devops_enabled", js.undefined)
    
    @scala.inline
    def setEmails_disabled(value: Boolean): Self = this.set("emails_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmails_disabled: Self = this.set("emails_disabled", js.undefined)
    
    @scala.inline
    def setParent_id(value: Double): Self = this.set("parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent_id: Self = this.set("parent_id", js.undefined)
  }
}
