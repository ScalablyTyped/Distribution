package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsenseReportsGenerateResponseHeaders extends js.Object {
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AdsenseReportsGenerateResponseHeaders {
  @scala.inline
  def apply(currency: java.lang.String = null, name: java.lang.String = null, `type`: java.lang.String = null): AdsenseReportsGenerateResponseHeaders = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AdsenseReportsGenerateResponseHeaders]
  }
}

