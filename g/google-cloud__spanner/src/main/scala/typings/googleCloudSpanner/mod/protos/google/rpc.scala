package typings.googleCloudSpanner.mod.protos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.IFieldViolation
import typings.googleCloudSpanner.protosMod.google.rpc.Help.ILink
import typings.googleCloudSpanner.protosMod.google.rpc.IBadRequest
import typings.googleCloudSpanner.protosMod.google.rpc.IDebugInfo
import typings.googleCloudSpanner.protosMod.google.rpc.IErrorInfo
import typings.googleCloudSpanner.protosMod.google.rpc.IHelp
import typings.googleCloudSpanner.protosMod.google.rpc.ILocalizedMessage
import typings.googleCloudSpanner.protosMod.google.rpc.IPreconditionFailure
import typings.googleCloudSpanner.protosMod.google.rpc.IQuotaFailure
import typings.googleCloudSpanner.protosMod.google.rpc.IRequestInfo
import typings.googleCloudSpanner.protosMod.google.rpc.IResourceInfo
import typings.googleCloudSpanner.protosMod.google.rpc.IRetryInfo
import typings.googleCloudSpanner.protosMod.google.rpc.IStatus
import typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.IViolation
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace rpc. */
object rpc {
  
  /** Represents a BadRequest. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.BadRequest")
  @js.native
  /**
    * Constructs a new BadRequest.
    * @param [properties] Properties to set
    */
  open class BadRequest ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.BadRequest {
    def this(properties: IBadRequest) = this()
  }
  object BadRequest {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.BadRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a FieldViolation. */
    @JSImport("@google-cloud/spanner", "protos.google.rpc.BadRequest.FieldViolation")
    @js.native
    /**
      * Constructs a new FieldViolation.
      * @param [properties] Properties to set
      */
    open class FieldViolation ()
      extends typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation {
      def this(properties: IFieldViolation) = this()
    }
    object FieldViolation {
      
