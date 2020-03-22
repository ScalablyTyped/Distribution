package typings.gitlab.groupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSchema extends js.Object {
  var auto_devops_enabled: js.UndefOr[Boolean] = js.undefined
  var avatar_url: String
  var description: String
  var emails_disabled: js.UndefOr[Boolean] = js.undefined
  var full_name: String
  var full_path: String
  var id: Double
  var lfs_enabled: Boolean
  var name: String
  var parent_id: js.UndefOr[Double] = js.undefined
  var path: String
  var project_creation_level: String
  var request_access_enabled: Boolean
  var require_two_factor_authentication: Boolean
  var share_with_group_lock: Boolean
  var subgroup_creation_level: String
  var two_factor_grace_period: Double
  var visibility: String
  var web_url: String
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
    web_url: String,
    auto_devops_enabled: js.UndefOr[Boolean] = js.undefined,
    emails_disabled: js.UndefOr[Boolean] = js.undefined,
    parent_id: Int | Double = null
  ): GroupSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], full_path = full_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lfs_enabled = lfs_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project_creation_level = project_creation_level.asInstanceOf[js.Any], request_access_enabled = request_access_enabled.asInstanceOf[js.Any], require_two_factor_authentication = require_two_factor_authentication.asInstanceOf[js.Any], share_with_group_lock = share_with_group_lock.asInstanceOf[js.Any], subgroup_creation_level = subgroup_creation_level.asInstanceOf[js.Any], two_factor_grace_period = two_factor_grace_period.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_devops_enabled)) __obj.updateDynamic("auto_devops_enabled")(auto_devops_enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(emails_disabled)) __obj.updateDynamic("emails_disabled")(emails_disabled.asInstanceOf[js.Any])
    if (parent_id != null) __obj.updateDynamic("parent_id")(parent_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupSchema]
  }
}

