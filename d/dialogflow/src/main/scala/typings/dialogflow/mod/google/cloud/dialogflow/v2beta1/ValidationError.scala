package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.ValidationError.Severity
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ValidationError. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ValidationError")
@js.native
/**
  * Constructs a new ValidationError.
  * @param [properties] Properties to set
  */
class ValidationError ()
  extends StObject
     with IValidationError {
  def this(properties: IValidationError) = this()
  
  /** ValidationError entries. */
  @JSName("entries")
  var entries_ValidationError: js.Array[String] = js.native
  
  /** ValidationError errorMessage. */
  @JSName("errorMessage")
  var errorMessage_ValidationError: String = js.native
  
  /** ValidationError severity. */
  @JSName("severity")
  var severity_ValidationError: Severity | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.ValidationError.Severity * / any */ String) = js.native
  
  /**
    * Converts this ValidationError to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ValidationError {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ValidationError")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Severity extends StObject
  /** Severity enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ValidationError.Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Severity & Double] = js.native
    
    @js.native
    sealed trait CRITICAL
      extends StObject
         with Severity
    /* 4 */ val CRITICAL: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.ValidationError.Severity.CRITICAL & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Severity
    /* 3 */ val ERROR: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.ValidationError.Severity.ERROR & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with Severity
    /* 1 */ val INFO: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.ValidationError.Severity.INFO & Double = js.native
    
    @js.native
    sealed trait SEVERITY_UNSPECIFIED
      extends StObject
         with Severity
    /* 0 */ val SEVERITY_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.ValidationError.Severity.SEVERITY_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait WARNING
      extends StObject
         with Severity
    /* 2 */ val WARNING: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.ValidationError.Severity.WARNING & Double = js.native
  }
  
  /**
    * Creates a new ValidationError instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ValidationError instance
    */
  /* static member */
  @scala.inline
  def create(): ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ValidationError]
  @scala.inline
  def create(properties: IValidationError): ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ValidationError]
  
  /**
    * Decodes a ValidationError message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ValidationError
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidationError]
  @scala.inline
  def decode(reader: Reader, length: Double): ValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValidationError]
  @scala.inline
  def decode(reader: Uint8Array): ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidationError]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ValidationError]
  
  /**
    * Decodes a ValidationError message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ValidationError
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidationError]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ValidationError]
  
  /**
    * Encodes the specified ValidationError message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ValidationError.verify|verify} messages.
    * @param message ValidationError message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IValidationError): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IValidationError, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ValidationError message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ValidationError.verify|verify} messages.
    * @param message ValidationError message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IValidationError): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IValidationError, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ValidationError message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ValidationError
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ValidationError]
  
  /**
    * Creates a plain object from a ValidationError message. Also converts values to other types if specified.
    * @param message ValidationError
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: ValidationError): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ValidationError, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ValidationError message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
