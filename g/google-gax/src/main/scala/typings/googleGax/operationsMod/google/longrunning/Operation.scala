package typings.googleGax.operationsMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.googleGaxStrings.error
import typings.googleGax.googleGaxStrings.response
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Operation. */
@JSImport("google-gax/build/protos/operations", "google.longrunning.Operation")
@js.native
/**
  * Constructs a new Operation.
  * @param [properties] Properties to set
  */
open class Operation ()
  extends StObject
     with IOperation {
  def this(properties: IOperation) = this()
  
  /** Operation done. */
  @JSName("done")
  var done_Operation: Boolean = js.native
  
  /** Operation name. */
  @JSName("name")
  var name_Operation: String = js.native
  
  /** Operation result. */
  var result: js.UndefOr[error | response] = js.native
  
  /**
    * Converts this Operation to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Operation {
  
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Operation instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Operation instance
    */
  /* static member */
  inline def create(): Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Operation]
  inline def create(properties: IOperation): Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Operation]
  
  inline def decode(reader: js.typedarray.Uint8Array): Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Operation]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Operation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Operation]
  /**
    * Decodes an Operation message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Operation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Operation]
  inline def decode(reader: Reader, length: Double): Operation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Operation]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Operation]
  /**
    * Decodes an Operation message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Operation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Operation]
  
  /**
    * Encodes the specified Operation message. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
    * @param message Operation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IOperation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IOperation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Operation message, length delimited. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
    * @param message Operation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IOperation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IOperation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an Operation message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Operation
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Operation]
  
  /**
    * Creates a plain object from an Operation message. Also converts values to other types if specified.
    * @param message Operation
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Operation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Operation, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an Operation message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
