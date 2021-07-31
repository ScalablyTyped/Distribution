package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.OverrideQuotaForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `185` extends StObject {
  
  var paramsType: js.Array[OverrideQuotaForOriginRequest]
  
  var returnType: Unit
}
object `185` {
  
  @scala.inline
  def apply(paramsType: js.Array[OverrideQuotaForOriginRequest], returnType: Unit): `185` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`185`]
  }
  
  @scala.inline
  implicit class `185MutableBuilder`[Self <: `185`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[OverrideQuotaForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: OverrideQuotaForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
