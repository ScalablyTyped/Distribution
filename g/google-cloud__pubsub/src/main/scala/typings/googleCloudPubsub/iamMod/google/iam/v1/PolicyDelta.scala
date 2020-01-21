package typings.googleCloudPubsub.iamMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PolicyDelta. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.PolicyDelta")
@js.native
/**
  * Constructs a new PolicyDelta.
  * @param [properties] Properties to set
  */
class PolicyDelta () extends IPolicyDelta {
  def this(properties: IPolicyDelta) = this()
  /** PolicyDelta auditConfigDeltas. */
  @JSName("auditConfigDeltas")
  var auditConfigDeltas_PolicyDelta: js.Array[IAuditConfigDelta] = js.native
  /** PolicyDelta bindingDeltas. */
  @JSName("bindingDeltas")
  var bindingDeltas_PolicyDelta: js.Array[IBindingDelta] = js.native
  /**
    * Converts this PolicyDelta to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.PolicyDelta")
@js.native
object PolicyDelta extends js.Object {
  /**
    * Creates a new PolicyDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PolicyDelta instance
    */
  def create(): PolicyDelta = js.native
  def create(properties: IPolicyDelta): PolicyDelta = js.native
  /**
    * Decodes a PolicyDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PolicyDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PolicyDelta = js.native
  def decode(reader: Reader, length: Double): PolicyDelta = js.native
  def decode(reader: Uint8Array): PolicyDelta = js.native
  def decode(reader: Uint8Array, length: Double): PolicyDelta = js.native
  /**
    * Decodes a PolicyDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PolicyDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PolicyDelta = js.native
  def decodeDelimited(reader: Uint8Array): PolicyDelta = js.native
  /**
    * Encodes the specified PolicyDelta message. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
    * @param message PolicyDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPolicyDelta): Writer = js.native
  def encode(message: IPolicyDelta, writer: Writer): Writer = js.native
  /**
    * Encodes the specified PolicyDelta message, length delimited. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
    * @param message PolicyDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPolicyDelta): Writer = js.native
  def encodeDelimited(message: IPolicyDelta, writer: Writer): Writer = js.native
  /**
    * Creates a PolicyDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PolicyDelta
    */
  def fromObject(`object`: StringDictionary[js.Any]): PolicyDelta = js.native
  /**
    * Creates a plain object from a PolicyDelta message. Also converts values to other types if specified.
    * @param message PolicyDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PolicyDelta): StringDictionary[js.Any] = js.native
  def toObject(message: PolicyDelta, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a PolicyDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

