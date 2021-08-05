package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.long.mod.Long
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingPullRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest")
@js.native
/**
  * Constructs a new StreamingPullRequest.
  * @param [properties] Properties to set
  */
class StreamingPullRequest ()
  extends StObject
     with IStreamingPullRequest {
  def this(properties: IStreamingPullRequest) = this()
  
  /** StreamingPullRequest ackIds. */
  @JSName("ackIds")
  var ackIds_StreamingPullRequest: js.Array[String] = js.native
  
  /** StreamingPullRequest clientId. */
  @JSName("clientId")
  var clientId_StreamingPullRequest: String = js.native
  
  /** StreamingPullRequest maxOutstandingBytes. */
  @JSName("maxOutstandingBytes")
  var maxOutstandingBytes_StreamingPullRequest: Double | Long | String = js.native
  
  /** StreamingPullRequest maxOutstandingMessages. */
  @JSName("maxOutstandingMessages")
  var maxOutstandingMessages_StreamingPullRequest: Double | Long | String = js.native
  
  /** StreamingPullRequest modifyDeadlineAckIds. */
  @JSName("modifyDeadlineAckIds")
  var modifyDeadlineAckIds_StreamingPullRequest: js.Array[String] = js.native
  
  /** StreamingPullRequest modifyDeadlineSeconds. */
  @JSName("modifyDeadlineSeconds")
  var modifyDeadlineSeconds_StreamingPullRequest: js.Array[Double] = js.native
  
  /** StreamingPullRequest streamAckDeadlineSeconds. */
  @JSName("streamAckDeadlineSeconds")
  var streamAckDeadlineSeconds_StreamingPullRequest: Double = js.native
  
  /** StreamingPullRequest subscription. */
  @JSName("subscription")
  var subscription_StreamingPullRequest: String = js.native
  
  /**
    * Converts this StreamingPullRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object StreamingPullRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new StreamingPullRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingPullRequest instance
    */
  /* static member */
  inline def create(): StreamingPullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StreamingPullRequest]
  inline def create(properties: IStreamingPullRequest): StreamingPullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StreamingPullRequest]
  
  /**
    * Decodes a StreamingPullRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingPullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): StreamingPullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingPullRequest]
  inline def decode(reader: Reader, length: Double): StreamingPullRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingPullRequest]
  inline def decode(reader: Uint8Array): StreamingPullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingPullRequest]
  inline def decode(reader: Uint8Array, length: Double): StreamingPullRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingPullRequest]
  
  /**
    * Decodes a StreamingPullRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingPullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): StreamingPullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingPullRequest]
  inline def decodeDelimited(reader: Uint8Array): StreamingPullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingPullRequest]
  
  /**
    * Encodes the specified StreamingPullRequest message. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
    * @param message StreamingPullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IStreamingPullRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStreamingPullRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StreamingPullRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
    * @param message StreamingPullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IStreamingPullRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStreamingPullRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StreamingPullRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingPullRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): StreamingPullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StreamingPullRequest]
  
  /**
    * Creates a plain object from a StreamingPullRequest message. Also converts values to other types if specified.
    * @param message StreamingPullRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: StreamingPullRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: StreamingPullRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a StreamingPullRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
