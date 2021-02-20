package typings.googleGax.operationsMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.googleGaxStrings.error
import typings.googleGax.googleGaxStrings.response
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Operation. */
@JSImport("google-gax/build/protos/operations", "google.longrunning.Operation")
@js.native
/**
  * Constructs a new Operation.
  * @param [properties] Properties to set
  */
class Operation () extends IOperation {
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
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Operation {
  
  /**
    * Creates a new Operation instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Operation instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.create")
  @js.native
  def create(): Operation = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.create")
  @js.native
  def create(properties: IOperation): Operation = js.native
  
  /**
    * Decodes an Operation message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Operation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.decode")
  @js.native
  def decode(reader: Reader): Operation = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.decode")
  @js.native
  def decode(reader: Reader, length: Double): Operation = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.decode")
  @js.native
  def decode(reader: Uint8Array): Operation = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Operation = js.native
  
  /**
    * Decodes an Operation message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Operation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Operation = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Operation = js.native
  
  /**
    * Encodes the specified Operation message. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
    * @param message Operation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.encode")
  @js.native
  def encode(message: IOperation): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.encode")
  @js.native
  def encode(message: IOperation, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Operation message, length delimited. Does not implicitly {@link google.longrunning.Operation.verify|verify} messages.
    * @param message Operation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.encodeDelimited")
  @js.native
  def encodeDelimited(message: IOperation): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.encodeDelimited")
  @js.native
  def encodeDelimited(message: IOperation, writer: Writer): Writer = js.native
  
  /**
    * Creates an Operation message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Operation
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Operation = js.native
  
  /**
    * Creates a plain object from an Operation message. Also converts values to other types if specified.
    * @param message Operation
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.toObject")
  @js.native
  def toObject(message: Operation): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.toObject")
  @js.native
  def toObject(message: Operation, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Operation message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.Operation.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
