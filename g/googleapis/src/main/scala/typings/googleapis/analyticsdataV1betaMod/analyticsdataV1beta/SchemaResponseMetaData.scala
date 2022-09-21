package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponseMetaData extends StObject {
  
  /**
    * The currency code used in this report. Intended to be used in formatting currency metrics like `purchaseRevenue` for visualization. If currency_code was specified in the request, this response parameter will echo the request parameter; otherwise, this response parameter is the property's current currency_code. Currency codes are string encodings of currency types from the ISO 4217 standard (https://en.wikipedia.org/wiki/ISO_4217); for example "USD", "EUR", "JPY". To learn more, see https://support.google.com/analytics/answer/9796179.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, indicates some buckets of dimension combinations are rolled into "(other)" row. This can happen for high cardinality reports.
    */
  var dataLossFromOtherRow: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If empty reason is specified, the report is empty for this reason.
    */
  var emptyReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes the schema restrictions actively enforced in creating this report. To learn more, see [Access and data-restriction management](https://support.google.com/analytics/answer/10851388).
    */
  var schemaRestrictionResponse: js.UndefOr[SchemaSchemaRestrictionResponse] = js.undefined
  
  /**
    * If `subjectToThresholding` is true, this report is subject to thresholding and only returns data that meets the minimum aggregation thresholds. It is possible for a request to be subject to thresholding thresholding and no data is absent from the report, and this happens when all data is above the thresholds. To learn more, see [Data thresholds](https://support.google.com/analytics/answer/9383630) and [About Demographics and Interests](https://support.google.com/analytics/answer/2799357).
    */
  var subjectToThresholding: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The property's current timezone. Intended to be used to interpret time-based dimensions like `hour` and `minute`. Formatted as strings from the IANA Time Zone database (https://www.iana.org/time-zones); for example "America/New_York" or "Asia/Tokyo".
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaResponseMetaData {
  
  inline def apply(): SchemaResponseMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseMetaData]
  }
  
  extension [Self <: SchemaResponseMetaData](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDataLossFromOtherRow(value: Boolean): Self = StObject.set(x, "dataLossFromOtherRow", value.asInstanceOf[js.Any])
    
    inline def setDataLossFromOtherRowNull: Self = StObject.set(x, "dataLossFromOtherRow", null)
    
    inline def setDataLossFromOtherRowUndefined: Self = StObject.set(x, "dataLossFromOtherRow", js.undefined)
    
    inline def setEmptyReason(value: String): Self = StObject.set(x, "emptyReason", value.asInstanceOf[js.Any])
    
    inline def setEmptyReasonNull: Self = StObject.set(x, "emptyReason", null)
    
    inline def setEmptyReasonUndefined: Self = StObject.set(x, "emptyReason", js.undefined)
    
    inline def setSchemaRestrictionResponse(value: SchemaSchemaRestrictionResponse): Self = StObject.set(x, "schemaRestrictionResponse", value.asInstanceOf[js.Any])
    
    inline def setSchemaRestrictionResponseUndefined: Self = StObject.set(x, "schemaRestrictionResponse", js.undefined)
    
    inline def setSubjectToThresholding(value: Boolean): Self = StObject.set(x, "subjectToThresholding", value.asInstanceOf[js.Any])
    
    inline def setSubjectToThresholdingNull: Self = StObject.set(x, "subjectToThresholding", null)
    
    inline def setSubjectToThresholdingUndefined: Self = StObject.set(x, "subjectToThresholding", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
