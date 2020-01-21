package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.mod.google.protobuf.FieldOptions.CType
import typings.dialogflow.mod.google.protobuf.FieldOptions.JSType
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FieldOptions. */
@JSImport("dialogflow/protos/protos", "google.protobuf.FieldOptions")
@js.native
/**
  * Constructs a new FieldOptions.
  * @param [properties] Properties to set
  */
class FieldOptions () extends IFieldOptions {
  def this(properties: IFieldOptions) = this()
  /** FieldOptions ctype. */
  @JSName("ctype")
  var ctype_FieldOptions: CType = js.native
  /** FieldOptions deprecated. */
  @JSName("deprecated")
  var deprecated_FieldOptions: Boolean = js.native
  /** FieldOptions jstype. */
  @JSName("jstype")
  var jstype_FieldOptions: JSType = js.native
  /** FieldOptions lazy. */
  @JSName("lazy")
  var lazy_FieldOptions: Boolean = js.native
  /** FieldOptions packed. */
  @JSName("packed")
  var packed_FieldOptions: Boolean = js.native
  /** FieldOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_FieldOptions: js.Array[IUninterpretedOption] = js.native
  /** FieldOptions weak. */
  @JSName("weak")
  var weak_FieldOptions: Boolean = js.native
  /**
    * Converts this FieldOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.protobuf.FieldOptions")
@js.native
object FieldOptions extends js.Object {
  @js.native
  sealed trait CType extends js.Object
  
  @js.native
  sealed trait JSType extends js.Object
  
  /**
    * Creates a new FieldOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldOptions instance
    */
  def create(): FieldOptions = js.native
  def create(properties: IFieldOptions): FieldOptions = js.native
  /**
    * Decodes a FieldOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): FieldOptions = js.native
  def decode(reader: Reader, length: Double): FieldOptions = js.native
  def decode(reader: Uint8Array): FieldOptions = js.native
  def decode(reader: Uint8Array, length: Double): FieldOptions = js.native
  /**
    * Decodes a FieldOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): FieldOptions = js.native
  def decodeDelimited(reader: Uint8Array): FieldOptions = js.native
  /**
    * Encodes the specified FieldOptions message. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFieldOptions): Writer = js.native
  def encode(message: IFieldOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FieldOptions message, length delimited. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFieldOptions): Writer = js.native
  def encodeDelimited(message: IFieldOptions, writer: Writer): Writer = js.native
  /**
    * Creates a FieldOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): FieldOptions = js.native
  /**
    * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
    * @param message FieldOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: FieldOptions): StringDictionary[js.Any] = js.native
  def toObject(message: FieldOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FieldOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** CType enum. */
  @js.native
  object CType extends js.Object {
    @js.native
    sealed trait CORD extends CType
    
    @js.native
    sealed trait STRING extends CType
    
    @js.native
    sealed trait STRING_PIECE extends CType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CType with Double] = js.native
    /* 1 */ @js.native
    object CORD extends TopLevel[CORD with Double]
    
    /* 0 */ @js.native
    object STRING extends TopLevel[STRING with Double]
    
    /* 2 */ @js.native
    object STRING_PIECE extends TopLevel[STRING_PIECE with Double]
    
  }
  
  /** JSType enum. */
  @js.native
  object JSType extends js.Object {
    @js.native
    sealed trait JS_NORMAL extends JSType
    
    @js.native
    sealed trait JS_NUMBER extends JSType
    
    @js.native
    sealed trait JS_STRING extends JSType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JSType with Double] = js.native
    /* 0 */ @js.native
    object JS_NORMAL extends TopLevel[JS_NORMAL with Double]
    
    /* 2 */ @js.native
    object JS_NUMBER extends TopLevel[JS_NUMBER with Double]
    
    /* 1 */ @js.native
    object JS_STRING extends TopLevel[JS_STRING with Double]
    
  }
  
}

