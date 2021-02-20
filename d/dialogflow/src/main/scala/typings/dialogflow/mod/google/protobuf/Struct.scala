package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Struct. */
@JSImport("dialogflow/protos/protos", "google.protobuf.Struct")
@js.native
/**
  * Constructs a new Struct.
  * @param [properties] Properties to set
  */
class Struct () extends IStruct {
  def this(properties: IStruct) = this()
  
  /** Struct fields. */
  @JSName("fields")
  var fields_Struct: StringDictionary[IValue] = js.native
  
  /**
    * Converts this Struct to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Struct {
  
  /**
    * Creates a new Struct instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Struct instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.create")
  @js.native
  def create(): Struct = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.create")
  @js.native
  def create(properties: IStruct): Struct = js.native
  
  /**
    * Decodes a Struct message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Struct
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.decode")
  @js.native
  def decode(reader: Reader): Struct = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.decode")
  @js.native
  def decode(reader: Reader, length: Double): Struct = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.decode")
  @js.native
  def decode(reader: Uint8Array): Struct = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Struct = js.native
  
  /**
    * Decodes a Struct message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Struct
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Struct = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Struct = js.native
  
  /**
    * Encodes the specified Struct message. Does not implicitly {@link google.protobuf.Struct.verify|verify} messages.
    * @param message Struct message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.encode")
  @js.native
  def encode(message: IStruct): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.encode")
  @js.native
  def encode(message: IStruct, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Struct message, length delimited. Does not implicitly {@link google.protobuf.Struct.verify|verify} messages.
    * @param message Struct message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStruct): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStruct, writer: Writer): Writer = js.native
  
  /**
    * Creates a Struct message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Struct
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Struct = js.native
  
  /**
    * Creates a plain object from a Struct message. Also converts values to other types if specified.
    * @param message Struct
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.toObject")
  @js.native
  def toObject(message: Struct): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.toObject")
  @js.native
  def toObject(message: Struct, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Struct message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
