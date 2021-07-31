package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OutputAudioConfig. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.OutputAudioConfig")
@js.native
/**
  * Constructs a new OutputAudioConfig.
  * @param [properties] Properties to set
  */
class OutputAudioConfig ()
  extends StObject
     with IOutputAudioConfig {
  def this(properties: IOutputAudioConfig) = this()
  
  /** OutputAudioConfig audioEncoding. */
  @JSName("audioEncoding")
  var audioEncoding_OutputAudioConfig: OutputAudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.OutputAudioEncoding * / any */ String) = js.native
  
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
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.OutputAudioConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new OutputAudioConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OutputAudioConfig instance
    */
  /* static member */
  @scala.inline
  def create(): OutputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[OutputAudioConfig]
  @scala.inline
  def create(properties: IOutputAudioConfig): OutputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[OutputAudioConfig]
  
  /**
    * Decodes an OutputAudioConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OutputAudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): OutputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OutputAudioConfig]
  @scala.inline
  def decode(reader: Reader, length: Double): OutputAudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OutputAudioConfig]
  @scala.inline
  def decode(reader: Uint8Array): OutputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OutputAudioConfig]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): OutputAudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OutputAudioConfig]
  
  /**
    * Decodes an OutputAudioConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OutputAudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): OutputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OutputAudioConfig]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): OutputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OutputAudioConfig]
  
  /**
    * Encodes the specified OutputAudioConfig message. Does not implicitly {@link google.cloud.dialogflow.v2.OutputAudioConfig.verify|verify} messages.
    * @param message OutputAudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IOutputAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IOutputAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified OutputAudioConfig message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.OutputAudioConfig.verify|verify} messages.
    * @param message OutputAudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IOutputAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IOutputAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an OutputAudioConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OutputAudioConfig
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): OutputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OutputAudioConfig]
  
  /**
    * Creates a plain object from an OutputAudioConfig message. Also converts values to other types if specified.
    * @param message OutputAudioConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: OutputAudioConfig): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: OutputAudioConfig, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an OutputAudioConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
