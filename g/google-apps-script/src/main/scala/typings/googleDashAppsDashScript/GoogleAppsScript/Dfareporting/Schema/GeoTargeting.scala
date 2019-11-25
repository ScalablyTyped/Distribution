package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoTargeting extends js.Object {
  var cities: js.UndefOr[js.Array[City]] = js.undefined
  var countries: js.UndefOr[js.Array[Country]] = js.undefined
  var excludeCountries: js.UndefOr[Boolean] = js.undefined
  var metros: js.UndefOr[js.Array[Metro]] = js.undefined
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.undefined
  var regions: js.UndefOr[js.Array[Region]] = js.undefined
}

object GeoTargeting {
  @scala.inline
  def apply(
    cities: js.Array[City] = null,
    countries: js.Array[Country] = null,
    excludeCountries: js.UndefOr[Boolean] = js.undefined,
    metros: js.Array[Metro] = null,
    postalCodes: js.Array[PostalCode] = null,
    regions: js.Array[Region] = null
  ): GeoTargeting = {
    val __obj = js.Dynamic.literal()
    if (cities != null) __obj.updateDynamic("cities")(cities.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeCountries)) __obj.updateDynamic("excludeCountries")(excludeCountries.asInstanceOf[js.Any])
    if (metros != null) __obj.updateDynamic("metros")(metros.asInstanceOf[js.Any])
    if (postalCodes != null) __obj.updateDynamic("postalCodes")(postalCodes.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoTargeting]
  }
}

