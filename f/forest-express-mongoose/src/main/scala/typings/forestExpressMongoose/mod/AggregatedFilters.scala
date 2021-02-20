package typings.forestExpressMongoose.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedFilters extends StObject {
  
  var aggregator: Aggregator = js.native
  
  var conditions: js.Array[Filter] = js.native
}
object AggregatedFilters {
  
  @scala.inline
  def apply(aggregator: Aggregator, conditions: js.Array[Filter]): AggregatedFilters = {
    val __obj = js.Dynamic.literal(aggregator = aggregator.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedFilters]
  }
  
  @scala.inline
  implicit class AggregatedFiltersMutableBuilder[Self <: AggregatedFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregator(value: Aggregator): Self = StObject.set(x, "aggregator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditions(value: js.Array[Filter]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: Filter*): Self = StObject.set(x, "conditions", js.Array(value :_*))
  }
}
