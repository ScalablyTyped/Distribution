package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.StartTrackingHeapObjectsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[StartTrackingHeapObjectsRequest]]
  
  var returnType: Unit
}
object `13` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[StartTrackingHeapObjectsRequest]], returnType: Unit): `13` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[StartTrackingHeapObjectsRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[StartTrackingHeapObjectsRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
