package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCode extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var countryDartId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object PostalCode {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    countryCode: java.lang.String = null,
    countryDartId: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null
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

