package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

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
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId.asInstanceOf[js.Any])
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (dmaId != null) __obj.updateDynamic("dmaId")(dmaId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metroCode != null) __obj.updateDynamic("metroCode")(metroCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metro]
  }
}

