package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SynthesizeSpeechConfig. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SynthesizeSpeechConfig")
@js.native
/**
  * Constructs a new SynthesizeSpeechConfig.
  * @param [properties] Properties to set
  */
class SynthesizeSpeechConfig ()
  extends StObject
     with ISynthesizeSpeechConfig {
  def this(properties: ISynthesizeSpeechConfig) = this()
  
  /** SynthesizeSpeechConfig effectsProfileId. */
  @JSName("effectsProfileId")
  var effectsProfileId_SynthesizeSpeechConfig: js.Array[String] = js.native
  
  /** SynthesizeSpeechConfig pitch. */
  @JSName("pitch")
  var pitch_SynthesizeSpeechConfig: Double = js.native
  
  /** SynthesizeSpeechConfig speakingRate. */
  @JSName("speakingRate")
  var speakingRate_SynthesizeSpeechConfig: Double = js.native
  
  /**
    * Converts this SynthesizeSpeechConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** SynthesizeSpeechConfig volumeGainDb. */
  @JSName("volumeGainDb")
  var volumeGainDb_SynthesizeSpeechConfig: Double = js.native
}
object SynthesizeSpeechConfig {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SynthesizeSpeechConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SynthesizeSpeechConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesizeSpeechConfig instance
    */
  /* static member */
  @scala.inline
  def create(): SynthesizeSpeechConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SynthesizeSpeechConfig]
  @scala.inline
  def create(properties: ISynthesizeSpeechConfig): SynthesizeSpeechConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechConfig]
  
  /**
    * Decodes a SynthesizeSpeechConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesizeSpeechConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): SynthesizeSpeechConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechConfig]
  @scala.inline
  def decode(reader: Reader, length: Double): SynthesizeSpeechConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeSpeechConfig]
  @scala.inline
  def decode(reader: Uint8Array): SynthesizeSpeechConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechConfig]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): SynthesizeSpeechConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeSpeechConfig]
  
  /**
    * Decodes a SynthesizeSpeechConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesizeSpeechConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): SynthesizeSpeechConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechConfig]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): SynthesizeSpeechConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechConfig]
  
  /**
    * Encodes the specified SynthesizeSpeechConfig message. Does not implicitly {@link google.cloud.dialogflow.v2.SynthesizeSpeechConfig.verify|verify} messages.
    * @param message SynthesizeSpeechConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISynthesizeSpeechConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISynthesizeSpeechConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SynthesizeSpeechConfig message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SynthesizeSpeechConfig.verify|verify} messages.
    * @param message SynthesizeSpeechConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISynthesizeSpeechConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISynthesizeSpeechConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SynthesizeSpeechConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesizeSpeechConfig
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): SynthesizeSpeechConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechConfig]
  
  /**
    * Creates a plain object from a SynthesizeSpeechConfig message. Also converts values to other types if specified.
    * @param message SynthesizeSpeechConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: SynthesizeSpeechConfig): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: SynthesizeSpeechConfig, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SynthesizeSpeechConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
