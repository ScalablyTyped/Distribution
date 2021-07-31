package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Tethering.UnbindRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `199` extends StObject {
  
  var paramsType: js.Array[UnbindRequest]
  
  var returnType: Unit
}
object `199` {
  
  @scala.inline
  def apply(paramsType: js.Array[UnbindRequest], returnType: Unit): `199` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`199`]
  }
  
  @scala.inline
  implicit class `199MutableBuilder`[Self <: `199`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[UnbindRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: UnbindRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
