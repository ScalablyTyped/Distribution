package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListIntentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse")
@js.native
/**
  * Constructs a new ListIntentsResponse.
  * @param [properties] Properties to set
  */
open class ListIntentsResponse ()
  extends StObject
     with IListIntentsResponse {
  def this(properties: IListIntentsResponse) = this()
  
  /** ListIntentsResponse intents. */
  @JSName("intents")
  var intents_ListIntentsResponse: js.Array[IIntent] = js.native
  
  /** ListIntentsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListIntentsResponse: String = js.native
  
  /**
    * Converts this ListIntentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListIntentsResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListIntentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListIntentsResponse instance
    */
  /* static member */
  inline def create(): ListIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListIntentsResponse]
  inline def create(properties: IListIntentsResponse): ListIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListIntentsResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListIntentsResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListIntentsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListIntentsResponse]
  /**
    * Decodes a ListIntentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListIntentsResponse]
  inline def decode(reader: Reader, length: Double): ListIntentsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListIntentsResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListIntentsResponse]
  /**
    * Decodes a ListIntentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListIntentsResponse]
  
  /**
    * Encodes the specified ListIntentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListIntentsResponse.verify|verify} messages.
    * @param message ListIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListIntentsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListIntentsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListIntentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListIntentsResponse.verify|verify} messages.
    * @param message ListIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListIntentsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListIntentsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListIntentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListIntentsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListIntentsResponse]
  
  /**
    * Creates a plain object from a ListIntentsResponse message. Also converts values to other types if specified.
    * @param message ListIntentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListIntentsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListIntentsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListIntentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
