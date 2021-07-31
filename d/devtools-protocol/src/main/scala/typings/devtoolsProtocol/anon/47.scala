package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Cast.StartTabMirroringRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var paramsType: js.Array[StartTabMirroringRequest]
  
  var returnType: Unit
}
object `47` {
  
  @scala.inline
  def apply(paramsType: js.Array[StartTabMirroringRequest], returnType: Unit): `47` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`47`]
  }
  
  @scala.inline
  implicit class `47MutableBuilder`[Self <: `47`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[StartTabMirroringRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: StartTabMirroringRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
