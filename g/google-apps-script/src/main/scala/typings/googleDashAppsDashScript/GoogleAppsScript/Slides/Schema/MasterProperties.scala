package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasterProperties extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
}

object MasterProperties {
  @scala.inline
  def apply(displayName: String = null): MasterProperties = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterProperties]
  }
}

