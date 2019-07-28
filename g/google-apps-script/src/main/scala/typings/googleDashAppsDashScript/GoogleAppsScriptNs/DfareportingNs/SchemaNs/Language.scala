package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var languageCode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Language {
  @scala.inline
  def apply(id: String = null, kind: String = null, languageCode: String = null, name: String = null): Language = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Language]
  }
}

