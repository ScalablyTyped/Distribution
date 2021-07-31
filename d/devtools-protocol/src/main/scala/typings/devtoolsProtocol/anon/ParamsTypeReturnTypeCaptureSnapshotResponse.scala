package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.CaptureSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.Page.CaptureSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsTypeReturnTypeCaptureSnapshotResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[CaptureSnapshotRequest]]
  
  var returnType: CaptureSnapshotResponse
}
object ParamsTypeReturnTypeCaptureSnapshotResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[CaptureSnapshotRequest]], returnType: CaptureSnapshotResponse): ParamsTypeReturnTypeCaptureSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTypeReturnTypeCaptureSnapshotResponse]
  }
  
  @scala.inline
  implicit class ParamsTypeReturnTypeCaptureSnapshotResponseMutableBuilder[Self <: ParamsTypeReturnTypeCaptureSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[CaptureSnapshotRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[CaptureSnapshotRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: CaptureSnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
