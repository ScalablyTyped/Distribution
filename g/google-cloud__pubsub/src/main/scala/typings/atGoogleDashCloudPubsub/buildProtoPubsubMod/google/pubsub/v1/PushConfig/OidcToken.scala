package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an OidcToken. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.PushConfig.OidcToken")
@js.native
/**
  * Constructs a new OidcToken.
  * @param [properties] Properties to set
  */
class OidcToken () extends IOidcToken {
  def this(properties: IOidcToken) = this()
  /** OidcToken audience. */
  @JSName("audience")
  var audience_OidcToken: String = js.native
  /** OidcToken serviceAccountEmail. */
  @JSName("serviceAccountEmail")
  var serviceAccountEmail_OidcToken: String = js.native
  /**
    * Converts this OidcToken to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.PushConfig.OidcToken")
@js.native
object OidcToken extends js.Object {
  /**
    * Creates a new OidcToken instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OidcToken instance
    */
  def create(): OidcToken = js.native
  def create(properties: IOidcToken): OidcToken = js.native
  /**
    * Decodes an OidcToken message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OidcToken
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): OidcToken = js.native
  def decode(reader: Reader, length: Double): OidcToken = js.native
  def decode(reader: Uint8Array): OidcToken = js.native
  def decode(reader: Uint8Array, length: Double): OidcToken = js.native
  /**
    * Decodes an OidcToken message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OidcToken
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): OidcToken = js.native
  def decodeDelimited(reader: Uint8Array): OidcToken = js.native
  /**
    * Encodes the specified OidcToken message. Does not implicitly {@link google.pubsub.v1.PushConfig.OidcToken.verify|verify} messages.
    * @param message OidcToken message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IOidcToken): Writer = js.native
  def encode(message: IOidcToken, writer: Writer): Writer = js.native
  /**
    * Encodes the specified OidcToken message, length delimited. Does not implicitly {@link google.pubsub.v1.PushConfig.OidcToken.verify|verify} messages.
    * @param message OidcToken message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IOidcToken): Writer = js.native
  def encodeDelimited(message: IOidcToken, writer: Writer): Writer = js.native
  /**
    * Creates an OidcToken message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OidcToken
    */
  def fromObject(`object`: StringDictionary[js.Any]): OidcToken = js.native
  /**
    * Creates a plain object from an OidcToken message. Also converts values to other types if specified.
    * @param message OidcToken
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: OidcToken): StringDictionary[js.Any] = js.native
  def toObject(message: OidcToken, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an OidcToken message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

