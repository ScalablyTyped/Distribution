package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.StartSamplingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[StartSamplingRequest]]
  
  var returnType: Unit
}
object `12` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[StartSamplingRequest]], returnType: Unit): `12` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[StartSamplingRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[StartSamplingRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
