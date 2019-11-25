package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagData extends js.Object {
  var adId: js.UndefOr[String] = js.undefined
  var clickTag: js.UndefOr[String] = js.undefined
  var creativeId: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var impressionTag: js.UndefOr[String] = js.undefined
}

object TagData {
  @scala.inline
  def apply(
    adId: String = null,
    clickTag: String = null,
    creativeId: String = null,
    format: String = null,
    impressionTag: String = null
  ): TagData = {
    val __obj = js.Dynamic.literal()
    if (adId != null) __obj.updateDynamic("adId")(adId.asInstanceOf[js.Any])
    if (clickTag != null) __obj.updateDynamic("clickTag")(clickTag.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (impressionTag != null) __obj.updateDynamic("impressionTag")(impressionTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagData]
  }
}

