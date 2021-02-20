package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Empty. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty")
@js.native
/**
  * Constructs a new Empty.
  * @param [properties] Properties to set
  */
class Empty () extends IEmpty {
  def this(properties: IEmpty) = this()
  
  /**
    * Converts this Empty to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Empty {
  
  /**
    * Creates a new Empty instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Empty instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.create")
  @js.native
  def create(): Empty = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.create")
  @js.native
  def create(properties: IEmpty): Empty = js.native
  
  /**
    * Decodes an Empty message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Empty
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.decode")
  @js.native
  def decode(reader: Reader): Empty = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.decode")
  @js.native
  def decode(reader: Reader, length: Double): Empty = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.decode")
  @js.native
  def decode(reader: Uint8Array): Empty = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Empty = js.native
  
  /**
    * Decodes an Empty message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Empty
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Empty = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Empty = js.native
  
  /**
    * Encodes the specified Empty message. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
    * @param message Empty message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.encode")
  @js.native
  def encode(message: IEmpty): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.encode")
  @js.native
  def encode(message: IEmpty, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Empty message, length delimited. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
    * @param message Empty message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEmpty): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEmpty, writer: Writer): Writer = js.native
  
  /**
    * Creates an Empty message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Empty
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Empty = js.native
  
  /**
    * Creates a plain object from an Empty message. Also converts values to other types if specified.
    * @param message Empty
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.toObject")
  @js.native
  def toObject(message: Empty): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.toObject")
  @js.native
  def toObject(message: Empty, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Empty message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
