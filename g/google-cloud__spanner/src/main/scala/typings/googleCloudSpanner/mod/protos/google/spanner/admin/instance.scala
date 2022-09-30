package typings.googleCloudSpanner.mod.protos.google.spanner.admin

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ICreateInstanceMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ICreateInstanceRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IDeleteInstanceRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IGetInstanceConfigRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IGetInstanceRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IInstance
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IInstanceConfig
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstanceConfigsRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstanceConfigsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstancesRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstancesResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IReplicaInfo
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IUpdateInstanceMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IUpdateInstanceRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace instance. */
object instance {
  
  /** Namespace v1. */
  object v1 {
    
    /** Represents a CreateInstanceMetadata. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.CreateInstanceMetadata")
    @js.native
    /**
      * Constructs a new CreateInstanceMetadata.
      * @param [properties] Properties to set
      */
    open class CreateInstanceMetadata ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata {
      def this(properties: ICreateInstanceMetadata) = this()
    }
    object CreateInstanceMetadata {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.CreateInstanceMetadata")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new CreateInstanceMetadata instance using the specified properties.
        * @param [properties] Properties to set
        * @returns CreateInstanceMetadata instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata]
      inline def create(properties: ICreateInstanceMetadata): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata]
      /**
        * Decodes a CreateInstanceMetadata message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns CreateInstanceMetadata
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata]
      /**
        * Decodes a CreateInstanceMetadata message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns CreateInstanceMetadata
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata]
      
      /**
        * Encodes the specified CreateInstanceMetadata message. Does not implicitly {@link google.spanner.admin.instance.v1.CreateInstanceMetadata.verify|verify} messages.
        * @param message CreateInstanceMetadata message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ICreateInstanceMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ICreateInstanceMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified CreateInstanceMetadata message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.CreateInstanceMetadata.verify|verify} messages.
        * @param message CreateInstanceMetadata message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ICreateInstanceMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ICreateInstanceMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a CreateInstanceMetadata message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns CreateInstanceMetadata
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata]
      
      /**
        * Gets the default type url for CreateInstanceMetadata
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a CreateInstanceMetadata message. Also converts values to other types if specified.
        * @param message CreateInstanceMetadata
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a CreateInstanceMetadata message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a CreateInstanceRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.CreateInstanceRequest")
    @js.native
    /**
      * Constructs a new CreateInstanceRequest.
      * @param [properties] Properties to set
      */
    open class CreateInstanceRequest ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest {
      def this(properties: ICreateInstanceRequest) = this()
    }
    object CreateInstanceRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.CreateInstanceRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new CreateInstanceRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns CreateInstanceRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest]
      inline def create(properties: ICreateInstanceRequest): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest]
      /**
        * Decodes a CreateInstanceRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns CreateInstanceRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest]
      /**
        * Decodes a CreateInstanceRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns CreateInstanceRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest]
      
      /**
        * Encodes the specified CreateInstanceRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.CreateInstanceRequest.verify|verify} messages.
        * @param message CreateInstanceRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ICreateInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ICreateInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified CreateInstanceRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.CreateInstanceRequest.verify|verify} messages.
        * @param message CreateInstanceRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ICreateInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ICreateInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a CreateInstanceRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns CreateInstanceRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest]
      
      /**
        * Gets the default type url for CreateInstanceRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a CreateInstanceRequest message. Also converts values to other types if specified.
        * @param message CreateInstanceRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a CreateInstanceRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a DeleteInstanceRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.DeleteInstanceRequest")
    @js.native
    /**
      * Constructs a new DeleteInstanceRequest.
      * @param [properties] Properties to set
      */
    open class DeleteInstanceRequest ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest {
      def this(properties: IDeleteInstanceRequest) = this()
    }
    object DeleteInstanceRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.DeleteInstanceRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new DeleteInstanceRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns DeleteInstanceRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest]
      inline def create(properties: IDeleteInstanceRequest): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest]
      /**
        * Decodes a DeleteInstanceRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns DeleteInstanceRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest]
      /**
        * Decodes a DeleteInstanceRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns DeleteInstanceRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest]
      
      /**
        * Encodes the specified DeleteInstanceRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.DeleteInstanceRequest.verify|verify} messages.
        * @param message DeleteInstanceRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IDeleteInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IDeleteInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified DeleteInstanceRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.DeleteInstanceRequest.verify|verify} messages.
        * @param message DeleteInstanceRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IDeleteInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IDeleteInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a DeleteInstanceRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns DeleteInstanceRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest]
      
      /**
        * Gets the default type url for DeleteInstanceRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a DeleteInstanceRequest message. Also converts values to other types if specified.
        * @param message DeleteInstanceRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.DeleteInstanceRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a DeleteInstanceRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a GetInstanceConfigRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.GetInstanceConfigRequest")
    @js.native
    /**
      * Constructs a new GetInstanceConfigRequest.
      * @param [properties] Properties to set
      */
    open class GetInstanceConfigRequest ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest {
      def this(properties: IGetInstanceConfigRequest) = this()
    }
    object GetInstanceConfigRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.GetInstanceConfigRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new GetInstanceConfigRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns GetInstanceConfigRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest]
      inline def create(properties: IGetInstanceConfigRequest): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest]
      /**
        * Decodes a GetInstanceConfigRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GetInstanceConfigRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest]
      /**
        * Decodes a GetInstanceConfigRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GetInstanceConfigRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest]
      
      /**
        * Encodes the specified GetInstanceConfigRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.GetInstanceConfigRequest.verify|verify} messages.
        * @param message GetInstanceConfigRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IGetInstanceConfigRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IGetInstanceConfigRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified GetInstanceConfigRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.GetInstanceConfigRequest.verify|verify} messages.
        * @param message GetInstanceConfigRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IGetInstanceConfigRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IGetInstanceConfigRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a GetInstanceConfigRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns GetInstanceConfigRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest]
      
      /**
        * Gets the default type url for GetInstanceConfigRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a GetInstanceConfigRequest message. Also converts values to other types if specified.
        * @param message GetInstanceConfigRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceConfigRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a GetInstanceConfigRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a GetInstanceRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.GetInstanceRequest")
    @js.native
    /**
      * Constructs a new GetInstanceRequest.
      * @param [properties] Properties to set
      */
    open class GetInstanceRequest ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest {
      def this(properties: IGetInstanceRequest) = this()
    }
    object GetInstanceRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.GetInstanceRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new GetInstanceRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns GetInstanceRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest]
      inline def create(properties: IGetInstanceRequest): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest]
      /**
        * Decodes a GetInstanceRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GetInstanceRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest]
      /**
        * Decodes a GetInstanceRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GetInstanceRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest]
      
      /**
        * Encodes the specified GetInstanceRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.GetInstanceRequest.verify|verify} messages.
        * @param message GetInstanceRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IGetInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IGetInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified GetInstanceRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.GetInstanceRequest.verify|verify} messages.
        * @param message GetInstanceRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IGetInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IGetInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a GetInstanceRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns GetInstanceRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest]
      
      /**
        * Gets the default type url for GetInstanceRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a GetInstanceRequest message. Also converts values to other types if specified.
        * @param message GetInstanceRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.GetInstanceRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a GetInstanceRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents an Instance. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.Instance")
    @js.native
    /**
      * Constructs a new Instance.
      * @param [properties] Properties to set
      */
    open class Instance ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance {
      def this(properties: IInstance) = this()
    }
    object Instance {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.Instance")
      @js.native
      val ^ : js.Any = js.native
      
      /** State enum. */
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.Instance.State")
      @js.native
      object State extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance.State & Double
              ] = js.native
        
        /* 1 */ val CREATING: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance.State.CREATING & Double = js.native
        
        /* 2 */ val READY: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance.State.READY & Double = js.native
        
        /* 0 */ val STATE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance.State.STATE_UNSPECIFIED & Double = js.native
      }
      
      /**
        * Creates a new Instance instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Instance instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance]
      inline def create(properties: IInstance): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance]
      /**
        * Decodes an Instance message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Instance
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance]
      /**
        * Decodes an Instance message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Instance
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance]
      
      /**
        * Encodes the specified Instance message. Does not implicitly {@link google.spanner.admin.instance.v1.Instance.verify|verify} messages.
        * @param message Instance message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IInstance): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IInstance, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Instance message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.Instance.verify|verify} messages.
        * @param message Instance message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IInstance): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IInstance, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates an Instance message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Instance
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance]
      
      /**
        * Gets the default type url for Instance
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from an Instance message. Also converts values to other types if specified.
        * @param message Instance
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies an Instance message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents an InstanceAdmin */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.InstanceAdmin")
    @js.native
    open class InstanceAdmin protected ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin {
      /**
        * Constructs a new InstanceAdmin service.
        * @param rpcImpl RPC implementation
        * @param [requestDelimited=false] Whether requests are length-delimited
        * @param [responseDelimited=false] Whether responses are length-delimited
        */
      def this(rpcImpl: RPCImpl) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
    }
    object InstanceAdmin {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.InstanceAdmin")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates new InstanceAdmin service using the specified rpc implementation.
        * @param rpcImpl RPC implementation
        * @param [requestDelimited=false] Whether requests are length-delimited
        * @param [responseDelimited=false] Whether responses are length-delimited
        * @returns RPC service. Useful where requests and/or responses are streamed.
        */
      /* static member */
      inline def create(rpcImpl: RPCImpl): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceAdmin]
    }
    
    /** Represents an InstanceConfig. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.InstanceConfig")
    @js.native
    /**
      * Constructs a new InstanceConfig.
      * @param [properties] Properties to set
      */
    open class InstanceConfig ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig {
      def this(properties: IInstanceConfig) = this()
    }
    object InstanceConfig {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.InstanceConfig")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new InstanceConfig instance using the specified properties.
        * @param [properties] Properties to set
        * @returns InstanceConfig instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig]
      inline def create(properties: IInstanceConfig): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig]
      /**
        * Decodes an InstanceConfig message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns InstanceConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig]
      /**
        * Decodes an InstanceConfig message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns InstanceConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig]
      
      /**
        * Encodes the specified InstanceConfig message. Does not implicitly {@link google.spanner.admin.instance.v1.InstanceConfig.verify|verify} messages.
        * @param message InstanceConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IInstanceConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IInstanceConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified InstanceConfig message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.InstanceConfig.verify|verify} messages.
        * @param message InstanceConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IInstanceConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IInstanceConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates an InstanceConfig message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns InstanceConfig
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig]
      
      /**
        * Gets the default type url for InstanceConfig
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from an InstanceConfig message. Also converts values to other types if specified.
        * @param message InstanceConfig
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.InstanceConfig,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies an InstanceConfig message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListInstanceConfigsRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ListInstanceConfigsRequest")
    @js.native
    /**
      * Constructs a new ListInstanceConfigsRequest.
      * @param [properties] Properties to set
      */
    open class ListInstanceConfigsRequest ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest {
      def this(properties: IListInstanceConfigsRequest) = this()
    }
    object ListInstanceConfigsRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ListInstanceConfigsRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ListInstanceConfigsRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListInstanceConfigsRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest]
      inline def create(properties: IListInstanceConfigsRequest): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest]
      /**
        * Decodes a ListInstanceConfigsRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListInstanceConfigsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest]
      /**
        * Decodes a ListInstanceConfigsRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListInstanceConfigsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest]
      
      /**
        * Encodes the specified ListInstanceConfigsRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstanceConfigsRequest.verify|verify} messages.
        * @param message ListInstanceConfigsRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IListInstanceConfigsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IListInstanceConfigsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ListInstanceConfigsRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstanceConfigsRequest.verify|verify} messages.
        * @param message ListInstanceConfigsRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IListInstanceConfigsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IListInstanceConfigsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ListInstanceConfigsRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ListInstanceConfigsRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest]
      
      /**
        * Gets the default type url for ListInstanceConfigsRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a ListInstanceConfigsRequest message. Also converts values to other types if specified.
        * @param message ListInstanceConfigsRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ListInstanceConfigsRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListInstanceConfigsResponse. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ListInstanceConfigsResponse")
    @js.native
    /**
      * Constructs a new ListInstanceConfigsResponse.
      * @param [properties] Properties to set
      */
    open class ListInstanceConfigsResponse ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse {
      def this(properties: IListInstanceConfigsResponse) = this()
    }
    object ListInstanceConfigsResponse {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ListInstanceConfigsResponse")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ListInstanceConfigsResponse instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListInstanceConfigsResponse instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse]
      inline def create(properties: IListInstanceConfigsResponse): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse]
      /**
        * Decodes a ListInstanceConfigsResponse message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListInstanceConfigsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse]
      /**
        * Decodes a ListInstanceConfigsResponse message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListInstanceConfigsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse]
      
      /**
        * Encodes the specified ListInstanceConfigsResponse message. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse.verify|verify} messages.
        * @param message ListInstanceConfigsResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IListInstanceConfigsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IListInstanceConfigsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ListInstanceConfigsResponse message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse.verify|verify} messages.
        * @param message ListInstanceConfigsResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IListInstanceConfigsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IListInstanceConfigsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ListInstanceConfigsResponse message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ListInstanceConfigsResponse
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse]
      
      /**
        * Gets the default type url for ListInstanceConfigsResponse
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a ListInstanceConfigsResponse message. Also converts values to other types if specified.
        * @param message ListInstanceConfigsResponse
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstanceConfigsResponse,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ListInstanceConfigsResponse message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListInstancesRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ListInstancesRequest")
    @js.native
    /**
      * Constructs a new ListInstancesRequest.
      * @param [properties] Properties to set
      */
    open class ListInstancesRequest ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest {
      def this(properties: IListInstancesRequest) = this()
    }
    object ListInstancesRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ListInstancesRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ListInstancesRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListInstancesRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest]
      inline def create(properties: IListInstancesRequest): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest]
      /**
        * Decodes a ListInstancesRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListInstancesRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest]
      /**
        * Decodes a ListInstancesRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListInstancesRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest]
      
      /**
        * Encodes the specified ListInstancesRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstancesRequest.verify|verify} messages.
        * @param message ListInstancesRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IListInstancesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IListInstancesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ListInstancesRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstancesRequest.verify|verify} messages.
        * @param message ListInstancesRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IListInstancesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IListInstancesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ListInstancesRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ListInstancesRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest]
      
      /**
        * Gets the default type url for ListInstancesRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a ListInstancesRequest message. Also converts values to other types if specified.
        * @param message ListInstancesRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ListInstancesRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListInstancesResponse. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ListInstancesResponse")
    @js.native
    /**
      * Constructs a new ListInstancesResponse.
      * @param [properties] Properties to set
      */
    open class ListInstancesResponse ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse {
      def this(properties: IListInstancesResponse) = this()
    }
    object ListInstancesResponse {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ListInstancesResponse")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ListInstancesResponse instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListInstancesResponse instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse]
      inline def create(properties: IListInstancesResponse): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse]
      /**
        * Decodes a ListInstancesResponse message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListInstancesResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse]
      /**
        * Decodes a ListInstancesResponse message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListInstancesResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse]
      
      /**
        * Encodes the specified ListInstancesResponse message. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstancesResponse.verify|verify} messages.
        * @param message ListInstancesResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IListInstancesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IListInstancesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ListInstancesResponse message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstancesResponse.verify|verify} messages.
        * @param message ListInstancesResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IListInstancesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IListInstancesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ListInstancesResponse message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ListInstancesResponse
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse]
      
      /**
        * Gets the default type url for ListInstancesResponse
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a ListInstancesResponse message. Also converts values to other types if specified.
        * @param message ListInstancesResponse
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ListInstancesResponse,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ListInstancesResponse message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ReplicaInfo. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ReplicaInfo")
    @js.native
    /**
      * Constructs a new ReplicaInfo.
      * @param [properties] Properties to set
      */
    open class ReplicaInfo ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo {
      def this(properties: IReplicaInfo) = this()
    }
    object ReplicaInfo {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ReplicaInfo")
      @js.native
      val ^ : js.Any = js.native
      
      /** ReplicaType enum. */
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType")
      @js.native
      object ReplicaType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType & Double
              ] = js.native
        
        /* 2 */ val READ_ONLY: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.READ_ONLY & Double = js.native
        
        /* 1 */ val READ_WRITE: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.READ_WRITE & Double = js.native
        
        /* 0 */ val TYPE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.TYPE_UNSPECIFIED & Double = js.native
        
        /* 3 */ val WITNESS: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.WITNESS & Double = js.native
      }
      
      /**
        * Creates a new ReplicaInfo instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ReplicaInfo instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo]
      inline def create(properties: IReplicaInfo): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo]
      /**
        * Decodes a ReplicaInfo message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ReplicaInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo]
      /**
        * Decodes a ReplicaInfo message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ReplicaInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo]
      
      /**
        * Encodes the specified ReplicaInfo message. Does not implicitly {@link google.spanner.admin.instance.v1.ReplicaInfo.verify|verify} messages.
        * @param message ReplicaInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IReplicaInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IReplicaInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ReplicaInfo message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.ReplicaInfo.verify|verify} messages.
        * @param message ReplicaInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IReplicaInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IReplicaInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ReplicaInfo message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ReplicaInfo
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo]
      
      /**
        * Gets the default type url for ReplicaInfo
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a ReplicaInfo message. Also converts values to other types if specified.
        * @param message ReplicaInfo
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ReplicaInfo message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents an UpdateInstanceMetadata. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.UpdateInstanceMetadata")
    @js.native
    /**
      * Constructs a new UpdateInstanceMetadata.
      * @param [properties] Properties to set
      */
    open class UpdateInstanceMetadata ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata {
      def this(properties: IUpdateInstanceMetadata) = this()
    }
    object UpdateInstanceMetadata {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.UpdateInstanceMetadata")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new UpdateInstanceMetadata instance using the specified properties.
        * @param [properties] Properties to set
        * @returns UpdateInstanceMetadata instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata]
      inline def create(properties: IUpdateInstanceMetadata): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata]
      /**
        * Decodes an UpdateInstanceMetadata message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns UpdateInstanceMetadata
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata]
      /**
        * Decodes an UpdateInstanceMetadata message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns UpdateInstanceMetadata
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata]
      
      /**
        * Encodes the specified UpdateInstanceMetadata message. Does not implicitly {@link google.spanner.admin.instance.v1.UpdateInstanceMetadata.verify|verify} messages.
        * @param message UpdateInstanceMetadata message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IUpdateInstanceMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IUpdateInstanceMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified UpdateInstanceMetadata message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.UpdateInstanceMetadata.verify|verify} messages.
        * @param message UpdateInstanceMetadata message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IUpdateInstanceMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IUpdateInstanceMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates an UpdateInstanceMetadata message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns UpdateInstanceMetadata
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata]
      
      /**
        * Gets the default type url for UpdateInstanceMetadata
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from an UpdateInstanceMetadata message. Also converts values to other types if specified.
        * @param message UpdateInstanceMetadata
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies an UpdateInstanceMetadata message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents an UpdateInstanceRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.UpdateInstanceRequest")
    @js.native
    /**
      * Constructs a new UpdateInstanceRequest.
      * @param [properties] Properties to set
      */
    open class UpdateInstanceRequest ()
      extends typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest {
      def this(properties: IUpdateInstanceRequest) = this()
    }
    object UpdateInstanceRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.instance.v1.UpdateInstanceRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new UpdateInstanceRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns UpdateInstanceRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest]
      inline def create(properties: IUpdateInstanceRequest): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest]
      /**
        * Decodes an UpdateInstanceRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns UpdateInstanceRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest]
      /**
        * Decodes an UpdateInstanceRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns UpdateInstanceRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest]
      
      /**
        * Encodes the specified UpdateInstanceRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.UpdateInstanceRequest.verify|verify} messages.
        * @param message UpdateInstanceRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IUpdateInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IUpdateInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified UpdateInstanceRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.UpdateInstanceRequest.verify|verify} messages.
        * @param message UpdateInstanceRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IUpdateInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IUpdateInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates an UpdateInstanceRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns UpdateInstanceRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest]
      
      /**
        * Gets the default type url for UpdateInstanceRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from an UpdateInstanceRequest message. Also converts values to other types if specified.
        * @param message UpdateInstanceRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest
      ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies an UpdateInstanceRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
  }
}
