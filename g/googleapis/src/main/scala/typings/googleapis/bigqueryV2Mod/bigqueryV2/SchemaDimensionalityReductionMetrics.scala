package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimensionalityReductionMetrics extends StObject {
  
  /**
    * Total percentage of variance explained by the selected principal components.
    */
  var totalExplainedVarianceRatio: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDimensionalityReductionMetrics {
  
  inline def apply(): SchemaDimensionalityReductionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionalityReductionMetrics]
  }
  
  extension [Self <: SchemaDimensionalityReductionMetrics](x: Self) {
    
    inline def setTotalExplainedVarianceRatio(value: Double): Self = StObject.set(x, "totalExplainedVarianceRatio", value.asInstanceOf[js.Any])
    
    inline def setTotalExplainedVarianceRatioNull: Self = StObject.set(x, "totalExplainedVarianceRatio", null)
    
    inline def setTotalExplainedVarianceRatioUndefined: Self = StObject.set(x, "totalExplainedVarianceRatio", js.undefined)
  }
}
