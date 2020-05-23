package typings.googleCloudPubsub.mod.protos.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.iam.v1.IAuditConfigDelta
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an AuditConfigDelta. */
@JSImport("@google-cloud/pubsub", "protos.google.iam.v1.AuditConfigDelta")
@js.native
/**
  * Constructs a new AuditConfigDelta.
  * @param [properties] Properties to set
  */
class AuditConfigDelta ()
  extends typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta {
  def this(properties: IAuditConfigDelta) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.iam.v1.AuditConfigDelta")
@js.native
object AuditConfigDelta extends js.Object {
  /**
    * Creates a new AuditConfigDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AuditConfigDelta instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta = js.native
  def create(properties: IAuditConfigDelta): typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta = js.native
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta = js.native
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta = js.native
  /**
    * Encodes the specified AuditConfigDelta message. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
    * @param message AuditConfigDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IAuditConfigDelta): Writer = js.native
  def encode(message: IAuditConfigDelta, writer: Writer): Writer = js.native
  /**
    * Encodes the specified AuditConfigDelta message, length delimited. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
    * @param message AuditConfigDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IAuditConfigDelta): Writer = js.native
  def encodeDelimited(message: IAuditConfigDelta, writer: Writer): Writer = js.native
  /**
    * Creates an AuditConfigDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AuditConfigDelta
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta = js.native
  /**
    * Creates a plain object from an AuditConfigDelta message. Also converts values to other types if specified.
    * @param message AuditConfigDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an AuditConfigDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Action enum. */
  @js.native
  object Action extends js.Object {
    /* 0 */ val ACTION_UNSPECIFIED: typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta.Action.ACTION_UNSPECIFIED with Double = js.native
    /* 1 */ val ADD: typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta.Action.ADD with Double = js.native
    /* 2 */ val REMOVE: typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta.Action.REMOVE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta.Action with Double
      ] = js.native
  }
  
}

