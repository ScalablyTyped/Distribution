package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

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
  var excludeCountries: js.UndefOr[scala.Boolean] = js.undefined
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

