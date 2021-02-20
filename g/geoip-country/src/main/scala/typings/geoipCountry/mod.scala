package typings.geoipCountry

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geoip-country", "cmp")
  @js.native
  def cmp(a: CmpArgs, b: CmpArgs): Null | Lookup_ = js.native
  
  @JSImport("geoip-country", "lookup")
  @js.native
  def lookup(ip: String): Null | Lookup_ = js.native
  @JSImport("geoip-country", "lookup")
  @js.native
  def lookup(ip: Double): Null | Lookup_ = js.native
  
  @JSImport("geoip-country", "pretty")
  @js.native
  def pretty(ip: String): String = js.native
  @JSImport("geoip-country", "pretty")
  @js.native
  def pretty(ip: js.Array[String | Double]): String = js.native
  @JSImport("geoip-country", "pretty")
  @js.native
  def pretty(ip: Double): String = js.native
  
  @JSImport("geoip-country", "startWatchingDataUpdate")
  @js.native
  def startWatchingDataUpdate(): Unit = js.native
  @JSImport("geoip-country", "startWatchingDataUpdate")
  @js.native
  def startWatchingDataUpdate(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  @JSImport("geoip-country", "stopWatchingDataUpdate")
  @js.native
  def stopWatchingDataUpdate(): Unit = js.native
  
  type CmpArgs = Double | js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.geoipCountry.geoipCountryNumbers.`1`
    - typings.geoipCountry.geoipCountryNumbers.`-1`
    - typings.geoipCountry.geoipCountryNumbers.`0`
    - scala.Null
  */
  type CmpResult = _CmpResult | Null
  
  @js.native
  trait Lookup_ extends StObject {
    
    /** 2 letter ISO-3166-1 country code https://www.iban.com/country-codes */
    var country: String = js.native
    
    /** [ <low bound of IP block>, <high bound of IP block> ] */
    var range: js.Tuple2[Double, Double] = js.native
  }
  object Lookup_ {
    
    @scala.inline
    def apply(country: String, range: js.Tuple2[Double, Double]): Lookup_ = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lookup_]
    }
    
    @scala.inline
    implicit class Lookup_MutableBuilder[Self <: Lookup_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  trait _CmpResult extends StObject
}
