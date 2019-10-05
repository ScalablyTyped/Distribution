package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupMetadata extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.undefined
  var updateTime: js.UndefOr[String] = js.undefined
}

object ContactGroupMetadata {
  @scala.inline
  def apply(deleted: js.UndefOr[Boolean] = js.undefined, updateTime: String = null): ContactGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[ContactGroupMetadata]
  }
}