      @JSImport("@google-cloud/spanner", "protos.google.rpc.BadRequest.FieldViolation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new FieldViolation instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FieldViolation instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation]
      inline def create(properties: IFieldViolation): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation]
      /**
        * Decodes a FieldViolation message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FieldViolation
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation]
      /**
        * Decodes a FieldViolation message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FieldViolation
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation]
      
      /**
        * Encodes the specified FieldViolation message. Does not implicitly {@link google.rpc.BadRequest.FieldViolation.verify|verify} messages.
        * @param message FieldViolation message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IFieldViolation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IFieldViolation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified FieldViolation message, length delimited. Does not implicitly {@link google.rpc.BadRequest.FieldViolation.verify|verify} messages.
        * @param message FieldViolation message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IFieldViolation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IFieldViolation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a FieldViolation message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FieldViolation
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation]
      
      /**
        * Gets the default type url for FieldViolation
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a FieldViolation message. Also converts values to other types if specified.
        * @param message FieldViolation
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.FieldViolation,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a FieldViolation message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new BadRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns BadRequest instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest]
    inline def create(properties: IBadRequest): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest]
    /**
      * Decodes a BadRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns BadRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest]
    /**
      * Decodes a BadRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns BadRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest]
    
    /**
      * Encodes the specified BadRequest message. Does not implicitly {@link google.rpc.BadRequest.verify|verify} messages.
      * @param message BadRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IBadRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IBadRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified BadRequest message, length delimited. Does not implicitly {@link google.rpc.BadRequest.verify|verify} messages.
      * @param message BadRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IBadRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IBadRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a BadRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns BadRequest
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.BadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.BadRequest]
    
    /**
      * Gets the default type url for BadRequest
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a BadRequest message. Also converts values to other types if specified.
      * @param message BadRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.BadRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.BadRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a BadRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a DebugInfo. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.DebugInfo")
  @js.native
  /**
    * Constructs a new DebugInfo.
    * @param [properties] Properties to set
    */
  open class DebugInfo ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo {
    def this(properties: IDebugInfo) = this()
  }
  object DebugInfo {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.DebugInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DebugInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns DebugInfo instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo]
    inline def create(properties: IDebugInfo): typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo]
    /**
      * Decodes a DebugInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns DebugInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo]
    /**
      * Decodes a DebugInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns DebugInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo]
    
    /**
      * Encodes the specified DebugInfo message. Does not implicitly {@link google.rpc.DebugInfo.verify|verify} messages.
      * @param message DebugInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IDebugInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IDebugInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified DebugInfo message, length delimited. Does not implicitly {@link google.rpc.DebugInfo.verify|verify} messages.
      * @param message DebugInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IDebugInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IDebugInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a DebugInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns DebugInfo
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo]
    
    /**
      * Gets the default type url for DebugInfo
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a DebugInfo message. Also converts values to other types if specified.
      * @param message DebugInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.DebugInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a DebugInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents an ErrorInfo. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.ErrorInfo")
  @js.native
  /**
    * Constructs a new ErrorInfo.
    * @param [properties] Properties to set
    */
  open class ErrorInfo ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo {
    def this(properties: IErrorInfo) = this()
  }
  object ErrorInfo {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.ErrorInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ErrorInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ErrorInfo instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo]
    inline def create(properties: IErrorInfo): typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo]
    /**
      * Decodes an ErrorInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ErrorInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo]
    /**
      * Decodes an ErrorInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ErrorInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo]
    
    /**
      * Encodes the specified ErrorInfo message. Does not implicitly {@link google.rpc.ErrorInfo.verify|verify} messages.
      * @param message ErrorInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IErrorInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IErrorInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ErrorInfo message, length delimited. Does not implicitly {@link google.rpc.ErrorInfo.verify|verify} messages.
      * @param message ErrorInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IErrorInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IErrorInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an ErrorInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ErrorInfo
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo]
    
    /**
      * Gets the default type url for ErrorInfo
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from an ErrorInfo message. Also converts values to other types if specified.
      * @param message ErrorInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.ErrorInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an ErrorInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Help. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.Help")
  @js.native
  /**
    * Constructs a new Help.
    * @param [properties] Properties to set
    */
  open class Help ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.Help {
    def this(properties: IHelp) = this()
  }
  object Help {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.Help")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a Link. */
    @JSImport("@google-cloud/spanner", "protos.google.rpc.Help.Link")
    @js.native
    /**
      * Constructs a new Link.
      * @param [properties] Properties to set
      */
    open class Link ()
      extends typings.googleCloudSpanner.protosMod.google.rpc.Help.Link {
      def this(properties: ILink) = this()
    }
    object Link {
      
