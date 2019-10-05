package typings.googleDashAppsDashScript.GoogleAppsScript.YouTubeAnalytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupContentDetails extends js.Object {
  var itemCount: js.UndefOr[String] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
}

object GroupContentDetails {
  @scala.inline
  def apply(itemCount: String = null, itemType: String = null): GroupContentDetails = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    __obj.asInstanceOf[GroupContentDetails]
  }
}

