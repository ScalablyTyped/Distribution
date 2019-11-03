package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Context. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Context")
@js.native
/**
  * Constructs a new Context.
  * @param [properties] Properties to set
  */
class Context () extends IContext {
  def this(properties: IContext) = this()
  /** Context lifespanCount. */
  @JSName("lifespanCount")
  var lifespanCount_Context: Double = js.native
  /** Context name. */
  @JSName("name")
  var name_Context: String = js.native
  /**
    * Converts this Context to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Context")
@js.native
object Context extends js.Object {
  /**
    * Creates a new Context instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Context instance
    */
  def create(): Context = js.native
  def create(properties: IContext): Context = js.native
  /**
    * Decodes a Context message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Context
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Context = js.native
  def decode(reader: Reader, length: Double): Context = js.native
  def decode(reader: Uint8Array): Context = js.native
  def decode(reader: Uint8Array, length: Double): Context = js.native
  /**
    * Decodes a Context message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Context
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Context = js.native
  def decodeDelimited(reader: Uint8Array): Context = js.native
  /**
    * Encodes the specified Context message. Does not implicitly {@link google.cloud.dialogflow.v2.Context.verify|verify} messages.
    * @param message Context message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IContext): Writer = js.native
  def encode(message: IContext, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Context message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Context.verify|verify} messages.
    * @param message Context message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IContext): Writer = js.native
  def encodeDelimited(message: IContext, writer: Writer): Writer = js.native
  /**
    * Creates a Context message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Context
    */
  def fromObject(`object`: StringDictionary[js.Any]): Context = js.native
  /**
    * Creates a plain object from a Context message. Also converts values to other types if specified.
    * @param message Context
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Context): StringDictionary[js.Any] = js.native
  def toObject(message: Context, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Context message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

