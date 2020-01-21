package typings.googleCloudPubsub.pubsubMod.google.`type`

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Expr. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.type.Expr")
@js.native
/**
  * Constructs a new Expr.
  * @param [properties] Properties to set
  */
class Expr () extends IExpr {
  def this(properties: IExpr) = this()
  /** Expr description. */
  @JSName("description")
  var description_Expr: String = js.native
  /** Expr expression. */
  @JSName("expression")
  var expression_Expr: String = js.native
  /** Expr location. */
  @JSName("location")
  var location_Expr: String = js.native
  /** Expr title. */
  @JSName("title")
  var title_Expr: String = js.native
  /**
    * Converts this Expr to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.type.Expr")
@js.native
object Expr extends js.Object {
  /**
    * Creates a new Expr instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Expr instance
    */
  def create(): Expr = js.native
  def create(properties: IExpr): Expr = js.native
  /**
    * Decodes an Expr message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Expr
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Expr = js.native
  def decode(reader: Reader, length: Double): Expr = js.native
  def decode(reader: Uint8Array): Expr = js.native
  def decode(reader: Uint8Array, length: Double): Expr = js.native
  /**
    * Decodes an Expr message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Expr
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Expr = js.native
  def decodeDelimited(reader: Uint8Array): Expr = js.native
  /**
    * Encodes the specified Expr message. Does not implicitly {@link google.type.Expr.verify|verify} messages.
    * @param message Expr message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IExpr): Writer = js.native
  def encode(message: IExpr, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Expr message, length delimited. Does not implicitly {@link google.type.Expr.verify|verify} messages.
    * @param message Expr message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IExpr): Writer = js.native
  def encodeDelimited(message: IExpr, writer: Writer): Writer = js.native
  /**
    * Creates an Expr message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Expr
    */
  def fromObject(`object`: StringDictionary[js.Any]): Expr = js.native
  /**
    * Creates a plain object from an Expr message. Also converts values to other types if specified.
    * @param message Expr
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Expr): StringDictionary[js.Any] = js.native
  def toObject(message: Expr, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Expr message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

