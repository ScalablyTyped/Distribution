package typings.googleCloudTextToSpeech.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.CType
import typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.JSType
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldOptions. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions")
@js.native
/**
  * Constructs a new FieldOptions.
  * @param [properties] Properties to set
  */
class FieldOptions () extends IFieldOptions {
  def this(properties: IFieldOptions) = this()
  
  /** FieldOptions ctype. */
  @JSName("ctype")
  var ctype_FieldOptions: CType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.CType * / any */ String) = js.native
  
  /** FieldOptions deprecated. */
  @JSName("deprecated")
  var deprecated_FieldOptions: Boolean = js.native
  
  /** FieldOptions jstype. */
  @JSName("jstype")
  var jstype_FieldOptions: JSType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.JSType * / any */ String) = js.native
  
  /** FieldOptions lazy. */
  @JSName("lazy")
  var lazy_FieldOptions: Boolean = js.native
  
  /** FieldOptions packed. */
  @JSName("packed")
  var packed_FieldOptions: Boolean = js.native
  
  /**
    * Converts this FieldOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** FieldOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_FieldOptions: js.Array[IUninterpretedOption] = js.native
  
  /** FieldOptions weak. */
  @JSName("weak")
  var weak_FieldOptions: Boolean = js.native
}
object FieldOptions {
  
  @js.native
  sealed trait CType extends StObject
  /** CType enum. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.CType")
  @js.native
  object CType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CType with Double] = js.native
    
    @js.native
    sealed trait CORD extends CType
    /* 1 */ val CORD: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.CType.CORD with Double = js.native
    
    @js.native
    sealed trait STRING extends CType
    /* 0 */ val STRING: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.CType.STRING with Double = js.native
    
    @js.native
    sealed trait STRING_PIECE extends CType
    /* 2 */ val STRING_PIECE: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.CType.STRING_PIECE with Double = js.native
  }
  
  @js.native
  sealed trait JSType extends StObject
  /** JSType enum. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.JSType")
  @js.native
  object JSType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JSType with Double] = js.native
    
    @js.native
    sealed trait JS_NORMAL extends JSType
    /* 0 */ val JS_NORMAL: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.JSType.JS_NORMAL with Double = js.native
    
    @js.native
    sealed trait JS_NUMBER extends JSType
    /* 2 */ val JS_NUMBER: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.JSType.JS_NUMBER with Double = js.native
    
    @js.native
    sealed trait JS_STRING extends JSType
    /* 1 */ val JS_STRING: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.JSType.JS_STRING with Double = js.native
  }
  
  /**
    * Creates a new FieldOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldOptions instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.create")
  @js.native
  def create(): FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.create")
  @js.native
  def create(properties: IFieldOptions): FieldOptions = js.native
  
  /**
    * Decodes a FieldOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.decode")
  @js.native
  def decode(reader: Reader): FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.decode")
  @js.native
  def decode(reader: Uint8Array): FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): FieldOptions = js.native
  
  /**
    * Decodes a FieldOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): FieldOptions = js.native
  
  /**
    * Encodes the specified FieldOptions message. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.encode")
  @js.native
  def encode(message: IFieldOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.encode")
  @js.native
  def encode(message: IFieldOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FieldOptions message, length delimited. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a FieldOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldOptions
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): FieldOptions = js.native
  
  /**
    * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
    * @param message FieldOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.toObject")
  @js.native
  def toObject(message: FieldOptions): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.toObject")
  @js.native
  def toObject(message: FieldOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FieldOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
