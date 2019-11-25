package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedString extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object LocalizedString {
  @scala.inline
  def apply(language: String = null, value: String = null): LocalizedString = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedString]
  }
}

