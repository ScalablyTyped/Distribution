package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesListResponse extends js.Object {
  var countries: js.UndefOr[js.Array[Country]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object CountriesListResponse {
  @scala.inline
  def apply(countries: js.Array[Country] = null, kind: java.lang.String = null): CountriesListResponse = {
    val __obj = js.Dynamic.literal()
    if (countries != null) __obj.updateDynamic("countries")(countries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CountriesListResponse]
  }
}

