package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.grpcMod.Metadata
import typings.googleGax.statusMod.Status
import typings.node.bufferMod.global.Buffer
import typings.proto3JsonSerializer.typesMod.JSONValue
import typings.protobufjs.mod.Message
import typings.protobufjs.mod.Root
import typings.protobufjs.mod.Type
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleErrorMod {
  
  @JSImport("google-gax/build/src/googleError", "GoogleError")
  @js.native
  open class GoogleError ()
    extends StObject
       with Error {
    
    var code: js.UndefOr[Status] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var errorInfoMetadata: js.UndefOr[StringDictionary[String]] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    var metadata: js.UndefOr[Metadata] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var note: js.UndefOr[String] = js.native
    
    var reason: js.UndefOr[String] = js.native
    
    var statusDetails: js.UndefOr[String | js.Array[Message[js.Object]]] = js.native
  }
  /* static members */
  object GoogleError {
    
    @JSImport("google-gax/build/src/googleError", "GoogleError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseGRPCStatusDetails(err: GoogleError): GoogleError = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGRPCStatusDetails")(err.asInstanceOf[js.Any]).asInstanceOf[GoogleError]
    
    inline def parseHttpError(json: Any): GoogleError = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHttpError")(json.asInstanceOf[js.Any]).asInstanceOf[GoogleError]
  }
  
  @JSImport("google-gax/build/src/googleError", "GoogleErrorDecoder")
  @js.native
  open class GoogleErrorDecoder () extends StObject {
    
    var anyType: Type = js.native
    
    def callErrorFromStatus(status: FallbackStatusObject): FallbackServiceError = js.native
    
    def decodeErrorFromBuffer(buffer: js.typedarray.ArrayBuffer): js.Error = js.native
    def decodeErrorFromBuffer(buffer: Buffer): js.Error = js.native
    
    def decodeGRPCStatusDetails(bufferArr: js.Array[js.typedarray.ArrayBuffer | Buffer]): GRPCStatusDetailsObject = js.native
    
    def decodeHTTPError(json: JSONValue): StringDictionary[Any] = js.native
    
    def decodeHttpStatusDetails(rawDetails: js.Array[ProtobufAny]): GRPCStatusDetailsObject = js.native
    
    def decodeProtobufAny(anyValue: ProtobufAny): Message[js.Object] = js.native
    
    def decodeRpcStatus(buffer: js.typedarray.ArrayBuffer): FallbackStatusObject = js.native
    def decodeRpcStatus(buffer: Buffer): FallbackStatusObject = js.native
    
    var root: Root = js.native
    
    var statusType: Type = js.native
  }
  
  trait ErrorInfo extends StObject {
    
    var domain: String
    
    var metadata: typings.googleGax.anon.String
    
    var reason: String
  }
  object ErrorInfo {
    
    inline def apply(domain: String, metadata: typings.googleGax.anon.String, reason: String): ErrorInfo = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    extension [Self <: ErrorInfo](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: typings.googleGax.anon.String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Error because var conflicts: message. Inlined name, stack, cause */ trait FallbackServiceError
    extends StObject
       with FallbackStatusObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    /* standard es5 */
    var name: String
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object FallbackServiceError {
    
    inline def apply(code: Status, message: String, name: String, statusDetails: js.Array[js.Object]): FallbackServiceError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusDetails = statusDetails.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackServiceError]
    }
    
    extension [Self <: FallbackServiceError](x: Self) {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait FallbackStatusObject extends StObject {
    
    var code: Status
    
    var domain: js.UndefOr[String] = js.undefined
    
    var errorInfoMetadata: js.UndefOr[typings.googleGax.anon.String] = js.undefined
    
    var message: String
    
    var reason: js.UndefOr[String] = js.undefined
    
    var statusDetails: js.Array[js.Object]
  }
  object FallbackStatusObject {
    
    inline def apply(code: Status, message: String, statusDetails: js.Array[js.Object]): FallbackStatusObject = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusDetails = statusDetails.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackStatusObject]
    }
    
    extension [Self <: FallbackStatusObject](x: Self) {
      
      inline def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setErrorInfoMetadata(value: typings.googleGax.anon.String): Self = StObject.set(x, "errorInfoMetadata", value.asInstanceOf[js.Any])
      
      inline def setErrorInfoMetadataUndefined: Self = StObject.set(x, "errorInfoMetadata", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setStatusDetails(value: js.Array[js.Object]): Self = StObject.set(x, "statusDetails", value.asInstanceOf[js.Any])
      
      inline def setStatusDetailsVarargs(value: js.Object*): Self = StObject.set(x, "statusDetails", js.Array(value*))
    }
  }
  
  trait GRPCStatusDetailsObject extends StObject {
    
    var details: js.Array[Message[js.Object]]
    
    var errorInfo: js.UndefOr[ErrorInfo] = js.undefined
  }
  object GRPCStatusDetailsObject {
    
    inline def apply(details: js.Array[Message[js.Object]]): GRPCStatusDetailsObject = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any])
      __obj.asInstanceOf[GRPCStatusDetailsObject]
    }
    
    extension [Self <: GRPCStatusDetailsObject](x: Self) {
      
      inline def setDetails(value: js.Array[Message[js.Object]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: Message[js.Object]*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
      
      inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    }
  }
  
  trait ProtobufAny extends StObject {
    
    var type_url: String
    
    var value: js.typedarray.Uint8Array
  }
  object ProtobufAny {
    
    inline def apply(type_url: String, value: js.typedarray.Uint8Array): ProtobufAny = {
      val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtobufAny]
    }
    
    extension [Self <: ProtobufAny](x: Self) {
      
      inline def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
