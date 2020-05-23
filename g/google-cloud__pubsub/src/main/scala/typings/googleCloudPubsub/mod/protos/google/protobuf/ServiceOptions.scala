package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IServiceOptions
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ServiceOptions. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.ServiceOptions")
@js.native
/**
  * Constructs a new ServiceOptions.
  * @param [properties] Properties to set
  */
class ServiceOptions ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions {
  def this(properties: IServiceOptions) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.ServiceOptions")
@js.native
object ServiceOptions extends js.Object {
  /**
    * Creates a new ServiceOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ServiceOptions instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions = js.native
  def create(properties: IServiceOptions): typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions = js.native
  /**
    * Decodes a ServiceOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ServiceOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions = js.native
  /**
    * Decodes a ServiceOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ServiceOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions = js.native
  /**
    * Encodes the specified ServiceOptions message. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
    * @param message ServiceOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IServiceOptions): Writer = js.native
  def encode(message: IServiceOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ServiceOptions message, length delimited. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
    * @param message ServiceOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IServiceOptions): Writer = js.native
  def encodeDelimited(message: IServiceOptions, writer: Writer): Writer = js.native
  /**
    * Creates a ServiceOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions = js.native
  /**
    * Creates a plain object from a ServiceOptions message. Also converts values to other types if specified.
    * @param message ServiceOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.ServiceOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ServiceOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

