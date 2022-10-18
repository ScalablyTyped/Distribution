package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListVoicesResponse. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesResponse")
@js.native
/**
  * Constructs a new ListVoicesResponse.
  * @param [properties] Properties to set
  */
open class ListVoicesResponse ()
  extends StObject
     with IListVoicesResponse {
  def this(properties: IListVoicesResponse) = this()
  
  /**
    * Converts this ListVoicesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** ListVoicesResponse voices. */
  @JSName("voices")
  var voices_ListVoicesResponse: js.Array[IVoice] = js.native
}
object ListVoicesResponse {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListVoicesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListVoicesResponse instance
    */
  /* static member */
  inline def create(): ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListVoicesResponse]
  inline def create(properties: IListVoicesResponse): ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListVoicesResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListVoicesResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListVoicesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListVoicesResponse]
  /**
    * Decodes a ListVoicesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListVoicesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListVoicesResponse]
  inline def decode(reader: Reader, length: Double): ListVoicesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListVoicesResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListVoicesResponse]
  /**
    * Decodes a ListVoicesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListVoicesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListVoicesResponse]
  
  /**
    * Encodes the specified ListVoicesResponse message. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesResponse.verify|verify} messages.
    * @param message ListVoicesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListVoicesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListVoicesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListVoicesResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesResponse.verify|verify} messages.
    * @param message ListVoicesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListVoicesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListVoicesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListVoicesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListVoicesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListVoicesResponse]
  
  /**
    * Gets the default type url for ListVoicesResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListVoicesResponse message. Also converts values to other types if specified.
    * @param message ListVoicesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListVoicesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListVoicesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListVoicesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
