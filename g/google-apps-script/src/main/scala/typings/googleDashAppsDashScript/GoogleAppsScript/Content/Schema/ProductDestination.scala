package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductDestination extends js.Object {
  var destinationName: js.UndefOr[String] = js.undefined
  var intention: js.UndefOr[String] = js.undefined
}

object ProductDestination {
  @scala.inline
  def apply(destinationName: String = null, intention: String = null): ProductDestination = {
    val __obj = js.Dynamic.literal()
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (intention != null) __obj.updateDynamic("intention")(intention.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductDestination]
  }
}

