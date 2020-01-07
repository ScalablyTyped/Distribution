package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Country List Response
  */
@js.native
trait Schema$CountriesListResponse extends js.Object {
  /**
    * Country collection.
    */
  var countries: js.UndefOr[js.Array[Schema$Country]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#countriesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$CountriesListResponse {
  @scala.inline
  def apply(countries: js.Array[Schema$Country] = null, kind: String = null): Schema$CountriesListResponse = {
    val __obj = js.Dynamic.literal()
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CountriesListResponse]
  }
}

