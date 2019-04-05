package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarrier extends js.Object {
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var countryDartId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object MobileCarrier {
  @scala.inline
  def apply(
    countryCode: java.lang.String = null,
    countryDartId: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null
  ): MobileCarrier = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MobileCarrier]
  }
}

