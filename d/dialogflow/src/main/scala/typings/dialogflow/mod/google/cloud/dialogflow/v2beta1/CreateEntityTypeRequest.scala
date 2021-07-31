package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest")
@js.native
/**
  * Constructs a new CreateEntityTypeRequest.
  * @param [properties] Properties to set
  */
class CreateEntityTypeRequest ()
  extends StObject
     with ICreateEntityTypeRequest {
  def this(properties: ICreateEntityTypeRequest) = this()
  
  /** CreateEntityTypeRequest languageCode. */
  @JSName("languageCode")
  var languageCode_CreateEntityTypeRequest: String = js.native
  
  /** CreateEntityTypeRequest parent. */
  @JSName("parent")
  var parent_CreateEntityTypeRequest: String = js.native
  
  /**
    * Converts this CreateEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateEntityTypeRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateEntityTypeRequest instance
    */
  /* static member */
  @scala.inline
  def create(): CreateEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateEntityTypeRequest]
  @scala.inline
  def create(properties: ICreateEntityTypeRequest): CreateEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateEntityTypeRequest]
  
  /**
    * Decodes a CreateEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): CreateEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateEntityTypeRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): CreateEntityTypeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateEntityTypeRequest]
  @scala.inline
  def decode(reader: Uint8Array): CreateEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateEntityTypeRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): CreateEntityTypeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateEntityTypeRequest]
  
  /**
    * Decodes a CreateEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): CreateEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateEntityTypeRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): CreateEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateEntityTypeRequest]
  
  /**
    * Encodes the specified CreateEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.verify|verify} messages.
    * @param message CreateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ICreateEntityTypeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ICreateEntityTypeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.verify|verify} messages.
    * @param message CreateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ICreateEntityTypeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ICreateEntityTypeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateEntityTypeRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): CreateEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateEntityTypeRequest]
  
  /**
    * Creates a plain object from a CreateEntityTypeRequest message. Also converts values to other types if specified.
    * @param message CreateEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: CreateEntityTypeRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: CreateEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CreateEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
