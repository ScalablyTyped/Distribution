package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.googleCloudPubsubStrings.name
import typings.googleCloudPubsub.googleCloudPubsubStrings.schema
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ValidateMessageRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ValidateMessageRequest")
@js.native
/**
  * Constructs a new ValidateMessageRequest.
  * @param [properties] Properties to set
  */
open class ValidateMessageRequest ()
  extends StObject
     with IValidateMessageRequest {
  def this(properties: IValidateMessageRequest) = this()
  
  /** ValidateMessageRequest encoding. */
  @JSName("encoding")
  var encoding_ValidateMessageRequest: Encoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Encoding * / any */ String) = js.native
  
  /** ValidateMessageRequest message. */
  @JSName("message")
  var message_ValidateMessageRequest: js.typedarray.Uint8Array | String = js.native
  
  /** ValidateMessageRequest parent. */
  @JSName("parent")
  var parent_ValidateMessageRequest: String = js.native
  
  /** ValidateMessageRequest schemaSpec. */
  var schemaSpec: js.UndefOr[name | schema] = js.native
  
  /**
    * Converts this ValidateMessageRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ValidateMessageRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ValidateMessageRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ValidateMessageRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ValidateMessageRequest instance
    */
  /* static member */
  inline def create(): ValidateMessageRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ValidateMessageRequest]
  inline def create(properties: IValidateMessageRequest): ValidateMessageRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ValidateMessageRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ValidateMessageRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidateMessageRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ValidateMessageRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValidateMessageRequest]
  /**
    * Decodes a ValidateMessageRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ValidateMessageRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ValidateMessageRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidateMessageRequest]
  inline def decode(reader: Reader, length: Double): ValidateMessageRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValidateMessageRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ValidateMessageRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidateMessageRequest]
  /**
    * Decodes a ValidateMessageRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ValidateMessageRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ValidateMessageRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidateMessageRequest]
  
  /**
    * Encodes the specified ValidateMessageRequest message. Does not implicitly {@link google.pubsub.v1.ValidateMessageRequest.verify|verify} messages.
    * @param message ValidateMessageRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IValidateMessageRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IValidateMessageRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ValidateMessageRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ValidateMessageRequest.verify|verify} messages.
    * @param message ValidateMessageRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IValidateMessageRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IValidateMessageRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ValidateMessageRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ValidateMessageRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ValidateMessageRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ValidateMessageRequest]
  
  /**
    * Gets the default type url for ValidateMessageRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ValidateMessageRequest message. Also converts values to other types if specified.
    * @param message ValidateMessageRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ValidateMessageRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ValidateMessageRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ValidateMessageRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
