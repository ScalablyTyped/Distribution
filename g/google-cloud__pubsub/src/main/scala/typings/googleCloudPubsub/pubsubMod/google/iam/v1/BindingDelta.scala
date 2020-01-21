package typings.googleCloudPubsub.pubsubMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.googleCloudPubsub.pubsubMod.google.iam.v1.BindingDelta.Action
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BindingDelta. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.iam.v1.BindingDelta")
@js.native
/**
  * Constructs a new BindingDelta.
  * @param [properties] Properties to set
  */
class BindingDelta () extends IBindingDelta {
  def this(properties: IBindingDelta) = this()
  /** BindingDelta action. */
  @JSName("action")
  var action_BindingDelta: Action = js.native
  /** BindingDelta member. */
  @JSName("member")
  var member_BindingDelta: String = js.native
  /** BindingDelta role. */
  @JSName("role")
  var role_BindingDelta: String = js.native
  /**
    * Converts this BindingDelta to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.iam.v1.BindingDelta")
@js.native
object BindingDelta extends js.Object {
  @js.native
  sealed trait Action extends js.Object
  
  /**
    * Creates a new BindingDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BindingDelta instance
    */
  def create(): BindingDelta = js.native
  def create(properties: IBindingDelta): BindingDelta = js.native
  /**
    * Decodes a BindingDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): BindingDelta = js.native
  def decode(reader: Reader, length: Double): BindingDelta = js.native
  def decode(reader: Uint8Array): BindingDelta = js.native
  def decode(reader: Uint8Array, length: Double): BindingDelta = js.native
  /**
    * Decodes a BindingDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): BindingDelta = js.native
  def decodeDelimited(reader: Uint8Array): BindingDelta = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): BindingDelta = js.native
  /**
    * Creates a plain object from a BindingDelta message. Also converts values to other types if specified.
    * @param message BindingDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: BindingDelta): StringDictionary[js.Any] = js.native
  def toObject(message: BindingDelta, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BindingDelta message.
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

