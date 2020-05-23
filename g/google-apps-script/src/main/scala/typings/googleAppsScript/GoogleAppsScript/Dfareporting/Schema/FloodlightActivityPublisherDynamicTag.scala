package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityPublisherDynamicTag extends js.Object {
  var clickThrough: js.UndefOr[Boolean] = js.undefined
  var directorySiteId: js.UndefOr[String] = js.undefined
  var dynamicTag: js.UndefOr[FloodlightActivityDynamicTag] = js.undefined
  var siteId: js.UndefOr[String] = js.undefined
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var viewThrough: js.UndefOr[Boolean] = js.undefined
}

object FloodlightActivityPublisherDynamicTag {
  @scala.inline
  def apply(
    clickThrough: js.UndefOr[Boolean] = js.undefined,
    directorySiteId: String = null,
    dynamicTag: FloodlightActivityDynamicTag = null,
    siteId: String = null,
    siteIdDimensionValue: DimensionValue = null,
    viewThrough: js.UndefOr[Boolean] = js.undefined
  ): FloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickThrough)) __obj.updateDynamic("clickThrough")(clickThrough.get.asInstanceOf[js.Any])
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId.asInstanceOf[js.Any])
    if (dynamicTag != null) __obj.updateDynamic("dynamicTag")(dynamicTag.asInstanceOf[js.Any])
    if (siteId != null) __obj.updateDynamic("siteId")(siteId.asInstanceOf[js.Any])
    if (siteIdDimensionValue != null) __obj.updateDynamic("siteIdDimensionValue")(siteIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(viewThrough)) __obj.updateDynamic("viewThrough")(viewThrough.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightActivityPublisherDynamicTag]
  }
}

