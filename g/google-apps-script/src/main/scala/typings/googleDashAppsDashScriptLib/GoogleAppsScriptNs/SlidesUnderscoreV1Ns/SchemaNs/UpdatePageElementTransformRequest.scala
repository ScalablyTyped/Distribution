package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePageElementTransformRequest extends js.Object {
  var applyMode: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[AffineTransform] = js.undefined
}

object UpdatePageElementTransformRequest {
  @scala.inline
  def apply(
    applyMode: java.lang.String = null,
    objectId: java.lang.String = null,
    transform: AffineTransform = null
  ): UpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    if (applyMode != null) __obj.updateDynamic("applyMode")(applyMode)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[UpdatePageElementTransformRequest]
  }
}

