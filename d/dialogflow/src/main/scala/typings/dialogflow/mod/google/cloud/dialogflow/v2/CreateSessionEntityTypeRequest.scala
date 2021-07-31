package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateSessionEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateSessionEntityTypeRequest")
@js.native
/**
  * Constructs a new CreateSessionEntityTypeRequest.
  * @param [properties] Properties to set
  */
class CreateSessionEntityTypeRequest ()
  extends StObject
     with ICreateSessionEntityTypeRequest {
  def this(properties: ICreateSessionEntityTypeRequest) = this()
  
  /** CreateSessionEntityTypeRequest parent. */
  @JSName("parent")
  var parent_CreateSessionEntityTypeRequest: String = js.native
  
  /**
    * Converts this CreateSessionEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateSessionEntityTypeRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateSessionEntityTypeRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateSessionEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateSessionEntityTypeRequest instance
    */
  /* static member */
  @scala.inline
  def create(): CreateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateSessionEntityTypeRequest]
  @scala.inline
  def create(properties: ICreateSessionEntityTypeRequest): CreateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateSessionEntityTypeRequest]
  
  /**
    * Decodes a CreateSessionEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): CreateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSessionEntityTypeRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): CreateSessionEntityTypeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateSessionEntityTypeRequest]
  @scala.inline
  def decode(reader: Uint8Array): CreateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSessionEntityTypeRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): CreateSessionEntityTypeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateSessionEntityTypeRequest]
  
  /**
    * Decodes a CreateSessionEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): CreateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSessionEntityTypeRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): CreateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSessionEntityTypeRequest]
  
  /**
    * Encodes the specified CreateSessionEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.CreateSessionEntityTypeRequest.verify|verify} messages.
    * @param message CreateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ICreateSessionEntityTypeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ICreateSessionEntityTypeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateSessionEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.CreateSessionEntityTypeRequest.verify|verify} messages.
    * @param message CreateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ICreateSessionEntityTypeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ICreateSessionEntityTypeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateSessionEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateSessionEntityTypeRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): CreateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateSessionEntityTypeRequest]
  
  /**
    * Creates a plain object from a CreateSessionEntityTypeRequest message. Also converts values to other types if specified.
    * @param message CreateSessionEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: CreateSessionEntityTypeRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: CreateSessionEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CreateSessionEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
