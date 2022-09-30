package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CopyBackupEncryptionConfig. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CopyBackupEncryptionConfig")
@js.native
/**
  * Constructs a new CopyBackupEncryptionConfig.
  * @param [properties] Properties to set
  */
open class CopyBackupEncryptionConfig ()
  extends StObject
     with ICopyBackupEncryptionConfig {
  def this(properties: ICopyBackupEncryptionConfig) = this()
  
  /** CopyBackupEncryptionConfig encryptionType. */
  @JSName("encryptionType")
  var encryptionType_CopyBackupEncryptionConfig: EncryptionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType * / any */ String) = js.native
  
  /** CopyBackupEncryptionConfig kmsKeyName. */
  @JSName("kmsKeyName")
  var kmsKeyName_CopyBackupEncryptionConfig: String = js.native
  
  /**
    * Converts this CopyBackupEncryptionConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CopyBackupEncryptionConfig {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CopyBackupEncryptionConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait EncryptionType extends StObject
  /** EncryptionType enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType")
  @js.native
  object EncryptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EncryptionType & Double] = js.native
    
    @js.native
    sealed trait CUSTOMER_MANAGED_ENCRYPTION
      extends StObject
         with EncryptionType
    /* 3 */ val CUSTOMER_MANAGED_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType.CUSTOMER_MANAGED_ENCRYPTION & Double = js.native
    
    @js.native
    sealed trait ENCRYPTION_TYPE_UNSPECIFIED
      extends StObject
         with EncryptionType
    /* 0 */ val ENCRYPTION_TYPE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType.ENCRYPTION_TYPE_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait GOOGLE_DEFAULT_ENCRYPTION
      extends StObject
         with EncryptionType
    /* 2 */ val GOOGLE_DEFAULT_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType.GOOGLE_DEFAULT_ENCRYPTION & Double = js.native
    
    @js.native
    sealed trait USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION
      extends StObject
         with EncryptionType
    /* 1 */ val USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType.USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION & Double = js.native
  }
  
  /**
    * Creates a new CopyBackupEncryptionConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CopyBackupEncryptionConfig instance
    */
  /* static member */
  inline def create(): CopyBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CopyBackupEncryptionConfig]
  inline def create(properties: ICopyBackupEncryptionConfig): CopyBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CopyBackupEncryptionConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): CopyBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupEncryptionConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CopyBackupEncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CopyBackupEncryptionConfig]
  /**
    * Decodes a CopyBackupEncryptionConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CopyBackupEncryptionConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CopyBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupEncryptionConfig]
  inline def decode(reader: Reader, length: Double): CopyBackupEncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CopyBackupEncryptionConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CopyBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupEncryptionConfig]
  /**
    * Decodes a CopyBackupEncryptionConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CopyBackupEncryptionConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CopyBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupEncryptionConfig]
  
  /**
    * Encodes the specified CopyBackupEncryptionConfig message. Does not implicitly {@link google.spanner.admin.database.v1.CopyBackupEncryptionConfig.verify|verify} messages.
    * @param message CopyBackupEncryptionConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICopyBackupEncryptionConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICopyBackupEncryptionConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CopyBackupEncryptionConfig message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.CopyBackupEncryptionConfig.verify|verify} messages.
    * @param message CopyBackupEncryptionConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICopyBackupEncryptionConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICopyBackupEncryptionConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CopyBackupEncryptionConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CopyBackupEncryptionConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CopyBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CopyBackupEncryptionConfig]
  
  /**
    * Gets the default type url for CopyBackupEncryptionConfig
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CopyBackupEncryptionConfig message. Also converts values to other types if specified.
    * @param message CopyBackupEncryptionConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CopyBackupEncryptionConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CopyBackupEncryptionConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CopyBackupEncryptionConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
