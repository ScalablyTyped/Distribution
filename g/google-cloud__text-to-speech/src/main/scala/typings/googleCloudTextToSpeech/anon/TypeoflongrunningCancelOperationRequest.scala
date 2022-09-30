package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleGax.mod.operationsProtos.google.longrunning.CancelOperationRequest
import typings.googleGax.mod.operationsProtos.google.longrunning.DeleteOperationRequest
import typings.googleGax.mod.operationsProtos.google.longrunning.GetOperationRequest
import typings.googleGax.mod.operationsProtos.google.longrunning.ListOperationsRequest
import typings.googleGax.mod.operationsProtos.google.longrunning.ListOperationsResponse
import typings.googleGax.mod.operationsProtos.google.longrunning.Operation
import typings.googleGax.mod.operationsProtos.google.longrunning.OperationInfo
import typings.googleGax.mod.operationsProtos.google.longrunning.Operations
import typings.googleGax.mod.operationsProtos.google.longrunning.WaitOperationRequest
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoflongrunningCancelOperationRequest extends StObject {
  
  /** Represents a CancelOperationRequest. */
  var CancelOperationRequest: Instantiable0[typings.googleGax.mod.operationsProtos.google.longrunning.CancelOperationRequest] & TypeofCancelOperationRequ
  
  /** Represents a DeleteOperationRequest. */
  var DeleteOperationRequest: Instantiable0[typings.googleGax.mod.operationsProtos.google.longrunning.DeleteOperationRequest] & TypeofDeleteOperationRequ
  
  /** Represents a GetOperationRequest. */
  var GetOperationRequest: Instantiable0[typings.googleGax.mod.operationsProtos.google.longrunning.GetOperationRequest] & TypeofGetOperationRequest
  
  /** Represents a ListOperationsRequest. */
  var ListOperationsRequest: Instantiable0[typings.googleGax.mod.operationsProtos.google.longrunning.ListOperationsRequest] & TypeofListOperationsReque
  
  /** Represents a ListOperationsResponse. */
  var ListOperationsResponse: Instantiable0[typings.googleGax.mod.operationsProtos.google.longrunning.ListOperationsResponse] & TypeofListOperationsRespo
  
  /** Represents an Operation. */
  var Operation: Instantiable0[typings.googleGax.mod.operationsProtos.google.longrunning.Operation] & TypeofOperation
  
  /** Represents an OperationInfo. */
  var OperationInfo: Instantiable0[typings.googleGax.mod.operationsProtos.google.longrunning.OperationInfo] & TypeofOperationInfo
  
  /** Represents an Operations */
  var Operations: (Instantiable1[
    /* rpcImpl */ RPCImpl, 
    typings.googleGax.mod.operationsProtos.google.longrunning.Operations
  ]) & TypeofOperations
  
  /** Represents a WaitOperationRequest. */
  var WaitOperationRequest: Instantiable0[typings.googleGax.mod.operationsProtos.google.longrunning.WaitOperationRequest] & TypeofWaitOperationReques
}
object TypeoflongrunningCancelOperationRequest {
  
  inline def apply(
    CancelOperationRequest: Instantiable0[CancelOperationRequest] & TypeofCancelOperationRequ,
    DeleteOperationRequest: Instantiable0[DeleteOperationRequest] & TypeofDeleteOperationRequ,
    GetOperationRequest: Instantiable0[GetOperationRequest] & TypeofGetOperationRequest,
    ListOperationsRequest: Instantiable0[ListOperationsRequest] & TypeofListOperationsReque,
    ListOperationsResponse: Instantiable0[ListOperationsResponse] & TypeofListOperationsRespo,
    Operation: Instantiable0[Operation] & TypeofOperation,
    OperationInfo: Instantiable0[OperationInfo] & TypeofOperationInfo,
    Operations: (Instantiable1[/* rpcImpl */ RPCImpl, Operations]) & TypeofOperations,
    WaitOperationRequest: Instantiable0[WaitOperationRequest] & TypeofWaitOperationReques
  ): TypeoflongrunningCancelOperationRequest = {
    val __obj = js.Dynamic.literal(CancelOperationRequest = CancelOperationRequest.asInstanceOf[js.Any], DeleteOperationRequest = DeleteOperationRequest.asInstanceOf[js.Any], GetOperationRequest = GetOperationRequest.asInstanceOf[js.Any], ListOperationsRequest = ListOperationsRequest.asInstanceOf[js.Any], ListOperationsResponse = ListOperationsResponse.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], OperationInfo = OperationInfo.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any], WaitOperationRequest = WaitOperationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoflongrunningCancelOperationRequest]
  }
  
  extension [Self <: TypeoflongrunningCancelOperationRequest](x: Self) {
    
    inline def setCancelOperationRequest(value: Instantiable0[CancelOperationRequest] & TypeofCancelOperationRequ): Self = StObject.set(x, "CancelOperationRequest", value.asInstanceOf[js.Any])
    
    inline def setDeleteOperationRequest(value: Instantiable0[DeleteOperationRequest] & TypeofDeleteOperationRequ): Self = StObject.set(x, "DeleteOperationRequest", value.asInstanceOf[js.Any])
    
    inline def setGetOperationRequest(value: Instantiable0[GetOperationRequest] & TypeofGetOperationRequest): Self = StObject.set(x, "GetOperationRequest", value.asInstanceOf[js.Any])
    
    inline def setListOperationsRequest(value: Instantiable0[ListOperationsRequest] & TypeofListOperationsReque): Self = StObject.set(x, "ListOperationsRequest", value.asInstanceOf[js.Any])
    
    inline def setListOperationsResponse(value: Instantiable0[ListOperationsResponse] & TypeofListOperationsRespo): Self = StObject.set(x, "ListOperationsResponse", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: Instantiable0[Operation] & TypeofOperation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationInfo(value: Instantiable0[OperationInfo] & TypeofOperationInfo): Self = StObject.set(x, "OperationInfo", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: (Instantiable1[/* rpcImpl */ RPCImpl, Operations]) & TypeofOperations): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setWaitOperationRequest(value: Instantiable0[WaitOperationRequest] & TypeofWaitOperationReques): Self = StObject.set(x, "WaitOperationRequest", value.asInstanceOf[js.Any])
  }
}
