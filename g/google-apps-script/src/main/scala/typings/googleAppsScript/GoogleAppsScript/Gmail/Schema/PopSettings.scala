package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

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
    if (accessWindow != null) __obj.updateDynamic("accessWindow")(accessWindow.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopSettings]
  }
}

