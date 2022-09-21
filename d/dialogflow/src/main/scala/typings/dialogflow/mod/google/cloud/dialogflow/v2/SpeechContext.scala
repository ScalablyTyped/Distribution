package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SpeechContext. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SpeechContext")
@js.native
/**
  * Constructs a new SpeechContext.
  * @param [properties] Properties to set
  */
open class SpeechContext ()
  extends StObject
     with ISpeechContext {
  def this(properties: ISpeechContext) = this()
  
  /** SpeechContext boost. */
  @JSName("boost")
  var boost_SpeechContext: Double = js.native
  
  /** SpeechContext phrases. */
  @JSName("phrases")
  var phrases_SpeechContext: js.Array[String] = js.native
  
  /**
    * Converts this SpeechContext to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object SpeechContext {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SpeechContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SpeechContext instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SpeechContext instance
    */
  /* static member */
  inline def create(): SpeechContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SpeechContext]
  inline def create(properties: ISpeechContext): SpeechContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SpeechContext]
  
  inline def decode(reader: js.typedarray.Uint8Array): SpeechContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SpeechContext]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SpeechContext = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SpeechContext]
  /**
    * Decodes a SpeechContext message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SpeechContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SpeechContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SpeechContext]
  inline def decode(reader: Reader, length: Double): SpeechContext = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SpeechContext]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SpeechContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SpeechContext]
  /**
    * Decodes a SpeechContext message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SpeechContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SpeechContext = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SpeechContext]
  
  /**
    * Encodes the specified SpeechContext message. Does not implicitly {@link google.cloud.dialogflow.v2.SpeechContext.verify|verify} messages.
    * @param message SpeechContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISpeechContext): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISpeechContext, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SpeechContext message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SpeechContext.verify|verify} messages.
    * @param message SpeechContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISpeechContext): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISpeechContext, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SpeechContext message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SpeechContext
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SpeechContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SpeechContext]
  
  /**
    * Creates a plain object from a SpeechContext message. Also converts values to other types if specified.
    * @param message SpeechContext
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SpeechContext): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SpeechContext, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SpeechContext message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
