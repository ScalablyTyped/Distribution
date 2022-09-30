package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateSchemaRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSchemaRequest")
@js.native
/**
  * Constructs a new CreateSchemaRequest.
  * @param [properties] Properties to set
  */
open class CreateSchemaRequest ()
  extends StObject
     with ICreateSchemaRequest {
  def this(properties: ICreateSchemaRequest) = this()
  
  /** CreateSchemaRequest parent. */
  @JSName("parent")
  var parent_CreateSchemaRequest: String = js.native
  
  /** CreateSchemaRequest schemaId. */
  @JSName("schemaId")
  var schemaId_CreateSchemaRequest: String = js.native
  
  /**
    * Converts this CreateSchemaRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateSchemaRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSchemaRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateSchemaRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateSchemaRequest instance
    */
  /* static member */
  inline def create(): CreateSchemaRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateSchemaRequest]
  inline def create(properties: ICreateSchemaRequest): CreateSchemaRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateSchemaRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): CreateSchemaRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSchemaRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CreateSchemaRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateSchemaRequest]
  /**
    * Decodes a CreateSchemaRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateSchemaRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateSchemaRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSchemaRequest]
  inline def decode(reader: Reader, length: Double): CreateSchemaRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateSchemaRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CreateSchemaRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSchemaRequest]
  /**
    * Decodes a CreateSchemaRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateSchemaRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateSchemaRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSchemaRequest]
  
  /**
    * Encodes the specified CreateSchemaRequest message. Does not implicitly {@link google.pubsub.v1.CreateSchemaRequest.verify|verify} messages.
    * @param message CreateSchemaRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateSchemaRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateSchemaRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateSchemaRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.CreateSchemaRequest.verify|verify} messages.
    * @param message CreateSchemaRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateSchemaRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateSchemaRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateSchemaRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateSchemaRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateSchemaRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateSchemaRequest]
  
  /**
    * Gets the default type url for CreateSchemaRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CreateSchemaRequest message. Also converts values to other types if specified.
    * @param message CreateSchemaRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateSchemaRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateSchemaRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CreateSchemaRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
