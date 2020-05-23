package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /** The current custom role support level. */
  var customRolesSupportLevel: js.UndefOr[String] = js.undefined
  /** A brief description of what this Permission is used for. */
  var description: js.UndefOr[String] = js.undefined
  /** The name of this Permission. */
  var name: js.UndefOr[String] = js.undefined
  /** This permission can ONLY be used in predefined roles. */
  var onlyInPredefinedRoles: js.UndefOr[Boolean] = js.undefined
  /** The current launch stage of the permission. */
  var stage: js.UndefOr[String] = js.undefined
  /** The title of this Permission. */
  var title: js.UndefOr[String] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    customRolesSupportLevel: String = null,
    description: String = null,
    name: String = null,
    onlyInPredefinedRoles: js.UndefOr[Boolean] = js.undefined,
    stage: String = null,
    title: String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (customRolesSupportLevel != null) __obj.updateDynamic("customRolesSupportLevel")(customRolesSupportLevel.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInPredefinedRoles)) __obj.updateDynamic("onlyInPredefinedRoles")(onlyInPredefinedRoles.get.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
}

