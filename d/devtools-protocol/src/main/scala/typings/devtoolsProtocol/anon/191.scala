package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.ExposeDevToolsProtocolRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  var paramsType: js.Array[ExposeDevToolsProtocolRequest]
  
  var returnType: Unit
}
object `191` {
  
  @scala.inline
  def apply(paramsType: js.Array[ExposeDevToolsProtocolRequest], returnType: Unit): `191` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`191`]
  }
  
  @scala.inline
  implicit class `191MutableBuilder`[Self <: `191`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ExposeDevToolsProtocolRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ExposeDevToolsProtocolRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
