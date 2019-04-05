package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metro extends js.Object {
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var countryDartId: js.UndefOr[java.lang.String] = js.undefined
  var dartId: js.UndefOr[java.lang.String] = js.undefined
  var dmaId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var metroCode: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Metro {
  @scala.inline
  def apply(
    countryCode: java.lang.String = null,
    countryDartId: java.lang.String = null,
    dartId: java.lang.String = null,
    dmaId: java.lang.String = null,
    kind: java.lang.String = null,
    metroCode: java.lang.String = null,
    name: java.lang.String = null
  ): Metro = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId)
    if (dartId != null) __obj.updateDynamic("dartId")(dartId)
    if (dmaId != null) __obj.updateDynamic("dmaId")(dmaId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metroCode != null) __obj.updateDynamic("metroCode")(metroCode)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Metro]
  }
}

