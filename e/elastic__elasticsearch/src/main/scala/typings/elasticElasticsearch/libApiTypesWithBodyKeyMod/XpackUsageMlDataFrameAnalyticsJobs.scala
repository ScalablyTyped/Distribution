package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlDataFrameAnalyticsJobs extends StObject {
  
  var _all: XpackUsageMlDataFrameAnalyticsJobsCount
  
  var analysis_counts: js.UndefOr[XpackUsageMlDataFrameAnalyticsJobsAnalysis] = js.undefined
  
  var memory_usage: js.UndefOr[XpackUsageMlDataFrameAnalyticsJobsMemory] = js.undefined
  
  var stopped: js.UndefOr[XpackUsageMlDataFrameAnalyticsJobsCount] = js.undefined
}
object XpackUsageMlDataFrameAnalyticsJobs {
  
  inline def apply(_all: XpackUsageMlDataFrameAnalyticsJobsCount): XpackUsageMlDataFrameAnalyticsJobs = {
    val __obj = js.Dynamic.literal(_all = _all.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlDataFrameAnalyticsJobs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlDataFrameAnalyticsJobs] (val x: Self) extends AnyVal {
    
    inline def setAnalysis_counts(value: XpackUsageMlDataFrameAnalyticsJobsAnalysis): Self = StObject.set(x, "analysis_counts", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_countsUndefined: Self = StObject.set(x, "analysis_counts", js.undefined)
    
    inline def setMemory_usage(value: XpackUsageMlDataFrameAnalyticsJobsMemory): Self = StObject.set(x, "memory_usage", value.asInstanceOf[js.Any])
    
    inline def setMemory_usageUndefined: Self = StObject.set(x, "memory_usage", js.undefined)
    
    inline def setStopped(value: XpackUsageMlDataFrameAnalyticsJobsCount): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    inline def setStoppedUndefined: Self = StObject.set(x, "stopped", js.undefined)
    
    inline def set_all(value: XpackUsageMlDataFrameAnalyticsJobsCount): Self = StObject.set(x, "_all", value.asInstanceOf[js.Any])
  }
}
