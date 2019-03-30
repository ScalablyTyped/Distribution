package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedString extends js.Object {
  var language: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object LocalizedString {
  @scala.inline
  def apply(language: java.lang.String = null, value: java.lang.String = null): LocalizedString = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LocalizedString]
  }
}

