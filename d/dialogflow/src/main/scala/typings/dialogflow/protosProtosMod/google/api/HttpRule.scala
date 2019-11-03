package typings.dialogflow.protosProtosMod.google.api

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.custom
import typings.dialogflow.dialogflowStrings.delete
import typings.dialogflow.dialogflowStrings.get
import typings.dialogflow.dialogflowStrings.patch
import typings.dialogflow.dialogflowStrings.post
import typings.dialogflow.dialogflowStrings.put
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a HttpRule. */
@JSImport("dialogflow/protos/protos", "google.api.HttpRule")
@js.native
/**
  * Constructs a new HttpRule.
  * @param [properties] Properties to set
  */
class HttpRule () extends IHttpRule {
  def this(properties: IHttpRule) = this()
  /** HttpRule additionalBindings. */
  @JSName("additionalBindings")
  var additionalBindings_HttpRule: js.Array[IHttpRule] = js.native
  /** HttpRule body. */
  @JSName("body")
  var body_HttpRule: String = js.native
  /** HttpRule delete. */
  @JSName("delete")
  var delete_HttpRule: String = js.native
  /** HttpRule get. */
  @JSName("get")
  var get_HttpRule: String = js.native
  /** HttpRule patch. */
  @JSName("patch")
  var patch_HttpRule: String = js.native
  /** HttpRule pattern. */
  var pattern: js.UndefOr[get | put | post | delete | patch | custom] = js.native
  /** HttpRule post. */
  @JSName("post")
  var post_HttpRule: String = js.native
  /** HttpRule put. */
  @JSName("put")
  var put_HttpRule: String = js.native
  /** HttpRule responseBody. */
  @JSName("responseBody")
  var responseBody_HttpRule: String = js.native
  /** HttpRule selector. */
  @JSName("selector")
  var selector_HttpRule: String = js.native
  /**
    * Converts this HttpRule to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.api.HttpRule")
@js.native
object HttpRule extends js.Object {
  /**
    * Creates a new HttpRule instance using the specified properties.
    * @param [properties] Properties to set
    * @returns HttpRule instance
    */
  def create(): HttpRule = js.native
  def create(properties: IHttpRule): HttpRule = js.native
  /**
    * Decodes a HttpRule message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns HttpRule
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): HttpRule = js.native
  def decode(reader: Reader, length: Double): HttpRule = js.native
  def decode(reader: Uint8Array): HttpRule = js.native
  def decode(reader: Uint8Array, length: Double): HttpRule = js.native
  /**
    * Decodes a HttpRule message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns HttpRule
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): HttpRule = js.native
  def decodeDelimited(reader: Uint8Array): HttpRule = js.native
  /**
    * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
    * @param message HttpRule message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IHttpRule): Writer = js.native
  def encode(message: IHttpRule, writer: Writer): Writer = js.native
  /**
    * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
    * @param message HttpRule message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IHttpRule): Writer = js.native
  def encodeDelimited(message: IHttpRule, writer: Writer): Writer = js.native
  /**
    * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns HttpRule
    */
  def fromObject(`object`: StringDictionary[js.Any]): HttpRule = js.native
  /**
    * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
    * @param message HttpRule
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: HttpRule): StringDictionary[js.Any] = js.native
  def toObject(message: HttpRule, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a HttpRule message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

