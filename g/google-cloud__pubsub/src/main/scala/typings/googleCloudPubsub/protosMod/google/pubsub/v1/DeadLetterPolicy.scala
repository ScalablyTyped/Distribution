package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeadLetterPolicy. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeadLetterPolicy")
@js.native
/**
  * Constructs a new DeadLetterPolicy.
  * @param [properties] Properties to set
  */
class DeadLetterPolicy ()
  extends StObject
     with IDeadLetterPolicy {
  def this(properties: IDeadLetterPolicy) = this()
  
  /** DeadLetterPolicy deadLetterTopic. */
  @JSName("deadLetterTopic")
  var deadLetterTopic_DeadLetterPolicy: String = js.native
  
  /** DeadLetterPolicy maxDeliveryAttempts. */
  @JSName("maxDeliveryAttempts")
  var maxDeliveryAttempts_DeadLetterPolicy: Double = js.native
  
  /**
    * Converts this DeadLetterPolicy to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeadLetterPolicy {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeadLetterPolicy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeadLetterPolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeadLetterPolicy instance
    */
  /* static member */
  @scala.inline
  def create(): DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DeadLetterPolicy]
  @scala.inline
  def create(properties: IDeadLetterPolicy): DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DeadLetterPolicy]
  
  /**
    * Decodes a DeadLetterPolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeadLetterPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeadLetterPolicy]
  @scala.inline
  def decode(reader: Reader, length: Double): DeadLetterPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeadLetterPolicy]
  @scala.inline
  def decode(reader: Uint8Array): DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeadLetterPolicy]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): DeadLetterPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeadLetterPolicy]
  
  /**
    * Decodes a DeadLetterPolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeadLetterPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeadLetterPolicy]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeadLetterPolicy]
  
  /**
    * Encodes the specified DeadLetterPolicy message. Does not implicitly {@link google.pubsub.v1.DeadLetterPolicy.verify|verify} messages.
    * @param message DeadLetterPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IDeadLetterPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IDeadLetterPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeadLetterPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.DeadLetterPolicy.verify|verify} messages.
    * @param message DeadLetterPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IDeadLetterPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IDeadLetterPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeadLetterPolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeadLetterPolicy
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeadLetterPolicy]
  
  /**
    * Creates a plain object from a DeadLetterPolicy message. Also converts values to other types if specified.
    * @param message DeadLetterPolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: DeadLetterPolicy): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: DeadLetterPolicy, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a DeadLetterPolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
