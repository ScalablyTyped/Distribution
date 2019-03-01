package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagData extends js.Object {
  /** Ad associated with this placement tag. Applicable only when format is PLACEMENT_TAG_TRACKING. */
  var adId: js.UndefOr[java.lang.String] = js.undefined
  /** Tag string to record a click. */
  var clickTag: js.UndefOr[java.lang.String] = js.undefined
  /** Creative associated with this placement tag. Applicable only when format is PLACEMENT_TAG_TRACKING. */
  var creativeId: js.UndefOr[java.lang.String] = js.undefined
  /** TagData tag format of this tag. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Tag string for serving an ad. */
  var impressionTag: js.UndefOr[java.lang.String] = js.undefined
}

object TagData {
  @scala.inline
  def apply(
    adId: java.lang.String = null,
    clickTag: java.lang.String = null,
    creativeId: java.lang.String = null,
    format: java.lang.String = null,
    impressionTag: java.lang.String = null
  ): TagData = {
    val __obj = js.Dynamic.literal()
    if (adId != null) __obj.updateDynamic("adId")(adId)
    if (clickTag != null) __obj.updateDynamic("clickTag")(clickTag)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    if (format != null) __obj.updateDynamic("format")(format)
    if (impressionTag != null) __obj.updateDynamic("impressionTag")(impressionTag)
    __obj.asInstanceOf[TagData]
  }
}

