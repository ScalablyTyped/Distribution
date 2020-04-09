package typings.geoipLite.mod

import typings.geoipLite.geoipLiteStrings.`0`
import typings.geoipLite.geoipLiteStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup_ extends js.Object {
  /** The approximate accuracy radius (km), around the latitude and longitude */
  var area: Double
  /** This is the full city name */
  var city: String
  /** 2 letter ISO-3166-1 country code https://www.iban.com/country-codes */
  var country: String
  /** 1 if the country is a member state of the European Union, 0 otherwise. */
  var eu: `1` | `0`
  /** The latitude and longitude of the city */
  var ll: js.Tuple2[Double, Double]
  /** Metro code */
  var metro: Double
  /** [ <low bound of IP block>, <high bound of IP block> ] */
  var range: js.Tuple2[Double, Double]
  /**
    * Up to 3 alphanumeric variable length characters as ISO 3166-2 code
    * For US states this is the 2 letter state
    * For the United Kingdom this could be ENG as a country like “England
    * FIPS 10-4 subcountry code
    */
  var region: String
  /** "Country/Zone" Timezone from IANA Time Zone Database */
  var timezone: String
}

object Lookup_ {
  @scala.inline
  def apply(
    area: Double,
    city: String,
    country: String,
    eu: `1` | `0`,
    ll: js.Tuple2[Double, Double],
    metro: Double,
    range: js.Tuple2[Double, Double],
    region: String,
    timezone: String
  ): Lookup_ = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], eu = eu.asInstanceOf[js.Any], ll = ll.asInstanceOf[js.Any], metro = metro.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Lookup_]
  }
}

