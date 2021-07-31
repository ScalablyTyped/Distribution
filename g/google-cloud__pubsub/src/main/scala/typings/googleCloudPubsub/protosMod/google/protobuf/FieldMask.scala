package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldMask. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask")
@js.native
/**
  * Constructs a new FieldMask.
  * @param [properties] Properties to set
  */
class FieldMask ()
  extends StObject
     with IFieldMask {
  def this(properties: IFieldMask) = this()
  
  /** FieldMask paths. */
  @JSName("paths")
  var paths_FieldMask: js.Array[String] = js.native
  
  /**
    * Converts this FieldMask to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object FieldMask {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FieldMask instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldMask instance
    */
  /* static member */
  @scala.inline
  def create(): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FieldMask]
  @scala.inline
  def create(properties: IFieldMask): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
  
  /**
    * Decodes a FieldMask message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldMask
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
  @scala.inline
  def decode(reader: Reader, length: Double): FieldMask = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FieldMask]
  @scala.inline
  def decode(reader: Uint8Array): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): FieldMask = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FieldMask]
  
  /**
    * Decodes a FieldMask message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldMask
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
  
  /**
    * Encodes the specified FieldMask message. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
    * @param message FieldMask message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IFieldMask): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IFieldMask, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified FieldMask message, length delimited. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
    * @param message FieldMask message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IFieldMask): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IFieldMask, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a FieldMask message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldMask
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
  
  /**
    * Creates a plain object from a FieldMask message. Also converts values to other types if specified.
    * @param message FieldMask
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: FieldMask): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: FieldMask, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a FieldMask message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
