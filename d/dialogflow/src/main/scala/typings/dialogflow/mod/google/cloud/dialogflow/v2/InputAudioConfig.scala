package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an InputAudioConfig. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig")
@js.native
/**
  * Constructs a new InputAudioConfig.
  * @param [properties] Properties to set
  */
class InputAudioConfig () extends IInputAudioConfig {
  def this(properties: IInputAudioConfig) = this()
  
  /** InputAudioConfig audioEncoding. */
  @JSName("audioEncoding")
  var audioEncoding_InputAudioConfig: AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.AudioEncoding * / any */ String) = js.native
  
  /** InputAudioConfig enableWordInfo. */
  @JSName("enableWordInfo")
  var enableWordInfo_InputAudioConfig: Boolean = js.native
  
  /** InputAudioConfig languageCode. */
  @JSName("languageCode")
  var languageCode_InputAudioConfig: String = js.native
  
  /** InputAudioConfig modelVariant. */
  @JSName("modelVariant")
  var modelVariant_InputAudioConfig: SpeechModelVariant | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SpeechModelVariant * / any */ String) = js.native
  
  /** InputAudioConfig model. */
  @JSName("model")
  var model_InputAudioConfig: String = js.native
  
  /** InputAudioConfig phraseHints. */
  @JSName("phraseHints")
  var phraseHints_InputAudioConfig: js.Array[String] = js.native
  
  /** InputAudioConfig sampleRateHertz. */
  @JSName("sampleRateHertz")
  var sampleRateHertz_InputAudioConfig: Double = js.native
  
  /** InputAudioConfig singleUtterance. */
  @JSName("singleUtterance")
  var singleUtterance_InputAudioConfig: Boolean = js.native
  
  /** InputAudioConfig speechContexts. */
  @JSName("speechContexts")
  var speechContexts_InputAudioConfig: js.Array[ISpeechContext] = js.native
  
  /**
    * Converts this InputAudioConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object InputAudioConfig {
  
  /**
    * Creates a new InputAudioConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns InputAudioConfig instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.create")
  @js.native
  def create(): InputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.create")
  @js.native
  def create(properties: IInputAudioConfig): InputAudioConfig = js.native
  
  /**
    * Decodes an InputAudioConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns InputAudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.decode")
  @js.native
  def decode(reader: Reader): InputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): InputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.decode")
  @js.native
  def decode(reader: Uint8Array): InputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): InputAudioConfig = js.native
  
  /**
    * Decodes an InputAudioConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns InputAudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): InputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): InputAudioConfig = js.native
  
  /**
    * Encodes the specified InputAudioConfig message. Does not implicitly {@link google.cloud.dialogflow.v2.InputAudioConfig.verify|verify} messages.
    * @param message InputAudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.encode")
  @js.native
  def encode(message: IInputAudioConfig): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.encode")
  @js.native
  def encode(message: IInputAudioConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified InputAudioConfig message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.InputAudioConfig.verify|verify} messages.
    * @param message InputAudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IInputAudioConfig): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IInputAudioConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates an InputAudioConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns InputAudioConfig
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): InputAudioConfig = js.native
  
  /**
    * Creates a plain object from an InputAudioConfig message. Also converts values to other types if specified.
    * @param message InputAudioConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.toObject")
  @js.native
  def toObject(message: InputAudioConfig): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.toObject")
  @js.native
  def toObject(message: InputAudioConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an InputAudioConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
