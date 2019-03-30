package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedTarget extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var excludedDestinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var includedDestinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
}

object DatafeedTarget {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    excludedDestinations: js.Array[java.lang.String] = null,
    includedDestinations: js.Array[java.lang.String] = null,
    language: java.lang.String = null
  ): DatafeedTarget = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (excludedDestinations != null) __obj.updateDynamic("excludedDestinations")(excludedDestinations)
    if (includedDestinations != null) __obj.updateDynamic("includedDestinations")(includedDestinations)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[DatafeedTarget]
  }
}

