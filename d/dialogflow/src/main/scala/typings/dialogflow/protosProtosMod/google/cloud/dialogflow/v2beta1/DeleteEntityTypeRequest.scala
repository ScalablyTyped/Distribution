package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest")
@js.native
/**
  * Constructs a new DeleteEntityTypeRequest.
  * @param [properties] Properties to set
  */
open class DeleteEntityTypeRequest ()
  extends StObject
     with IDeleteEntityTypeRequest {
  def this(properties: IDeleteEntityTypeRequest) = this()
  
  /** DeleteEntityTypeRequest name. */
  @JSName("name")
  var name_DeleteEntityTypeRequest: String = js.native
  
  /**
    * Converts this DeleteEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DeleteEntityTypeRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeleteEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteEntityTypeRequest instance
    */
  /* static member */
  inline def create(): DeleteEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DeleteEntityTypeRequest]
  inline def create(properties: IDeleteEntityTypeRequest): DeleteEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DeleteEntityTypeRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): DeleteEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteEntityTypeRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DeleteEntityTypeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteEntityTypeRequest]
  /**
    * Decodes a DeleteEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DeleteEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteEntityTypeRequest]
  inline def decode(reader: Reader, length: Double): DeleteEntityTypeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteEntityTypeRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DeleteEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteEntityTypeRequest]
  /**
    * Decodes a DeleteEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DeleteEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteEntityTypeRequest]
  
  /**
    * Encodes the specified DeleteEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.verify|verify} messages.
    * @param message DeleteEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDeleteEntityTypeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDeleteEntityTypeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeleteEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.verify|verify} messages.
    * @param message DeleteEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDeleteEntityTypeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDeleteEntityTypeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeleteEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteEntityTypeRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DeleteEntityTypeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteEntityTypeRequest]
  
  /**
    * Creates a plain object from a DeleteEntityTypeRequest message. Also converts values to other types if specified.
    * @param message DeleteEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DeleteEntityTypeRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DeleteEntityTypeRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DeleteEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
