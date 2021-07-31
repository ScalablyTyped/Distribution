package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateSnapshotRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest")
@js.native
/**
  * Constructs a new CreateSnapshotRequest.
  * @param [properties] Properties to set
  */
class CreateSnapshotRequest ()
  extends StObject
     with ICreateSnapshotRequest {
  def this(properties: ICreateSnapshotRequest) = this()
  
  /** CreateSnapshotRequest labels. */
  @JSName("labels")
  var labels_CreateSnapshotRequest: StringDictionary[String] = js.native
  
  /** CreateSnapshotRequest name. */
  @JSName("name")
  var name_CreateSnapshotRequest: String = js.native
  
  /** CreateSnapshotRequest subscription. */
  @JSName("subscription")
  var subscription_CreateSnapshotRequest: String = js.native
  
  /**
    * Converts this CreateSnapshotRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateSnapshotRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateSnapshotRequest instance
    */
  /* static member */
  @scala.inline
  def create(): CreateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateSnapshotRequest]
  @scala.inline
  def create(properties: ICreateSnapshotRequest): CreateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateSnapshotRequest]
  
  /**
    * Decodes a CreateSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): CreateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSnapshotRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): CreateSnapshotRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateSnapshotRequest]
  @scala.inline
  def decode(reader: Uint8Array): CreateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSnapshotRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): CreateSnapshotRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateSnapshotRequest]
  
  /**
    * Decodes a CreateSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): CreateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSnapshotRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): CreateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateSnapshotRequest]
  
  /**
    * Encodes the specified CreateSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.CreateSnapshotRequest.verify|verify} messages.
    * @param message CreateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ICreateSnapshotRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ICreateSnapshotRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.CreateSnapshotRequest.verify|verify} messages.
    * @param message CreateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ICreateSnapshotRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ICreateSnapshotRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateSnapshotRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): CreateSnapshotRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateSnapshotRequest]
  
  /**
    * Creates a plain object from a CreateSnapshotRequest message. Also converts values to other types if specified.
    * @param message CreateSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: CreateSnapshotRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: CreateSnapshotRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CreateSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
