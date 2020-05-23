package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.IExtensionRange
import typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.IReservedRange
import typings.googleCloudPubsub.protosMod.google.protobuf.IDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DescriptorProto. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.DescriptorProto")
@js.native
/**
  * Constructs a new DescriptorProto.
  * @param [properties] Properties to set
  */
class DescriptorProto ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto {
  def this(properties: IDescriptorProto) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.DescriptorProto")
@js.native
object DescriptorProto extends js.Object {
  /** Represents an ExtensionRange. */
  @js.native
  /**
    * Constructs a new ExtensionRange.
    * @param [properties] Properties to set
    */
  class ExtensionRange ()
    extends typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange {
    def this(properties: IExtensionRange) = this()
  }
  
  /** Represents a ReservedRange. */
  @js.native
  /**
    * Constructs a new ReservedRange.
    * @param [properties] Properties to set
    */
  class ReservedRange ()
    extends typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange {
    def this(properties: IReservedRange) = this()
  }
  
  /**
    * Creates a new DescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DescriptorProto instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto = js.native
  def create(properties: IDescriptorProto): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto = js.native
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto = js.native
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto = js.native
  /**
    * Encodes the specified DescriptorProto message. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDescriptorProto): Writer = js.native
  def encode(message: IDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDescriptorProto): Writer = js.native
  def encodeDelimited(message: IDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates a DescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto = js.native
  /**
    * Creates a plain object from a DescriptorProto message. Also converts values to other types if specified.
    * @param message DescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /* static members */
  @js.native
  object ExtensionRange extends js.Object {
    /**
      * Creates a new ExtensionRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ExtensionRange instance
      */
    def create(): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange = js.native
    def create(properties: IExtensionRange): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange = js.native
    /**
      * Decodes an ExtensionRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ExtensionRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange = js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange = js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange = js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange = js.native
    /**
      * Decodes an ExtensionRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ExtensionRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange = js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange = js.native
    /**
      * Encodes the specified ExtensionRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
      * @param message ExtensionRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IExtensionRange): Writer = js.native
    def encode(message: IExtensionRange, writer: Writer): Writer = js.native
    /**
      * Encodes the specified ExtensionRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
      * @param message ExtensionRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IExtensionRange): Writer = js.native
    def encodeDelimited(message: IExtensionRange, writer: Writer): Writer = js.native
    /**
      * Creates an ExtensionRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ExtensionRange
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange = js.native
    /**
      * Creates a plain object from an ExtensionRange message. Also converts values to other types if specified.
      * @param message ExtensionRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ExtensionRange,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies an ExtensionRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /* static members */
  @js.native
  object ReservedRange extends js.Object {
    /**
      * Creates a new ReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ReservedRange instance
      */
    def create(): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange = js.native
    def create(properties: IReservedRange): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange = js.native
    /**
      * Decodes a ReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange = js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange = js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange = js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange = js.native
    /**
      * Decodes a ReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange = js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange = js.native
    /**
      * Encodes the specified ReservedRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
      * @param message ReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IReservedRange): Writer = js.native
    def encode(message: IReservedRange, writer: Writer): Writer = js.native
    /**
      * Encodes the specified ReservedRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
      * @param message ReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IReservedRange): Writer = js.native
    def encodeDelimited(message: IReservedRange, writer: Writer): Writer = js.native
    /**
      * Creates a ReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ReservedRange
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange = js.native
    /**
      * Creates a plain object from a ReservedRange message. Also converts values to other types if specified.
      * @param message ReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto.ReservedRange,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies a ReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
}

