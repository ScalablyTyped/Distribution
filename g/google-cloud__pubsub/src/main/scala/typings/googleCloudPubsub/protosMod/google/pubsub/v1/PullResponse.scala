package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PullResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PullResponse")
@js.native
/**
  * Constructs a new PullResponse.
  * @param [properties] Properties to set
  */
class PullResponse ()
  extends StObject
     with IPullResponse {
  def this(properties: IPullResponse) = this()
  
  /** PullResponse receivedMessages. */
  @JSName("receivedMessages")
  var receivedMessages_PullResponse: js.Array[IReceivedMessage] = js.native
  
  /**
    * Converts this PullResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object PullResponse {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PullResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PullResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PullResponse instance
    */
  /* static member */
  inline def create(): PullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PullResponse]
  inline def create(properties: IPullResponse): PullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PullResponse]
  
  /**
    * Decodes a PullResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PullResponse]
  inline def decode(reader: Reader, length: Double): PullResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PullResponse]
  inline def decode(reader: Uint8Array): PullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PullResponse]
  inline def decode(reader: Uint8Array, length: Double): PullResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PullResponse]
  
  /**
    * Decodes a PullResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PullResponse]
  inline def decodeDelimited(reader: Uint8Array): PullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PullResponse]
  
  /**
    * Encodes the specified PullResponse message. Does not implicitly {@link google.pubsub.v1.PullResponse.verify|verify} messages.
    * @param message PullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPullResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPullResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PullResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.PullResponse.verify|verify} messages.
    * @param message PullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPullResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPullResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PullResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PullResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): PullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PullResponse]
  
  /**
    * Creates a plain object from a PullResponse message. Also converts values to other types if specified.
    * @param message PullResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PullResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: PullResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PullResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
