package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVideoPropertiesRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var videoProperties: js.UndefOr[VideoProperties] = js.undefined
}

object UpdateVideoPropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    videoProperties: VideoProperties = null
  ): UpdateVideoPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (videoProperties != null) __obj.updateDynamic("videoProperties")(videoProperties)
    __obj.asInstanceOf[UpdateVideoPropertiesRequest]
  }
}

