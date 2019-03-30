package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSlidesPositionRequest extends js.Object {
  var insertionIndex: js.UndefOr[scala.Double] = js.undefined
  var slideObjectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object UpdateSlidesPositionRequest {
  @scala.inline
  def apply(insertionIndex: scala.Int | scala.Double = null, slideObjectIds: js.Array[java.lang.String] = null): UpdateSlidesPositionRequest = {
    val __obj = js.Dynamic.literal()
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    if (slideObjectIds != null) __obj.updateDynamic("slideObjectIds")(slideObjectIds)
    __obj.asInstanceOf[UpdateSlidesPositionRequest]
  }
}

