package typings.googleCloudSpanner.mod.protos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.iam.v1.IAuditConfig
import typings.googleCloudSpanner.protosMod.google.iam.v1.IAuditConfigDelta
import typings.googleCloudSpanner.protosMod.google.iam.v1.IAuditLogConfig
import typings.googleCloudSpanner.protosMod.google.iam.v1.IBinding
import typings.googleCloudSpanner.protosMod.google.iam.v1.IBindingDelta
import typings.googleCloudSpanner.protosMod.google.iam.v1.IGetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.IGetPolicyOptions
import typings.googleCloudSpanner.protosMod.google.iam.v1.IPolicy
import typings.googleCloudSpanner.protosMod.google.iam.v1.IPolicyDelta
import typings.googleCloudSpanner.protosMod.google.iam.v1.ISetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ITestIamPermissionsRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ITestIamPermissionsResponse
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace iam. */
object iam {
  
  /** Namespace v1. */
  object v1 {
    
    /** Represents an AuditConfig. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.AuditConfig")
    @js.native
    /**
      * Constructs a new AuditConfig.
      * @param [properties] Properties to set
      */
    open class AuditConfig ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig {
      def this(properties: IAuditConfig) = this()
    }
    object AuditConfig {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.AuditConfig")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new AuditConfig instance using the specified properties.
        * @param [properties] Properties to set
        * @returns AuditConfig instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig]
      inline def create(properties: IAuditConfig): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig]
      /**
        * Decodes an AuditConfig message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns AuditConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig]
      /**
        * Decodes an AuditConfig message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns AuditConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig]
      
      /**
        * Encodes the specified AuditConfig message. Does not implicitly {@link google.iam.v1.AuditConfig.verify|verify} messages.
        * @param message AuditConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IAuditConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IAuditConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified AuditConfig message, length delimited. Does not implicitly {@link google.iam.v1.AuditConfig.verify|verify} messages.
        * @param message AuditConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IAuditConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IAuditConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates an AuditConfig message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns AuditConfig
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig]
      
      /**
        * Gets the default type url for AuditConfig
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from an AuditConfig message. Also converts values to other types if specified.
        * @param message AuditConfig
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfig,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies an AuditConfig message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents an AuditConfigDelta. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.AuditConfigDelta")
    @js.native
    /**
      * Constructs a new AuditConfigDelta.
      * @param [properties] Properties to set
      */
    open class AuditConfigDelta ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta {
      def this(properties: IAuditConfigDelta) = this()
    }
    object AuditConfigDelta {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.AuditConfigDelta")
      @js.native
      val ^ : js.Any = js.native
      
      /** Action enum. */
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.AuditConfigDelta.Action")
      @js.native
      object Action extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta.Action & Double
              ] = js.native
        
        /* 0 */ val ACTION_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta.Action.ACTION_UNSPECIFIED & Double = js.native
        
        /* 1 */ val ADD: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta.Action.ADD & Double = js.native
        
