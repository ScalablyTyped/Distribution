package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ValidationResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ValidationResult")
@js.native
/**
  * Constructs a new ValidationResult.
  * @param [properties] Properties to set
  */
class ValidationResult () extends IValidationResult {
  def this(properties: IValidationResult) = this()
  /** ValidationResult validationErrors. */
  @JSName("validationErrors")
  var validationErrors_ValidationResult: js.Array[IValidationError] = js.native
  /**
    * Converts this ValidationResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ValidationResult")
@js.native
object ValidationResult extends js.Object {
  /**
    * Creates a new ValidationResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ValidationResult instance
    */
  def create(): ValidationResult = js.native
  def create(properties: IValidationResult): ValidationResult = js.native
  /**
    * Decodes a ValidationResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ValidationResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ValidationResult = js.native
  def decode(reader: Reader, length: Double): ValidationResult = js.native
  def decode(reader: Uint8Array): ValidationResult = js.native
  def decode(reader: Uint8Array, length: Double): ValidationResult = js.native
  /**
    * Decodes a ValidationResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ValidationResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ValidationResult = js.native
  def decodeDelimited(reader: Uint8Array): ValidationResult = js.native
  /**
    * Encodes the specified ValidationResult message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ValidationResult.verify|verify} messages.
    * @param message ValidationResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IValidationResult): Writer = js.native
  def encode(message: IValidationResult, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ValidationResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ValidationResult.verify|verify} messages.
    * @param message ValidationResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IValidationResult): Writer = js.native
  def encodeDelimited(message: IValidationResult, writer: Writer): Writer = js.native
  /**
    * Creates a ValidationResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ValidationResult
    */
  def fromObject(`object`: StringDictionary[js.Any]): ValidationResult = js.native
  /**
    * Creates a plain object from a ValidationResult message. Also converts values to other types if specified.
    * @param message ValidationResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ValidationResult): StringDictionary[js.Any] = js.native
  def toObject(message: ValidationResult, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ValidationResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

