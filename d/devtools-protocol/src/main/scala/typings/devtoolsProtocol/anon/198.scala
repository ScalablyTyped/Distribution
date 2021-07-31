package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Tethering.BindRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `198` extends StObject {
  
  var paramsType: js.Array[BindRequest]
  
  var returnType: Unit
}
object `198` {
  
  @scala.inline
  def apply(paramsType: js.Array[BindRequest], returnType: Unit): `198` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`198`]
  }
  
  @scala.inline
  implicit class `198MutableBuilder`[Self <: `198`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[BindRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: BindRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
