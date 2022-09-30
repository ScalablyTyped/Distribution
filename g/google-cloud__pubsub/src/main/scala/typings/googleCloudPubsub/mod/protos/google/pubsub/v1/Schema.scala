package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISchema
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Schema. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Schema")
@js.native
/**
  * Constructs a new Schema.
  * @param [properties] Properties to set
  */
open class Schema ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema {
  def this(properties: ISchema) = this()
}
object Schema {
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Schema")
  @js.native
  val ^ : js.Any = js.native
  
  /** Type enum. */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Schema.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema.Type & Double] = js.native
    
    /* 2 */ val AVRO: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema.Type.AVRO & Double = js.native
    
    /* 1 */ val PROTOCOL_BUFFER: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema.Type.PROTOCOL_BUFFER & Double = js.native
    
    /* 0 */ val TYPE_UNSPECIFIED: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema.Type.TYPE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new Schema instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Schema instance
    */
  /* static member */
  inline def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema]
  inline def create(properties: ISchema): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema]
  /**
    * Decodes a Schema message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Schema
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema]
  inline def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema]
  /**
    * Decodes a Schema message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Schema
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema]
  
  /**
    * Encodes the specified Schema message. Does not implicitly {@link google.pubsub.v1.Schema.verify|verify} messages.
    * @param message Schema message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISchema): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISchema, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Schema message, length delimited. Does not implicitly {@link google.pubsub.v1.Schema.verify|verify} messages.
    * @param message Schema message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISchema): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISchema, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Schema message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Schema
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema]
  
  /**
    * Gets the default type url for Schema
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a Schema message. Also converts values to other types if specified.
    * @param message Schema
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Schema, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Schema message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
