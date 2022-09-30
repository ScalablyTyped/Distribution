package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IBigQueryConfig
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BigQueryConfig. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.BigQueryConfig")
@js.native
/**
  * Constructs a new BigQueryConfig.
  * @param [properties] Properties to set
  */
open class BigQueryConfig ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig {
  def this(properties: IBigQueryConfig) = this()
}
object BigQueryConfig {
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.BigQueryConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /** State enum. */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.BigQueryConfig.State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig.State & Double
      ] = js.native
    
    /* 1 */ val ACTIVE: typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig.State.ACTIVE & Double = js.native
    
    /* 3 */ val NOT_FOUND: typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig.State.NOT_FOUND & Double = js.native
    
    /* 2 */ val PERMISSION_DENIED: typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig.State.PERMISSION_DENIED & Double = js.native
    
    /* 4 */ val SCHEMA_MISMATCH: typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig.State.SCHEMA_MISMATCH & Double = js.native
    
    /* 0 */ val STATE_UNSPECIFIED: typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig.State.STATE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new BigQueryConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BigQueryConfig instance
    */
  /* static member */
  inline def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig]
  inline def create(properties: IBigQueryConfig): typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig]
  /**
    * Decodes a BigQueryConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BigQueryConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig]
  inline def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig]
  /**
    * Decodes a BigQueryConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BigQueryConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig]
  
  /**
    * Encodes the specified BigQueryConfig message. Does not implicitly {@link google.pubsub.v1.BigQueryConfig.verify|verify} messages.
    * @param message BigQueryConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBigQueryConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBigQueryConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BigQueryConfig message, length delimited. Does not implicitly {@link google.pubsub.v1.BigQueryConfig.verify|verify} messages.
    * @param message BigQueryConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBigQueryConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBigQueryConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BigQueryConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BigQueryConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig]
  
  /**
    * Gets the default type url for BigQueryConfig
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a BigQueryConfig message. Also converts values to other types if specified.
    * @param message BigQueryConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BigQueryConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
