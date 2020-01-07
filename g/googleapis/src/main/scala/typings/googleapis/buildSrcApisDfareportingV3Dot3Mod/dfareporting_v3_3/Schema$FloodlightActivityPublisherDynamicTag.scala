package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Publisher Dynamic Tag
  */
@js.native
trait Schema$FloodlightActivityPublisherDynamicTag extends js.Object {
  /**
    * Whether this tag is applicable only for click-throughs.
    */
  var clickThrough: js.UndefOr[Boolean] = js.native
  /**
    * Directory site ID of this dynamic tag. This is a write-only field that
    * can be used as an alternative to the siteId field. When this resource is
    * retrieved, only the siteId field will be populated.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  /**
    * Dynamic floodlight tag.
    */
  var dynamicTag: js.UndefOr[Schema$FloodlightActivityDynamicTag] = js.native
  /**
    * Site ID of this dynamic tag.
    */
  var siteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[Schema$DimensionValue] = js.native
  /**
    * Whether this tag is applicable only for view-throughs.
    */
  var viewThrough: js.UndefOr[Boolean] = js.native
}

object Schema$FloodlightActivityPublisherDynamicTag {
  @scala.inline
  def apply(
    clickThrough: js.UndefOr[Boolean] = js.undefined,
    directorySiteId: String = null,
    dynamicTag: Schema$FloodlightActivityDynamicTag = null,
    siteId: String = null,
    siteIdDimensionValue: Schema$DimensionValue = null,
    viewThrough: js.UndefOr[Boolean] = js.undefined
  ): Schema$FloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickThrough)) __obj.updateDynamic("clickThrough")(clickThrough.asInstanceOf[js.Any])
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId.asInstanceOf[js.Any])
    if (dynamicTag != null) __obj.updateDynamic("dynamicTag")(dynamicTag.asInstanceOf[js.Any])
    if (siteId != null) __obj.updateDynamic("siteId")(siteId.asInstanceOf[js.Any])
    if (siteIdDimensionValue != null) __obj.updateDynamic("siteIdDimensionValue")(siteIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(viewThrough)) __obj.updateDynamic("viewThrough")(viewThrough.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FloodlightActivityPublisherDynamicTag]
  }
}

