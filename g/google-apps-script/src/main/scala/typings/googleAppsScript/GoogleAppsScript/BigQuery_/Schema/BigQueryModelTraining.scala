package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQueryModelTraining extends StObject {
  
  var currentIteration: js.UndefOr[Double] = js.undefined
  
  var expectedTotalIterations: js.UndefOr[String] = js.undefined
}
object BigQueryModelTraining {
  
  inline def apply(): BigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryModelTraining]
  }
  
  extension [Self <: BigQueryModelTraining](x: Self) {
    
    inline def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
    
    inline def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
    
    inline def setExpectedTotalIterations(value: String): Self = StObject.set(x, "expectedTotalIterations", value.asInstanceOf[js.Any])
    
    inline def setExpectedTotalIterationsUndefined: Self = StObject.set(x, "expectedTotalIterations", js.undefined)
  }
}
