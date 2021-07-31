package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.ClearDataForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  var paramsType: js.Array[ClearDataForOriginRequest]
  
  var returnType: Unit
}
object `181` {
  
  @scala.inline
  def apply(paramsType: js.Array[ClearDataForOriginRequest], returnType: Unit): `181` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`181`]
  }
  
  @scala.inline
  implicit class `181MutableBuilder`[Self <: `181`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ClearDataForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ClearDataForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
