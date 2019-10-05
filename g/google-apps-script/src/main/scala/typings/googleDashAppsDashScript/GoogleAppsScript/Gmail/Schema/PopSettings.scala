package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopSettings extends js.Object {
  var accessWindow: js.UndefOr[String] = js.undefined
  var disposition: js.UndefOr[String] = js.undefined
}

object PopSettings {
  @scala.inline
  def apply(accessWindow: String = null, disposition: String = null): PopSettings = {
    val __obj = js.Dynamic.literal()
    if (accessWindow != null) __obj.updateDynamic("accessWindow")(accessWindow)
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    __obj.asInstanceOf[PopSettings]
  }
}

