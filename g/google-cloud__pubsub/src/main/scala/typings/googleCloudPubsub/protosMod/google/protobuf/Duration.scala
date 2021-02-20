package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.long.mod.Long
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Duration. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration")
@js.native
/**
  * Constructs a new Duration.
  * @param [properties] Properties to set
  */
class Duration () extends IDuration {
  def this(properties: IDuration) = this()
  
  /** Duration nanos. */
  @JSName("nanos")
  var nanos_Duration: Double = js.native
  
  /** Duration seconds. */
  @JSName("seconds")
  var seconds_Duration: Double | Long | String = js.native
  
  /**
    * Converts this Duration to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Duration {
  
  /**
    * Creates a new Duration instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Duration instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.create")
  @js.native
  def create(): Duration = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.create")
  @js.native
  def create(properties: IDuration): Duration = js.native
  
  /**
    * Decodes a Duration message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.decode")
  @js.native
  def decode(reader: Reader): Duration = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.decode")
  @js.native
  def decode(reader: Reader, length: Double): Duration = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.decode")
  @js.native
  def decode(reader: Uint8Array): Duration = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Duration = js.native
  
  /**
    * Decodes a Duration message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Duration = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Duration = js.native
  
  /**
    * Encodes the specified Duration message. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.encode")
  @js.native
  def encode(message: IDuration): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.encode")
  @js.native
  def encode(message: IDuration, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Duration message, length delimited. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDuration): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDuration, writer: Writer): Writer = js.native
  
  /**
    * Creates a Duration message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Duration
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Duration = js.native
  
  /**
    * Creates a plain object from a Duration message. Also converts values to other types if specified.
    * @param message Duration
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.toObject")
  @js.native
  def toObject(message: Duration): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.toObject")
  @js.native
  def toObject(message: Duration, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Duration message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Duration.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
