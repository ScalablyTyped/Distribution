package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlDataFrameAnalyticsJobsMemory extends StObject {
  
  var peak_usage_bytes: MlJobStatistics
}
object XpackUsageMlDataFrameAnalyticsJobsMemory {
  
  inline def apply(peak_usage_bytes: MlJobStatistics): XpackUsageMlDataFrameAnalyticsJobsMemory = {
    val __obj = js.Dynamic.literal(peak_usage_bytes = peak_usage_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlDataFrameAnalyticsJobsMemory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlDataFrameAnalyticsJobsMemory] (val x: Self) extends AnyVal {
    
    inline def setPeak_usage_bytes(value: MlJobStatistics): Self = StObject.set(x, "peak_usage_bytes", value.asInstanceOf[js.Any])
  }
}
