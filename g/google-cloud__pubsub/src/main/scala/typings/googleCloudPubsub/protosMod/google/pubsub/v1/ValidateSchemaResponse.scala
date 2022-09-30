package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ValidateSchemaResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ValidateSchemaResponse")
@js.native
/**
  * Constructs a new ValidateSchemaResponse.
  * @param [properties] Properties to set
  */
open class ValidateSchemaResponse ()
  extends StObject
     with IValidateSchemaResponse {
  def this(properties: IValidateSchemaResponse) = this()
  
  /**
    * Converts this ValidateSchemaResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ValidateSchemaResponse {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ValidateSchemaResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ValidateSchemaResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ValidateSchemaResponse instance
    */
  /* static member */
  inline def create(): ValidateSchemaResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ValidateSchemaResponse]
  inline def create(properties: IValidateSchemaResponse): ValidateSchemaResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ValidateSchemaResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ValidateSchemaResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidateSchemaResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ValidateSchemaResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValidateSchemaResponse]
  /**
    * Decodes a ValidateSchemaResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ValidateSchemaResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ValidateSchemaResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidateSchemaResponse]
  inline def decode(reader: Reader, length: Double): ValidateSchemaResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValidateSchemaResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ValidateSchemaResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidateSchemaResponse]
  /**
    * Decodes a ValidateSchemaResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ValidateSchemaResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ValidateSchemaResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidateSchemaResponse]
  
  /**
    * Encodes the specified ValidateSchemaResponse message. Does not implicitly {@link google.pubsub.v1.ValidateSchemaResponse.verify|verify} messages.
    * @param message ValidateSchemaResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IValidateSchemaResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IValidateSchemaResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ValidateSchemaResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ValidateSchemaResponse.verify|verify} messages.
    * @param message ValidateSchemaResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IValidateSchemaResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IValidateSchemaResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ValidateSchemaResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ValidateSchemaResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ValidateSchemaResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ValidateSchemaResponse]
  
  /**
    * Gets the default type url for ValidateSchemaResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ValidateSchemaResponse message. Also converts values to other types if specified.
    * @param message ValidateSchemaResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ValidateSchemaResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ValidateSchemaResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ValidateSchemaResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
