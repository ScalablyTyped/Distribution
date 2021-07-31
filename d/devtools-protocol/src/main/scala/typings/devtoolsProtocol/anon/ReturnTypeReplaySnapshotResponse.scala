package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.ReplaySnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ReplaySnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeReplaySnapshotResponse extends StObject {
  
  var paramsType: js.Array[ReplaySnapshotRequest]
  
  var returnType: ReplaySnapshotResponse
}
object ReturnTypeReplaySnapshotResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[ReplaySnapshotRequest], returnType: ReplaySnapshotResponse): ReturnTypeReplaySnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeReplaySnapshotResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeReplaySnapshotResponseMutableBuilder[Self <: ReturnTypeReplaySnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ReplaySnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ReplaySnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: ReplaySnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
