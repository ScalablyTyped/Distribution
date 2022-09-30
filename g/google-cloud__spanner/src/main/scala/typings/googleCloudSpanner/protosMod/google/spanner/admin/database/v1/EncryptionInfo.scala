package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.googleCloudSpannerStrings.create
import typings.googleCloudSpanner.googleCloudSpannerStrings.decode
import typings.googleCloudSpanner.googleCloudSpannerStrings.decodeDelimited
import typings.googleCloudSpanner.googleCloudSpannerStrings.encode
import typings.googleCloudSpanner.googleCloudSpannerStrings.encodeDelimited
import typings.googleCloudSpanner.googleCloudSpannerStrings.fromObject
import typings.googleCloudSpanner.googleCloudSpannerStrings.getTypeUrl
import typings.googleCloudSpanner.googleCloudSpannerStrings.toObject
import typings.googleCloudSpanner.googleCloudSpannerStrings.verify
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Type
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EncryptionInfo. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.EncryptionInfo")
@js.native
/**
  * Constructs a new EncryptionInfo.
  * @param [properties] Properties to set
  */
open class EncryptionInfo ()
  extends StObject
     with IEncryptionInfo {
  def this(properties: IEncryptionInfo) = this()
  
  /** EncryptionInfo encryptionType. */
  @JSName("encryptionType")
  var encryptionType_EncryptionInfo: Type | create | encode | encodeDelimited | decode | decodeDelimited | verify | fromObject | toObject | getTypeUrl = js.native
  
  /** EncryptionInfo kmsKeyVersion. */
  @JSName("kmsKeyVersion")
  var kmsKeyVersion_EncryptionInfo: String = js.native
  
  /**
    * Converts this EncryptionInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object EncryptionInfo {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.EncryptionInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Type extends StObject
  /** Type enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.EncryptionInfo.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.EncryptionInfo.Type & Double
      ] = js.native
    
    @js.native
    sealed trait CUSTOMER_MANAGED_ENCRYPTION
      extends StObject
         with typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.EncryptionInfo.Type
    /* 2 */ val CUSTOMER_MANAGED_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.EncryptionInfo.Type.CUSTOMER_MANAGED_ENCRYPTION & Double = js.native
    
    @js.native
    sealed trait GOOGLE_DEFAULT_ENCRYPTION
      extends StObject
         with typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.EncryptionInfo.Type
    /* 1 */ val GOOGLE_DEFAULT_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.EncryptionInfo.Type.GOOGLE_DEFAULT_ENCRYPTION & Double = js.native
    
    @js.native
    sealed trait TYPE_UNSPECIFIED
      extends StObject
         with typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.EncryptionInfo.Type
    /* 0 */ val TYPE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.EncryptionInfo.Type.TYPE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new EncryptionInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EncryptionInfo instance
    */
  /* static member */
  inline def create(): EncryptionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EncryptionInfo]
  inline def create(properties: IEncryptionInfo): EncryptionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EncryptionInfo]
  
  inline def decode(reader: js.typedarray.Uint8Array): EncryptionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EncryptionInfo]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): EncryptionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EncryptionInfo]
  /**
    * Decodes an EncryptionInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EncryptionInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): EncryptionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EncryptionInfo]
  inline def decode(reader: Reader, length: Double): EncryptionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EncryptionInfo]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): EncryptionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EncryptionInfo]
  /**
    * Decodes an EncryptionInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EncryptionInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): EncryptionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EncryptionInfo]
  
  /**
    * Encodes the specified EncryptionInfo message. Does not implicitly {@link google.spanner.admin.database.v1.EncryptionInfo.verify|verify} messages.
    * @param message EncryptionInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IEncryptionInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEncryptionInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EncryptionInfo message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.EncryptionInfo.verify|verify} messages.
    * @param message EncryptionInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IEncryptionInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEncryptionInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EncryptionInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EncryptionInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): EncryptionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EncryptionInfo]
  
  /**
    * Gets the default type url for EncryptionInfo
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an EncryptionInfo message. Also converts values to other types if specified.
    * @param message EncryptionInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: EncryptionInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: EncryptionInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an EncryptionInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
