package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickTag extends js.Object {
  var clickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.undefined
  var eventName: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ClickTag {
  @scala.inline
  def apply(
    clickThroughUrl: CreativeClickThroughUrl = null,
    eventName: java.lang.String = null,
    name: java.lang.String = null
  ): ClickTag = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ClickTag]
  }
}

