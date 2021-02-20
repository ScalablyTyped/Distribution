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

/** Represents a ServiceOptions. */
@JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions")
@js.native
/**
  * Constructs a new ServiceOptions.
  * @param [properties] Properties to set
  */
class ServiceOptions () extends IServiceOptions {
  def this(properties: IServiceOptions) = this()
  
  /** ServiceOptions deprecated. */
  @JSName("deprecated")
  var deprecated_ServiceOptions: Boolean = js.native
  
  /**
    * Converts this ServiceOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ServiceOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_ServiceOptions: js.Array[IUninterpretedOption] = js.native
}
object ServiceOptions {
  
  /**
    * Creates a new ServiceOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ServiceOptions instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.create")
  @js.native
  def create(): ServiceOptions = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.create")
  @js.native
  def create(properties: IServiceOptions): ServiceOptions = js.native
  
  /**
    * Decodes a ServiceOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ServiceOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.decode")
  @js.native
  def decode(reader: Reader): ServiceOptions = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): ServiceOptions = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.decode")
  @js.native
  def decode(reader: Uint8Array): ServiceOptions = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ServiceOptions = js.native
  
  /**
    * Decodes a ServiceOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ServiceOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ServiceOptions = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ServiceOptions = js.native
  
  /**
    * Encodes the specified ServiceOptions message. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
    * @param message ServiceOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.encode")
  @js.native
  def encode(message: IServiceOptions): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.encode")
  @js.native
  def encode(message: IServiceOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ServiceOptions message, length delimited. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
    * @param message ServiceOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IServiceOptions): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IServiceOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a ServiceOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceOptions
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ServiceOptions = js.native
  
  /**
    * Creates a plain object from a ServiceOptions message. Also converts values to other types if specified.
    * @param message ServiceOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.toObject")
  @js.native
  def toObject(message: ServiceOptions): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.toObject")
  @js.native
  def toObject(message: ServiceOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ServiceOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.ServiceOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
