package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileIndexableText extends js.Object {
  var text: js.UndefOr[String] = js.undefined
}

object FileIndexableText {
  @scala.inline
  def apply(text: String = null): FileIndexableText = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileIndexableText]
  }
}

