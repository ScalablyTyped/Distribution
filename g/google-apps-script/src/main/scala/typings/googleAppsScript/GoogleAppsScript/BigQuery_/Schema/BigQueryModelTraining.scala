package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQueryModelTraining extends StObject {
  
  var currentIteration: js.UndefOr[Double] = js.undefined
  
  var expectedTotalIterations: js.UndefOr[String] = js.undefined
}
object BigQueryModelTraining {
  
  @scala.inline
  def apply(): BigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryModelTraining]
  }
  
  @scala.inline
  implicit class BigQueryModelTrainingMutableBuilder[Self <: BigQueryModelTraining] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
    
    @scala.inline
    def setExpectedTotalIterations(value: String): Self = StObject.set(x, "expectedTotalIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedTotalIterationsUndefined: Self = StObject.set(x, "expectedTotalIterations", js.undefined)
  }
}
