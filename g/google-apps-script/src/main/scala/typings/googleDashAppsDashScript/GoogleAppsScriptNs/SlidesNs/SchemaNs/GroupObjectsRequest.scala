package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupObjectsRequest extends js.Object {
  var childrenObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  var groupObjectId: js.UndefOr[String] = js.undefined
}

object GroupObjectsRequest {
  @scala.inline
  def apply(childrenObjectIds: js.Array[String] = null, groupObjectId: String = null): GroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    if (childrenObjectIds != null) __obj.updateDynamic("childrenObjectIds")(childrenObjectIds)
    if (groupObjectId != null) __obj.updateDynamic("groupObjectId")(groupObjectId)
    __obj.asInstanceOf[GroupObjectsRequest]
  }
}

