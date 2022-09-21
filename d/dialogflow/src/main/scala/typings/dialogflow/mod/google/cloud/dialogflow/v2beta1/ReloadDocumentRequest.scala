package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.gcsSource
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ReloadDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest")
@js.native
/**
  * Constructs a new ReloadDocumentRequest.
  * @param [properties] Properties to set
  */
open class ReloadDocumentRequest ()
  extends StObject
     with IReloadDocumentRequest {
  def this(properties: IReloadDocumentRequest) = this()
  
  /** ReloadDocumentRequest name. */
  @JSName("name")
  var name_ReloadDocumentRequest: String = js.native
  
  /** ReloadDocumentRequest source. */
  var source: js.UndefOr[gcsSource] = js.native
  
  /**
    * Converts this ReloadDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ReloadDocumentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ReloadDocumentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ReloadDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReloadDocumentRequest instance
    */
  /* static member */
  inline def create(): ReloadDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ReloadDocumentRequest]
  inline def create(properties: IReloadDocumentRequest): ReloadDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ReloadDocumentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ReloadDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReloadDocumentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ReloadDocumentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReloadDocumentRequest]
  /**
    * Decodes a ReloadDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReloadDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ReloadDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReloadDocumentRequest]
  inline def decode(reader: Reader, length: Double): ReloadDocumentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReloadDocumentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ReloadDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReloadDocumentRequest]
  /**
    * Decodes a ReloadDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReloadDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ReloadDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReloadDocumentRequest]
  
  /**
    * Encodes the specified ReloadDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.verify|verify} messages.
    * @param message ReloadDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IReloadDocumentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IReloadDocumentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ReloadDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.verify|verify} messages.
    * @param message ReloadDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IReloadDocumentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IReloadDocumentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ReloadDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReloadDocumentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ReloadDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ReloadDocumentRequest]
  
  /**
    * Creates a plain object from a ReloadDocumentRequest message. Also converts values to other types if specified.
    * @param message ReloadDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ReloadDocumentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ReloadDocumentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ReloadDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
