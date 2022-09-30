package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SchemaSettings. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SchemaSettings")
@js.native
/**
  * Constructs a new SchemaSettings.
  * @param [properties] Properties to set
  */
open class SchemaSettings ()
  extends StObject
     with ISchemaSettings {
  def this(properties: ISchemaSettings) = this()
  
  /** SchemaSettings encoding. */
  @JSName("encoding")
  var encoding_SchemaSettings: Encoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Encoding * / any */ String) = js.native
  
  /** SchemaSettings schema. */
  @JSName("schema")
  var schema_SchemaSettings: String = js.native
  
  /**
    * Converts this SchemaSettings to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object SchemaSettings {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SchemaSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SchemaSettings instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SchemaSettings instance
    */
  /* static member */
  inline def create(): SchemaSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SchemaSettings]
  inline def create(properties: ISchemaSettings): SchemaSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SchemaSettings]
  
  inline def decode(reader: js.typedarray.Uint8Array): SchemaSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SchemaSettings]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SchemaSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SchemaSettings]
  /**
    * Decodes a SchemaSettings message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SchemaSettings
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SchemaSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SchemaSettings]
  inline def decode(reader: Reader, length: Double): SchemaSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SchemaSettings]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SchemaSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SchemaSettings]
  /**
    * Decodes a SchemaSettings message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SchemaSettings
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SchemaSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SchemaSettings]
  
  /**
    * Encodes the specified SchemaSettings message. Does not implicitly {@link google.pubsub.v1.SchemaSettings.verify|verify} messages.
    * @param message SchemaSettings message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISchemaSettings): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISchemaSettings, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SchemaSettings message, length delimited. Does not implicitly {@link google.pubsub.v1.SchemaSettings.verify|verify} messages.
    * @param message SchemaSettings message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISchemaSettings): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISchemaSettings, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SchemaSettings message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SchemaSettings
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SchemaSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SchemaSettings]
  
  /**
    * Gets the default type url for SchemaSettings
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a SchemaSettings message. Also converts values to other types if specified.
    * @param message SchemaSettings
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SchemaSettings): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SchemaSettings, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SchemaSettings message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
