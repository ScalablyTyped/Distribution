package typings.googleCloudPubsub.mod.protos.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.iam.v1.IBindingDelta
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BindingDelta. */
@JSImport("@google-cloud/pubsub", "protos.google.iam.v1.BindingDelta")
@js.native
/**
  * Constructs a new BindingDelta.
  * @param [properties] Properties to set
  */
class BindingDelta ()
  extends typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta {
  def this(properties: IBindingDelta) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.iam.v1.BindingDelta")
@js.native
object BindingDelta extends js.Object {
  /**
    * Creates a new BindingDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BindingDelta instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta = js.native
  def create(properties: IBindingDelta): typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta = js.native
  /**
    * Decodes a BindingDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta = js.native
  /**
    * Decodes a BindingDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta = js.native
  /**
    * Encodes the specified BindingDelta message. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
    * @param message BindingDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBindingDelta): Writer = js.native
  def encode(message: IBindingDelta, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BindingDelta message, length delimited. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
    * @param message BindingDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBindingDelta): Writer = js.native
  def encodeDelimited(message: IBindingDelta, writer: Writer): Writer = js.native
  /**
    * Creates a BindingDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BindingDelta
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta = js.native
  /**
    * Creates a plain object from a BindingDelta message. Also converts values to other types if specified.
    * @param message BindingDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BindingDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Action enum. */
  @js.native
  object Action extends js.Object {
    /* 0 */ val ACTION_UNSPECIFIED: typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta.Action.ACTION_UNSPECIFIED with Double = js.native
    /* 1 */ val ADD: typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta.Action.ADD with Double = js.native
    /* 2 */ val REMOVE: typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta.Action.REMOVE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudPubsub.protosMod.google.iam.v1.BindingDelta.Action with Double
      ] = js.native
  }
  
}

