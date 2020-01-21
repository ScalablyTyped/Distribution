package typings.googleCloudPubsub.iamMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ServiceDescriptorProto. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.protobuf.ServiceDescriptorProto")
@js.native
/**
  * Constructs a new ServiceDescriptorProto.
  * @param [properties] Properties to set
  */
class ServiceDescriptorProto () extends IServiceDescriptorProto {
  def this(properties: IServiceDescriptorProto) = this()
  /** ServiceDescriptorProto method. */
  @JSName("method")
  var method_ServiceDescriptorProto: js.Array[IMethodDescriptorProto] = js.native
  /** ServiceDescriptorProto name. */
  @JSName("name")
  var name_ServiceDescriptorProto: String = js.native
  /**
    * Converts this ServiceDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.protobuf.ServiceDescriptorProto")
@js.native
object ServiceDescriptorProto extends js.Object {
  /**
    * Creates a new ServiceDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ServiceDescriptorProto instance
    */
  def create(): ServiceDescriptorProto = js.native
  def create(properties: IServiceDescriptorProto): ServiceDescriptorProto = js.native
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ServiceDescriptorProto = js.native
  def decode(reader: Reader, length: Double): ServiceDescriptorProto = js.native
  def decode(reader: Uint8Array): ServiceDescriptorProto = js.native
  def decode(reader: Uint8Array, length: Double): ServiceDescriptorProto = js.native
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ServiceDescriptorProto = js.native
  def decodeDelimited(reader: Uint8Array): ServiceDescriptorProto = js.native
  /**
    * Encodes the specified ServiceDescriptorProto message. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IServiceDescriptorProto): Writer = js.native
  def encode(message: IServiceDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ServiceDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IServiceDescriptorProto): Writer = js.native
  def encodeDelimited(message: IServiceDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates a ServiceDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceDescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): ServiceDescriptorProto = js.native
  /**
    * Creates a plain object from a ServiceDescriptorProto message. Also converts values to other types if specified.
    * @param message ServiceDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ServiceDescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(message: ServiceDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ServiceDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

