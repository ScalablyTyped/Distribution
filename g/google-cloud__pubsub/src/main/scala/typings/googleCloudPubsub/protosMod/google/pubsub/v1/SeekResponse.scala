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

/** Represents a SeekResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse")
@js.native
/**
  * Constructs a new SeekResponse.
  * @param [properties] Properties to set
  */
class SeekResponse () extends ISeekResponse {
  def this(properties: ISeekResponse) = this()
  
  /**
    * Converts this SeekResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SeekResponse {
  
  /**
    * Creates a new SeekResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SeekResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.create")
  @js.native
  def create(): SeekResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.create")
  @js.native
  def create(properties: ISeekResponse): SeekResponse = js.native
  
  /**
    * Decodes a SeekResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SeekResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.decode")
  @js.native
  def decode(reader: Reader): SeekResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): SeekResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.decode")
  @js.native
  def decode(reader: Uint8Array): SeekResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SeekResponse = js.native
  
  /**
    * Decodes a SeekResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SeekResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SeekResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SeekResponse = js.native
  
  /**
    * Encodes the specified SeekResponse message. Does not implicitly {@link google.pubsub.v1.SeekResponse.verify|verify} messages.
    * @param message SeekResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.encode")
  @js.native
  def encode(message: ISeekResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.encode")
  @js.native
  def encode(message: ISeekResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SeekResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.SeekResponse.verify|verify} messages.
    * @param message SeekResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISeekResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISeekResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a SeekResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SeekResponse
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SeekResponse = js.native
  
  /**
    * Creates a plain object from a SeekResponse message. Also converts values to other types if specified.
    * @param message SeekResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.toObject")
  @js.native
  def toObject(message: SeekResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.toObject")
  @js.native
  def toObject(message: SeekResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SeekResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
