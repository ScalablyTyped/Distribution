package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IFieldOptions
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FieldOptions. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldOptions")
@js.native
/**
  * Constructs a new FieldOptions.
  * @param [properties] Properties to set
  */
class FieldOptions ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions {
  def this(properties: IFieldOptions) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldOptions")
@js.native
object FieldOptions extends js.Object {
  /**
    * Creates a new FieldOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldOptions instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions = js.native
  def create(properties: IFieldOptions): typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions = js.native
  /**
    * Decodes a FieldOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions = js.native
  /**
    * Decodes a FieldOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions = js.native
  /**
    * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
    * @param message FieldOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FieldOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** CType enum. */
  @js.native
  object CType extends js.Object {
    /* 1 */ val CORD: typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.CType.CORD with Double = js.native
    /* 0 */ val STRING: typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.CType.STRING with Double = js.native
    /* 2 */ val STRING_PIECE: typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.CType.STRING_PIECE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.CType with Double
      ] = js.native
  }
  
  /** JSType enum. */
  @js.native
  object JSType extends js.Object {
    /* 0 */ val JS_NORMAL: typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.JSType.JS_NORMAL with Double = js.native
    /* 2 */ val JS_NUMBER: typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.JSType.JS_NUMBER with Double = js.native
    /* 1 */ val JS_STRING: typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.JSType.JS_STRING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.JSType with Double
      ] = js.native
  }
  
}

