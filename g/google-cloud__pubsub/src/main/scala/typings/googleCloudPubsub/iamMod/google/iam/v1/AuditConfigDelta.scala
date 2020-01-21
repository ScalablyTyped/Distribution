package typings.googleCloudPubsub.iamMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.googleCloudPubsub.iamMod.google.iam.v1.AuditConfigDelta.Action
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an AuditConfigDelta. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.AuditConfigDelta")
@js.native
/**
  * Constructs a new AuditConfigDelta.
  * @param [properties] Properties to set
  */
class AuditConfigDelta () extends IAuditConfigDelta {
  def this(properties: IAuditConfigDelta) = this()
  /** AuditConfigDelta action. */
  @JSName("action")
  var action_AuditConfigDelta: Action = js.native
  /** AuditConfigDelta exemptedMember. */
  @JSName("exemptedMember")
  var exemptedMember_AuditConfigDelta: String = js.native
  /** AuditConfigDelta logType. */
  @JSName("logType")
  var logType_AuditConfigDelta: String = js.native
  /** AuditConfigDelta service. */
  @JSName("service")
  var service_AuditConfigDelta: String = js.native
  /**
    * Converts this AuditConfigDelta to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.AuditConfigDelta")
@js.native
object AuditConfigDelta extends js.Object {
  @js.native
  sealed trait Action extends js.Object
  
  /**
    * Creates a new AuditConfigDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AuditConfigDelta instance
    */
  def create(): AuditConfigDelta = js.native
  def create(properties: IAuditConfigDelta): AuditConfigDelta = js.native
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): AuditConfigDelta = js.native
  def decode(reader: Reader, length: Double): AuditConfigDelta = js.native
  def decode(reader: Uint8Array): AuditConfigDelta = js.native
  def decode(reader: Uint8Array, length: Double): AuditConfigDelta = js.native
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): AuditConfigDelta = js.native
  def decodeDelimited(reader: Uint8Array): AuditConfigDelta = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): AuditConfigDelta = js.native
  /**
    * Creates a plain object from an AuditConfigDelta message. Also converts values to other types if specified.
    * @param message AuditConfigDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: AuditConfigDelta): StringDictionary[js.Any] = js.native
  def toObject(message: AuditConfigDelta, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an AuditConfigDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Action enum. */
  @js.native
  object Action extends js.Object {
    @js.native
    sealed trait ACTION_UNSPECIFIED extends Action
    
    @js.native
    sealed trait ADD extends Action
    
    @js.native
    sealed trait REMOVE extends Action
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Action with Double] = js.native
    /* 0 */ @js.native
    object ACTION_UNSPECIFIED extends TopLevel[ACTION_UNSPECIFIED with Double]
    
    /* 1 */ @js.native
    object ADD extends TopLevel[ADD with Double]
    
    /* 2 */ @js.native
    object REMOVE extends TopLevel[REMOVE with Double]
    
  }
  
}

