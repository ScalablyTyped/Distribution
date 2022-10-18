package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageCcr
  extends StObject
     with XpackUsageBase {
  
  var auto_follow_patterns_count: integer
  
  var follower_indices_count: integer
}
object XpackUsageCcr {
  
  inline def apply(
    auto_follow_patterns_count: integer,
    available: Boolean,
    enabled: Boolean,
    follower_indices_count: integer
  ): XpackUsageCcr = {
    val __obj = js.Dynamic.literal(auto_follow_patterns_count = auto_follow_patterns_count.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], follower_indices_count = follower_indices_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageCcr]
  }
  
  extension [Self <: XpackUsageCcr](x: Self) {
    
    inline def setAuto_follow_patterns_count(value: integer): Self = StObject.set(x, "auto_follow_patterns_count", value.asInstanceOf[js.Any])
    
    inline def setFollower_indices_count(value: integer): Self = StObject.set(x, "follower_indices_count", value.asInstanceOf[js.Any])
  }
}
