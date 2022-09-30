package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateInstanceMetadata. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.UpdateInstanceMetadata")
@js.native
/**
  * Constructs a new UpdateInstanceMetadata.
  * @param [properties] Properties to set
  */
open class UpdateInstanceMetadata ()
  extends StObject
     with IUpdateInstanceMetadata {
  def this(properties: IUpdateInstanceMetadata) = this()
  
  /**
    * Converts this UpdateInstanceMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object UpdateInstanceMetadata {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.UpdateInstanceMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new UpdateInstanceMetadata instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateInstanceMetadata instance
    */
  /* static member */
  inline def create(): UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UpdateInstanceMetadata]
  inline def create(properties: IUpdateInstanceMetadata): UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UpdateInstanceMetadata]
  
  inline def decode(reader: js.typedarray.Uint8Array): UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateInstanceMetadata]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): UpdateInstanceMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateInstanceMetadata]
  /**
    * Decodes an UpdateInstanceMetadata message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateInstanceMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateInstanceMetadata]
  inline def decode(reader: Reader, length: Double): UpdateInstanceMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateInstanceMetadata]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateInstanceMetadata]
  /**
    * Decodes an UpdateInstanceMetadata message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateInstanceMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateInstanceMetadata]
  
  /**
    * Encodes the specified UpdateInstanceMetadata message. Does not implicitly {@link google.spanner.admin.instance.v1.UpdateInstanceMetadata.verify|verify} messages.
    * @param message UpdateInstanceMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IUpdateInstanceMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IUpdateInstanceMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UpdateInstanceMetadata message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.UpdateInstanceMetadata.verify|verify} messages.
    * @param message UpdateInstanceMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IUpdateInstanceMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IUpdateInstanceMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UpdateInstanceMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateInstanceMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): UpdateInstanceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateInstanceMetadata]
  
  /**
    * Gets the default type url for UpdateInstanceMetadata
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an UpdateInstanceMetadata message. Also converts values to other types if specified.
    * @param message UpdateInstanceMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UpdateInstanceMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: UpdateInstanceMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an UpdateInstanceMetadata message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
