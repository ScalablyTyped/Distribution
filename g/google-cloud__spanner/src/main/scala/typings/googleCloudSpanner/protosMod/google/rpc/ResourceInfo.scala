package typings.googleCloudSpanner.protosMod.google.rpc

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ResourceInfo. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.ResourceInfo")
@js.native
/**
  * Constructs a new ResourceInfo.
  * @param [properties] Properties to set
  */
open class ResourceInfo ()
  extends StObject
     with IResourceInfo {
  def this(properties: IResourceInfo) = this()
  
  /** ResourceInfo description. */
  @JSName("description")
  var description_ResourceInfo: String = js.native
  
  /** ResourceInfo owner. */
  @JSName("owner")
  var owner_ResourceInfo: String = js.native
  
  /** ResourceInfo resourceName. */
  @JSName("resourceName")
  var resourceName_ResourceInfo: String = js.native
  
  /** ResourceInfo resourceType. */
  @JSName("resourceType")
  var resourceType_ResourceInfo: String = js.native
  
  /**
    * Converts this ResourceInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ResourceInfo {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.ResourceInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ResourceInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ResourceInfo instance
    */
  /* static member */
  inline def create(): ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResourceInfo]
  inline def create(properties: IResourceInfo): ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ResourceInfo]
  
  inline def decode(reader: js.typedarray.Uint8Array): ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceInfo]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ResourceInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResourceInfo]
  /**
    * Decodes a ResourceInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ResourceInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceInfo]
  inline def decode(reader: Reader, length: Double): ResourceInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResourceInfo]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceInfo]
  /**
    * Decodes a ResourceInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ResourceInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceInfo]
  
  /**
    * Encodes the specified ResourceInfo message. Does not implicitly {@link google.rpc.ResourceInfo.verify|verify} messages.
    * @param message ResourceInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IResourceInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IResourceInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ResourceInfo message, length delimited. Does not implicitly {@link google.rpc.ResourceInfo.verify|verify} messages.
    * @param message ResourceInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IResourceInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IResourceInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ResourceInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ResourceInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ResourceInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ResourceInfo]
  
  /**
    * Gets the default type url for ResourceInfo
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ResourceInfo message. Also converts values to other types if specified.
    * @param message ResourceInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ResourceInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ResourceInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ResourceInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
