package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.googleCloudPubsubStrings.snapshot
import typings.googleCloudPubsub.googleCloudPubsubStrings.time
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SeekRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest")
@js.native
/**
  * Constructs a new SeekRequest.
  * @param [properties] Properties to set
  */
class SeekRequest ()
  extends StObject
     with ISeekRequest {
  def this(properties: ISeekRequest) = this()
  
  /** SeekRequest snapshot. */
  @JSName("snapshot")
  var snapshot_SeekRequest: String = js.native
  
  /** SeekRequest subscription. */
  @JSName("subscription")
  var subscription_SeekRequest: String = js.native
  
  /** SeekRequest target. */
  var target: js.UndefOr[time | snapshot] = js.native
  
  /**
    * Converts this SeekRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SeekRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SeekRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SeekRequest instance
    */
  /* static member */
  @scala.inline
  def create(): SeekRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SeekRequest]
  @scala.inline
  def create(properties: ISeekRequest): SeekRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SeekRequest]
  
  /**
    * Decodes a SeekRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SeekRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): SeekRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SeekRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): SeekRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SeekRequest]
  @scala.inline
  def decode(reader: Uint8Array): SeekRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SeekRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): SeekRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SeekRequest]
  
  /**
    * Decodes a SeekRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SeekRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): SeekRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SeekRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): SeekRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SeekRequest]
  
  /**
    * Encodes the specified SeekRequest message. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
    * @param message SeekRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISeekRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISeekRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SeekRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
    * @param message SeekRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISeekRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISeekRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SeekRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SeekRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): SeekRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SeekRequest]
  
  /**
    * Creates a plain object from a SeekRequest message. Also converts values to other types if specified.
    * @param message SeekRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: SeekRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: SeekRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SeekRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
