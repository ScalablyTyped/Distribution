package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupMetadata extends js.Object {
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

object ContactGroupMetadata {
  @scala.inline
  def apply(deleted: js.UndefOr[scala.Boolean] = js.undefined, updateTime: java.lang.String = null): ContactGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[ContactGroupMetadata]
  }
}

