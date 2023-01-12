package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMachineLearning
  extends StObject
     with XpackUsageBase {
  
  var data_frame_analytics_jobs: XpackUsageMlDataFrameAnalyticsJobs
  
  var datafeeds: Record[String, XpackUsageDatafeed]
  
  var inference: XpackUsageMlInference
  
  var jobs: Record[String, XpackUsageJobUsage]
  
  var node_count: integer
}
object XpackUsageMachineLearning {
  
  inline def apply(
    available: Boolean,
    data_frame_analytics_jobs: XpackUsageMlDataFrameAnalyticsJobs,
    datafeeds: Record[String, XpackUsageDatafeed],
    enabled: Boolean,
    inference: XpackUsageMlInference,
    jobs: Record[String, XpackUsageJobUsage],
    node_count: integer
  ): XpackUsageMachineLearning = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], data_frame_analytics_jobs = data_frame_analytics_jobs.asInstanceOf[js.Any], datafeeds = datafeeds.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], inference = inference.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], node_count = node_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMachineLearning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMachineLearning] (val x: Self) extends AnyVal {
    
    inline def setData_frame_analytics_jobs(value: XpackUsageMlDataFrameAnalyticsJobs): Self = StObject.set(x, "data_frame_analytics_jobs", value.asInstanceOf[js.Any])
    
    inline def setDatafeeds(value: Record[String, XpackUsageDatafeed]): Self = StObject.set(x, "datafeeds", value.asInstanceOf[js.Any])
    
    inline def setInference(value: XpackUsageMlInference): Self = StObject.set(x, "inference", value.asInstanceOf[js.Any])
    
    inline def setJobs(value: Record[String, XpackUsageJobUsage]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setNode_count(value: integer): Self = StObject.set(x, "node_count", value.asInstanceOf[js.Any])
  }
}
