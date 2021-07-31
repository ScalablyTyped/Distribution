package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.ContinueToLocationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnType extends StObject {
  
  var paramsType: js.Array[ContinueToLocationRequest]
  
  var returnType: Unit
}
object ReturnType {
  
  @scala.inline
  def apply(paramsType: js.Array[ContinueToLocationRequest], returnType: Unit): ReturnType = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnType]
  }
  
  @scala.inline
  implicit class ReturnTypeMutableBuilder[Self <: ReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ContinueToLocationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ContinueToLocationRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
