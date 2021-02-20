package typings.googleGax.mod.operationsProtos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.longrunning.ICancelOperationRequest
import typings.googleGax.operationsMod.google.longrunning.IDeleteOperationRequest
import typings.googleGax.operationsMod.google.longrunning.IGetOperationRequest
import typings.googleGax.operationsMod.google.longrunning.IListOperationsRequest
import typings.googleGax.operationsMod.google.longrunning.IListOperationsResponse
import typings.googleGax.operationsMod.google.longrunning.IOperation
import typings.googleGax.operationsMod.google.longrunning.IOperationInfo
import typings.googleGax.operationsMod.google.longrunning.IWaitOperationRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace longrunning. */
object longrunning {
  
  /** Represents a CancelOperationRequest. */
  @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest")
  @js.native
  /**
    * Constructs a new CancelOperationRequest.
    * @param [properties] Properties to set
    */
  class CancelOperationRequest ()
    extends typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest {
    def this(properties: ICancelOperationRequest) = this()
  }
  object CancelOperationRequest {
    
    /**
      * Creates a new CancelOperationRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CancelOperationRequest instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.create")
    @js.native
    def create(properties: ICancelOperationRequest): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = js.native
    
    /**
      * Decodes a CancelOperationRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CancelOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = js.native
    
    /**
      * Decodes a CancelOperationRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CancelOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = js.native
    
    /**
      * Encodes the specified CancelOperationRequest message. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
      * @param message CancelOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.encode")
    @js.native
    def encode(message: ICancelOperationRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.encode")
    @js.native
    def encode(message: ICancelOperationRequest, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified CancelOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
      * @param message CancelOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICancelOperationRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICancelOperationRequest, writer: Writer): Writer = js.native
    
    /**
      * Creates a CancelOperationRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CancelOperationRequest
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = js.native
    
    /**
      * Creates a plain object from a CancelOperationRequest message. Also converts values to other types if specified.
      * @param message CancelOperationRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.toObject")
    @js.native
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a CancelOperationRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a DeleteOperationRequest. */
  @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest")
  @js.native
  /**
    * Constructs a new DeleteOperationRequest.
    * @param [properties] Properties to set
    */
  class DeleteOperationRequest ()
    extends typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest {
    def this(properties: IDeleteOperationRequest) = this()
  }
  object DeleteOperationRequest {
    
    /**
      * Creates a new DeleteOperationRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns DeleteOperationRequest instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.create")
    @js.native
    def create(properties: IDeleteOperationRequest): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = js.native
    
    /**
      * Decodes a DeleteOperationRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns DeleteOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = js.native
    
    /**
      * Decodes a DeleteOperationRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns DeleteOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = js.native
    
    /**
      * Encodes the specified DeleteOperationRequest message. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
      * @param message DeleteOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.encode")
    @js.native
    def encode(message: IDeleteOperationRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.encode")
    @js.native
    def encode(message: IDeleteOperationRequest, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified DeleteOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
      * @param message DeleteOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IDeleteOperationRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IDeleteOperationRequest, writer: Writer): Writer = js.native
    
    /**
      * Creates a DeleteOperationRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns DeleteOperationRequest
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = js.native
    
    /**
      * Creates a plain object from a DeleteOperationRequest message. Also converts values to other types if specified.
      * @param message DeleteOperationRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.toObject")
    @js.native
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a DeleteOperationRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a GetOperationRequest. */
  @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest")
  @js.native
  /**
    * Constructs a new GetOperationRequest.
    * @param [properties] Properties to set
    */
  class GetOperationRequest ()
    extends typings.googleGax.operationsMod.google.longrunning.GetOperationRequest {
    def this(properties: IGetOperationRequest) = this()
  }
  object GetOperationRequest {
    
