package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.custom
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.delete
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.get
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.patch
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.post
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.put
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a HttpRule. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.HttpRule")
@js.native
/**
  * Constructs a new HttpRule.
  * @param [properties] Properties to set
  */
open class HttpRule ()
  extends StObject
     with IHttpRule {
  def this(properties: IHttpRule) = this()
  
  /** HttpRule additionalBindings. */
  @JSName("additionalBindings")
  var additionalBindings_HttpRule: js.Array[IHttpRule] = js.native
  
  /** HttpRule body. */
  @JSName("body")
  var body_HttpRule: String = js.native
  
  /** HttpRule pattern. */
  var pattern: js.UndefOr[get | put | post | delete | patch | custom] = js.native
  
  /** HttpRule responseBody. */
  @JSName("responseBody")
  var responseBody_HttpRule: String = js.native
  
  /** HttpRule selector. */
  @JSName("selector")
  var selector_HttpRule: String = js.native
  
  /**
    * Converts this HttpRule to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object HttpRule {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.HttpRule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new HttpRule instance using the specified properties.
    * @param [properties] Properties to set
    * @returns HttpRule instance
    */
  /* static member */
  inline def create(): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[HttpRule]
  inline def create(properties: IHttpRule): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
  
  inline def decode(reader: js.typedarray.Uint8Array): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): HttpRule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HttpRule]
  /**
    * Decodes a HttpRule message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns HttpRule
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
  inline def decode(reader: Reader, length: Double): HttpRule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HttpRule]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
  /**
    * Decodes a HttpRule message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns HttpRule
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
  
  /**
    * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
    * @param message HttpRule message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IHttpRule): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IHttpRule, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
    * @param message HttpRule message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IHttpRule): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IHttpRule, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns HttpRule
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
  
  /**
    * Gets the default type url for HttpRule
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
    * @param message HttpRule
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: HttpRule): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: HttpRule, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a HttpRule message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
