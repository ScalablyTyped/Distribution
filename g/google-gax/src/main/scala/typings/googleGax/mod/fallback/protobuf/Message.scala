package typings.googleGax.mod.fallback.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Properties
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.protobuf.Message")
@js.native
/**
  * Constructs a new message instance.
  * @param [properties] Properties to set
  */
class Message[T /* <: js.Object */] ()
  extends typings.googleGax.fallbackMod.protobuf.Message[T] {
  def this(properties: Properties[T]) = this()
}
/* static members */
object Message {
  
  /** Reference to the reflected type. */
  @JSImport("google-gax", "fallback.protobuf.Message.$type")
  @js.native
  val $type: typings.protobufjs.mod.Type = js.native
  
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  @JSImport("google-gax", "fallback.protobuf.Message.create")
  @js.native
  def create[T /* <: typings.protobufjs.mod.Message[T] */](): typings.protobufjs.mod.Message[T] = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.create")
  @js.native
  def create[T /* <: typings.protobufjs.mod.Message[T] */](properties: StringDictionary[js.Any]): typings.protobufjs.mod.Message[T] = js.native
  
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  @JSImport("google-gax", "fallback.protobuf.Message.decode")
  @js.native
  def decode[T /* <: typings.protobufjs.mod.Message[T] */](reader: typings.protobufjs.mod.Reader): T = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.decode")
  @js.native
  def decode[T /* <: typings.protobufjs.mod.Message[T] */](reader: Uint8Array): T = js.native
  
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  @JSImport("google-gax", "fallback.protobuf.Message.decodeDelimited")
  @js.native
  def decodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](reader: typings.protobufjs.mod.Reader): T = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.decodeDelimited")
  @js.native
  def decodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](reader: Uint8Array): T = js.native
  
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  @JSImport("google-gax", "fallback.protobuf.Message.encode")
  @js.native
  def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: T): typings.protobufjs.mod.Writer = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.encode")
  @js.native
  def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: T, writer: typings.protobufjs.mod.Writer): typings.protobufjs.mod.Writer = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.encode")
  @js.native
  def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[js.Any]): typings.protobufjs.mod.Writer = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.encode")
  @js.native
  def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[js.Any], writer: typings.protobufjs.mod.Writer): typings.protobufjs.mod.Writer = js.native
  
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  @JSImport("google-gax", "fallback.protobuf.Message.encodeDelimited")
  @js.native
  def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: T): typings.protobufjs.mod.Writer = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.encodeDelimited")
  @js.native
  def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: T, writer: typings.protobufjs.mod.Writer): typings.protobufjs.mod.Writer = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.encodeDelimited")
  @js.native
  def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[js.Any]): typings.protobufjs.mod.Writer = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.encodeDelimited")
  @js.native
  def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[js.Any], writer: typings.protobufjs.mod.Writer): typings.protobufjs.mod.Writer = js.native
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  @JSImport("google-gax", "fallback.protobuf.Message.fromObject")
  @js.native
  def fromObject[T /* <: typings.protobufjs.mod.Message[T] */](`object`: StringDictionary[js.Any]): T = js.native
  
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("google-gax", "fallback.protobuf.Message.toObject")
  @js.native
  def toObject[T /* <: typings.protobufjs.mod.Message[T] */](message: T): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "fallback.protobuf.Message.toObject")
  @js.native
  def toObject[T /* <: typings.protobufjs.mod.Message[T] */](message: T, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("google-gax", "fallback.protobuf.Message.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
