package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
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
open class DeleteAllContextsRequest ()
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
  def toJSON(): StringDictionary[Any] = js.native
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
  inline def create(): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DeleteAllContextsRequest]
  inline def create(properties: IDeleteAllContextsRequest): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DeleteAllContextsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteAllContextsRequest]
  /**
    * Decodes a DeleteAllContextsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteAllContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  inline def decode(reader: Reader, length: Double): DeleteAllContextsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteAllContextsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  /**
    * Decodes a DeleteAllContextsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteAllContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  
  /**
    * Encodes the specified DeleteAllContextsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteAllContextsRequest.verify|verify} messages.
    * @param message DeleteAllContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDeleteAllContextsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDeleteAllContextsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeleteAllContextsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteAllContextsRequest.verify|verify} messages.
    * @param message DeleteAllContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDeleteAllContextsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDeleteAllContextsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeleteAllContextsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteAllContextsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DeleteAllContextsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteAllContextsRequest]
  
  /**
    * Creates a plain object from a DeleteAllContextsRequest message. Also converts values to other types if specified.
    * @param message DeleteAllContextsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DeleteAllContextsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DeleteAllContextsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DeleteAllContextsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
