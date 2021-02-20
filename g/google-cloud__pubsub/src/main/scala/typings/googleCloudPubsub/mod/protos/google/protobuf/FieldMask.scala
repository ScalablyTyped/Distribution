package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IFieldMask
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldMask. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask")
@js.native
/**
  * Constructs a new FieldMask.
  * @param [properties] Properties to set
  */
class FieldMask ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask {
  def this(properties: IFieldMask) = this()
}
object FieldMask {
  
  /**
    * Creates a new FieldMask instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldMask instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.create")
  @js.native
  def create(properties: IFieldMask): typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask = js.native
  
  /**
    * Decodes a FieldMask message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldMask
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask = js.native
  
  /**
    * Decodes a FieldMask message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldMask
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask = js.native
  
  /**
    * Encodes the specified FieldMask message. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
    * @param message FieldMask message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.encode")
  @js.native
  def encode(message: IFieldMask): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.encode")
  @js.native
  def encode(message: IFieldMask, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FieldMask message, length delimited. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
    * @param message FieldMask message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldMask): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldMask, writer: Writer): Writer = js.native
  
  /**
    * Creates a FieldMask message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldMask
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask = js.native
  
  /**
    * Creates a plain object from a FieldMask message. Also converts values to other types if specified.
    * @param message FieldMask
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.FieldMask,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FieldMask message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldMask.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
