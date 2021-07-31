package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a VoiceSelectionParams. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams")
@js.native
/**
  * Constructs a new VoiceSelectionParams.
  * @param [properties] Properties to set
  */
class VoiceSelectionParams ()
  extends StObject
     with IVoiceSelectionParams {
  def this(properties: IVoiceSelectionParams) = this()
  
  /** VoiceSelectionParams languageCode. */
  @JSName("languageCode")
  var languageCode_VoiceSelectionParams: String = js.native
  
  /** VoiceSelectionParams name. */
  @JSName("name")
  var name_VoiceSelectionParams: String = js.native
  
  /** VoiceSelectionParams ssmlGender. */
  @JSName("ssmlGender")
  var ssmlGender_VoiceSelectionParams: SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1beta1.SsmlVoiceGender * / any */ String) = js.native
  
  /**
    * Converts this VoiceSelectionParams to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object VoiceSelectionParams {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new VoiceSelectionParams instance using the specified properties.
    * @param [properties] Properties to set
    * @returns VoiceSelectionParams instance
    */
  /* static member */
  @scala.inline
  def create(): VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[VoiceSelectionParams]
  @scala.inline
  def create(properties: IVoiceSelectionParams): VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[VoiceSelectionParams]
  
  /**
    * Decodes a VoiceSelectionParams message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns VoiceSelectionParams
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[VoiceSelectionParams]
  @scala.inline
  def decode(reader: Reader, length: Double): VoiceSelectionParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[VoiceSelectionParams]
  @scala.inline
  def decode(reader: Uint8Array): VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[VoiceSelectionParams]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): VoiceSelectionParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[VoiceSelectionParams]
  
  /**
    * Decodes a VoiceSelectionParams message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns VoiceSelectionParams
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[VoiceSelectionParams]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[VoiceSelectionParams]
  
  /**
    * Encodes the specified VoiceSelectionParams message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.VoiceSelectionParams.verify|verify} messages.
    * @param message VoiceSelectionParams message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IVoiceSelectionParams): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IVoiceSelectionParams, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified VoiceSelectionParams message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.VoiceSelectionParams.verify|verify} messages.
    * @param message VoiceSelectionParams message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IVoiceSelectionParams): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IVoiceSelectionParams, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a VoiceSelectionParams message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns VoiceSelectionParams
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[VoiceSelectionParams]
  
  /**
    * Creates a plain object from a VoiceSelectionParams message. Also converts values to other types if specified.
    * @param message VoiceSelectionParams
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: VoiceSelectionParams): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: VoiceSelectionParams, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a VoiceSelectionParams message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
