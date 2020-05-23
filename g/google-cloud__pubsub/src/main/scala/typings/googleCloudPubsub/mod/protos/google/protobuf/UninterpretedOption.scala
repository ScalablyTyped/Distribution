package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IUninterpretedOption
import typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.INamePart
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UninterpretedOption. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.UninterpretedOption")
@js.native
/**
  * Constructs a new UninterpretedOption.
  * @param [properties] Properties to set
  */
class UninterpretedOption ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption {
  def this(properties: IUninterpretedOption) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.UninterpretedOption")
@js.native
object UninterpretedOption extends js.Object {
  /** Represents a NamePart. */
  @js.native
  /**
    * Constructs a new NamePart.
    * @param [properties] Properties to set
    */
  class NamePart ()
    extends typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart {
    def this(properties: INamePart) = this()
  }
  
  /**
    * Creates a new UninterpretedOption instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UninterpretedOption instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption = js.native
  def create(properties: IUninterpretedOption): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption = js.native
  /**
    * Decodes an UninterpretedOption message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UninterpretedOption
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption = js.native
  /**
    * Decodes an UninterpretedOption message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UninterpretedOption
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption = js.native
  /**
    * Encodes the specified UninterpretedOption message. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
    * @param message UninterpretedOption message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUninterpretedOption): Writer = js.native
  def encode(message: IUninterpretedOption, writer: Writer): Writer = js.native
  /**
    * Encodes the specified UninterpretedOption message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
    * @param message UninterpretedOption message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUninterpretedOption): Writer = js.native
  def encodeDelimited(message: IUninterpretedOption, writer: Writer): Writer = js.native
  /**
    * Creates an UninterpretedOption message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UninterpretedOption
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption = js.native
  /**
    * Creates a plain object from an UninterpretedOption message. Also converts values to other types if specified.
    * @param message UninterpretedOption
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an UninterpretedOption message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /* static members */
  @js.native
  object NamePart extends js.Object {
    /**
      * Creates a new NamePart instance using the specified properties.
      * @param [properties] Properties to set
      * @returns NamePart instance
      */
    def create(): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart = js.native
    def create(properties: INamePart): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart = js.native
    /**
      * Decodes a NamePart message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns NamePart
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart = js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart = js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart = js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart = js.native
    /**
      * Decodes a NamePart message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns NamePart
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart = js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart = js.native
    /**
      * Encodes the specified NamePart message. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
      * @param message NamePart message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: INamePart): Writer = js.native
    def encode(message: INamePart, writer: Writer): Writer = js.native
    /**
      * Encodes the specified NamePart message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
      * @param message NamePart message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: INamePart): Writer = js.native
    def encodeDelimited(message: INamePart, writer: Writer): Writer = js.native
    /**
      * Creates a NamePart message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns NamePart
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart = js.native
    /**
      * Creates a plain object from a NamePart message. Also converts values to other types if specified.
      * @param message NamePart
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.googleCloudPubsub.protosMod.google.protobuf.UninterpretedOption.NamePart,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies a NamePart message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
}

