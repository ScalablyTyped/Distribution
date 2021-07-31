package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertiesResponse extends StObject {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Internal object properties (only of the element itself).
    */
  var internalProperties: js.UndefOr[js.Array[InternalPropertyDescriptor]] = js.undefined
  
  /**
    * Object private properties.
    */
  var privateProperties: js.UndefOr[js.Array[PrivatePropertyDescriptor]] = js.undefined
  
  /**
    * Object properties.
    */
  var result: js.Array[PropertyDescriptor]
}
object GetPropertiesResponse {
  
  @scala.inline
  def apply(result: js.Array[PropertyDescriptor]): GetPropertiesResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesResponse]
  }
  
  @scala.inline
  implicit class GetPropertiesResponseMutableBuilder[Self <: GetPropertiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    @scala.inline
    def setInternalProperties(value: js.Array[InternalPropertyDescriptor]): Self = StObject.set(x, "internalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalPropertiesUndefined: Self = StObject.set(x, "internalProperties", js.undefined)
    
    @scala.inline
    def setInternalPropertiesVarargs(value: InternalPropertyDescriptor*): Self = StObject.set(x, "internalProperties", js.Array(value :_*))
    
    @scala.inline
    def setPrivateProperties(value: js.Array[PrivatePropertyDescriptor]): Self = StObject.set(x, "privateProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivatePropertiesUndefined: Self = StObject.set(x, "privateProperties", js.undefined)
    
    @scala.inline
    def setPrivatePropertiesVarargs(value: PrivatePropertyDescriptor*): Self = StObject.set(x, "privateProperties", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[PropertyDescriptor]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: PropertyDescriptor*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
