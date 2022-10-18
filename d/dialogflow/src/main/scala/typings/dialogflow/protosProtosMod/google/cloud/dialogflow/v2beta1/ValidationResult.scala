package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ValidationResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ValidationResult")
@js.native
/**
  * Constructs a new ValidationResult.
  * @param [properties] Properties to set
  */
open class ValidationResult ()
  extends StObject
     with IValidationResult {
  def this(properties: IValidationResult) = this()
  
  /**
    * Converts this ValidationResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** ValidationResult validationErrors. */
  @JSName("validationErrors")
  var validationErrors_ValidationResult: js.Array[IValidationError] = js.native
}
object ValidationResult {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ValidationResult")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ValidationResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ValidationResult instance
    */
  /* static member */
  inline def create(): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ValidationResult]
  inline def create(properties: IValidationResult): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ValidationResult]
  
  inline def decode(reader: js.typedarray.Uint8Array): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidationResult]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  /**
    * Decodes a ValidationResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ValidationResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidationResult]
  inline def decode(reader: Reader, length: Double): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidationResult]
  /**
    * Decodes a ValidationResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ValidationResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidationResult]
  
  /**
    * Encodes the specified ValidationResult message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ValidationResult.verify|verify} messages.
    * @param message ValidationResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IValidationResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IValidationResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ValidationResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ValidationResult.verify|verify} messages.
    * @param message ValidationResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IValidationResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IValidationResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ValidationResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ValidationResult
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ValidationResult]
  
  /**
    * Creates a plain object from a ValidationResult message. Also converts values to other types if specified.
    * @param message ValidationResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ValidationResult): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ValidationResult, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ValidationResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
