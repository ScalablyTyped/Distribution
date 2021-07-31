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
    
    @JSImport("google-gax", "operationsProtos.google.longrunning.CancelOperationRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new CancelOperationRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CancelOperationRequest instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest]
    @scala.inline
    def create(properties: ICancelOperationRequest): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest]
    
    /**
      * Decodes a CancelOperationRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CancelOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest]
    
    /**
      * Decodes a CancelOperationRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CancelOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest]
    
    /**
      * Encodes the specified CancelOperationRequest message. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
      * @param message CancelOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ICancelOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ICancelOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified CancelOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
      * @param message CancelOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ICancelOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ICancelOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a CancelOperationRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CancelOperationRequest
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest]
    
    /**
      * Creates a plain object from a CancelOperationRequest message. Also converts values to other types if specified.
      * @param message CancelOperationRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a CancelOperationRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
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
    
    @JSImport("google-gax", "operationsProtos.google.longrunning.DeleteOperationRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DeleteOperationRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns DeleteOperationRequest instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest]
    @scala.inline
    def create(properties: IDeleteOperationRequest): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest]
    
    /**
      * Decodes a DeleteOperationRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns DeleteOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest]
    
    /**
      * Decodes a DeleteOperationRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns DeleteOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest]
    
    /**
      * Encodes the specified DeleteOperationRequest message. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
      * @param message DeleteOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IDeleteOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IDeleteOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified DeleteOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
      * @param message DeleteOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IDeleteOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IDeleteOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a DeleteOperationRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns DeleteOperationRequest
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest]
    
    /**
      * Creates a plain object from a DeleteOperationRequest message. Also converts values to other types if specified.
      * @param message DeleteOperationRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a DeleteOperationRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
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
    
    @JSImport("google-gax", "operationsProtos.google.longrunning.GetOperationRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new GetOperationRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns GetOperationRequest instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.longrunning.GetOperationRequest]
    @scala.inline
    def create(properties: IGetOperationRequest): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.GetOperationRequest]
    
    /**
      * Decodes a GetOperationRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns GetOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.GetOperationRequest]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.GetOperationRequest]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.GetOperationRequest]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.GetOperationRequest]
    
    /**
      * Decodes a GetOperationRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns GetOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.GetOperationRequest]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.GetOperationRequest]
    
    /**
      * Encodes the specified GetOperationRequest message. Does not implicitly {@link google.longrunning.GetOperationRequest.verify|verify} messages.
      * @param message GetOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IGetOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IGetOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified GetOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.GetOperationRequest.verify|verify} messages.
      * @param message GetOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IGetOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IGetOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a GetOperationRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns GetOperationRequest
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.GetOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.GetOperationRequest]
    
    /**
      * Creates a plain object from a GetOperationRequest message. Also converts values to other types if specified.
      * @param message GetOperationRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.GetOperationRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.GetOperationRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a GetOperationRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
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
    
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ListOperationsRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ListOperationsRequest instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest]
    @scala.inline
    def create(properties: IListOperationsRequest): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest]
    
    /**
      * Decodes a ListOperationsRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListOperationsRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest]
    
    /**
      * Decodes a ListOperationsRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListOperationsRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest]
    
    /**
      * Encodes the specified ListOperationsRequest message. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
      * @param message ListOperationsRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IListOperationsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IListOperationsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ListOperationsRequest message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
      * @param message ListOperationsRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IListOperationsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IListOperationsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ListOperationsRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListOperationsRequest
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest]
    
    /**
      * Creates a plain object from a ListOperationsRequest message. Also converts values to other types if specified.
      * @param message ListOperationsRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a ListOperationsRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
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
    
    @JSImport("google-gax", "operationsProtos.google.longrunning.ListOperationsResponse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ListOperationsResponse instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ListOperationsResponse instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse]
    @scala.inline
    def create(properties: IListOperationsResponse): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse]
    
    /**
      * Decodes a ListOperationsResponse message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListOperationsResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse]
    
    /**
      * Decodes a ListOperationsResponse message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListOperationsResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse]
    
    /**
      * Encodes the specified ListOperationsResponse message. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
      * @param message ListOperationsResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IListOperationsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IListOperationsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ListOperationsResponse message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
      * @param message ListOperationsResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IListOperationsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IListOperationsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ListOperationsResponse message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListOperationsResponse
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse]
    
    /**
      * Creates a plain object from a ListOperationsResponse message. Also converts values to other types if specified.
      * @param message ListOperationsResponse
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a ListOperationsResponse message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
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
    
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Operation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Operation instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.operationsMod.google.longrunning.Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operation]
    @scala.inline
    def create(properties: IOperation): typings.googleGax.operationsMod.google.longrunning.Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operation]
    
    /**
      * Decodes an Operation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Operation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operation]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.Operation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operation]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operation]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.Operation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operation]
    
    /**
      * Decodes an Operation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Operation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operation]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operation]
    
    /**
      * Encodes the specified Operation message. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
      * @param message Operation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IOperation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IOperation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Operation message, length delimited. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
      * @param message Operation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IOperation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IOperation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an Operation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Operation
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operation]
    
    /**
      * Creates a plain object from an Operation message. Also converts values to other types if specified.
      * @param message Operation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.Operation): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.Operation, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an Operation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
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
    
    @JSImport("google-gax", "operationsProtos.google.longrunning.OperationInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new OperationInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns OperationInfo instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.operationsMod.google.longrunning.OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.longrunning.OperationInfo]
    @scala.inline
    def create(properties: IOperationInfo): typings.googleGax.operationsMod.google.longrunning.OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.OperationInfo]
    
    /**
      * Decodes an OperationInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns OperationInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.OperationInfo]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.OperationInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.OperationInfo]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.OperationInfo]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.OperationInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.OperationInfo]
    
    /**
      * Decodes an OperationInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns OperationInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.OperationInfo]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.OperationInfo]
    
    /**
      * Encodes the specified OperationInfo message. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
      * @param message OperationInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IOperationInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IOperationInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified OperationInfo message, length delimited. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
      * @param message OperationInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IOperationInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IOperationInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an OperationInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns OperationInfo
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.OperationInfo]
    
    /**
      * Creates a plain object from an OperationInfo message. Also converts values to other types if specified.
      * @param message OperationInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.OperationInfo): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.OperationInfo,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an OperationInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
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
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  }
  object Operations {
    
    @JSImport("google-gax", "operationsProtos.google.longrunning.Operations")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates new Operations service using the specified rpc implementation.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      * @returns RPC service. Useful where requests and/or responses are streamed.
      */
    /* static member */
    @scala.inline
    def create(rpcImpl: RPCImpl): typings.googleGax.operationsMod.google.longrunning.Operations = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operations]
    @scala.inline
    def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleGax.operationsMod.google.longrunning.Operations = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operations]
    @scala.inline
    def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleGax.operationsMod.google.longrunning.Operations = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operations]
    @scala.inline
    def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): typings.googleGax.operationsMod.google.longrunning.Operations = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.Operations]
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
    
    @JSImport("google-gax", "operationsProtos.google.longrunning.WaitOperationRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new WaitOperationRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns WaitOperationRequest instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest]
    @scala.inline
    def create(properties: IWaitOperationRequest): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest]
    
    /**
      * Decodes a WaitOperationRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns WaitOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest]
    
    /**
      * Decodes a WaitOperationRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns WaitOperationRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest]
    
    /**
      * Encodes the specified WaitOperationRequest message. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
      * @param message WaitOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IWaitOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IWaitOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified WaitOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
      * @param message WaitOperationRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IWaitOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IWaitOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a WaitOperationRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns WaitOperationRequest
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest]
    
    /**
      * Creates a plain object from a WaitOperationRequest message. Also converts values to other types if specified.
      * @param message WaitOperationRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleGax.operationsMod.google.longrunning.WaitOperationRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a WaitOperationRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
}
