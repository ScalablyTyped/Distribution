package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait City extends js.Object {
  var countryCode: js.UndefOr[String] = js.undefined
  var countryDartId: js.UndefOr[String] = js.undefined
  var dartId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var metroCode: js.UndefOr[String] = js.undefined
  var metroDmaId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var regionCode: js.UndefOr[String] = js.undefined
  var regionDartId: js.UndefOr[String] = js.undefined
}

object City {
  @scala.inline
  def apply(
    countryCode: String = null,
    countryDartId: String = null,
    dartId: String = null,
    kind: String = null,
    metroCode: String = null,
    metroDmaId: String = null,
    name: String = null,
    regionCode: String = null,
    regionDartId: String = null
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

