package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagData extends js.Object {
  var adId: js.UndefOr[java.lang.String] = js.undefined
  var clickTag: js.UndefOr[java.lang.String] = js.undefined
  var creativeId: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
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

