package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.ReplayXHRRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  var paramsType: js.Array[ReplayXHRRequest]
  
  var returnType: Unit
}
object `115` {
  
  @scala.inline
  def apply(paramsType: js.Array[ReplayXHRRequest], returnType: Unit): `115` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`115`]
  }
  
  @scala.inline
  implicit class `115MutableBuilder`[Self <: `115`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ReplayXHRRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ReplayXHRRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
