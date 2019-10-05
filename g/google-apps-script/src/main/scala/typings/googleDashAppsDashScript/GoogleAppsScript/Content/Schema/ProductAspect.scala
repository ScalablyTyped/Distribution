package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductAspect extends js.Object {
  var aspectName: js.UndefOr[String] = js.undefined
  var destinationName: js.UndefOr[String] = js.undefined
  var intention: js.UndefOr[String] = js.undefined
}

object ProductAspect {
  @scala.inline
  def apply(aspectName: String = null, destinationName: String = null, intention: String = null): ProductAspect = {
    val __obj = js.Dynamic.literal()
    if (aspectName != null) __obj.updateDynamic("aspectName")(aspectName)
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName)
    if (intention != null) __obj.updateDynamic("intention")(intention)
    __obj.asInstanceOf[ProductAspect]
  }
}

