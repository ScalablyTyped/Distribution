package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainResponseDetails extends StObject {
  
  var description: String
  
  var details: js.Array[ExplainResponseDetails]
  
  var value: Double
}
object ExplainResponseDetails {
  
  @scala.inline
  def apply(description: String, details: js.Array[ExplainResponseDetails], value: Double): ExplainResponseDetails = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainResponseDetails]
  }
  
  @scala.inline
  implicit class ExplainResponseDetailsMutableBuilder[Self <: ExplainResponseDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: js.Array[ExplainResponseDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsVarargs(value: ExplainResponseDetails*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
