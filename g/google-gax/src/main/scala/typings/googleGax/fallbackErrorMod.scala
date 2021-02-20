package typings.googleGax

import typings.googleGax.statusMod.Status
import typings.node.Buffer
import typings.protobufjs.mod.Message
import typings.protobufjs.mod.Root
import typings.protobufjs.mod.Type
import typings.std.ArrayBuffer
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fallbackErrorMod {
  
  @JSImport("google-gax/build/src/fallbackError", "FallbackErrorDecoder")
  @js.native
  class FallbackErrorDecoder () extends StObject {
    
    var anyType: Type = js.native
    
    def callErrorFromStatus(status: FallbackStatusObject): FallbackServiceError = js.native
    
    def decodeErrorFromBuffer(buffer: Buffer): Error = js.native
    def decodeErrorFromBuffer(buffer: ArrayBuffer): Error = js.native
    
    def decodeProtobufAny(anyValue: ProtobufAny): Message[js.Object] = js.native
    
    def decodeRpcStatus(buffer: Buffer): FallbackStatusObject = js.native
    def decodeRpcStatus(buffer: ArrayBuffer): FallbackStatusObject = js.native
    
    var root: Root = js.native
    
    var statusType: Type = js.native
  }
  
  type FallbackServiceError = FallbackStatusObject with Error
  
  @js.native
  trait FallbackStatusObject extends StObject {
    
    var code: Status = js.native
    
    var details: js.Array[js.Object] = js.native
    
    var message: String = js.native
  }
  object FallbackStatusObject {
    
    @scala.inline
    def apply(code: Status, details: js.Array[js.Object], message: String): FallbackStatusObject = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackStatusObject]
    }
    
    @scala.inline
    implicit class FallbackStatusObjectMutableBuilder[Self <: FallbackStatusObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: js.Array[js.Object]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsVarargs(value: js.Object*): Self = StObject.set(x, "details", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProtobufAny extends StObject {
    
    var type_url: String = js.native
    
    var value: Uint8Array = js.native
  }
  object ProtobufAny {
    
    @scala.inline
    def apply(type_url: String, value: Uint8Array): ProtobufAny = {
      val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtobufAny]
    }
    
    @scala.inline
    implicit class ProtobufAnyMutableBuilder[Self <: ProtobufAny] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