    /**
      * Creates a new GetOperationRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns GetOperationRequest instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.create")
    @js.native
    def create(properties: IGetOperationRequest): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = js.native
    
    /**
      * Decodes a GetOperationRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns GetOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = js.native
    
    /**
      * Decodes a GetOperationRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns GetOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = js.native
    
    /**
      * Encodes the specified GetOperationRequest message. Does not implicitly {@link google.longrunning.GetOperationRequest.verify|verify} messages.
      * @param message GetOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.encode")
    @js.native
    def encode(message: IGetOperationRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.encode")
    @js.native
    def encode(message: IGetOperationRequest, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified GetOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.GetOperationRequest.verify|verify} messages.
      * @param message GetOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IGetOperationRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IGetOperationRequest, writer: Writer): Writer = js.native
    
    /**
      * Creates a GetOperationRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns GetOperationRequest
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = js.native
    
    /**
      * Creates a plain object from a GetOperationRequest message. Also converts values to other types if specified.
      * @param message GetOperationRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.GetOperationRequest): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.toObject")
    @js.native
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.GetOperationRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a GetOperationRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ListOperationsRequest. */
  @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest")
  @js.native
  /**
    * Constructs a new ListOperationsRequest.
    * @param [properties] Properties to set
    */
  class ListOperationsRequest ()
    extends typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest {
    def this(properties: IListOperationsRequest) = this()
  }
  object ListOperationsRequest {
    
    /**
      * Creates a new ListOperationsRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ListOperationsRequest instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.create")
    @js.native
    def create(properties: IListOperationsRequest): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = js.native
    
    /**
      * Decodes a ListOperationsRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListOperationsRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = js.native
    
    /**
      * Decodes a ListOperationsRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListOperationsRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = js.native
    
    /**
      * Encodes the specified ListOperationsRequest message. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
      * @param message ListOperationsRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.encode")
    @js.native
    def encode(message: IListOperationsRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.encode")
    @js.native
    def encode(message: IListOperationsRequest, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ListOperationsRequest message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
      * @param message ListOperationsRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IListOperationsRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IListOperationsRequest, writer: Writer): Writer = js.native
    
    /**
      * Creates a ListOperationsRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListOperationsRequest
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = js.native
    
    /**
      * Creates a plain object from a ListOperationsRequest message. Also converts values to other types if specified.
      * @param message ListOperationsRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.toObject")
    @js.native
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ListOperationsRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ListOperationsResponse. */
  @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse")
  @js.native
  /**
    * Constructs a new ListOperationsResponse.
    * @param [properties] Properties to set
    */
  class ListOperationsResponse ()
    extends typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse {
    def this(properties: IListOperationsResponse) = this()
  }
  object ListOperationsResponse {
    
    /**
      * Creates a new ListOperationsResponse instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ListOperationsResponse instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.create")
    @js.native
    def create(properties: IListOperationsResponse): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = js.native
    
    /**
      * Decodes a ListOperationsResponse message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListOperationsResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = js.native
    
    /**
      * Decodes a ListOperationsResponse message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListOperationsResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = js.native
    
    /**
      * Encodes the specified ListOperationsResponse message. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
      * @param message ListOperationsResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.encode")
    @js.native
    def encode(message: IListOperationsResponse): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.encode")
    @js.native
    def encode(message: IListOperationsResponse, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ListOperationsResponse message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
      * @param message ListOperationsResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.encodeDelimited")
    @js.native
    def encodeDelimited(message: IListOperationsResponse): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.encodeDelimited")
    @js.native
    def encodeDelimited(message: IListOperationsResponse, writer: Writer): Writer = js.native
    
    /**
      * Creates a ListOperationsResponse message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListOperationsResponse
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = js.native
    
    /**
      * Creates a plain object from a ListOperationsResponse message. Also converts values to other types if specified.
      * @param message ListOperationsResponse
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.toObject")
    @js.native
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ListOperationsResponse message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents an Operation. */
  @JSImport("google-gax", "operationsProtos.google.longrunning.Operation")
  @js.native
  /**
    * Constructs a new Operation.
    * @param [properties] Properties to set
    */
  class Operation ()
    extends typings.googleGax.operationsMod.google.longrunning.Operation {
    def this(properties: IOperation) = this()
  }
  object Operation {
    
