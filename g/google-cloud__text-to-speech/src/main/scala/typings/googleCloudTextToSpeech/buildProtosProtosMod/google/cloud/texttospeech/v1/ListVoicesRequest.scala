package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListVoicesRequest. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest")
@js.native
/**
  * Constructs a new ListVoicesRequest.
  * @param [properties] Properties to set
  */
open class ListVoicesRequest ()
  extends StObject
     with IListVoicesRequest {
  def this(properties: IListVoicesRequest) = this()
  
  /** ListVoicesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_ListVoicesRequest: String = js.native
  
  /**
    * Converts this ListVoicesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListVoicesRequest {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListVoicesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListVoicesRequest instance
    */
  /* static member */
  inline def create(): ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListVoicesRequest]
  inline def create(properties: IListVoicesRequest): ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListVoicesRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListVoicesRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListVoicesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListVoicesRequest]
  /**
    * Decodes a ListVoicesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListVoicesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListVoicesRequest]
  inline def decode(reader: Reader, length: Double): ListVoicesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListVoicesRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListVoicesRequest]
  /**
    * Decodes a ListVoicesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListVoicesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListVoicesRequest]
  
  /**
    * Encodes the specified ListVoicesRequest message. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesRequest.verify|verify} messages.
    * @param message ListVoicesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListVoicesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListVoicesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListVoicesRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesRequest.verify|verify} messages.
    * @param message ListVoicesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListVoicesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListVoicesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListVoicesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListVoicesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListVoicesRequest]
  
  /**
    * Gets the default type url for ListVoicesRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListVoicesRequest message. Also converts values to other types if specified.
    * @param message ListVoicesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListVoicesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListVoicesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListVoicesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
