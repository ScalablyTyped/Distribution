package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IFieldDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FieldDescriptorProto. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldDescriptorProto")
@js.native
/**
  * Constructs a new FieldDescriptorProto.
  * @param [properties] Properties to set
  */
class FieldDescriptorProto ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto {
  def this(properties: IFieldDescriptorProto) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FieldDescriptorProto")
@js.native
object FieldDescriptorProto extends js.Object {
  /**
    * Creates a new FieldDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldDescriptorProto instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto = js.native
  def create(properties: IFieldDescriptorProto): typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto = js.native
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto = js.native
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto = js.native
  /**
    * Encodes the specified FieldDescriptorProto message. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFieldDescriptorProto): Writer = js.native
  def encode(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FieldDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFieldDescriptorProto): Writer = js.native
  def encodeDelimited(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldDescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto = js.native
  /**
    * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
    * @param message FieldDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FieldDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Label enum. */
  @js.native
  object Label extends js.Object {
    /* 1 */ val LABEL_OPTIONAL: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label.LABEL_OPTIONAL with Double = js.native
    /* 3 */ val LABEL_REPEATED: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REPEATED with Double = js.native
    /* 2 */ val LABEL_REQUIRED: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REQUIRED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label with Double
      ] = js.native
  }
  
  /** Type enum. */
  @js.native
  object Type extends js.Object {
    /* 8 */ val TYPE_BOOL: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_BOOL with Double = js.native
    /* 12 */ val TYPE_BYTES: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_BYTES with Double = js.native
    /* 1 */ val TYPE_DOUBLE: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_DOUBLE with Double = js.native
    /* 14 */ val TYPE_ENUM: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_ENUM with Double = js.native
    /* 7 */ val TYPE_FIXED32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED32 with Double = js.native
    /* 6 */ val TYPE_FIXED64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED64 with Double = js.native
    /* 2 */ val TYPE_FLOAT: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FLOAT with Double = js.native
    /* 10 */ val TYPE_GROUP: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_GROUP with Double = js.native
    /* 5 */ val TYPE_INT32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT32 with Double = js.native
    /* 3 */ val TYPE_INT64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT64 with Double = js.native
    /* 11 */ val TYPE_MESSAGE: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_MESSAGE with Double = js.native
    /* 15 */ val TYPE_SFIXED32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED32 with Double = js.native
    /* 16 */ val TYPE_SFIXED64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED64 with Double = js.native
    /* 17 */ val TYPE_SINT32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT32 with Double = js.native
    /* 18 */ val TYPE_SINT64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT64 with Double = js.native
    /* 9 */ val TYPE_STRING: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_STRING with Double = js.native
    /* 13 */ val TYPE_UINT32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT32 with Double = js.native
    /* 4 */ val TYPE_UINT64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type with Double
      ] = js.native
  }
  
}

