package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageTag extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object LanguageTag {
  @scala.inline
  def apply(value: String = null): LanguageTag = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LanguageTag]
  }
}

