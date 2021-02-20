package typings.geoipLite

import typings.geoipLite.geoipLiteStrings.`0`
import typings.geoipLite.geoipLiteStrings.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geoip-lite", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("geoip-lite", "cmp")
  @js.native
  def cmp(a: CmpArgs, b: CmpArgs): Null | Lookup_ = js.native
  
  @JSImport("geoip-lite", "lookup")
  @js.native
  def lookup(ip: String): Null | Lookup_ = js.native
  @JSImport("geoip-lite", "lookup")
  @js.native
  def lookup(ip: Double): Null | Lookup_ = js.native
  
  @JSImport("geoip-lite", "pretty")
  @js.native
  def pretty(ip: String): String = js.native
  @JSImport("geoip-lite", "pretty")
  @js.native
  def pretty(ip: js.Array[String | Double]): String = js.native
  @JSImport("geoip-lite", "pretty")
  @js.native
  def pretty(ip: Double): String = js.native
  
  @JSImport("geoip-lite", "reloadData")
  @js.native
  def reloadData(): Unit = js.native
  @JSImport("geoip-lite", "reloadData")
  @js.native
  def reloadData(cb: AsyncCallback): Unit = js.native
  
  @JSImport("geoip-lite", "reloadDataSync")
  @js.native
  def reloadDataSync(): Unit = js.native
  
  @JSImport("geoip-lite", "startWatchingDataUpdate")
  @js.native
  def startWatchingDataUpdate(): Unit = js.native
  @JSImport("geoip-lite", "startWatchingDataUpdate")
  @js.native
  def startWatchingDataUpdate(cb: AsyncCallback): Unit = js.native
  
  @JSImport("geoip-lite", "stopWatchingDataUpdate")
  @js.native
  def stopWatchingDataUpdate(): Unit = js.native
  @JSImport("geoip-lite", "stopWatchingDataUpdate")
  @js.native
  def stopWatchingDataUpdate(cb: AsyncCallback): Unit = js.native
  
  type AsyncCallback = js.Function1[/* err */ js.UndefOr[Error], Unit]
  
  type CmpArgs = Double | js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.geoipLite.geoipLiteNumbers.`1`
    - typings.geoipLite.geoipLiteNumbers.`-1`
    - typings.geoipLite.geoipLiteNumbers.`0`
    - scala.Null
  */
  type CmpResult = _CmpResult | Null
  
  @js.native
  trait Lookup_ extends StObject {
    
    /** The approximate accuracy radius (km), around the latitude and longitude */
    var area: Double = js.native
    
    /** This is the full city name */
    var city: String = js.native
    
    /** 2 letter ISO-3166-1 country code https://www.iban.com/country-codes */
    var country: String = js.native
    
    /** 1 if the country is a member state of the European Union, 0 otherwise. */
    var eu: `1` | `0` = js.native
    
    /** The latitude and longitude of the city */
    var ll: js.Tuple2[Double, Double] = js.native
    
    /** Metro code */
    var metro: Double = js.native
    
    /** [ <low bound of IP block>, <high bound of IP block> ] */
    var range: js.Tuple2[Double, Double] = js.native
    
    /**
      * Up to 3 alphanumeric variable length characters as ISO 3166-2 code
      * For US states this is the 2 letter state
      * For the United Kingdom this could be ENG as a country like “England
      * FIPS 10-4 subcountry code
      */
    var region: String = js.native
    
    /** "Country/Zone" Timezone from IANA Time Zone Database */
    var timezone: String = js.native
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
    
    @scala.inline
    implicit class Lookup_MutableBuilder[Self <: Lookup_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEu(value: `1` | `0`): Self = StObject.set(x, "eu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLl(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "ll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetro(value: Double): Self = StObject.set(x, "metro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
  
  trait _CmpResult extends StObject
}
