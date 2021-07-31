package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateSessionEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest")
@js.native
/**
  * Constructs a new UpdateSessionEntityTypeRequest.
  * @param [properties] Properties to set
  */
class UpdateSessionEntityTypeRequest ()
  extends StObject
     with IUpdateSessionEntityTypeRequest {
  def this(properties: IUpdateSessionEntityTypeRequest) = this()
  
  /**
    * Converts this UpdateSessionEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UpdateSessionEntityTypeRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new UpdateSessionEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateSessionEntityTypeRequest instance
    */
  /* static member */
  @scala.inline
  def create(): UpdateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UpdateSessionEntityTypeRequest]
  @scala.inline
  def create(properties: IUpdateSessionEntityTypeRequest): UpdateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UpdateSessionEntityTypeRequest]
  
  /**
    * Decodes an UpdateSessionEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): UpdateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSessionEntityTypeRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): UpdateSessionEntityTypeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateSessionEntityTypeRequest]
  @scala.inline
  def decode(reader: Uint8Array): UpdateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSessionEntityTypeRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): UpdateSessionEntityTypeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateSessionEntityTypeRequest]
  
  /**
    * Decodes an UpdateSessionEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): UpdateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSessionEntityTypeRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): UpdateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSessionEntityTypeRequest]
  
  /**
    * Encodes the specified UpdateSessionEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest.verify|verify} messages.
    * @param message UpdateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IUpdateSessionEntityTypeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IUpdateSessionEntityTypeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UpdateSessionEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest.verify|verify} messages.
    * @param message UpdateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IUpdateSessionEntityTypeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IUpdateSessionEntityTypeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UpdateSessionEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateSessionEntityTypeRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): UpdateSessionEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateSessionEntityTypeRequest]
  
  /**
    * Creates a plain object from an UpdateSessionEntityTypeRequest message. Also converts values to other types if specified.
    * @param message UpdateSessionEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: UpdateSessionEntityTypeRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: UpdateSessionEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an UpdateSessionEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
