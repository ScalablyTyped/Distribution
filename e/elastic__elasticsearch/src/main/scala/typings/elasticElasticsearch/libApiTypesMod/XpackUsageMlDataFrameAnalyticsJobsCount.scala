package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlDataFrameAnalyticsJobsCount extends StObject {
  
  var count: long
}
object XpackUsageMlDataFrameAnalyticsJobsCount {
  
  inline def apply(count: long): XpackUsageMlDataFrameAnalyticsJobsCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlDataFrameAnalyticsJobsCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlDataFrameAnalyticsJobsCount] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
