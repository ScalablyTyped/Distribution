package typings.geoipCountry

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geoip-country", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  def startWatchingDataUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startWatchingDataUpdate")().asInstanceOf[Unit]
  @scala.inline
  def startWatchingDataUpdate(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startWatchingDataUpdate")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def stopWatchingDataUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopWatchingDataUpdate")().asInstanceOf[Unit]
  
  type CmpArgs = Double | js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.geoipCountry.geoipCountryNumbers.`1`
    - typings.geoipCountry.geoipCountryNumbers.`-1`
    - typings.geoipCountry.geoipCountryNumbers.`0`
    - scala.Null
  */
  type CmpResult = _CmpResult | Null
  
  trait Lookup_ extends StObject {
    
    /** 2 letter ISO-3166-1 country code https://www.iban.com/country-codes */
    var country: String
    
    /** [ <low bound of IP block>, <high bound of IP block> ] */
    var range: js.Tuple2[Double, Double]
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
