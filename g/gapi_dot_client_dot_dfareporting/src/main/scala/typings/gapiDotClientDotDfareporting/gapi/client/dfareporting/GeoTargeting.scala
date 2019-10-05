package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoTargeting extends js.Object {
  /**
    * Cities to be targeted. For each city only dartId is required. The other fields are populated automatically when the ad is inserted or updated. If
    * targeting a city, do not target or exclude the country of the city, and do not target the metro or region of the city.
    */
  var cities: js.UndefOr[js.Array[City]] = js.undefined
  /**
    * Countries to be targeted or excluded from targeting, depending on the setting of the excludeCountries field. For each country only dartId is required.
    * The other fields are populated automatically when the ad is inserted or updated. If targeting or excluding a country, do not target regions, cities,
    * metros, or postal codes in the same country.
    */
  var countries: js.UndefOr[js.Array[Country]] = js.undefined
  /**
    * Whether or not to exclude the countries in the countries field from targeting. If false, the countries field refers to countries which will be targeted
    * by the ad.
    */
  var excludeCountries: js.UndefOr[Boolean] = js.undefined
  /**
    * Metros to be targeted. For each metro only dmaId is required. The other fields are populated automatically when the ad is inserted or updated. If
    * targeting a metro, do not target or exclude the country of the metro.
    */
  var metros: js.UndefOr[js.Array[Metro]] = js.undefined
  /**
    * Postal codes to be targeted. For each postal code only id is required. The other fields are populated automatically when the ad is inserted or updated.
    * If targeting a postal code, do not target or exclude the country of the postal code.
    */
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.undefined
  /**
    * Regions to be targeted. For each region only dartId is required. The other fields are populated automatically when the ad is inserted or updated. If
    * targeting a region, do not target or exclude the country of the region.
    */
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
    if (cities != null) __obj.updateDynamic("cities")(cities)
    if (countries != null) __obj.updateDynamic("countries")(countries)
    if (!js.isUndefined(excludeCountries)) __obj.updateDynamic("excludeCountries")(excludeCountries)
    if (metros != null) __obj.updateDynamic("metros")(metros)
    if (postalCodes != null) __obj.updateDynamic("postalCodes")(postalCodes)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[GeoTargeting]
  }
}

