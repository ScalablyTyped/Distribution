package typings.gitlab.groupsMod

import typings.gitlab.projectsMod.ProjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupDetailSchema extends GroupSchema {
  var projects: js.Array[ProjectSchema]
  var runners_token: String
  var shared_projects: js.Array[ProjectSchema]
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
    web_url: String,
    auto_devops_enabled: js.UndefOr[Boolean] = js.undefined,
    emails_disabled: js.UndefOr[Boolean] = js.undefined,
    parent_id: Int | Double = null
  ): GroupDetailSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], full_path = full_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lfs_enabled = lfs_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project_creation_level = project_creation_level.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], request_access_enabled = request_access_enabled.asInstanceOf[js.Any], require_two_factor_authentication = require_two_factor_authentication.asInstanceOf[js.Any], runners_token = runners_token.asInstanceOf[js.Any], share_with_group_lock = share_with_group_lock.asInstanceOf[js.Any], shared_projects = shared_projects.asInstanceOf[js.Any], subgroup_creation_level = subgroup_creation_level.asInstanceOf[js.Any], two_factor_grace_period = two_factor_grace_period.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_devops_enabled)) __obj.updateDynamic("auto_devops_enabled")(auto_devops_enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(emails_disabled)) __obj.updateDynamic("emails_disabled")(emails_disabled.asInstanceOf[js.Any])
    if (parent_id != null) __obj.updateDynamic("parent_id")(parent_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupDetailSchema]
  }
}

