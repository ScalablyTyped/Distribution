package typings.dialogflow.protosProtosMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an OperationInfo. */
@JSImport("dialogflow/protos/protos", "google.longrunning.OperationInfo")
@js.native
/**
  * Constructs a new OperationInfo.
  * @param [properties] Properties to set
  */
class OperationInfo () extends IOperationInfo {
  def this(properties: IOperationInfo) = this()
  /** OperationInfo metadataType. */
  @JSName("metadataType")
  var metadataType_OperationInfo: String = js.native
  /** OperationInfo responseType. */
  @JSName("responseType")
  var responseType_OperationInfo: String = js.native
  /**
    * Converts this OperationInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.longrunning.OperationInfo")
@js.native
object OperationInfo extends js.Object {
  /**
    * Creates a new OperationInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OperationInfo instance
    */
  def create(): OperationInfo = js.native
  def create(properties: IOperationInfo): OperationInfo = js.native
  /**
    * Decodes an OperationInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OperationInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): OperationInfo = js.native
  def decode(reader: Reader, length: Double): OperationInfo = js.native
  def decode(reader: Uint8Array): OperationInfo = js.native
  def decode(reader: Uint8Array, length: Double): OperationInfo = js.native
  /**
    * Decodes an OperationInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OperationInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): OperationInfo = js.native
  def decodeDelimited(reader: Uint8Array): OperationInfo = js.native
  /**
    * Encodes the specified OperationInfo message. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
    * @param message OperationInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IOperationInfo): Writer = js.native
  def encode(message: IOperationInfo, writer: Writer): Writer = js.native
  /**
    * Encodes the specified OperationInfo message, length delimited. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
    * @param message OperationInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IOperationInfo): Writer = js.native
  def encodeDelimited(message: IOperationInfo, writer: Writer): Writer = js.native
  /**
    * Creates an OperationInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OperationInfo
    */
  def fromObject(`object`: StringDictionary[js.Any]): OperationInfo = js.native
  /**
    * Creates a plain object from an OperationInfo message. Also converts values to other types if specified.
    * @param message OperationInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: OperationInfo): StringDictionary[js.Any] = js.native
  def toObject(message: OperationInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an OperationInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

