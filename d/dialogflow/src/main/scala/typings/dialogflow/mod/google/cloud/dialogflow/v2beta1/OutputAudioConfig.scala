package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OutputAudioConfig. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig")
@js.native
/**
  * Constructs a new OutputAudioConfig.
  * @param [properties] Properties to set
  */
class OutputAudioConfig () extends IOutputAudioConfig {
  def this(properties: IOutputAudioConfig) = this()
  
  /** OutputAudioConfig audioEncoding. */
  @JSName("audioEncoding")
  var audioEncoding_OutputAudioConfig: OutputAudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.OutputAudioEncoding * / any */ String) = js.native
  
  /** OutputAudioConfig sampleRateHertz. */
  @JSName("sampleRateHertz")
  var sampleRateHertz_OutputAudioConfig: Double = js.native
  
  /**
    * Converts this OutputAudioConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object OutputAudioConfig {
  
  /**
    * Creates a new OutputAudioConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OutputAudioConfig instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.create")
  @js.native
  def create(): OutputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.create")
  @js.native
  def create(properties: IOutputAudioConfig): OutputAudioConfig = js.native
  
  /**
    * Decodes an OutputAudioConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OutputAudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.decode")
  @js.native
  def decode(reader: Reader): OutputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): OutputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.decode")
  @js.native
  def decode(reader: Uint8Array): OutputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): OutputAudioConfig = js.native
  
  /**
    * Decodes an OutputAudioConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OutputAudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): OutputAudioConfig = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): OutputAudioConfig = js.native
  
  /**
    * Encodes the specified OutputAudioConfig message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.OutputAudioConfig.verify|verify} messages.
    * @param message OutputAudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.encode")
  @js.native
  def encode(message: IOutputAudioConfig): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.encode")
  @js.native
  def encode(message: IOutputAudioConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified OutputAudioConfig message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.OutputAudioConfig.verify|verify} messages.
    * @param message OutputAudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IOutputAudioConfig): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IOutputAudioConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates an OutputAudioConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OutputAudioConfig
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): OutputAudioConfig = js.native
  
  /**
    * Creates a plain object from an OutputAudioConfig message. Also converts values to other types if specified.
    * @param message OutputAudioConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.toObject")
  @js.native
  def toObject(message: OutputAudioConfig): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.toObject")
  @js.native
  def toObject(message: OutputAudioConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an OutputAudioConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
