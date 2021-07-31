package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.FieldOptions.CType
import typings.googleGax.operationsMod.google.protobuf.FieldOptions.JSType
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldOptions. */
@JSImport("google-gax/build/protos/operations", "google.protobuf.FieldOptions")
@js.native
/**
  * Constructs a new FieldOptions.
  * @param [properties] Properties to set
  */
class FieldOptions ()
  extends StObject
     with IFieldOptions {
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
  
  @JSImport("google-gax/build/protos/operations", "google.protobuf.FieldOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CType extends StObject
  /** CType enum. */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.FieldOptions.CType")
  @js.native
  object CType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CType & Double] = js.native
    
    @js.native
    sealed trait CORD
      extends StObject
         with CType
    /* 1 */ val CORD: typings.googleGax.operationsMod.google.protobuf.FieldOptions.CType.CORD & Double = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with CType
    /* 0 */ val STRING: typings.googleGax.operationsMod.google.protobuf.FieldOptions.CType.STRING & Double = js.native
    
    @js.native
    sealed trait STRING_PIECE
      extends StObject
         with CType
    /* 2 */ val STRING_PIECE: typings.googleGax.operationsMod.google.protobuf.FieldOptions.CType.STRING_PIECE & Double = js.native
  }
  
  @js.native
  sealed trait JSType extends StObject
  /** JSType enum. */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.FieldOptions.JSType")
  @js.native
  object JSType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JSType & Double] = js.native
    
    @js.native
    sealed trait JS_NORMAL
      extends StObject
         with JSType
    /* 0 */ val JS_NORMAL: typings.googleGax.operationsMod.google.protobuf.FieldOptions.JSType.JS_NORMAL & Double = js.native
    
    @js.native
    sealed trait JS_NUMBER
      extends StObject
         with JSType
    /* 2 */ val JS_NUMBER: typings.googleGax.operationsMod.google.protobuf.FieldOptions.JSType.JS_NUMBER & Double = js.native
    
    @js.native
    sealed trait JS_STRING
      extends StObject
         with JSType
    /* 1 */ val JS_STRING: typings.googleGax.operationsMod.google.protobuf.FieldOptions.JSType.JS_STRING & Double = js.native
  }
  
  /**
    * Creates a new FieldOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldOptions instance
    */
  /* static member */
  @scala.inline
  def create(): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FieldOptions]
  @scala.inline
  def create(properties: IFieldOptions): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  /**
    * Decodes a FieldOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  @scala.inline
  def decode(reader: Reader, length: Double): FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FieldOptions]
  @scala.inline
  def decode(reader: Uint8Array): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FieldOptions]
  
  /**
    * Decodes a FieldOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  /**
    * Encodes the specified FieldOptions message. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IFieldOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IFieldOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified FieldOptions message, length delimited. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IFieldOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IFieldOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a FieldOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldOptions
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  /**
    * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
    * @param message FieldOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: FieldOptions): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: FieldOptions, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a FieldOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
