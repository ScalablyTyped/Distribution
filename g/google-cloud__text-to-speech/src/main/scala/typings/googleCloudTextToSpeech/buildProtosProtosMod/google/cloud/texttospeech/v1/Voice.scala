package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Voice. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.Voice")
@js.native
/**
  * Constructs a new Voice.
  * @param [properties] Properties to set
  */
open class Voice ()
  extends StObject
     with IVoice {
  def this(properties: IVoice) = this()
  
  /** Voice languageCodes. */
  @JSName("languageCodes")
  var languageCodes_Voice: js.Array[String] = js.native
  
  /** Voice name. */
  @JSName("name")
  var name_Voice: String = js.native
  
  /** Voice naturalSampleRateHertz. */
  @JSName("naturalSampleRateHertz")
  var naturalSampleRateHertz_Voice: Double = js.native
  
  /** Voice ssmlGender. */
  @JSName("ssmlGender")
  var ssmlGender_Voice: SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.SsmlVoiceGender * / any */ String) = js.native
  
  /**
    * Converts this Voice to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Voice {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.Voice")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Voice instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Voice instance
    */
  /* static member */
  inline def create(): Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Voice]
  inline def create(properties: IVoice): Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Voice]
  
  inline def decode(reader: js.typedarray.Uint8Array): Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Voice]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Voice = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Voice]
  /**
    * Decodes a Voice message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Voice
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Voice]
  inline def decode(reader: Reader, length: Double): Voice = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Voice]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Voice]
  /**
    * Decodes a Voice message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Voice
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Voice]
  
  /**
    * Encodes the specified Voice message. Does not implicitly {@link google.cloud.texttospeech.v1.Voice.verify|verify} messages.
    * @param message Voice message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IVoice): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IVoice, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Voice message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.Voice.verify|verify} messages.
    * @param message Voice message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IVoice): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IVoice, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Voice message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Voice
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Voice]
  
  /**
    * Gets the default type url for Voice
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a Voice message. Also converts values to other types if specified.
    * @param message Voice
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Voice): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Voice, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Voice message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
