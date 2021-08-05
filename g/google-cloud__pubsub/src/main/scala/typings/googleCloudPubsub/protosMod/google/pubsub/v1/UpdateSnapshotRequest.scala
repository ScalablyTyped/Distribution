package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateSnapshotRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.UpdateSnapshotRequest")
@js.native
/**
  * Constructs a new UpdateSnapshotRequest.
  * @param [properties] Properties to set
  */
class UpdateSnapshotRequest ()
  extends StObject
     with IUpdateSnapshotRequest {
  def this(properties: IUpdateSnapshotRequest) = this()
  
  /**
    * Converts this UpdateSnapshotRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UpdateSnapshotRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.UpdateSnapshotRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new UpdateSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateSnapshotRequest instance
    */
  /* static member */
  inline def create(): UpdateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UpdateSnapshotRequest]
  inline def create(properties: IUpdateSnapshotRequest): UpdateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UpdateSnapshotRequest]
  
  /**
    * Decodes an UpdateSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): UpdateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSnapshotRequest]
  inline def decode(reader: Reader, length: Double): UpdateSnapshotRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateSnapshotRequest]
  inline def decode(reader: Uint8Array): UpdateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSnapshotRequest]
  inline def decode(reader: Uint8Array, length: Double): UpdateSnapshotRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateSnapshotRequest]
  
  /**
    * Decodes an UpdateSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): UpdateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSnapshotRequest]
  inline def decodeDelimited(reader: Uint8Array): UpdateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSnapshotRequest]
  
  /**
    * Encodes the specified UpdateSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.UpdateSnapshotRequest.verify|verify} messages.
    * @param message UpdateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IUpdateSnapshotRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IUpdateSnapshotRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UpdateSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateSnapshotRequest.verify|verify} messages.
    * @param message UpdateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IUpdateSnapshotRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IUpdateSnapshotRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UpdateSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateSnapshotRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): UpdateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateSnapshotRequest]
  
  /**
    * Creates a plain object from an UpdateSnapshotRequest message. Also converts values to other types if specified.
    * @param message UpdateSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UpdateSnapshotRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: UpdateSnapshotRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an UpdateSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
