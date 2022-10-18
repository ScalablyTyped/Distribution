package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageAnalytics
  extends StObject
     with XpackUsageBase {
  
  var stats: XpackUsageAnalyticsStatistics
}
object XpackUsageAnalytics {
  
  inline def apply(available: Boolean, enabled: Boolean, stats: XpackUsageAnalyticsStatistics): XpackUsageAnalytics = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageAnalytics]
  }
  
  extension [Self <: XpackUsageAnalytics](x: Self) {
    
    inline def setStats(value: XpackUsageAnalyticsStatistics): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
