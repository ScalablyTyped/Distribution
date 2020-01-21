package typings.googleCloudPubsub.pubsubMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.googleCloudPubsub.pubsubMod.google.protobuf.MethodOptions.IdempotencyLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MethodOptions. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.MethodOptions")
@js.native
/**
  * Constructs a new MethodOptions.
  * @param [properties] Properties to set
  */
class MethodOptions () extends IMethodOptions {
  def this(properties: IMethodOptions) = this()
  /** MethodOptions deprecated. */
  @JSName("deprecated")
  var deprecated_MethodOptions: Boolean = js.native
  /** MethodOptions idempotencyLevel. */
  @JSName("idempotencyLevel")
  var idempotencyLevel_MethodOptions: IdempotencyLevel = js.native
  /** MethodOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_MethodOptions: js.Array[IUninterpretedOption] = js.native
  /**
    * Converts this MethodOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.MethodOptions")
@js.native
object MethodOptions extends js.Object {
  @js.native
  sealed trait IdempotencyLevel extends js.Object
  
  /**
    * Creates a new MethodOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MethodOptions instance
    */
  def create(): MethodOptions = js.native
  def create(properties: IMethodOptions): MethodOptions = js.native
  /**
    * Decodes a MethodOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): MethodOptions = js.native
  def decode(reader: Reader, length: Double): MethodOptions = js.native
  def decode(reader: Uint8Array): MethodOptions = js.native
  def decode(reader: Uint8Array, length: Double): MethodOptions = js.native
  /**
    * Decodes a MethodOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): MethodOptions = js.native
  def decodeDelimited(reader: Uint8Array): MethodOptions = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): MethodOptions = js.native
  /**
    * Creates a plain object from a MethodOptions message. Also converts values to other types if specified.
    * @param message MethodOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: MethodOptions): StringDictionary[js.Any] = js.native
  def toObject(message: MethodOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a MethodOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** IdempotencyLevel enum. */
  @js.native
  object IdempotencyLevel extends js.Object {
    @js.native
    sealed trait IDEMPOTENCY_UNKNOWN extends IdempotencyLevel
    
    @js.native
    sealed trait IDEMPOTENT extends IdempotencyLevel
    
    @js.native
    sealed trait NO_SIDE_EFFECTS extends IdempotencyLevel
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IdempotencyLevel with Double] = js.native
    /* 0 */ @js.native
    object IDEMPOTENCY_UNKNOWN extends TopLevel[IDEMPOTENCY_UNKNOWN with Double]
    
    /* 2 */ @js.native
    object IDEMPOTENT extends TopLevel[IDEMPOTENT with Double]
    
    /* 1 */ @js.native
    object NO_SIDE_EFFECTS extends TopLevel[NO_SIDE_EFFECTS with Double]
    
  }
  
}

