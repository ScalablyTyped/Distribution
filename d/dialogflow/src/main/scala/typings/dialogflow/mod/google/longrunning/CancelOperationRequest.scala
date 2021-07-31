package typings.dialogflow.mod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CancelOperationRequest. */
@JSImport("dialogflow/protos/protos", "google.longrunning.CancelOperationRequest")
@js.native
/**
  * Constructs a new CancelOperationRequest.
  * @param [properties] Properties to set
  */
class CancelOperationRequest ()
  extends StObject
     with ICancelOperationRequest {
  def this(properties: ICancelOperationRequest) = this()
  
  /** CancelOperationRequest name. */
  @JSName("name")
  var name_CancelOperationRequest: String = js.native
  
  /**
    * Converts this CancelOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CancelOperationRequest {
  
  @JSImport("dialogflow/protos/protos", "google.longrunning.CancelOperationRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CancelOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CancelOperationRequest instance
    */
  /* static member */
  @scala.inline
  def create(): CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CancelOperationRequest]
  @scala.inline
  def create(properties: ICancelOperationRequest): CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CancelOperationRequest]
  
  /**
    * Decodes a CancelOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CancelOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CancelOperationRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): CancelOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CancelOperationRequest]
  @scala.inline
  def decode(reader: Uint8Array): CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CancelOperationRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): CancelOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CancelOperationRequest]
  
  /**
    * Decodes a CancelOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CancelOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CancelOperationRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CancelOperationRequest]
  
  /**
    * Encodes the specified CancelOperationRequest message. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
    * @param message CancelOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ICancelOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ICancelOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CancelOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
    * @param message CancelOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ICancelOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ICancelOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CancelOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CancelOperationRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CancelOperationRequest]
  
  /**
    * Creates a plain object from a CancelOperationRequest message. Also converts values to other types if specified.
    * @param message CancelOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: CancelOperationRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: CancelOperationRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CancelOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
