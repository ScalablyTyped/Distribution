package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

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
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ClickTag]
  }
}

