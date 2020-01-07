package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A permission which can be included by a role.
  */
@js.native
trait Schema$Permission extends js.Object {
  /**
    * The service API associated with the permission is not enabled.
    */
  var apiDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The current custom role support level.
    */
  var customRolesSupportLevel: js.UndefOr[String] = js.native
  /**
    * A brief description of what this Permission is used for.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of this Permission.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * This permission can ONLY be used in predefined roles.
    */
  var onlyInPredefinedRoles: js.UndefOr[Boolean] = js.native
  /**
    * The current launch stage of the permission.
    */
  var stage: js.UndefOr[String] = js.native
  /**
    * The title of this Permission.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$Permission {
  @scala.inline
  def apply(
    apiDisabled: js.UndefOr[Boolean] = js.undefined,
    customRolesSupportLevel: String = null,
    description: String = null,
    name: String = null,
    onlyInPredefinedRoles: js.UndefOr[Boolean] = js.undefined,
    stage: String = null,
    title: String = null
  ): Schema$Permission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apiDisabled)) __obj.updateDynamic("apiDisabled")(apiDisabled.asInstanceOf[js.Any])
    if (customRolesSupportLevel != null) __obj.updateDynamic("customRolesSupportLevel")(customRolesSupportLevel.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInPredefinedRoles)) __obj.updateDynamic("onlyInPredefinedRoles")(onlyInPredefinedRoles.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Permission]
  }
}