      @JSImport("@google-cloud/spanner", "protos.google.rpc.Help.Link")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Link instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Link instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.Help.Link = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help.Link]
      inline def create(properties: ILink): typings.googleCloudSpanner.protosMod.google.rpc.Help.Link = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help.Link]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.Help.Link = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help.Link]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.Help.Link = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help.Link]
      /**
        * Decodes a Link message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Link
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.Help.Link = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help.Link]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.Help.Link = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help.Link]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.Help.Link = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help.Link]
      /**
        * Decodes a Link message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Link
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.Help.Link = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help.Link]
      
      /**
        * Encodes the specified Link message. Does not implicitly {@link google.rpc.Help.Link.verify|verify} messages.
        * @param message Link message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ILink): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ILink, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Link message, length delimited. Does not implicitly {@link google.rpc.Help.Link.verify|verify} messages.
        * @param message Link message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ILink): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ILink, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Link message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Link
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.Help.Link = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help.Link]
      
      /**
        * Gets the default type url for Link
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a Link message. Also converts values to other types if specified.
        * @param message Link
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.Help.Link): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.Help.Link, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Link message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new Help instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Help instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.Help = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help]
    inline def create(properties: IHelp): typings.googleCloudSpanner.protosMod.google.rpc.Help = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.Help = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.Help = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help]
    /**
      * Decodes a Help message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Help
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.Help = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.Help = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.Help = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help]
    /**
      * Decodes a Help message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Help
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.Help = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help]
    
    /**
      * Encodes the specified Help message. Does not implicitly {@link google.rpc.Help.verify|verify} messages.
      * @param message Help message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IHelp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IHelp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Help message, length delimited. Does not implicitly {@link google.rpc.Help.verify|verify} messages.
      * @param message Help message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IHelp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IHelp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Help message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Help
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.Help = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Help]
    
    /**
      * Gets the default type url for Help
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Help message. Also converts values to other types if specified.
      * @param message Help
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.Help): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.Help, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Help message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a LocalizedMessage. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.LocalizedMessage")
  @js.native
  /**
    * Constructs a new LocalizedMessage.
    * @param [properties] Properties to set
    */
  open class LocalizedMessage ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage {
    def this(properties: ILocalizedMessage) = this()
  }
  object LocalizedMessage {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.LocalizedMessage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new LocalizedMessage instance using the specified properties.
      * @param [properties] Properties to set
      * @returns LocalizedMessage instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage]
    inline def create(properties: ILocalizedMessage): typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage]
    /**
      * Decodes a LocalizedMessage message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns LocalizedMessage
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage]
    /**
      * Decodes a LocalizedMessage message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns LocalizedMessage
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage]
    
    /**
      * Encodes the specified LocalizedMessage message. Does not implicitly {@link google.rpc.LocalizedMessage.verify|verify} messages.
      * @param message LocalizedMessage message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ILocalizedMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ILocalizedMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified LocalizedMessage message, length delimited. Does not implicitly {@link google.rpc.LocalizedMessage.verify|verify} messages.
      * @param message LocalizedMessage message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ILocalizedMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ILocalizedMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a LocalizedMessage message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns LocalizedMessage
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage]
    
    /**
      * Gets the default type url for LocalizedMessage
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a LocalizedMessage message. Also converts values to other types if specified.
      * @param message LocalizedMessage
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudSpanner.protosMod.google.rpc.LocalizedMessage,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a LocalizedMessage message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a PreconditionFailure. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.PreconditionFailure")
  @js.native
  /**
    * Constructs a new PreconditionFailure.
    * @param [properties] Properties to set
    */
  open class PreconditionFailure ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure {
    def this(properties: IPreconditionFailure) = this()
  }
  object PreconditionFailure {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.PreconditionFailure")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a Violation. */
    @JSImport("@google-cloud/spanner", "protos.google.rpc.PreconditionFailure.Violation")
    @js.native
    /**
      * Constructs a new Violation.
      * @param [properties] Properties to set
      */
    open class Violation ()
      extends typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation {
      def this(properties: IViolation) = this()
    }
    object Violation {
      
      @JSImport("@google-cloud/spanner", "protos.google.rpc.PreconditionFailure.Violation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Violation instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Violation instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation]
      inline def create(properties: IViolation): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation]
      /**
        * Decodes a Violation message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Violation
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation]
      /**
        * Decodes a Violation message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Violation
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation]
      
      /**
        * Encodes the specified Violation message. Does not implicitly {@link google.rpc.PreconditionFailure.Violation.verify|verify} messages.
        * @param message Violation message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IViolation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IViolation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Violation message, length delimited. Does not implicitly {@link google.rpc.PreconditionFailure.Violation.verify|verify} messages.
        * @param message Violation message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IViolation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IViolation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Violation message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Violation
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation]
      
      /**
        * Gets the default type url for Violation
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a Violation message. Also converts values to other types if specified.
        * @param message Violation
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.Violation,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Violation message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new PreconditionFailure instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PreconditionFailure instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure]
    inline def create(properties: IPreconditionFailure): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure]
    /**
      * Decodes a PreconditionFailure message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PreconditionFailure
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure]
    /**
      * Decodes a PreconditionFailure message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PreconditionFailure
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure]
    
    /**
      * Encodes the specified PreconditionFailure message. Does not implicitly {@link google.rpc.PreconditionFailure.verify|verify} messages.
      * @param message PreconditionFailure message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IPreconditionFailure): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IPreconditionFailure, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified PreconditionFailure message, length delimited. Does not implicitly {@link google.rpc.PreconditionFailure.verify|verify} messages.
      * @param message PreconditionFailure message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IPreconditionFailure): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IPreconditionFailure, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a PreconditionFailure message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PreconditionFailure
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure]
    
    /**
      * Gets the default type url for PreconditionFailure
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a PreconditionFailure message. Also converts values to other types if specified.
      * @param message PreconditionFailure
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a PreconditionFailure message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a QuotaFailure. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.QuotaFailure")
  @js.native
  /**
    * Constructs a new QuotaFailure.
    * @param [properties] Properties to set
    */
  open class QuotaFailure ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure {
    def this(properties: IQuotaFailure) = this()
  }
  object QuotaFailure {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.QuotaFailure")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a Violation. */
    @JSImport("@google-cloud/spanner", "protos.google.rpc.QuotaFailure.Violation")
    @js.native
    /**
      * Constructs a new Violation.
      * @param [properties] Properties to set
      */
    open class Violation ()
      extends typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation {
      def this(properties: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.IViolation) = this()
    }
    object Violation {
      
      @JSImport("@google-cloud/spanner", "protos.google.rpc.QuotaFailure.Violation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Violation instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Violation instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation]
      inline def create(properties: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.IViolation): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation]
      /**
        * Decodes a Violation message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Violation
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation]
      /**
        * Decodes a Violation message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Violation
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation]
      
      /**
        * Encodes the specified Violation message. Does not implicitly {@link google.rpc.QuotaFailure.Violation.verify|verify} messages.
        * @param message Violation message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.IViolation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.IViolation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Violation message, length delimited. Does not implicitly {@link google.rpc.QuotaFailure.Violation.verify|verify} messages.
        * @param message Violation message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.IViolation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.IViolation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Violation message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Violation
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation]
      
      /**
        * Gets the default type url for Violation
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a Violation message. Also converts values to other types if specified.
        * @param message Violation
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure.Violation,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Violation message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new QuotaFailure instance using the specified properties.
      * @param [properties] Properties to set
      * @returns QuotaFailure instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure]
    inline def create(properties: IQuotaFailure): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure]
    /**
      * Decodes a QuotaFailure message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns QuotaFailure
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure]
    /**
      * Decodes a QuotaFailure message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns QuotaFailure
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure]
    
    /**
      * Encodes the specified QuotaFailure message. Does not implicitly {@link google.rpc.QuotaFailure.verify|verify} messages.
      * @param message QuotaFailure message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IQuotaFailure): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IQuotaFailure, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified QuotaFailure message, length delimited. Does not implicitly {@link google.rpc.QuotaFailure.verify|verify} messages.
      * @param message QuotaFailure message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IQuotaFailure): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IQuotaFailure, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a QuotaFailure message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns QuotaFailure
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure]
    
    /**
      * Gets the default type url for QuotaFailure
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a QuotaFailure message. Also converts values to other types if specified.
      * @param message QuotaFailure
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.QuotaFailure, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a QuotaFailure message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a RequestInfo. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.RequestInfo")
  @js.native
  /**
    * Constructs a new RequestInfo.
    * @param [properties] Properties to set
    */
  open class RequestInfo ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo {
    def this(properties: IRequestInfo) = this()
  }
  object RequestInfo {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.RequestInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new RequestInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns RequestInfo instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo]
    inline def create(properties: IRequestInfo): typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo]
    /**
      * Decodes a RequestInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns RequestInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo]
    /**
      * Decodes a RequestInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns RequestInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo]
    
    /**
      * Encodes the specified RequestInfo message. Does not implicitly {@link google.rpc.RequestInfo.verify|verify} messages.
      * @param message RequestInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IRequestInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IRequestInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified RequestInfo message, length delimited. Does not implicitly {@link google.rpc.RequestInfo.verify|verify} messages.
      * @param message RequestInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IRequestInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IRequestInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a RequestInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns RequestInfo
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo]
    
    /**
      * Gets the default type url for RequestInfo
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a RequestInfo message. Also converts values to other types if specified.
      * @param message RequestInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.RequestInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a RequestInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ResourceInfo. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.ResourceInfo")
  @js.native
  /**
    * Constructs a new ResourceInfo.
    * @param [properties] Properties to set
    */
  open class ResourceInfo ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo {
    def this(properties: IResourceInfo) = this()
  }
  object ResourceInfo {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.ResourceInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ResourceInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResourceInfo instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo]
    inline def create(properties: IResourceInfo): typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo]
    /**
      * Decodes a ResourceInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResourceInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo]
    /**
      * Decodes a ResourceInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResourceInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo]
    
    /**
      * Encodes the specified ResourceInfo message. Does not implicitly {@link google.rpc.ResourceInfo.verify|verify} messages.
      * @param message ResourceInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IResourceInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IResourceInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ResourceInfo message, length delimited. Does not implicitly {@link google.rpc.ResourceInfo.verify|verify} messages.
      * @param message ResourceInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IResourceInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IResourceInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ResourceInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResourceInfo
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo]
    
    /**
      * Gets the default type url for ResourceInfo
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a ResourceInfo message. Also converts values to other types if specified.
      * @param message ResourceInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.ResourceInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ResourceInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a RetryInfo. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.RetryInfo")
  @js.native
  /**
    * Constructs a new RetryInfo.
    * @param [properties] Properties to set
    */
  open class RetryInfo ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo {
    def this(properties: IRetryInfo) = this()
  }
  object RetryInfo {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.RetryInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new RetryInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns RetryInfo instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo]
    inline def create(properties: IRetryInfo): typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo]
    /**
      * Decodes a RetryInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns RetryInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo]
    /**
      * Decodes a RetryInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns RetryInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo]
    
    /**
      * Encodes the specified RetryInfo message. Does not implicitly {@link google.rpc.RetryInfo.verify|verify} messages.
      * @param message RetryInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IRetryInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IRetryInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified RetryInfo message, length delimited. Does not implicitly {@link google.rpc.RetryInfo.verify|verify} messages.
      * @param message RetryInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IRetryInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IRetryInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a RetryInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns RetryInfo
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo]
    
    /**
      * Gets the default type url for RetryInfo
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a RetryInfo message. Also converts values to other types if specified.
      * @param message RetryInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.RetryInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a RetryInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Status. */
  @JSImport("@google-cloud/spanner", "protos.google.rpc.Status")
  @js.native
  /**
    * Constructs a new Status.
    * @param [properties] Properties to set
    */
  open class Status ()
    extends typings.googleCloudSpanner.protosMod.google.rpc.Status {
    def this(properties: IStatus) = this()
  }
  object Status {
    
    @JSImport("@google-cloud/spanner", "protos.google.rpc.Status")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Status instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Status instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Status]
    inline def create(properties: IStatus): typings.googleCloudSpanner.protosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Status]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Status]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.Status = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Status]
    /**
      * Decodes a Status message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Status]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.rpc.Status = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Status]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Status]
    /**
      * Decodes a Status message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Status]
    
    /**
      * Encodes the specified Status message. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IStatus): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IStatus, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Status message, length delimited. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IStatus): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IStatus, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Status message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Status
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.rpc.Status]
    
    /**
      * Gets the default type url for Status
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Status message. Also converts values to other types if specified.
      * @param message Status
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.Status): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.rpc.Status, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Status message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
}