        /* 2 */ val REMOVE: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta.Action.REMOVE & Double = js.native
      }
      
      /**
        * Creates a new AuditConfigDelta instance using the specified properties.
        * @param [properties] Properties to set
        * @returns AuditConfigDelta instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta]
      inline def create(properties: IAuditConfigDelta): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta]
      /**
        * Decodes an AuditConfigDelta message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns AuditConfigDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta]
      /**
        * Decodes an AuditConfigDelta message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns AuditConfigDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta]
      
      /**
        * Encodes the specified AuditConfigDelta message. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
        * @param message AuditConfigDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IAuditConfigDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IAuditConfigDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified AuditConfigDelta message, length delimited. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
        * @param message AuditConfigDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IAuditConfigDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IAuditConfigDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates an AuditConfigDelta message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns AuditConfigDelta
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta]
      
      /**
        * Gets the default type url for AuditConfigDelta
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from an AuditConfigDelta message. Also converts values to other types if specified.
        * @param message AuditConfigDelta
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies an AuditConfigDelta message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents an AuditLogConfig. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.AuditLogConfig")
    @js.native
    /**
      * Constructs a new AuditLogConfig.
      * @param [properties] Properties to set
      */
    open class AuditLogConfig ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig {
      def this(properties: IAuditLogConfig) = this()
    }
    object AuditLogConfig {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.AuditLogConfig")
      @js.native
      val ^ : js.Any = js.native
      
      /** LogType enum. */
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.AuditLogConfig.LogType")
      @js.native
      object LogType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType & Double
              ] = js.native
        
        /* 1 */ val ADMIN_READ: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType.ADMIN_READ & Double = js.native
        
        /* 3 */ val DATA_READ: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType.DATA_READ & Double = js.native
        
        /* 2 */ val DATA_WRITE: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType.DATA_WRITE & Double = js.native
        
        /* 0 */ val LOG_TYPE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType.LOG_TYPE_UNSPECIFIED & Double = js.native
      }
      
      /**
        * Creates a new AuditLogConfig instance using the specified properties.
        * @param [properties] Properties to set
        * @returns AuditLogConfig instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig]
      inline def create(properties: IAuditLogConfig): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig]
      /**
        * Decodes an AuditLogConfig message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns AuditLogConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig]
      /**
        * Decodes an AuditLogConfig message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns AuditLogConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig]
      
      /**
        * Encodes the specified AuditLogConfig message. Does not implicitly {@link google.iam.v1.AuditLogConfig.verify|verify} messages.
        * @param message AuditLogConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IAuditLogConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IAuditLogConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified AuditLogConfig message, length delimited. Does not implicitly {@link google.iam.v1.AuditLogConfig.verify|verify} messages.
        * @param message AuditLogConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IAuditLogConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IAuditLogConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates an AuditLogConfig message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns AuditLogConfig
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig]
      
      /**
        * Gets the default type url for AuditLogConfig
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from an AuditLogConfig message. Also converts values to other types if specified.
        * @param message AuditLogConfig
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies an AuditLogConfig message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Binding. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.Binding")
    @js.native
    /**
      * Constructs a new Binding.
      * @param [properties] Properties to set
      */
    open class Binding ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.Binding {
      def this(properties: IBinding) = this()
    }
    object Binding {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.Binding")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Binding instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Binding instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Binding]
      inline def create(properties: IBinding): typings.googleCloudSpanner.protosMod.google.iam.v1.Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Binding]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Binding]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.Binding = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Binding]
      /**
        * Decodes a Binding message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Binding
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Binding]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.Binding = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Binding]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Binding]
      /**
        * Decodes a Binding message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Binding
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Binding]
      
      /**
        * Encodes the specified Binding message. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
        * @param message Binding message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IBinding): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IBinding, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Binding message, length delimited. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
        * @param message Binding message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IBinding): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IBinding, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Binding message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Binding
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Binding]
      
      /**
        * Gets the default type url for Binding
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a Binding message. Also converts values to other types if specified.
        * @param message Binding
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.Binding): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.Binding, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Binding message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a BindingDelta. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.BindingDelta")
    @js.native
    /**
      * Constructs a new BindingDelta.
      * @param [properties] Properties to set
      */
    open class BindingDelta ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta {
      def this(properties: IBindingDelta) = this()
    }
    object BindingDelta {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.BindingDelta")
      @js.native
      val ^ : js.Any = js.native
      
      /** Action enum. */
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.BindingDelta.Action")
      @js.native
      object Action extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta.Action & Double] = js.native
        
        /* 0 */ val ACTION_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta.Action.ACTION_UNSPECIFIED & Double = js.native
        
        /* 1 */ val ADD: typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta.Action.ADD & Double = js.native
        
        /* 2 */ val REMOVE: typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta.Action.REMOVE & Double = js.native
      }
      
      /**
        * Creates a new BindingDelta instance using the specified properties.
        * @param [properties] Properties to set
        * @returns BindingDelta instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta]
      inline def create(properties: IBindingDelta): typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta]
      /**
        * Decodes a BindingDelta message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns BindingDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta]
      /**
        * Decodes a BindingDelta message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns BindingDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta]
      
      /**
        * Encodes the specified BindingDelta message. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
        * @param message BindingDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IBindingDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IBindingDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified BindingDelta message, length delimited. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
        * @param message BindingDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IBindingDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IBindingDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a BindingDelta message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns BindingDelta
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta]
      
      /**
        * Gets the default type url for BindingDelta
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a BindingDelta message. Also converts values to other types if specified.
        * @param message BindingDelta
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a BindingDelta message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a GetIamPolicyRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.GetIamPolicyRequest")
    @js.native
    /**
      * Constructs a new GetIamPolicyRequest.
      * @param [properties] Properties to set
      */
    open class GetIamPolicyRequest ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest {
      def this(properties: IGetIamPolicyRequest) = this()
    }
    object GetIamPolicyRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.GetIamPolicyRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new GetIamPolicyRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns GetIamPolicyRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest]
      inline def create(properties: IGetIamPolicyRequest): typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest]
      /**
        * Decodes a GetIamPolicyRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GetIamPolicyRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest]
      /**
        * Decodes a GetIamPolicyRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GetIamPolicyRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest]
      
      /**
        * Encodes the specified GetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
        * @param message GetIamPolicyRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IGetIamPolicyRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IGetIamPolicyRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified GetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
        * @param message GetIamPolicyRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IGetIamPolicyRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IGetIamPolicyRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a GetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns GetIamPolicyRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest]
      
      /**
        * Gets the default type url for GetIamPolicyRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a GetIamPolicyRequest message. Also converts values to other types if specified.
        * @param message GetIamPolicyRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.GetIamPolicyRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a GetIamPolicyRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a GetPolicyOptions. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.GetPolicyOptions")
    @js.native
    /**
      * Constructs a new GetPolicyOptions.
      * @param [properties] Properties to set
      */
    open class GetPolicyOptions ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions {
      def this(properties: IGetPolicyOptions) = this()
    }
    object GetPolicyOptions {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.GetPolicyOptions")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new GetPolicyOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns GetPolicyOptions instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions]
      inline def create(properties: IGetPolicyOptions): typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions]
      /**
        * Decodes a GetPolicyOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GetPolicyOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions]
      /**
        * Decodes a GetPolicyOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GetPolicyOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions]
      
      /**
        * Encodes the specified GetPolicyOptions message. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
        * @param message GetPolicyOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IGetPolicyOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IGetPolicyOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified GetPolicyOptions message, length delimited. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
        * @param message GetPolicyOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IGetPolicyOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IGetPolicyOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a GetPolicyOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns GetPolicyOptions
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions]
      
      /**
        * Gets the default type url for GetPolicyOptions
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a GetPolicyOptions message. Also converts values to other types if specified.
        * @param message GetPolicyOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.GetPolicyOptions,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a GetPolicyOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a IAMPolicy */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.IAMPolicy")
    @js.native
    open class IAMPolicy protected ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.IAMPolicy {
      /**
        * Constructs a new IAMPolicy service.
        * @param rpcImpl RPC implementation
        * @param [requestDelimited=false] Whether requests are length-delimited
        * @param [responseDelimited=false] Whether responses are length-delimited
        */
      def this(rpcImpl: RPCImpl) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
    }
    object IAMPolicy {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.IAMPolicy")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates new IAMPolicy service using the specified rpc implementation.
        * @param rpcImpl RPC implementation
        * @param [requestDelimited=false] Whether requests are length-delimited
        * @param [responseDelimited=false] Whether responses are length-delimited
        * @returns RPC service. Useful where requests and/or responses are streamed.
        */
      /* static member */
      inline def create(rpcImpl: RPCImpl): typings.googleCloudSpanner.protosMod.google.iam.v1.IAMPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.IAMPolicy]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleCloudSpanner.protosMod.google.iam.v1.IAMPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.IAMPolicy]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleCloudSpanner.protosMod.google.iam.v1.IAMPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.IAMPolicy]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): typings.googleCloudSpanner.protosMod.google.iam.v1.IAMPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.IAMPolicy]
    }
    
    /** Represents a Policy. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.Policy")
    @js.native
    /**
      * Constructs a new Policy.
      * @param [properties] Properties to set
      */
    open class Policy ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.Policy {
      def this(properties: IPolicy) = this()
    }
    object Policy {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.Policy")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Policy instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Policy instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Policy]
      inline def create(properties: IPolicy): typings.googleCloudSpanner.protosMod.google.iam.v1.Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Policy]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Policy]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Policy]
      /**
        * Decodes a Policy message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Policy
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Policy]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Policy]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Policy]
      /**
        * Decodes a Policy message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Policy
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Policy]
      
      /**
        * Encodes the specified Policy message. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
        * @param message Policy message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Policy message, length delimited. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
        * @param message Policy message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Policy message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Policy
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.Policy]
      
      /**
        * Gets the default type url for Policy
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a Policy message. Also converts values to other types if specified.
        * @param message Policy
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.Policy): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.Policy, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Policy message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a PolicyDelta. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.PolicyDelta")
    @js.native
    /**
      * Constructs a new PolicyDelta.
      * @param [properties] Properties to set
      */
    open class PolicyDelta ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta {
      def this(properties: IPolicyDelta) = this()
    }
    object PolicyDelta {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.PolicyDelta")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new PolicyDelta instance using the specified properties.
        * @param [properties] Properties to set
        * @returns PolicyDelta instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta]
      inline def create(properties: IPolicyDelta): typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta]
      /**
        * Decodes a PolicyDelta message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns PolicyDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta]
      /**
        * Decodes a PolicyDelta message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns PolicyDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta]
      
      /**
        * Encodes the specified PolicyDelta message. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
        * @param message PolicyDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IPolicyDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IPolicyDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified PolicyDelta message, length delimited. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
        * @param message PolicyDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IPolicyDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IPolicyDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a PolicyDelta message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns PolicyDelta
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta]
      
      /**
        * Gets the default type url for PolicyDelta
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a PolicyDelta message. Also converts values to other types if specified.
        * @param message PolicyDelta
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.PolicyDelta,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a PolicyDelta message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a SetIamPolicyRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.SetIamPolicyRequest")
    @js.native
    /**
      * Constructs a new SetIamPolicyRequest.
      * @param [properties] Properties to set
      */
    open class SetIamPolicyRequest ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest {
      def this(properties: ISetIamPolicyRequest) = this()
    }
    object SetIamPolicyRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.SetIamPolicyRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SetIamPolicyRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SetIamPolicyRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest]
      inline def create(properties: ISetIamPolicyRequest): typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest]
      /**
        * Decodes a SetIamPolicyRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SetIamPolicyRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest]
      /**
        * Decodes a SetIamPolicyRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SetIamPolicyRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest]
      
      /**
        * Encodes the specified SetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
        * @param message SetIamPolicyRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ISetIamPolicyRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ISetIamPolicyRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified SetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
        * @param message SetIamPolicyRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ISetIamPolicyRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ISetIamPolicyRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a SetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SetIamPolicyRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest]
      
      /**
        * Gets the default type url for SetIamPolicyRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a SetIamPolicyRequest message. Also converts values to other types if specified.
        * @param message SetIamPolicyRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.SetIamPolicyRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a SetIamPolicyRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TestIamPermissionsRequest. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.TestIamPermissionsRequest")
    @js.native
    /**
      * Constructs a new TestIamPermissionsRequest.
      * @param [properties] Properties to set
      */
    open class TestIamPermissionsRequest ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest {
      def this(properties: ITestIamPermissionsRequest) = this()
    }
    object TestIamPermissionsRequest {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.TestIamPermissionsRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TestIamPermissionsRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TestIamPermissionsRequest instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest]
      inline def create(properties: ITestIamPermissionsRequest): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest]
      /**
        * Decodes a TestIamPermissionsRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TestIamPermissionsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest]
      /**
        * Decodes a TestIamPermissionsRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TestIamPermissionsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest]
      
      /**
        * Encodes the specified TestIamPermissionsRequest message. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
        * @param message TestIamPermissionsRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ITestIamPermissionsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ITestIamPermissionsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TestIamPermissionsRequest message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
        * @param message TestIamPermissionsRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ITestIamPermissionsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ITestIamPermissionsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TestIamPermissionsRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TestIamPermissionsRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest]
      
      /**
        * Gets the default type url for TestIamPermissionsRequest
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a TestIamPermissionsRequest message. Also converts values to other types if specified.
        * @param message TestIamPermissionsRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a TestIamPermissionsRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TestIamPermissionsResponse. */
    @JSImport("@google-cloud/spanner", "protos.google.iam.v1.TestIamPermissionsResponse")
    @js.native
    /**
      * Constructs a new TestIamPermissionsResponse.
      * @param [properties] Properties to set
      */
    open class TestIamPermissionsResponse ()
      extends typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse {
      def this(properties: ITestIamPermissionsResponse) = this()
    }
    object TestIamPermissionsResponse {
      
      @JSImport("@google-cloud/spanner", "protos.google.iam.v1.TestIamPermissionsResponse")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TestIamPermissionsResponse instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TestIamPermissionsResponse instance
        */
      /* static member */
      inline def create(): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse]
      inline def create(properties: ITestIamPermissionsResponse): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse]
      /**
        * Decodes a TestIamPermissionsResponse message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TestIamPermissionsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse]
      inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse]
      /**
        * Decodes a TestIamPermissionsResponse message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TestIamPermissionsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse]
      
      /**
        * Encodes the specified TestIamPermissionsResponse message. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
        * @param message TestIamPermissionsResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ITestIamPermissionsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ITestIamPermissionsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TestIamPermissionsResponse message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
        * @param message TestIamPermissionsResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ITestIamPermissionsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ITestIamPermissionsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TestIamPermissionsResponse message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TestIamPermissionsResponse
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse]
      
      /**
        * Gets the default type url for TestIamPermissionsResponse
        * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
        * @returns The default type url
        */
      /* static member */
      inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
      inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Creates a plain object from a TestIamPermissionsResponse message. Also converts values to other types if specified.
        * @param message TestIamPermissionsResponse
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a TestIamPermissionsResponse message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
  }
}
