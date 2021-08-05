package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeleteSnapshotRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteSnapshotRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSnapshotRequest")
@js.native
/**
  * Constructs a new DeleteSnapshotRequest.
  * @param [properties] Properties to set
  */
class DeleteSnapshotRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest {
  def this(properties: IDeleteSnapshotRequest) = this()
}
object DeleteSnapshotRequest {
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSnapshotRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeleteSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteSnapshotRequest instance
    */
  /* static member */
  inline def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest]
  inline def create(properties: IDeleteSnapshotRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest]
  
  /**
    * Decodes a DeleteSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest]
  inline def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest]
  inline def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest]
  inline def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest]
  
  /**
    * Decodes a DeleteSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest]
  inline def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest]
  
  /**
    * Encodes the specified DeleteSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.DeleteSnapshotRequest.verify|verify} messages.
    * @param message DeleteSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDeleteSnapshotRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDeleteSnapshotRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeleteSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteSnapshotRequest.verify|verify} messages.
    * @param message DeleteSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDeleteSnapshotRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDeleteSnapshotRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeleteSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteSnapshotRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest]
  
  /**
    * Creates a plain object from a DeleteSnapshotRequest message. Also converts values to other types if specified.
    * @param message DeleteSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a DeleteSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
