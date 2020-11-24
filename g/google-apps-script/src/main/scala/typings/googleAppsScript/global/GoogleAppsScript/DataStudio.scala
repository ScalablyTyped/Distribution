package typings.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Data_Studio")
@js.native
object DataStudio extends js.Object {
  
  /**
    * An enum that defines the aggregation types that can be set for a Field.
    */
  @js.native
  object AggregationType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType with Double] = js.native
    
    /* 6 */ val AUTO: typings.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType.AUTO with Double = js.native
    
    /* 0 */ val AVG: typings.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType.AVG with Double = js.native
    
    /* 1 */ val COUNT: typings.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType.COUNT with Double = js.native
    
    /* 2 */ val COUNT_DISTINCT: typings.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType.COUNT_DISTINCT with Double = js.native
    
    /* 3 */ val MAX: typings.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType.MAX with Double = js.native
    
    /* 4 */ val MIN: typings.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType.MIN with Double = js.native
    
    /* 7 */ val NO_AGGREGATION: typings.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType.NO_AGGREGATION with Double = js.native
    
    /* 5 */ val SUM: typings.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType.SUM with Double = js.native
  }
  
  /**
    * An enum that defines the authentication types that can be set for a connector.
    */
  @js.native
  object AuthType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.DataStudio.AuthType with Double] = js.native
    
    /* 3 */ val KEY: typings.googleAppsScript.GoogleAppsScript.DataStudio.AuthType.KEY with Double = js.native
    
    /* 0 */ val NONE: typings.googleAppsScript.GoogleAppsScript.DataStudio.AuthType.NONE with Double = js.native
    
    /* 1 */ val OAUTH2: typings.googleAppsScript.GoogleAppsScript.DataStudio.AuthType.OAUTH2 with Double = js.native
    
    /* 2 */ val USER_PASS: typings.googleAppsScript.GoogleAppsScript.DataStudio.AuthType.USER_PASS with Double = js.native
    
    /* 4 */ val USER_TOKEN: typings.googleAppsScript.GoogleAppsScript.DataStudio.AuthType.USER_TOKEN with Double = js.native
  }
  
  /**
    * An enum that defines the BigQuery parameter types that you can set.
    */
  @js.native
  object BigQueryParameterType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleAppsScript.GoogleAppsScript.DataStudio.BigQueryParameterType with Double
      ] = js.native
    
    /* 2 */ val BOOL: typings.googleAppsScript.GoogleAppsScript.DataStudio.BigQueryParameterType.BOOL with Double = js.native
    
    /* 3 */ val FLOAT64: typings.googleAppsScript.GoogleAppsScript.DataStudio.BigQueryParameterType.FLOAT64 with Double = js.native
    
    /* 1 */ val INT64: typings.googleAppsScript.GoogleAppsScript.DataStudio.BigQueryParameterType.INT64 with Double = js.native
    
    /* 0 */ val STRING: typings.googleAppsScript.GoogleAppsScript.DataStudio.BigQueryParameterType.STRING with Double = js.native
  }
  
  /**
    * An enum that defines the types that can be set for a Field.
    */
  @js.native
  object FieldType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType with Double] = js.native
    
    /* 32 */ val BOOLEAN: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.BOOLEAN with Double = js.native
    
    /* 24 */ val CITY: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CITY with Double = js.native
    
    /* 25 */ val CITY_CODE: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CITY_CODE with Double = js.native
    
    /* 18 */ val CONTINENT: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CONTINENT with Double = js.native
    
    /* 19 */ val CONTINENT_CODE: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CONTINENT_CODE with Double = js.native
    
    /* 16 */ val COUNTRY: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.COUNTRY with Double = js.native
    
    /* 17 */ val COUNTRY_CODE: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.COUNTRY_CODE with Double = js.native
    
    /* 37 */ val CURRENCY_AED: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_AED with Double = js.native
    
    /* 38 */ val CURRENCY_ALL: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_ALL with Double = js.native
    
    /* 39 */ val CURRENCY_ARS: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_ARS with Double = js.native
    
    /* 40 */ val CURRENCY_AUD: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_AUD with Double = js.native
    
    /* 41 */ val CURRENCY_BDT: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_BDT with Double = js.native
    
    /* 42 */ val CURRENCY_BGN: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_BGN with Double = js.native
    
    /* 43 */ val CURRENCY_BOB: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_BOB with Double = js.native
    
    /* 44 */ val CURRENCY_BRL: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_BRL with Double = js.native
    
    /* 45 */ val CURRENCY_CAD: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_CAD with Double = js.native
    
    /* 46 */ val CURRENCY_CDF: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_CDF with Double = js.native
    
    /* 47 */ val CURRENCY_CHF: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_CHF with Double = js.native
    
    /* 48 */ val CURRENCY_CLP: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_CLP with Double = js.native
    
    /* 49 */ val CURRENCY_CNY: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_CNY with Double = js.native
    
    /* 50 */ val CURRENCY_COP: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_COP with Double = js.native
    
    /* 51 */ val CURRENCY_CRC: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_CRC with Double = js.native
    
    /* 52 */ val CURRENCY_CZK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_CZK with Double = js.native
    
    /* 53 */ val CURRENCY_DKK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_DKK with Double = js.native
    
    /* 54 */ val CURRENCY_DOP: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_DOP with Double = js.native
    
    /* 55 */ val CURRENCY_EGP: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_EGP with Double = js.native
    
    /* 56 */ val CURRENCY_ETB: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_ETB with Double = js.native
    
    /* 57 */ val CURRENCY_EUR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_EUR with Double = js.native
    
    /* 58 */ val CURRENCY_GBP: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_GBP with Double = js.native
    
    /* 59 */ val CURRENCY_HKD: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_HKD with Double = js.native
    
    /* 60 */ val CURRENCY_HRK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_HRK with Double = js.native
    
    /* 61 */ val CURRENCY_HUF: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_HUF with Double = js.native
    
    /* 62 */ val CURRENCY_IDR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_IDR with Double = js.native
    
    /* 63 */ val CURRENCY_ILS: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_ILS with Double = js.native
    
    /* 64 */ val CURRENCY_INR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_INR with Double = js.native
    
    /* 65 */ val CURRENCY_IRR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_IRR with Double = js.native
    
    /* 66 */ val CURRENCY_ISK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_ISK with Double = js.native
    
    /* 67 */ val CURRENCY_JMD: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_JMD with Double = js.native
    
    /* 68 */ val CURRENCY_JPY: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_JPY with Double = js.native
    
    /* 69 */ val CURRENCY_KRW: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_KRW with Double = js.native
    
    /* 70 */ val CURRENCY_LKR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_LKR with Double = js.native
    
    /* 71 */ val CURRENCY_LTL: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_LTL with Double = js.native
    
    /* 72 */ val CURRENCY_MNT: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_MNT with Double = js.native
    
    /* 73 */ val CURRENCY_MVR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_MVR with Double = js.native
    
    /* 74 */ val CURRENCY_MXN: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_MXN with Double = js.native
    
    /* 75 */ val CURRENCY_MYR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_MYR with Double = js.native
    
    /* 76 */ val CURRENCY_NOK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_NOK with Double = js.native
    
    /* 77 */ val CURRENCY_NZD: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_NZD with Double = js.native
    
    /* 78 */ val CURRENCY_PAB: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_PAB with Double = js.native
    
    /* 79 */ val CURRENCY_PEN: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_PEN with Double = js.native
    
    /* 80 */ val CURRENCY_PHP: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_PHP with Double = js.native
    
    /* 81 */ val CURRENCY_PKR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_PKR with Double = js.native
    
    /* 82 */ val CURRENCY_PLN: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_PLN with Double = js.native
    
    /* 83 */ val CURRENCY_RON: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_RON with Double = js.native
    
    /* 84 */ val CURRENCY_RSD: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_RSD with Double = js.native
    
    /* 85 */ val CURRENCY_RUB: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_RUB with Double = js.native
    
    /* 86 */ val CURRENCY_SAR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_SAR with Double = js.native
    
    /* 87 */ val CURRENCY_SEK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_SEK with Double = js.native
    
    /* 88 */ val CURRENCY_SGD: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_SGD with Double = js.native
    
    /* 89 */ val CURRENCY_THB: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_THB with Double = js.native
    
    /* 90 */ val CURRENCY_TRY: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_TRY with Double = js.native
    
    /* 91 */ val CURRENCY_TWD: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_TWD with Double = js.native
    
    /* 92 */ val CURRENCY_TZS: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_TZS with Double = js.native
    
    /* 93 */ val CURRENCY_UAH: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_UAH with Double = js.native
    
    /* 94 */ val CURRENCY_USD: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_USD with Double = js.native
    
    /* 95 */ val CURRENCY_UYU: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_UYU with Double = js.native
    
    /* 96 */ val CURRENCY_VEF: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_VEF with Double = js.native
    
    /* 97 */ val CURRENCY_VND: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_VND with Double = js.native
    
    /* 98 */ val CURRENCY_YER: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_YER with Double = js.native
    
    /* 99 */ val CURRENCY_ZAR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.CURRENCY_ZAR with Double = js.native
    
    /* 12 */ val DAY: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.DAY with Double = js.native
    
    /* 11 */ val DAY_OF_WEEK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.DAY_OF_WEEK with Double = js.native
    
    /* 15 */ val DURATION: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.DURATION with Double = js.native
    
    /* 13 */ val HOUR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.HOUR with Double = js.native
    
    /* 34 */ val HYPERLINK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.HYPERLINK with Double = js.native
    
    /* 35 */ val IMAGE: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.IMAGE with Double = js.native
    
    /* 36 */ val IMAGE_LINK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.IMAGE_LINK with Double = js.native
    
    /* 28 */ val LATITUDE_LONGITUDE: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.LATITUDE_LONGITUDE with Double = js.native
    
    /* 26 */ val METRO: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.METRO with Double = js.native
    
    /* 27 */ val METRO_CODE: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.METRO_CODE with Double = js.native
    
    /* 14 */ val MINUTE: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.MINUTE with Double = js.native
    
    /* 8 */ val MONTH: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.MONTH with Double = js.native
    
    /* 10 */ val MONTH_DAY: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.MONTH_DAY with Double = js.native
    
    /* 29 */ val NUMBER: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.NUMBER with Double = js.native
    
    /* 30 */ val PERCENT: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.PERCENT with Double = js.native
    
    /* 7 */ val QUARTER: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.QUARTER with Double = js.native
    
    /* 22 */ val REGION: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.REGION with Double = js.native
    
    /* 23 */ val REGION_CODE: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.REGION_CODE with Double = js.native
    
    /* 20 */ val SUB_CONTINENT: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.SUB_CONTINENT with Double = js.native
    
    /* 21 */ val SUB_CONTINENT_CODE: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.SUB_CONTINENT_CODE with Double = js.native
    
    /* 31 */ val TEXT: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.TEXT with Double = js.native
    
    /* 33 */ val URL: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.URL with Double = js.native
    
    /* 9 */ val WEEK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.WEEK with Double = js.native
    
    /* 0 */ val YEAR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.YEAR with Double = js.native
    
    /* 2 */ val YEAR_MONTH: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.YEAR_MONTH with Double = js.native
    
    /* 4 */ val YEAR_MONTH_DAY: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.YEAR_MONTH_DAY with Double = js.native
    
    /* 5 */ val YEAR_MONTH_DAY_HOUR: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.YEAR_MONTH_DAY_HOUR with Double = js.native
    
    /* 6 */ val YEAR_MONTH_DAY_SECOND: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.YEAR_MONTH_DAY_SECOND with Double = js.native
    
    /* 1 */ val YEAR_QUARTER: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.YEAR_QUARTER with Double = js.native
    
    /* 3 */ val YEAR_WEEK: typings.googleAppsScript.GoogleAppsScript.DataStudio.FieldType.YEAR_WEEK with Double = js.native
  }
}
