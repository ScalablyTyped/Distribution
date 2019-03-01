package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesListResponse extends js.Object {
  /** Country collection. */
  var countries: js.UndefOr[js.Array[Country]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#countriesListResponse". */
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

