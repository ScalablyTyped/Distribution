package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageTargeting extends js.Object {
  var languages: js.UndefOr[js.Array[Language]] = js.undefined
}

object LanguageTargeting {
  @scala.inline
  def apply(languages: js.Array[Language] = null): LanguageTargeting = {
    val __obj = js.Dynamic.literal()
    if (languages != null) __obj.updateDynamic("languages")(languages)
    __obj.asInstanceOf[LanguageTargeting]
  }
}

