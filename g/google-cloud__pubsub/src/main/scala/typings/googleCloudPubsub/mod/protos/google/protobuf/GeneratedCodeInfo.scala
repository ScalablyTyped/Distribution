package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import typings.googleCloudPubsub.protosMod.google.protobuf.IGeneratedCodeInfo
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GeneratedCodeInfo. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo")
@js.native
/**
  * Constructs a new GeneratedCodeInfo.
  * @param [properties] Properties to set
  */
class GeneratedCodeInfo ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo {
  def this(properties: IGeneratedCodeInfo) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo")
@js.native
object GeneratedCodeInfo extends js.Object {
  /** Represents an Annotation. */
  @js.native
  /**
    * Constructs a new Annotation.
    * @param [properties] Properties to set
    */
  class Annotation ()
    extends typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation {
    def this(properties: IAnnotation) = this()
  }
  
  /**
    * Creates a new GeneratedCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedCodeInfo instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  def create(properties: IGeneratedCodeInfo): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Encodes the specified GeneratedCodeInfo message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGeneratedCodeInfo): Writer = js.native
  def encode(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GeneratedCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGeneratedCodeInfo): Writer = js.native
  def encodeDelimited(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  /**
    * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedCodeInfo
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
    * @param message GeneratedCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GeneratedCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /* static members */
  @js.native
  object Annotation extends js.Object {
    /**
      * Creates a new Annotation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Annotation instance
      */
    def create(): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    def create(properties: IAnnotation): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    /**
      * Decodes an Annotation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    /**
      * Decodes an Annotation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    /**
      * Encodes the specified Annotation message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IAnnotation): Writer = js.native
    def encode(message: IAnnotation, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Annotation message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IAnnotation): Writer = js.native
    def encodeDelimited(message: IAnnotation, writer: Writer): Writer = js.native
    /**
      * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Annotation
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    /**
      * Creates a plain object from an Annotation message. Also converts values to other types if specified.
      * @param message Annotation
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies an Annotation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
}

