package typings.googleCloudPubsub

import typings.googleCloudPubsub.buildSrcSubscriberMod.AckResponse
import typings.googleGax.buildSrcStatusMod.Status
import typings.googleGax.mod.GoogleError
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAckMetadataMod {
  
  @JSImport("@google-cloud/pubsub/build/src/ack-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processAckErrorInfo(rpcError: GoogleError): AckErrorCodes = ^.asInstanceOf[js.Dynamic].applyDynamic("processAckErrorInfo")(rpcError.asInstanceOf[js.Any]).asInstanceOf[AckErrorCodes]
  
  inline def processAckRpcError(grpcCode: Status): AckErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("processAckRpcError")(grpcCode.asInstanceOf[js.Any]).asInstanceOf[AckErrorInfo]
  
  type AckErrorCodes = Map[String, AckErrorInfo]
  
  trait AckErrorInfo extends StObject {
    
    var grpcErrorCode: js.UndefOr[Status] = js.undefined
    
    var rawErrorCode: js.UndefOr[String] = js.undefined
    
    var response: js.UndefOr[AckResponse] = js.undefined
    
    var transient: Boolean
  }
  object AckErrorInfo {
    
    inline def apply(transient: Boolean): AckErrorInfo = {
      val __obj = js.Dynamic.literal(transient = transient.asInstanceOf[js.Any])
      __obj.asInstanceOf[AckErrorInfo]
    }
    
    extension [Self <: AckErrorInfo](x: Self) {
      
      inline def setGrpcErrorCode(value: Status): Self = StObject.set(x, "grpcErrorCode", value.asInstanceOf[js.Any])
      
      inline def setGrpcErrorCodeUndefined: Self = StObject.set(x, "grpcErrorCode", js.undefined)
      
      inline def setRawErrorCode(value: String): Self = StObject.set(x, "rawErrorCode", value.asInstanceOf[js.Any])
      
      inline def setRawErrorCodeUndefined: Self = StObject.set(x, "rawErrorCode", js.undefined)
      
      inline def setResponse(value: AckResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setTransient(value: Boolean): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    }
  }
}
