package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait City extends js.Object {
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var countryDartId: js.UndefOr[java.lang.String] = js.undefined
  var dartId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var metroCode: js.UndefOr[java.lang.String] = js.undefined
  var metroDmaId: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
  var regionDartId: js.UndefOr[java.lang.String] = js.undefined
}

object City {
  @scala.inline
  def apply(
    countryCode: java.lang.String = null,
    countryDartId: java.lang.String = null,
    dartId: java.lang.String = null,
    kind: java.lang.String = null,
    metroCode: java.lang.String = null,
    metroDmaId: java.lang.String = null,
    name: java.lang.String = null,
    regionCode: java.lang.String = null,
    regionDartId: java.lang.String = null
  ): City = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId)
    if (dartId != null) __obj.updateDynamic("dartId")(dartId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metroCode != null) __obj.updateDynamic("metroCode")(metroCode)
    if (metroDmaId != null) __obj.updateDynamic("metroDmaId")(metroDmaId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode)
    if (regionDartId != null) __obj.updateDynamic("regionDartId")(regionDartId)
    __obj.asInstanceOf[City]
  }
}

