package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPayloadItem extends js.Object {
  var advanced: js.UndefOr[JobObjOutputPayloadAdvanced] = js.undefined
  var `type`: String
  var views: js.UndefOr[js.Array[String]] = js.undefined
}

object JobPayloadItem {
  @scala.inline
  def apply(`type`: String, advanced: JobObjOutputPayloadAdvanced = null, views: js.Array[String] = null): JobPayloadItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (advanced != null) __obj.updateDynamic("advanced")(advanced.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadItem]
  }
}

