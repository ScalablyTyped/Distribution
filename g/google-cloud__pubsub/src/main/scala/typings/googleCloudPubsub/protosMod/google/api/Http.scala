package typings.googleCloudPubsub.protosMod.google.api

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Http. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.api.Http")
@js.native
/**
  * Constructs a new Http.
  * @param [properties] Properties to set
  */
class Http () extends IHttp {
  def this(properties: IHttp) = this()
  /** Http fullyDecodeReservedExpansion. */
  @JSName("fullyDecodeReservedExpansion")
  var fullyDecodeReservedExpansion_Http: Boolean = js.native
  /** Http rules. */
  @JSName("rules")
  var rules_Http: js.Array[IHttpRule] = js.native
  /**
    * Converts this Http to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.api.Http")
@js.native
object Http extends js.Object {
  /**
    * Creates a new Http instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Http instance
    */
  def create(): Http = js.native
  def create(properties: IHttp): Http = js.native
  /**
    * Decodes a Http message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Http
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Http = js.native
  def decode(reader: Reader, length: Double): Http = js.native
  def decode(reader: Uint8Array): Http = js.native
  def decode(reader: Uint8Array, length: Double): Http = js.native
  /**
    * Decodes a Http message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Http
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Http = js.native
  def decodeDelimited(reader: Uint8Array): Http = js.native
  /**
    * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
    * @param message Http message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IHttp): Writer = js.native
  def encode(message: IHttp, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
    * @param message Http message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IHttp): Writer = js.native
  def encodeDelimited(message: IHttp, writer: Writer): Writer = js.native
  /**
    * Creates a Http message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Http
    */
  def fromObject(`object`: StringDictionary[js.Any]): Http = js.native
  /**
    * Creates a plain object from a Http message. Also converts values to other types if specified.
    * @param message Http
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Http): StringDictionary[js.Any] = js.native
  def toObject(message: Http, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Http message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

