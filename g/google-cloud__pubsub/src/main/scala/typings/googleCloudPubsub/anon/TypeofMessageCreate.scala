package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Message
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Type
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMessageCreate
  extends StObject
     with Instantiable0[Message[js.Object]] {
  
  /** Reference to the reflected type. */
  @JSName("$type")
  val $type: Type = js.native
  
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create[T /* <: typings.protobufjs.mod.Message[T] */](): typings.protobufjs.mod.Message[T] = js.native
  def create[T /* <: typings.protobufjs.mod.Message[T] */](properties: StringDictionary[Any]): typings.protobufjs.mod.Message[T] = js.native
  
  def decode[T /* <: typings.protobufjs.mod.Message[T] */](reader: js.typedarray.Uint8Array): T = js.native
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decode[T /* <: typings.protobufjs.mod.Message[T] */](reader: Reader): T = js.native
  
  def decodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](reader: js.typedarray.Uint8Array): T = js.native
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](reader: Reader): T = js.native
  
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: T): Writer = js.native
  def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: T, writer: Writer): Writer = js.native
  def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[Any]): Writer = js.native
  def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[Any], writer: Writer): Writer = js.native
  
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: T): Writer = js.native
  def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: T, writer: Writer): Writer = js.native
  def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[Any]): Writer = js.native
  def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[Any], writer: Writer): Writer = js.native
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  def fromObject[T /* <: typings.protobufjs.mod.Message[T] */](`object`: StringDictionary[Any]): T = js.native
  
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject[T /* <: typings.protobufjs.mod.Message[T] */](message: T): StringDictionary[Any] = js.native
  def toObject[T /* <: typings.protobufjs.mod.Message[T] */](message: T, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
