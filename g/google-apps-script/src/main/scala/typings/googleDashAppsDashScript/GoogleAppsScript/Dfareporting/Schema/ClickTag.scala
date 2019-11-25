package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickTag extends js.Object {
  var clickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.undefined
  var eventName: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ClickTag {
  @scala.inline
  def apply(clickThroughUrl: CreativeClickThroughUrl = null, eventName: String = null, name: String = null): ClickTag = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickTag]
  }
}

