package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Language {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    kind: java.lang.String = null,
    languageCode: java.lang.String = null,
    name: java.lang.String = null
  ): Language = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Language]
  }
}

