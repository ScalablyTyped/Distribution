package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RestoreDatabaseEncryptionConfig. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig")
@js.native
/**
  * Constructs a new RestoreDatabaseEncryptionConfig.
  * @param [properties] Properties to set
  */
open class RestoreDatabaseEncryptionConfig ()
  extends StObject
     with IRestoreDatabaseEncryptionConfig {
  def this(properties: IRestoreDatabaseEncryptionConfig) = this()
  
  /** RestoreDatabaseEncryptionConfig encryptionType. */
  @JSName("encryptionType")
  var encryptionType_RestoreDatabaseEncryptionConfig: EncryptionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType * / any */ String) = js.native
  
  /** RestoreDatabaseEncryptionConfig kmsKeyName. */
  @JSName("kmsKeyName")
  var kmsKeyName_RestoreDatabaseEncryptionConfig: String = js.native
  
  /**
    * Converts this RestoreDatabaseEncryptionConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object RestoreDatabaseEncryptionConfig {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait EncryptionType extends StObject
  /** EncryptionType enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType")
  @js.native
  object EncryptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EncryptionType & Double] = js.native
    
    @js.native
    sealed trait CUSTOMER_MANAGED_ENCRYPTION
      extends StObject
         with EncryptionType
    /* 3 */ val CUSTOMER_MANAGED_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType.CUSTOMER_MANAGED_ENCRYPTION & Double = js.native
    
    @js.native
    sealed trait ENCRYPTION_TYPE_UNSPECIFIED
      extends StObject
         with EncryptionType
    /* 0 */ val ENCRYPTION_TYPE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType.ENCRYPTION_TYPE_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait GOOGLE_DEFAULT_ENCRYPTION
      extends StObject
         with EncryptionType
    /* 2 */ val GOOGLE_DEFAULT_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType.GOOGLE_DEFAULT_ENCRYPTION & Double = js.native
    
    @js.native
    sealed trait USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION
      extends StObject
         with EncryptionType
    /* 1 */ val USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType.USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION & Double = js.native
  }
  
  /**
    * Creates a new RestoreDatabaseEncryptionConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RestoreDatabaseEncryptionConfig instance
    */
  /* static member */
  inline def create(): RestoreDatabaseEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RestoreDatabaseEncryptionConfig]
  inline def create(properties: IRestoreDatabaseEncryptionConfig): RestoreDatabaseEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseEncryptionConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): RestoreDatabaseEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseEncryptionConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): RestoreDatabaseEncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RestoreDatabaseEncryptionConfig]
  /**
    * Decodes a RestoreDatabaseEncryptionConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RestoreDatabaseEncryptionConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): RestoreDatabaseEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseEncryptionConfig]
  inline def decode(reader: Reader, length: Double): RestoreDatabaseEncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RestoreDatabaseEncryptionConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): RestoreDatabaseEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseEncryptionConfig]
  /**
    * Decodes a RestoreDatabaseEncryptionConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RestoreDatabaseEncryptionConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): RestoreDatabaseEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseEncryptionConfig]
  
  /**
    * Encodes the specified RestoreDatabaseEncryptionConfig message. Does not implicitly {@link google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.verify|verify} messages.
    * @param message RestoreDatabaseEncryptionConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IRestoreDatabaseEncryptionConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IRestoreDatabaseEncryptionConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified RestoreDatabaseEncryptionConfig message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.verify|verify} messages.
    * @param message RestoreDatabaseEncryptionConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IRestoreDatabaseEncryptionConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IRestoreDatabaseEncryptionConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RestoreDatabaseEncryptionConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RestoreDatabaseEncryptionConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): RestoreDatabaseEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseEncryptionConfig]
  
  /**
    * Gets the default type url for RestoreDatabaseEncryptionConfig
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a RestoreDatabaseEncryptionConfig message. Also converts values to other types if specified.
    * @param message RestoreDatabaseEncryptionConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RestoreDatabaseEncryptionConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RestoreDatabaseEncryptionConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a RestoreDatabaseEncryptionConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
