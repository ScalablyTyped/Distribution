package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSlm
  extends StObject
     with XpackUsageBase {
  
  var policy_count: js.UndefOr[integer] = js.undefined
  
  var policy_stats: js.UndefOr[SlmStatistics] = js.undefined
}
object XpackUsageSlm {
  
  inline def apply(available: Boolean, enabled: Boolean): XpackUsageSlm = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSlm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageSlm] (val x: Self) extends AnyVal {
    
    inline def setPolicy_count(value: integer): Self = StObject.set(x, "policy_count", value.asInstanceOf[js.Any])
    
    inline def setPolicy_countUndefined: Self = StObject.set(x, "policy_count", js.undefined)
    
    inline def setPolicy_stats(value: SlmStatistics): Self = StObject.set(x, "policy_stats", value.asInstanceOf[js.Any])
    
    inline def setPolicy_statsUndefined: Self = StObject.set(x, "policy_stats", js.undefined)
  }
}
