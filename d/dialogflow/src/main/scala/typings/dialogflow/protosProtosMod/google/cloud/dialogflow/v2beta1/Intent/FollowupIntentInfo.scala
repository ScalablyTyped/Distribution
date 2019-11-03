package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FollowupIntentInfo. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo")
@js.native
/**
  * Constructs a new FollowupIntentInfo.
  * @param [properties] Properties to set
  */
class FollowupIntentInfo () extends IFollowupIntentInfo {
  def this(properties: IFollowupIntentInfo) = this()
  /** FollowupIntentInfo followupIntentName. */
  @JSName("followupIntentName")
  var followupIntentName_FollowupIntentInfo: String = js.native
  /** FollowupIntentInfo parentFollowupIntentName. */
  @JSName("parentFollowupIntentName")
  var parentFollowupIntentName_FollowupIntentInfo: String = js.native
  /**
    * Converts this FollowupIntentInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo")
@js.native
object FollowupIntentInfo extends js.Object {
  /**
    * Creates a new FollowupIntentInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FollowupIntentInfo instance
    */
  def create(): FollowupIntentInfo = js.native
  def create(properties: IFollowupIntentInfo): FollowupIntentInfo = js.native
  /**
    * Decodes a FollowupIntentInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FollowupIntentInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): FollowupIntentInfo = js.native
  def decode(reader: Reader, length: Double): FollowupIntentInfo = js.native
  def decode(reader: Uint8Array): FollowupIntentInfo = js.native
  def decode(reader: Uint8Array, length: Double): FollowupIntentInfo = js.native
  /**
    * Decodes a FollowupIntentInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FollowupIntentInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): FollowupIntentInfo = js.native
  def decodeDelimited(reader: Uint8Array): FollowupIntentInfo = js.native
  /**
    * Encodes the specified FollowupIntentInfo message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo.verify|verify} messages.
    * @param message FollowupIntentInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFollowupIntentInfo): Writer = js.native
  def encode(message: IFollowupIntentInfo, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FollowupIntentInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo.verify|verify} messages.
    * @param message FollowupIntentInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFollowupIntentInfo): Writer = js.native
  def encodeDelimited(message: IFollowupIntentInfo, writer: Writer): Writer = js.native
  /**
    * Creates a FollowupIntentInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FollowupIntentInfo
    */
  def fromObject(`object`: StringDictionary[js.Any]): FollowupIntentInfo = js.native
  /**
    * Creates a plain object from a FollowupIntentInfo message. Also converts values to other types if specified.
    * @param message FollowupIntentInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: FollowupIntentInfo): StringDictionary[js.Any] = js.native
  def toObject(message: FollowupIntentInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FollowupIntentInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

