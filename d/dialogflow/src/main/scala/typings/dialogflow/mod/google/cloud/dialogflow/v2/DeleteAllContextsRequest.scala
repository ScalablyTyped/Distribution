package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteAllContextsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteAllContextsRequest")
@js.native
/**
  * Constructs a new DeleteAllContextsRequest.
  * @param [properties] Properties to set
  */
class DeleteAllContextsRequest ()
  extends StObject
     with IDeleteAllContextsRequest {
  def this(properties: IDeleteAllContextsRequest) = this()
  
  /** DeleteAllContextsRequest parent. */
  @JSName("parent")
  var parent_DeleteAllContextsRequest: String = js.native
  
  /**
    * Converts this DeleteAllContextsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteAllContextsRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteAllContextsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeleteAllContextsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteAllContextsRequest instance
    */
  /* static member */
  @scala.inline
  def create(): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DeleteAllContextsRequest]
  @scala.inline
  def create(properties: IDeleteAllContextsRequest): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  
  /**
    * Decodes a DeleteAllContextsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteAllContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): DeleteAllContextsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteAllContextsRequest]
  @scala.inline
  def decode(reader: Uint8Array): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): DeleteAllContextsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteAllContextsRequest]
  
  /**
    * Decodes a DeleteAllContextsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteAllContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  
  /**
    * Encodes the specified DeleteAllContextsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteAllContextsRequest.verify|verify} messages.
    * @param message DeleteAllContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IDeleteAllContextsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IDeleteAllContextsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeleteAllContextsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteAllContextsRequest.verify|verify} messages.
    * @param message DeleteAllContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IDeleteAllContextsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IDeleteAllContextsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeleteAllContextsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteAllContextsRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  
  /**
    * Creates a plain object from a DeleteAllContextsRequest message. Also converts values to other types if specified.
    * @param message DeleteAllContextsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: DeleteAllContextsRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: DeleteAllContextsRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a DeleteAllContextsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
