package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SpeechWordInfo. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SpeechWordInfo")
@js.native
/**
  * Constructs a new SpeechWordInfo.
  * @param [properties] Properties to set
  */
class SpeechWordInfo ()
  extends StObject
     with ISpeechWordInfo {
  def this(properties: ISpeechWordInfo) = this()
  
  /** SpeechWordInfo confidence. */
  @JSName("confidence")
  var confidence_SpeechWordInfo: Double = js.native
  
  /**
    * Converts this SpeechWordInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** SpeechWordInfo word. */
  @JSName("word")
  var word_SpeechWordInfo: String = js.native
}
object SpeechWordInfo {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SpeechWordInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SpeechWordInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SpeechWordInfo instance
    */
  /* static member */
  @scala.inline
  def create(): SpeechWordInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SpeechWordInfo]
  @scala.inline
  def create(properties: ISpeechWordInfo): SpeechWordInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SpeechWordInfo]
  
  /**
    * Decodes a SpeechWordInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SpeechWordInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): SpeechWordInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SpeechWordInfo]
  @scala.inline
  def decode(reader: Reader, length: Double): SpeechWordInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SpeechWordInfo]
  @scala.inline
  def decode(reader: Uint8Array): SpeechWordInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SpeechWordInfo]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): SpeechWordInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SpeechWordInfo]
  
  /**
    * Decodes a SpeechWordInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SpeechWordInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): SpeechWordInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SpeechWordInfo]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): SpeechWordInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SpeechWordInfo]
  
  /**
    * Encodes the specified SpeechWordInfo message. Does not implicitly {@link google.cloud.dialogflow.v2.SpeechWordInfo.verify|verify} messages.
    * @param message SpeechWordInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISpeechWordInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISpeechWordInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SpeechWordInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SpeechWordInfo.verify|verify} messages.
    * @param message SpeechWordInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISpeechWordInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISpeechWordInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SpeechWordInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SpeechWordInfo
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): SpeechWordInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SpeechWordInfo]
  
  /**
    * Creates a plain object from a SpeechWordInfo message. Also converts values to other types if specified.
    * @param message SpeechWordInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: SpeechWordInfo): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: SpeechWordInfo, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SpeechWordInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
