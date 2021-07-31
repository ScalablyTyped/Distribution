package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.MakeSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.MakeSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeMakeSnapshotResponse extends StObject {
  
  var paramsType: js.Array[MakeSnapshotRequest]
  
  var returnType: MakeSnapshotResponse
}
object ReturnTypeMakeSnapshotResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[MakeSnapshotRequest], returnType: MakeSnapshotResponse): ReturnTypeMakeSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeMakeSnapshotResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeMakeSnapshotResponseMutableBuilder[Self <: ReturnTypeMakeSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[MakeSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: MakeSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: MakeSnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
