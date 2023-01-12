package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The following optional arguments are supported: */
trait ReportOptionalArguments extends StObject {
  
  /**
    * For AWQL queries, the AdWords API version to query.
    * Sunsetted versions are not allowed.
    * For GAQL queries, the Google Ads API version to query.
    * Sunsetted versions for GAQL queries are also not allowed.
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to include entities that had zero impressions in the report.
    * This field is not allowed when the query uses GAQL. See here for details on how GAQL handles zero impressions.
    * Defaults to `true` for AWQL queries.
    */
  var includeZeroImpressions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to convert Geo CriteriaIds (e.g. CountryCriteriaId and CityCriteriaId) into names (e.g. 'United States' and 'San Francisco').
    * Set to true if you want names. Set to `false` if you want numerical IDs. Defaults to `true`.
    */
  var resolveGeoNames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to represent money in micros ('1370000') or in currency ('1.37').
    * This field is not allowed when the query uses GAQL.
    * In that case, all money values are represented in micros.
    * Defaults to `false` for AWQL queries.
    */
  var returnMoneyInMicros: js.UndefOr[Boolean] = js.undefined
}
object ReportOptionalArguments {
  
  inline def apply(): ReportOptionalArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOptionalArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportOptionalArguments] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setIncludeZeroImpressions(value: Boolean): Self = StObject.set(x, "includeZeroImpressions", value.asInstanceOf[js.Any])
    
    inline def setIncludeZeroImpressionsUndefined: Self = StObject.set(x, "includeZeroImpressions", js.undefined)
    
    inline def setResolveGeoNames(value: Boolean): Self = StObject.set(x, "resolveGeoNames", value.asInstanceOf[js.Any])
    
    inline def setResolveGeoNamesUndefined: Self = StObject.set(x, "resolveGeoNames", js.undefined)
    
    inline def setReturnMoneyInMicros(value: Boolean): Self = StObject.set(x, "returnMoneyInMicros", value.asInstanceOf[js.Any])
    
    inline def setReturnMoneyInMicrosUndefined: Self = StObject.set(x, "returnMoneyInMicros", js.undefined)
  }
}
