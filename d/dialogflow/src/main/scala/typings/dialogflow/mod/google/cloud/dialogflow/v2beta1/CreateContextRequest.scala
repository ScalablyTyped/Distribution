package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateContextRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateContextRequest")
@js.native
/**
  * Constructs a new CreateContextRequest.
  * @param [properties] Properties to set
  */
open class CreateContextRequest ()
  extends StObject
     with ICreateContextRequest {
  def this(properties: ICreateContextRequest) = this()
  
  /** CreateContextRequest parent. */
  @JSName("parent")
  var parent_CreateContextRequest: String = js.native
  
  /**
    * Converts this CreateContextRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateContextRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateContextRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateContextRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateContextRequest instance
    */
  /* static member */
  inline def create(): CreateContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateContextRequest]
  inline def create(properties: ICreateContextRequest): CreateContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateContextRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): CreateContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateContextRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CreateContextRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateContextRequest]
  /**
    * Decodes a CreateContextRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateContextRequest]
  inline def decode(reader: Reader, length: Double): CreateContextRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateContextRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CreateContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateContextRequest]
  /**
    * Decodes a CreateContextRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateContextRequest]
  
  /**
    * Encodes the specified CreateContextRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateContextRequest.verify|verify} messages.
    * @param message CreateContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateContextRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateContextRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateContextRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateContextRequest.verify|verify} messages.
    * @param message CreateContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateContextRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateContextRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateContextRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateContextRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateContextRequest]
  
  /**
    * Creates a plain object from a CreateContextRequest message. Also converts values to other types if specified.
    * @param message CreateContextRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateContextRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateContextRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CreateContextRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
