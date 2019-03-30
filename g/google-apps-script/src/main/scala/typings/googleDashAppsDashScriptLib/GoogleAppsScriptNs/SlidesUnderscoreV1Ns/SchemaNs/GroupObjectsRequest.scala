package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupObjectsRequest extends js.Object {
  var childrenObjectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var groupObjectId: js.UndefOr[java.lang.String] = js.undefined
}

object GroupObjectsRequest {
  @scala.inline
  def apply(childrenObjectIds: js.Array[java.lang.String] = null, groupObjectId: java.lang.String = null): GroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    if (childrenObjectIds != null) __obj.updateDynamic("childrenObjectIds")(childrenObjectIds)
    if (groupObjectId != null) __obj.updateDynamic("groupObjectId")(groupObjectId)
    __obj.asInstanceOf[GroupObjectsRequest]
  }
}

