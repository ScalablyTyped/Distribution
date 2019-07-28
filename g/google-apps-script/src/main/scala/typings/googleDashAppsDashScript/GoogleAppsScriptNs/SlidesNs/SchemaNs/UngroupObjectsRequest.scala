package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UngroupObjectsRequest extends js.Object {
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
}

object UngroupObjectsRequest {
  @scala.inline
  def apply(objectIds: js.Array[String] = null): UngroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds)
    __obj.asInstanceOf[UngroupObjectsRequest]
  }
}