    /**
      * Creates a new Operation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Operation instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.longrunning.Operation = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.create")
    @js.native
    def create(properties: IOperation): typings.googleGax.operationsMod.google.longrunning.Operation = js.native
    
    /**
      * Decodes an Operation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Operation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.Operation = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.Operation = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.Operation = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.Operation = js.native
    
    /**
      * Decodes an Operation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Operation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.Operation = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.Operation = js.native
    
    /**
      * Encodes the specified Operation message. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
      * @param message Operation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.encode")
    @js.native
    def encode(message: IOperation): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.encode")
    @js.native
    def encode(message: IOperation, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Operation message, length delimited. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
      * @param message Operation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.encodeDelimited")
    @js.native
    def encodeDelimited(message: IOperation): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.encodeDelimited")
    @js.native
    def encodeDelimited(message: IOperation, writer: Writer): Writer = js.native
    
    /**
      * Creates an Operation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Operation
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.Operation = js.native
    
    /**
      * Creates a plain object from an Operation message. Also converts values to other types if specified.
      * @param message Operation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.Operation): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.Operation, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Operation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents an OperationInfo. */
  @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo")
  @js.native
  /**
    * Constructs a new OperationInfo.
    * @param [properties] Properties to set
    */
  class OperationInfo ()
    extends typings.googleGax.operationsMod.google.longrunning.OperationInfo {
    def this(properties: IOperationInfo) = this()
  }
  object OperationInfo {
    
    /**
      * Creates a new OperationInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns OperationInfo instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.longrunning.OperationInfo = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.create")
    @js.native
    def create(properties: IOperationInfo): typings.googleGax.operationsMod.google.longrunning.OperationInfo = js.native
    
    /**
      * Decodes an OperationInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns OperationInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.OperationInfo = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.OperationInfo = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.OperationInfo = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.OperationInfo = js.native
    
    /**
      * Decodes an OperationInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns OperationInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.OperationInfo = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.OperationInfo = js.native
    
    /**
      * Encodes the specified OperationInfo message. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
      * @param message OperationInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.encode")
    @js.native
    def encode(message: IOperationInfo): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.encode")
    @js.native
    def encode(message: IOperationInfo, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified OperationInfo message, length delimited. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
      * @param message OperationInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.encodeDelimited")
    @js.native
    def encodeDelimited(message: IOperationInfo): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.encodeDelimited")
    @js.native
    def encodeDelimited(message: IOperationInfo, writer: Writer): Writer = js.native
    
    /**
      * Creates an OperationInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns OperationInfo
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.OperationInfo = js.native
    
    /**
      * Creates a plain object from an OperationInfo message. Also converts values to other types if specified.
      * @param message OperationInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.OperationInfo): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.toObject")
    @js.native
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.OperationInfo,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an OperationInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents an Operations */
  @JSImport("google-gax", "operationsProtos.google.longrunning.Operations")
  @js.native
  class Operations protected ()
    extends typings.googleGax.operationsMod.google.longrunning.Operations {
    /**
      * Constructs a new Operations service.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      */
    def this(rpcImpl: RPCImpl) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  }
  object Operations {
    
    /**
      * Creates new Operations service using the specified rpc implementation.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      * @returns RPC service. Useful where requests and/or responses are streamed.
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operations.create")
    @js.native
    def create(rpcImpl: RPCImpl): typings.googleGax.operationsMod.google.longrunning.Operations = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operations.create")
    @js.native
    def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): typings.googleGax.operationsMod.google.longrunning.Operations = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operations.create")
    @js.native
    def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleGax.operationsMod.google.longrunning.Operations = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operations.create")
    @js.native
    def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleGax.operationsMod.google.longrunning.Operations = js.native
  }
  
  /** Represents a WaitOperationRequest. */
  @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest")
  @js.native
  /**
    * Constructs a new WaitOperationRequest.
    * @param [properties] Properties to set
    */
  class WaitOperationRequest ()
    extends typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest {
    def this(properties: IWaitOperationRequest) = this()
  }
  object WaitOperationRequest {
    
    /**
      * Creates a new WaitOperationRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns WaitOperationRequest instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.create")
    @js.native
    def create(properties: IWaitOperationRequest): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = js.native
    
    /**
      * Decodes a WaitOperationRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns WaitOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = js.native
    
    /**
      * Decodes a WaitOperationRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns WaitOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = js.native
    
    /**
      * Encodes the specified WaitOperationRequest message. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
      * @param message WaitOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.encode")
    @js.native
    def encode(message: IWaitOperationRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.encode")
    @js.native
    def encode(message: IWaitOperationRequest, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified WaitOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
      * @param message WaitOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IWaitOperationRequest): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IWaitOperationRequest, writer: Writer): Writer = js.native
    
    /**
      * Creates a WaitOperationRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns WaitOperationRequest
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = js.native
    
    /**
      * Creates a plain object from a WaitOperationRequest message. Also converts values to other types if specified.
      * @param message WaitOperationRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.toObject")
    @js.native
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a WaitOperationRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
