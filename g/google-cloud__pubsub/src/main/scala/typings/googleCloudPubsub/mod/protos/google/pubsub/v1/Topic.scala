package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ITopic
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Topic. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic")
@js.native
/**
  * Constructs a new Topic.
  * @param [properties] Properties to set
  */
class Topic ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic {
  def this(properties: ITopic) = this()
}
object Topic {
  
  /**
    * Creates a new Topic instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Topic instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.create")
  @js.native
  def create(properties: ITopic): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic = js.native
  
  /**
    * Decodes a Topic message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Topic
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic = js.native
  
  /**
    * Decodes a Topic message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Topic
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic = js.native
  
  /**
    * Encodes the specified Topic message. Does not implicitly {@link google.pubsub.v1.Topic.verify|verify} messages.
    * @param message Topic message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.encode")
  @js.native
  def encode(message: ITopic): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.encode")
  @js.native
  def encode(message: ITopic, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Topic message, length delimited. Does not implicitly {@link google.pubsub.v1.Topic.verify|verify} messages.
    * @param message Topic message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITopic): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITopic, writer: Writer): Writer = js.native
  
  /**
    * Creates a Topic message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Topic
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic = js.native
  
  /**
    * Creates a plain object from a Topic message. Also converts values to other types if specified.
    * @param message Topic
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Topic, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Topic message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Topic.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
