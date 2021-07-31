package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.EmulateNetworkConditionsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var paramsType: js.Array[EmulateNetworkConditionsRequest]
  
  var returnType: Unit
}
object `113` {
  
  @scala.inline
  def apply(paramsType: js.Array[EmulateNetworkConditionsRequest], returnType: Unit): `113` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit class `113MutableBuilder`[Self <: `113`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[EmulateNetworkConditionsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: EmulateNetworkConditionsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
