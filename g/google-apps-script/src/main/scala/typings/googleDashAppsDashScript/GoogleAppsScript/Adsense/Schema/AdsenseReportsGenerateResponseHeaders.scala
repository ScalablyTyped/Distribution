package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsenseReportsGenerateResponseHeaders extends js.Object {
  var currency: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AdsenseReportsGenerateResponseHeaders {
  @scala.inline
  def apply(currency: String = null, name: String = null, `type`: String = null): AdsenseReportsGenerateResponseHeaders = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AdsenseReportsGenerateResponseHeaders]
  }
}

