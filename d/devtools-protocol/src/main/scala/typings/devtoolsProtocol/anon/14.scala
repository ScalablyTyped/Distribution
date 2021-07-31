package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.StopTrackingHeapObjectsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[StopTrackingHeapObjectsRequest]]
  
  var returnType: Unit
}
object `14` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[StopTrackingHeapObjectsRequest]], returnType: Unit): `14` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14MutableBuilder`[Self <: `14`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[StopTrackingHeapObjectsRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[StopTrackingHeapObjectsRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
