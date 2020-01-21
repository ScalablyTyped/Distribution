package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityUserLinkPermissions extends js.Object {
  var effective: js.UndefOr[js.Array[String]] = js.undefined
  var local: js.UndefOr[js.Array[String]] = js.undefined
}

object EntityUserLinkPermissions {
  @scala.inline
  def apply(effective: js.Array[String] = null, local: js.Array[String] = null): EntityUserLinkPermissions = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityUserLinkPermissions]
  }
}

