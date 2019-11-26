package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventExtendedProperties extends js.Object {
  var `private`: js.UndefOr[Record[String, String]] = js.undefined
  var shared: js.UndefOr[Record[String, String]] = js.undefined
}

object EventExtendedProperties {
  @scala.inline
  def apply(`private`: Record[String, String] = null, shared: Record[String, String] = null): EventExtendedProperties = {
    val __obj = js.Dynamic.literal()
    if (`private` != null) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (shared != null) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventExtendedProperties]
  }
}

