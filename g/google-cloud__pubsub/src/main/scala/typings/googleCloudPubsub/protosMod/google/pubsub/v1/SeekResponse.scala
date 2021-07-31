package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SeekResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse")
@js.native
/**
  * Constructs a new SeekResponse.
  * @param [properties] Properties to set
  */
class SeekResponse ()
  extends StObject
     with ISeekResponse {
  def this(properties: ISeekResponse) = this()
  
  /**
    * Converts this SeekResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SeekResponse {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SeekResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SeekResponse instance
    */
  /* static member */
  @scala.inline
  def create(): SeekResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SeekResponse]
  @scala.inline
  def create(properties: ISeekResponse): SeekResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SeekResponse]
  
  /**
    * Decodes a SeekResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SeekResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): SeekResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SeekResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): SeekResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SeekResponse]
  @scala.inline
  def decode(reader: Uint8Array): SeekResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SeekResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): SeekResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SeekResponse]
  
  /**
    * Decodes a SeekResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SeekResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): SeekResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SeekResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): SeekResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SeekResponse]
  
  /**
    * Encodes the specified SeekResponse message. Does not implicitly {@link google.pubsub.v1.SeekResponse.verify|verify} messages.
    * @param message SeekResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISeekResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISeekResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SeekResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.SeekResponse.verify|verify} messages.
    * @param message SeekResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISeekResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISeekResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SeekResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SeekResponse
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): SeekResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SeekResponse]
  
  /**
    * Creates a plain object from a SeekResponse message. Also converts values to other types if specified.
    * @param message SeekResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: SeekResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: SeekResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SeekResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
