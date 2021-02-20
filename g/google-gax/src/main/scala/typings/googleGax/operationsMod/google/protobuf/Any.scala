package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Any. */
@JSImport("google-gax/build/protos/operations", "google.protobuf.Any")
@js.native
/**
  * Constructs a new Any.
  * @param [properties] Properties to set
  */
class Any () extends IAny {
  def this(properties: IAny) = this()
  
  /**
    * Converts this Any to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Any type_url. */
  @JSName("type_url")
  var type_url_Any: String = js.native
  
  /** Any value. */
  @JSName("value")
  var value_Any: Uint8Array = js.native
}
object Any {
  
  /**
    * Creates a new Any instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Any instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.create")
  @js.native
  def create(): Any = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.create")
  @js.native
  def create(properties: IAny): Any = js.native
  
  /**
    * Decodes an Any message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Any
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.decode")
  @js.native
  def decode(reader: Reader): Any = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.decode")
  @js.native
  def decode(reader: Reader, length: Double): Any = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.decode")
  @js.native
  def decode(reader: Uint8Array): Any = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Any = js.native
  
  /**
    * Decodes an Any message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Any
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Any = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Any = js.native
  
  /**
    * Encodes the specified Any message. Does not implicitly {@link google.protobuf.Any.verify|verify} messages.
    * @param message Any message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.encode")
  @js.native
  def encode(message: IAny): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.encode")
  @js.native
  def encode(message: IAny, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Any message, length delimited. Does not implicitly {@link google.protobuf.Any.verify|verify} messages.
    * @param message Any message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAny): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAny, writer: Writer): Writer = js.native
  
  /**
    * Creates an Any message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Any
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Any = js.native
  
  /**
    * Creates a plain object from an Any message. Also converts values to other types if specified.
    * @param message Any
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.toObject")
  @js.native
  def toObject(message: Any): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.toObject")
  @js.native
  def toObject(message: Any, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Any message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.Any.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
