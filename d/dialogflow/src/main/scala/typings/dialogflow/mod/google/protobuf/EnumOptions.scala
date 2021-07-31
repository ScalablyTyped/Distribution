package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumOptions. */
@JSImport("dialogflow/protos/protos", "google.protobuf.EnumOptions")
@js.native
/**
  * Constructs a new EnumOptions.
  * @param [properties] Properties to set
  */
class EnumOptions ()
  extends StObject
     with IEnumOptions {
  def this(properties: IEnumOptions) = this()
  
  /** EnumOptions allowAlias. */
  @JSName("allowAlias")
  var allowAlias_EnumOptions: Boolean = js.native
  
  /** EnumOptions deprecated. */
  @JSName("deprecated")
  var deprecated_EnumOptions: Boolean = js.native
  
  /**
    * Converts this EnumOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** EnumOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_EnumOptions: js.Array[IUninterpretedOption] = js.native
}
object EnumOptions {
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.EnumOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new EnumOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumOptions instance
    */
  /* static member */
  @scala.inline
  def create(): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EnumOptions]
  @scala.inline
  def create(properties: IEnumOptions): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  
  /**
    * Decodes an EnumOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  @scala.inline
  def decode(reader: Reader, length: Double): EnumOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EnumOptions]
  @scala.inline
  def decode(reader: Uint8Array): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): EnumOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EnumOptions]
  
  /**
    * Decodes an EnumOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  
  /**
    * Encodes the specified EnumOptions message. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
    * @param message EnumOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IEnumOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IEnumOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EnumOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
    * @param message EnumOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IEnumOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IEnumOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EnumOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumOptions
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  
  /**
    * Creates a plain object from an EnumOptions message. Also converts values to other types if specified.
    * @param message EnumOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: EnumOptions): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: EnumOptions, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an EnumOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
