package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Performance.SetTimeDomainRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `167` extends StObject {
  
  var paramsType: js.Array[SetTimeDomainRequest]
  
  var returnType: Unit
}
object `167` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetTimeDomainRequest], returnType: Unit): `167` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`167`]
  }
  
  @scala.inline
  implicit class `167MutableBuilder`[Self <: `167`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetTimeDomainRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetTimeDomainRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
