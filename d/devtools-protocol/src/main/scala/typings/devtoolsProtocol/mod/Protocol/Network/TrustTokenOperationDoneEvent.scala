package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.devtoolsProtocolStrings.AlreadyExists
import typings.devtoolsProtocol.devtoolsProtocolStrings.BadResponse
import typings.devtoolsProtocol.devtoolsProtocolStrings.FailedPrecondition
import typings.devtoolsProtocol.devtoolsProtocolStrings.FulfilledLocally
import typings.devtoolsProtocol.devtoolsProtocolStrings.InternalError
import typings.devtoolsProtocol.devtoolsProtocolStrings.InvalidArgument
import typings.devtoolsProtocol.devtoolsProtocolStrings.Ok
import typings.devtoolsProtocol.devtoolsProtocolStrings.ResourceExhausted
import typings.devtoolsProtocol.devtoolsProtocolStrings.Unavailable
import typings.devtoolsProtocol.devtoolsProtocolStrings.UnknownError
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustTokenOperationDoneEvent extends StObject {
  
  /**
    * The number of obtained Trust Tokens on a successful "Issuance" operation.
    */
  var issuedTokenCount: js.UndefOr[integer] = js.undefined
  
  /**
    * Origin of the issuer in case of a "Issuance" or "Redemption" operation.
    */
  var issuerOrigin: js.UndefOr[String] = js.undefined
  
  var requestId: RequestId
  
  /**
    * Detailed success or error status of the operation.
    * 'AlreadyExists' also signifies a successful operation, as the result
    * of the operation already exists und thus, the operation was abort
    * preemptively (e.g. a cache hit). (TrustTokenOperationDoneEventStatus enum)
    */
  var status: Ok | InvalidArgument | FailedPrecondition | ResourceExhausted | AlreadyExists | Unavailable | BadResponse | InternalError | UnknownError | FulfilledLocally
  
  /**
    * Top level origin. The context in which the operation was attempted.
    */
  var topLevelOrigin: js.UndefOr[String] = js.undefined
  
  var `type`: TrustTokenOperationType
}
object TrustTokenOperationDoneEvent {
  
  inline def apply(
    requestId: RequestId,
    status: Ok | InvalidArgument | FailedPrecondition | ResourceExhausted | AlreadyExists | Unavailable | BadResponse | InternalError | UnknownError | FulfilledLocally,
    `type`: TrustTokenOperationType
  ): TrustTokenOperationDoneEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustTokenOperationDoneEvent]
  }
  
  extension [Self <: TrustTokenOperationDoneEvent](x: Self) {
    
    inline def setIssuedTokenCount(value: integer): Self = StObject.set(x, "issuedTokenCount", value.asInstanceOf[js.Any])
    
    inline def setIssuedTokenCountUndefined: Self = StObject.set(x, "issuedTokenCount", js.undefined)
    
    inline def setIssuerOrigin(value: String): Self = StObject.set(x, "issuerOrigin", value.asInstanceOf[js.Any])
    
    inline def setIssuerOriginUndefined: Self = StObject.set(x, "issuerOrigin", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: Ok | InvalidArgument | FailedPrecondition | ResourceExhausted | AlreadyExists | Unavailable | BadResponse | InternalError | UnknownError | FulfilledLocally
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTopLevelOrigin(value: String): Self = StObject.set(x, "topLevelOrigin", value.asInstanceOf[js.Any])
    
    inline def setTopLevelOriginUndefined: Self = StObject.set(x, "topLevelOrigin", js.undefined)
    
    inline def setType(value: TrustTokenOperationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
