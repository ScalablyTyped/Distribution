package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IMethodOptions
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MethodOptions. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.MethodOptions")
@js.native
/**
  * Constructs a new MethodOptions.
  * @param [properties] Properties to set
  */
class MethodOptions ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions {
  def this(properties: IMethodOptions) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.MethodOptions")
@js.native
object MethodOptions extends js.Object {
  /**
    * Creates a new MethodOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MethodOptions instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions = js.native
  def create(properties: IMethodOptions): typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions = js.native
  /**
    * Decodes a MethodOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions = js.native
  /**
    * Decodes a MethodOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions = js.native
  /**
    * Encodes the specified MethodOptions message. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMethodOptions): Writer = js.native
  def encode(message: IMethodOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified MethodOptions message, length delimited. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMethodOptions): Writer = js.native
  def encodeDelimited(message: IMethodOptions, writer: Writer): Writer = js.native
  /**
    * Creates a MethodOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MethodOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions = js.native
  /**
    * Creates a plain object from a MethodOptions message. Also converts values to other types if specified.
    * @param message MethodOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a MethodOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** IdempotencyLevel enum. */
  @js.native
  object IdempotencyLevel extends js.Object {
    /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN with Double = js.native
    /* 2 */ val IDEMPOTENT: typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENT with Double = js.native
    /* 1 */ val NO_SIDE_EFFECTS: typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions.IdempotencyLevel with Double
      ] = js.native
  }
  
}

