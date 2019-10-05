package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metro extends js.Object {
  var countryCode: js.UndefOr[String] = js.undefined
  var countryDartId: js.UndefOr[String] = js.undefined
  var dartId: js.UndefOr[String] = js.undefined
  var dmaId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var metroCode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Metro {
  @scala.inline
  def apply(
    countryCode: String = null,
    countryDartId: String = null,
    dartId: String = null,
    dmaId: String = null,
    kind: String = null,
    metroCode: String = null,
    name: String = null
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

