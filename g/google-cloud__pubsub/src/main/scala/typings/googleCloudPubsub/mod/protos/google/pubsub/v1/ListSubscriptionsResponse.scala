package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSubscriptionsResponse
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListSubscriptionsResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSubscriptionsResponse")
@js.native
/**
  * Constructs a new ListSubscriptionsResponse.
  * @param [properties] Properties to set
  */
class ListSubscriptionsResponse ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse {
  def this(properties: IListSubscriptionsResponse) = this()
}
object ListSubscriptionsResponse {
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSubscriptionsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListSubscriptionsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSubscriptionsResponse instance
    */
  /* static member */
  inline def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse]
  inline def create(properties: IListSubscriptionsResponse): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse]
  
  /**
    * Decodes a ListSubscriptionsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSubscriptionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse]
  inline def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse]
  inline def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse]
  inline def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse]
  
  /**
    * Decodes a ListSubscriptionsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSubscriptionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse]
  inline def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse]
  
  /**
    * Encodes the specified ListSubscriptionsResponse message. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsResponse.verify|verify} messages.
    * @param message ListSubscriptionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListSubscriptionsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListSubscriptionsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListSubscriptionsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsResponse.verify|verify} messages.
    * @param message ListSubscriptionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListSubscriptionsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListSubscriptionsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListSubscriptionsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSubscriptionsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse]
  
  /**
    * Creates a plain object from a ListSubscriptionsResponse message. Also converts values to other types if specified.
    * @param message ListSubscriptionsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ListSubscriptionsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
