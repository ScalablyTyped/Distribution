package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an InstanceConfig. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.InstanceConfig")
@js.native
/**
  * Constructs a new InstanceConfig.
  * @param [properties] Properties to set
  */
open class InstanceConfig ()
  extends StObject
     with IInstanceConfig {
  def this(properties: IInstanceConfig) = this()
  
  /** InstanceConfig displayName. */
  @JSName("displayName")
  var displayName_InstanceConfig: String = js.native
  
  /** InstanceConfig leaderOptions. */
  @JSName("leaderOptions")
  var leaderOptions_InstanceConfig: js.Array[String] = js.native
  
  /** InstanceConfig name. */
  @JSName("name")
  var name_InstanceConfig: String = js.native
  
  /** InstanceConfig replicas. */
  @JSName("replicas")
  var replicas_InstanceConfig: js.Array[IReplicaInfo] = js.native
  
  /**
    * Converts this InstanceConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object InstanceConfig {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.InstanceConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InstanceConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns InstanceConfig instance
    */
  /* static member */
  inline def create(): InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[InstanceConfig]
  inline def create(properties: IInstanceConfig): InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[InstanceConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[InstanceConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): InstanceConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[InstanceConfig]
  /**
    * Decodes an InstanceConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns InstanceConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[InstanceConfig]
  inline def decode(reader: Reader, length: Double): InstanceConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[InstanceConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[InstanceConfig]
  /**
    * Decodes an InstanceConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns InstanceConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[InstanceConfig]
  
  /**
    * Encodes the specified InstanceConfig message. Does not implicitly {@link google.spanner.admin.instance.v1.InstanceConfig.verify|verify} messages.
    * @param message InstanceConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IInstanceConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IInstanceConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified InstanceConfig message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.InstanceConfig.verify|verify} messages.
    * @param message InstanceConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IInstanceConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IInstanceConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an InstanceConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns InstanceConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): InstanceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[InstanceConfig]
  
  /**
    * Gets the default type url for InstanceConfig
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an InstanceConfig message. Also converts values to other types if specified.
    * @param message InstanceConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: InstanceConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: InstanceConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an InstanceConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
