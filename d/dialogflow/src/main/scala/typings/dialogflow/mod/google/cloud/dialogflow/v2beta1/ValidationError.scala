package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.ValidationError.Severity
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ValidationError. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ValidationError")
@js.native
/**
  * Constructs a new ValidationError.
  * @param [properties] Properties to set
  */
class ValidationError () extends IValidationError {
  def this(properties: IValidationError) = this()
  /** ValidationError entries. */
  @JSName("entries")
  var entries_ValidationError: js.Array[String] = js.native
  /** ValidationError errorMessage. */
  @JSName("errorMessage")
  var errorMessage_ValidationError: String = js.native
  /** ValidationError severity. */
  @JSName("severity")
  var severity_ValidationError: Severity | String = js.native
  /**
    * Converts this ValidationError to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ValidationError")
@js.native
object ValidationError extends js.Object {
  @js.native
  sealed trait Severity extends js.Object
  
  /**
    * Creates a new ValidationError instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ValidationError instance
    */
  def create(): ValidationError = js.native
  def create(properties: IValidationError): ValidationError = js.native
  /**
    * Decodes a ValidationError message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ValidationError
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ValidationError = js.native
  def decode(reader: Reader, length: Double): ValidationError = js.native
  def decode(reader: Uint8Array): ValidationError = js.native
  def decode(reader: Uint8Array, length: Double): ValidationError = js.native
  /**
    * Decodes a ValidationError message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ValidationError
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ValidationError = js.native
  def decodeDelimited(reader: Uint8Array): ValidationError = js.native
  /**
    * Encodes the specified ValidationError message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ValidationError.verify|verify} messages.
    * @param message ValidationError message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IValidationError): Writer = js.native
  def encode(message: IValidationError, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ValidationError message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ValidationError.verify|verify} messages.
    * @param message ValidationError message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IValidationError): Writer = js.native
  def encodeDelimited(message: IValidationError, writer: Writer): Writer = js.native
  /**
    * Creates a ValidationError message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ValidationError
    */
  def fromObject(`object`: StringDictionary[js.Any]): ValidationError = js.native
  /**
    * Creates a plain object from a ValidationError message. Also converts values to other types if specified.
    * @param message ValidationError
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ValidationError): StringDictionary[js.Any] = js.native
  def toObject(message: ValidationError, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ValidationError message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Severity enum. */
  @js.native
  object Severity extends js.Object {
    @js.native
    sealed trait CRITICAL extends Severity
    
    @js.native
    sealed trait ERROR extends Severity
    
    @js.native
    sealed trait INFO extends Severity
    
    @js.native
    sealed trait SEVERITY_UNSPECIFIED extends Severity
    
    @js.native
    sealed trait WARNING extends Severity
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Severity with Double] = js.native
    /* 4 */ @js.native
    object CRITICAL extends TopLevel[CRITICAL with Double]
    
    /* 3 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    /* 1 */ @js.native
    object INFO extends TopLevel[INFO with Double]
    
    /* 0 */ @js.native
    object SEVERITY_UNSPECIFIED extends TopLevel[SEVERITY_UNSPECIFIED with Double]
    
    /* 2 */ @js.native
    object WARNING extends TopLevel[WARNING with Double]
    
  }
  
}

