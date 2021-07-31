package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PullRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PullRequest")
@js.native
/**
  * Constructs a new PullRequest.
  * @param [properties] Properties to set
  */
class PullRequest ()
  extends StObject
     with IPullRequest {
  def this(properties: IPullRequest) = this()
  
  /** PullRequest maxMessages. */
  @JSName("maxMessages")
  var maxMessages_PullRequest: Double = js.native
  
  /** PullRequest returnImmediately. */
  @JSName("returnImmediately")
  var returnImmediately_PullRequest: Boolean = js.native
  
  /** PullRequest subscription. */
  @JSName("subscription")
  var subscription_PullRequest: String = js.native
  
  /**
    * Converts this PullRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object PullRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PullRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PullRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PullRequest instance
    */
  /* static member */
  @scala.inline
  def create(): PullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PullRequest]
  @scala.inline
  def create(properties: IPullRequest): PullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PullRequest]
  
  /**
    * Decodes a PullRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): PullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PullRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): PullRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PullRequest]
  @scala.inline
  def decode(reader: Uint8Array): PullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PullRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): PullRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PullRequest]
  
  /**
    * Decodes a PullRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): PullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PullRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): PullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PullRequest]
  
  /**
    * Encodes the specified PullRequest message. Does not implicitly {@link google.pubsub.v1.PullRequest.verify|verify} messages.
    * @param message PullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IPullRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IPullRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PullRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.PullRequest.verify|verify} messages.
    * @param message PullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IPullRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IPullRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PullRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PullRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): PullRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PullRequest]
  
  /**
    * Creates a plain object from a PullRequest message. Also converts values to other types if specified.
    * @param message PullRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: PullRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: PullRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PullRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
