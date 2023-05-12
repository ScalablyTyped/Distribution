package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceRequestOrderDetail
  extends StObject
     with BackboneElement {
  
  /**
    * The parameter details for the service being requested.
    */
  var parameter: js.Array[ServiceRequestOrderDetailParameter]
  
  /**
    * Indicates the context of the order details by reference.
    */
  var parameterFocus: js.UndefOr[CodeableReference] = js.undefined
}
object ServiceRequestOrderDetail {
  
  inline def apply(parameter: js.Array[ServiceRequestOrderDetailParameter]): ServiceRequestOrderDetail = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceRequestOrderDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceRequestOrderDetail] (val x: Self) extends AnyVal {
    
    inline def setParameter(value: js.Array[ServiceRequestOrderDetailParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterFocus(value: CodeableReference): Self = StObject.set(x, "parameterFocus", value.asInstanceOf[js.Any])
    
    inline def setParameterFocusUndefined: Self = StObject.set(x, "parameterFocus", js.undefined)
    
    inline def setParameterVarargs(value: ServiceRequestOrderDetailParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
  }
}
