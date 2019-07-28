package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCode extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var countryDartId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object PostalCode {
  @scala.inline
  def apply(
    code: String = null,
    countryCode: String = null,
    countryDartId: String = null,
    id: String = null,
    kind: String = null
  ): PostalCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[PostalCode]
  }
}

