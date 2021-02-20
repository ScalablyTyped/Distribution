package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeProfileSnapshotResponse extends StObject {
  
  var paramsType: js.Array[ProfileSnapshotRequest] = js.native
  
  var returnType: ProfileSnapshotResponse = js.native
}
object ReturnTypeProfileSnapshotResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[ProfileSnapshotRequest], returnType: ProfileSnapshotResponse): ReturnTypeProfileSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeProfileSnapshotResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeProfileSnapshotResponseMutableBuilder[Self <: ReturnTypeProfileSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ProfileSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ProfileSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: ProfileSnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
