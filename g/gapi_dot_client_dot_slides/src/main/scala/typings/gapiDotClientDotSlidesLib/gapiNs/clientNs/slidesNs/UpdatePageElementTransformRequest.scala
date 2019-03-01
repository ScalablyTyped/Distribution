package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePageElementTransformRequest extends js.Object {
  /** The apply mode of the transform update. */
  var applyMode: js.UndefOr[java.lang.String] = js.undefined
  /** The object ID of the page element to update. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** The input transform matrix used to update the page element. */
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

