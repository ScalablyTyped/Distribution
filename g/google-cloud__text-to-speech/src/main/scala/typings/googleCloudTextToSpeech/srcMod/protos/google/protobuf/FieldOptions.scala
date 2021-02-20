package typings.googleCloudTextToSpeech.srcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.IFieldOptions
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldOptions. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions")
@js.native
/**
  * Constructs a new FieldOptions.
  * @param [properties] Properties to set
  */
class FieldOptions ()
  extends typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions {
  def this(properties: IFieldOptions) = this()
}
object FieldOptions {
  
  /** CType enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.CType")
  @js.native
  object CType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.CType with Double
      ] = js.native
    
    /* 1 */ val CORD: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.CType.CORD with Double = js.native
    
    /* 0 */ val STRING: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.CType.STRING with Double = js.native
    
    /* 2 */ val STRING_PIECE: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.CType.STRING_PIECE with Double = js.native
  }
  
  /** JSType enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.JSType")
  @js.native
  object JSType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.JSType with Double
      ] = js.native
    
    /* 0 */ val JS_NORMAL: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.JSType.JS_NORMAL with Double = js.native
    
    /* 2 */ val JS_NUMBER: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.JSType.JS_NUMBER with Double = js.native
    
    /* 1 */ val JS_STRING: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions.JSType.JS_STRING with Double = js.native
  }
  
  /**
    * Creates a new FieldOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldOptions instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.create")
  @js.native
  def create(): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.create")
  @js.native
  def create(properties: IFieldOptions): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions = js.native
  
  /**
    * Decodes a FieldOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions = js.native
  
  /**
    * Decodes a FieldOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions = js.native
  
  /**
    * Encodes the specified FieldOptions message. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.encode")
  @js.native
  def encode(message: IFieldOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.encode")
  @js.native
  def encode(message: IFieldOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FieldOptions message, length delimited. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a FieldOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldOptions
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions = js.native
  
  /**
    * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
    * @param message FieldOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.toObject")
  @js.native
  def toObject(message: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FieldOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
