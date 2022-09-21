package typings.exchangeRatesApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("exchange-rates-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(amount: Double, fromCurrency: String, toCurrency: String, date: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(amount.asInstanceOf[js.Any], fromCurrency.asInstanceOf[js.Any], toCurrency.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def convert(amount: Double, fromCurrency: String, toCurrency: String, date: js.Date): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(amount.asInstanceOf[js.Any], fromCurrency.asInstanceOf[js.Any], toCurrency.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def exchangeRates(): ExchangeRates_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exchangeRates")().asInstanceOf[ExchangeRates_]
  
  /**
    * ExchangeRates
    */
  @js.native
  trait ExchangeRates_ extends StObject {
    
    /**
      * Set the date to get historical rates for that specific day
      */
    def at(date: js.Date): ExchangeRates_ = js.native
    
    /**
      * Return the average value of each exchange rate for the selected time period
      * To select a time period, create a chain with `.from()` and `.to()` before `.avg()`
      */
    def avg(): js.Promise[js.Object | Double] = js.native
    def avg(decimalPlaces: Double): js.Promise[js.Object | Double] = js.native
    
    /**
      * Set the base currency (if not explicitly set, it defaults to 'EUR')
      */
    def base(currency: String): ExchangeRates_ = js.native
    
    /**
      * Fetch the exchange rates from exchangeratesapi.io, parse the response and return it
      */
    def fetch(): js.Promise[js.Object | Double] = js.native
    
    /**
      * Set the date from which to request historical rates
      */
    def from(date: js.Date): ExchangeRates_ = js.native
    
    /**
      * Set the date to get the latest exchange rates
      */
    def latest(): ExchangeRates_ = js.native
    
    /**
      * Set symbols to limit results to specific exchange rate(s)
      */
    def symbols(currencies: String): ExchangeRates_ = js.native
    def symbols(currencies: js.Array[String]): ExchangeRates_ = js.native
    
    /**
      * Set the date to which to request historical rates
      */
    def to(date: js.Date): ExchangeRates_ = js.native
    
    /**
      * The API url to request
      */
    def url: String = js.native
  }
}
