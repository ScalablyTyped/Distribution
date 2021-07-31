package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MessageOptions. */
@JSImport("dialogflow/protos/protos", "google.protobuf.MessageOptions")
@js.native
/**
  * Constructs a new MessageOptions.
  * @param [properties] Properties to set
  */
class MessageOptions ()
  extends StObject
     with IMessageOptions {
  def this(properties: IMessageOptions) = this()
  
  /** MessageOptions deprecated. */
  @JSName("deprecated")
  var deprecated_MessageOptions: Boolean = js.native
  
  /** MessageOptions mapEntry. */
  @JSName("mapEntry")
  var mapEntry_MessageOptions: Boolean = js.native
  
  /** MessageOptions messageSetWireFormat. */
  @JSName("messageSetWireFormat")
  var messageSetWireFormat_MessageOptions: Boolean = js.native
  
  /** MessageOptions noStandardDescriptorAccessor. */
  @JSName("noStandardDescriptorAccessor")
  var noStandardDescriptorAccessor_MessageOptions: Boolean = js.native
  
  /**
    * Converts this MessageOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** MessageOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_MessageOptions: js.Array[IUninterpretedOption] = js.native
}
object MessageOptions {
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.MessageOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new MessageOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MessageOptions instance
    */
  /* static member */
  @scala.inline
  def create(): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageOptions]
  @scala.inline
  def create(properties: IMessageOptions): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  
  /**
    * Decodes a MessageOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MessageOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  @scala.inline
  def decode(reader: Reader, length: Double): MessageOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MessageOptions]
  @scala.inline
  def decode(reader: Uint8Array): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): MessageOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MessageOptions]
  
  /**
    * Decodes a MessageOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MessageOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  
  /**
    * Encodes the specified MessageOptions message. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
    * @param message MessageOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IMessageOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IMessageOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified MessageOptions message, length delimited. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
    * @param message MessageOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IMessageOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IMessageOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a MessageOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MessageOptions
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  
  /**
    * Creates a plain object from a MessageOptions message. Also converts values to other types if specified.
    * @param message MessageOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: MessageOptions): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: MessageOptions, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a MessageOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
