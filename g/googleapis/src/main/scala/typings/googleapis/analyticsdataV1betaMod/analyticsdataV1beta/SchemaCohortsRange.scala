package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCohortsRange extends StObject {
  
  /**
    * Required. `endOffset` specifies the end date of the extended reporting date range for a cohort report. `endOffset` can be any positive integer but is commonly set to 5 to 10 so that reports contain data on the cohort for the next several granularity time periods. If `granularity` is `DAILY`, the `endDate` of the extended reporting date range is `endDate` of the cohort plus `endOffset` days. If `granularity` is `WEEKLY`, the `endDate` of the extended reporting date range is `endDate` of the cohort plus `endOffset * 7` days. If `granularity` is `MONTHLY`, the `endDate` of the extended reporting date range is `endDate` of the cohort plus `endOffset * 30` days.
    */
  var endOffset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The granularity used to interpret the `startOffset` and `endOffset` for the extended reporting date range for a cohort report.
    */
  var granularity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * `startOffset` specifies the start date of the extended reporting date range for a cohort report. `startOffset` is commonly set to 0 so that reports contain data from the acquisition of the cohort forward. If `granularity` is `DAILY`, the `startDate` of the extended reporting date range is `startDate` of the cohort plus `startOffset` days. If `granularity` is `WEEKLY`, the `startDate` of the extended reporting date range is `startDate` of the cohort plus `startOffset * 7` days. If `granularity` is `MONTHLY`, the `startDate` of the extended reporting date range is `startDate` of the cohort plus `startOffset * 30` days.
    */
  var startOffset: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCohortsRange {
  
  inline def apply(): SchemaCohortsRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCohortsRange]
  }
  
  extension [Self <: SchemaCohortsRange](x: Self) {
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetNull: Self = StObject.set(x, "endOffset", null)
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setGranularity(value: String): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityNull: Self = StObject.set(x, "granularity", null)
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetNull: Self = StObject.set(x, "startOffset", null)
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
  }
}
