package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.long.mod.^
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PartitionOptions. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PartitionOptions")
@js.native
/**
  * Constructs a new PartitionOptions.
  * @param [properties] Properties to set
  */
open class PartitionOptions ()
  extends StObject
     with IPartitionOptions {
  def this(properties: IPartitionOptions) = this()
  
  /** PartitionOptions maxPartitions. */
  @JSName("maxPartitions")
  var maxPartitions_PartitionOptions: Double | ^ | String = js.native
  
  /** PartitionOptions partitionSizeBytes. */
  @JSName("partitionSizeBytes")
  var partitionSizeBytes_PartitionOptions: Double | ^ | String = js.native
  
  /**
    * Converts this PartitionOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object PartitionOptions {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PartitionOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PartitionOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PartitionOptions instance
    */
  /* static member */
  inline def create(): PartitionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PartitionOptions]
  inline def create(properties: IPartitionOptions): PartitionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PartitionOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): PartitionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PartitionOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PartitionOptions]
  /**
    * Decodes a PartitionOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PartitionOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PartitionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionOptions]
  inline def decode(reader: Reader, length: Double): PartitionOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PartitionOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PartitionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionOptions]
  /**
    * Decodes a PartitionOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PartitionOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PartitionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionOptions]
  
  /**
    * Encodes the specified PartitionOptions message. Does not implicitly {@link google.spanner.v1.PartitionOptions.verify|verify} messages.
    * @param message PartitionOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPartitionOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPartitionOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PartitionOptions message, length delimited. Does not implicitly {@link google.spanner.v1.PartitionOptions.verify|verify} messages.
    * @param message PartitionOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPartitionOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPartitionOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PartitionOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PartitionOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): PartitionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PartitionOptions]
  
  /**
    * Gets the default type url for PartitionOptions
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a PartitionOptions message. Also converts values to other types if specified.
    * @param message PartitionOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PartitionOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PartitionOptions, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PartitionOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
