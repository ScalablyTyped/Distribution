package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.BackgroundService.StartObservingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var paramsType: js.Array[StartObservingRequest]
  
  var returnType: Unit
}
object `29` {
  
  @scala.inline
  def apply(paramsType: js.Array[StartObservingRequest], returnType: Unit): `29` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit class `29MutableBuilder`[Self <: `29`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[StartObservingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: StartObservingRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
