package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CitiesListResponse extends js.Object {
  /** City collection. */
  var cities: js.UndefOr[js.Array[City]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#citiesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object CitiesListResponse {
  @scala.inline
  def apply(cities: js.Array[City] = null, kind: java.lang.String = null): CitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (cities != null) __obj.updateDynamic("cities")(cities)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CitiesListResponse]
  }
}

