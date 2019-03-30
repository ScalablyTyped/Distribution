package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityPublisherDynamicTag extends js.Object {
  var clickThrough: js.UndefOr[scala.Boolean] = js.undefined
  var directorySiteId: js.UndefOr[java.lang.String] = js.undefined
  var dynamicTag: js.UndefOr[FloodlightActivityDynamicTag] = js.undefined
  var siteId: js.UndefOr[java.lang.String] = js.undefined
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var viewThrough: js.UndefOr[scala.Boolean] = js.undefined
}

object FloodlightActivityPublisherDynamicTag {
  @scala.inline
  def apply(
    clickThrough: js.UndefOr[scala.Boolean] = js.undefined,
    directorySiteId: java.lang.String = null,
    dynamicTag: FloodlightActivityDynamicTag = null,
    siteId: java.lang.String = null,
    siteIdDimensionValue: DimensionValue = null,
    viewThrough: js.UndefOr[scala.Boolean] = js.undefined
  ): FloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickThrough)) __obj.updateDynamic("clickThrough")(clickThrough)
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId)
    if (dynamicTag != null) __obj.updateDynamic("dynamicTag")(dynamicTag)
    if (siteId != null) __obj.updateDynamic("siteId")(siteId)
    if (siteIdDimensionValue != null) __obj.updateDynamic("siteIdDimensionValue")(siteIdDimensionValue)
    if (!js.isUndefined(viewThrough)) __obj.updateDynamic("viewThrough")(viewThrough)
    __obj.asInstanceOf[FloodlightActivityPublisherDynamicTag]
  }
}

