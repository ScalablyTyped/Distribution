package typings.geoipLite

import typings.geoipLite.geoipLiteStrings.`0`
import typings.geoipLite.geoipLiteStrings.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geoip-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  @scala.inline
  def cmp(a: CmpArgs, b: CmpArgs): Null | Lookup_ = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Null | Lookup_]
  
  @scala.inline
  def lookup(ip: String): Null | Lookup_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(ip.asInstanceOf[js.Any]).asInstanceOf[Null | Lookup_]
  @scala.inline
  def lookup(ip: Double): Null | Lookup_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(ip.asInstanceOf[js.Any]).asInstanceOf[Null | Lookup_]
  
  @scala.inline
  def pretty(ip: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pretty")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def pretty(ip: js.Array[String | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pretty")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def pretty(ip: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pretty")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def reloadData(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadData")().asInstanceOf[Unit]
  @scala.inline
  def reloadData(cb: AsyncCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadData")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def reloadDataSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadDataSync")().asInstanceOf[Unit]
  
  @scala.inline
  def startWatchingDataUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startWatchingDataUpdate")().asInstanceOf[Unit]
  @scala.inline
  def startWatchingDataUpdate(cb: AsyncCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startWatchingDataUpdate")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def stopWatchingDataUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopWatchingDataUpdate")().asInstanceOf[Unit]
  @scala.inline
  def stopWatchingDataUpdate(cb: AsyncCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopWatchingDataUpdate")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AsyncCallback = js.Function1[/* err */ js.UndefOr[Error], Unit]
  
  type CmpArgs = Double | js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.geoipLite.geoipLiteNumbers.`1`
    - typings.geoipLite.geoipLiteNumbers.`-1`
    - typings.geoipLite.geoipLiteNumbers.`0`
    - scala.Null
  */
  type CmpResult = _CmpResult | Null
  
  trait Lookup_ extends StObject {
    
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
