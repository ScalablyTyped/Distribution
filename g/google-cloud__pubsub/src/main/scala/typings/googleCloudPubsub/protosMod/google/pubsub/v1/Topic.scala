package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Topic. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic")
@js.native
/**
  * Constructs a new Topic.
  * @param [properties] Properties to set
  */
class Topic () extends ITopic {
  def this(properties: ITopic) = this()
  
  /** Topic kmsKeyName. */
  @JSName("kmsKeyName")
  var kmsKeyName_Topic: String = js.native
  
  /** Topic labels. */
  @JSName("labels")
  var labels_Topic: StringDictionary[String] = js.native
  
  /** Topic name. */
  @JSName("name")
  var name_Topic: String = js.native
  
  /**
    * Converts this Topic to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Topic {
  
  /**
    * Creates a new Topic instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Topic instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.create")
  @js.native
  def create(): Topic = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.create")
  @js.native
  def create(properties: ITopic): Topic = js.native
  
  /**
    * Decodes a Topic message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Topic
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.decode")
  @js.native
  def decode(reader: Reader): Topic = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.decode")
  @js.native
  def decode(reader: Reader, length: Double): Topic = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.decode")
  @js.native
  def decode(reader: Uint8Array): Topic = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Topic = js.native
  
  /**
    * Decodes a Topic message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Topic
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Topic = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Topic = js.native
  
  /**
    * Encodes the specified Topic message. Does not implicitly {@link google.pubsub.v1.Topic.verify|verify} messages.
    * @param message Topic message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.encode")
  @js.native
  def encode(message: ITopic): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.encode")
  @js.native
  def encode(message: ITopic, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Topic message, length delimited. Does not implicitly {@link google.pubsub.v1.Topic.verify|verify} messages.
    * @param message Topic message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITopic): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITopic, writer: Writer): Writer = js.native
  
  /**
    * Creates a Topic message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Topic
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Topic = js.native
  
  /**
    * Creates a plain object from a Topic message. Also converts values to other types if specified.
    * @param message Topic
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.toObject")
  @js.native
  def toObject(message: Topic): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.toObject")
  @js.native
  def toObject(message: Topic, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Topic message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Topic.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
