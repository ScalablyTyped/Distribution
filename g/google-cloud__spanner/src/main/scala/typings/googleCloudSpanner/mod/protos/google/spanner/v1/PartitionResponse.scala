package typings.googleCloudSpanner.mod.protos.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IPartitionResponse
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PartitionResponse. */
@JSImport("@google-cloud/spanner", "protos.google.spanner.v1.PartitionResponse")
@js.native
/**
  * Constructs a new PartitionResponse.
  * @param [properties] Properties to set
  */
open class PartitionResponse ()
  extends typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse {
  def this(properties: IPartitionResponse) = this()
}
object PartitionResponse {
  
  @JSImport("@google-cloud/spanner", "protos.google.spanner.v1.PartitionResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PartitionResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PartitionResponse instance
    */
  /* static member */
  inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse]
  inline def create(properties: IPartitionResponse): typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse]
  /**
    * Decodes a PartitionResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PartitionResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse]
  inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse]
  /**
    * Decodes a PartitionResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PartitionResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse]
  
  /**
    * Encodes the specified PartitionResponse message. Does not implicitly {@link google.spanner.v1.PartitionResponse.verify|verify} messages.
    * @param message PartitionResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPartitionResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPartitionResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PartitionResponse message, length delimited. Does not implicitly {@link google.spanner.v1.PartitionResponse.verify|verify} messages.
    * @param message PartitionResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPartitionResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPartitionResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PartitionResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PartitionResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse]
  
  /**
    * Gets the default type url for PartitionResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a PartitionResponse message. Also converts values to other types if specified.
    * @param message PartitionResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.googleCloudSpanner.protosMod.google.spanner.v1.PartitionResponse,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PartitionResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
