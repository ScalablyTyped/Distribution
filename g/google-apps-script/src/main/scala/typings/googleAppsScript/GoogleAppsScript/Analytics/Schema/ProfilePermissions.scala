package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilePermissions extends js.Object {
  var effective: js.UndefOr[js.Array[String]] = js.undefined
}

object ProfilePermissions {
  @scala.inline
  def apply(effective: js.Array[String] = null): ProfilePermissions = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilePermissions]
  }
}

