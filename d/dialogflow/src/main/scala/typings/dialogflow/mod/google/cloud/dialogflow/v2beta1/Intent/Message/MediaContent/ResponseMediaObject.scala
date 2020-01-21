package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.icon
import typings.dialogflow.dialogflowStrings.largeImage
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ResponseMediaObject. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaObject")
@js.native
/**
  * Constructs a new ResponseMediaObject.
  * @param [properties] Properties to set
  */
class ResponseMediaObject () extends IResponseMediaObject {
  def this(properties: IResponseMediaObject) = this()
  /** ResponseMediaObject contentUrl. */
  @JSName("contentUrl")
  var contentUrl_ResponseMediaObject: String = js.native
  /** ResponseMediaObject description. */
  @JSName("description")
  var description_ResponseMediaObject: String = js.native
  /** ResponseMediaObject image. */
  var image: js.UndefOr[largeImage | icon] = js.native
  /** ResponseMediaObject name. */
  @JSName("name")
  var name_ResponseMediaObject: String = js.native
  /**
    * Converts this ResponseMediaObject to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaObject")
@js.native
object ResponseMediaObject extends js.Object {
  /**
    * Creates a new ResponseMediaObject instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ResponseMediaObject instance
    */
  def create(): ResponseMediaObject = js.native
  def create(properties: IResponseMediaObject): ResponseMediaObject = js.native
  /**
    * Decodes a ResponseMediaObject message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ResponseMediaObject
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ResponseMediaObject = js.native
  def decode(reader: Reader, length: Double): ResponseMediaObject = js.native
  def decode(reader: Uint8Array): ResponseMediaObject = js.native
  def decode(reader: Uint8Array, length: Double): ResponseMediaObject = js.native
  /**
    * Decodes a ResponseMediaObject message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ResponseMediaObject
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ResponseMediaObject = js.native
  def decodeDelimited(reader: Uint8Array): ResponseMediaObject = js.native
  /**
    * Encodes the specified ResponseMediaObject message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaObject.verify|verify} messages.
    * @param message ResponseMediaObject message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IResponseMediaObject): Writer = js.native
  def encode(message: IResponseMediaObject, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ResponseMediaObject message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaObject.verify|verify} messages.
    * @param message ResponseMediaObject message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IResponseMediaObject): Writer = js.native
  def encodeDelimited(message: IResponseMediaObject, writer: Writer): Writer = js.native
  /**
    * Creates a ResponseMediaObject message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ResponseMediaObject
    */
  def fromObject(`object`: StringDictionary[js.Any]): ResponseMediaObject = js.native
  /**
    * Creates a plain object from a ResponseMediaObject message. Also converts values to other types if specified.
    * @param message ResponseMediaObject
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ResponseMediaObject): StringDictionary[js.Any] = js.native
  def toObject(message: ResponseMediaObject, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ResponseMediaObject message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

