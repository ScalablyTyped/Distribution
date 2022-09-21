package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TextInput. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TextInput")
@js.native
/**
  * Constructs a new TextInput.
  * @param [properties] Properties to set
  */
open class TextInput ()
  extends StObject
     with ITextInput {
  def this(properties: ITextInput) = this()
  
  /** TextInput languageCode. */
  @JSName("languageCode")
  var languageCode_TextInput: String = js.native
  
  /** TextInput text. */
  @JSName("text")
  var text_TextInput: String = js.native
  
  /**
    * Converts this TextInput to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object TextInput {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TextInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TextInput instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TextInput instance
    */
  /* static member */
  inline def create(): TextInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TextInput]
  inline def create(properties: ITextInput): TextInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TextInput]
  
  inline def decode(reader: js.typedarray.Uint8Array): TextInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TextInput]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): TextInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TextInput]
  /**
    * Decodes a TextInput message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TextInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): TextInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TextInput]
  inline def decode(reader: Reader, length: Double): TextInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TextInput]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): TextInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TextInput]
  /**
    * Decodes a TextInput message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TextInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): TextInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TextInput]
  
  /**
    * Encodes the specified TextInput message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.TextInput.verify|verify} messages.
    * @param message TextInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITextInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITextInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TextInput message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.TextInput.verify|verify} messages.
    * @param message TextInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITextInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITextInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TextInput message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TextInput
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): TextInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TextInput]
  
  /**
    * Creates a plain object from a TextInput message. Also converts values to other types if specified.
    * @param message TextInput
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: TextInput): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TextInput, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TextInput message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
