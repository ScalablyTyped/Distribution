package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CreateBackupEncryptionConfig.EncryptionType
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateBackupEncryptionConfig. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateBackupEncryptionConfig")
@js.native
/**
  * Constructs a new CreateBackupEncryptionConfig.
  * @param [properties] Properties to set
  */
open class CreateBackupEncryptionConfig ()
  extends StObject
     with ICreateBackupEncryptionConfig {
  def this(properties: ICreateBackupEncryptionConfig) = this()
  
  /** CreateBackupEncryptionConfig encryptionType. */
  @JSName("encryptionType")
  var encryptionType_CreateBackupEncryptionConfig: EncryptionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.CreateBackupEncryptionConfig.EncryptionType * / any */ String) = js.native
  
  /** CreateBackupEncryptionConfig kmsKeyName. */
  @JSName("kmsKeyName")
  var kmsKeyName_CreateBackupEncryptionConfig: String = js.native
  
  /**
    * Converts this CreateBackupEncryptionConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateBackupEncryptionConfig {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateBackupEncryptionConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait EncryptionType extends StObject
  /** EncryptionType enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateBackupEncryptionConfig.EncryptionType")
  @js.native
  object EncryptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EncryptionType & Double] = js.native
    
    @js.native
    sealed trait CUSTOMER_MANAGED_ENCRYPTION
      extends StObject
         with EncryptionType
    /* 3 */ val CUSTOMER_MANAGED_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CreateBackupEncryptionConfig.EncryptionType.CUSTOMER_MANAGED_ENCRYPTION & Double = js.native
    
    @js.native
    sealed trait ENCRYPTION_TYPE_UNSPECIFIED
      extends StObject
         with EncryptionType
    /* 0 */ val ENCRYPTION_TYPE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CreateBackupEncryptionConfig.EncryptionType.ENCRYPTION_TYPE_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait GOOGLE_DEFAULT_ENCRYPTION
      extends StObject
         with EncryptionType
    /* 2 */ val GOOGLE_DEFAULT_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CreateBackupEncryptionConfig.EncryptionType.GOOGLE_DEFAULT_ENCRYPTION & Double = js.native
    
    @js.native
    sealed trait USE_DATABASE_ENCRYPTION
      extends StObject
         with EncryptionType
    /* 1 */ val USE_DATABASE_ENCRYPTION: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CreateBackupEncryptionConfig.EncryptionType.USE_DATABASE_ENCRYPTION & Double = js.native
  }
  
  /**
    * Creates a new CreateBackupEncryptionConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateBackupEncryptionConfig instance
    */
  /* static member */
  inline def create(): CreateBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateBackupEncryptionConfig]
  inline def create(properties: ICreateBackupEncryptionConfig): CreateBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateBackupEncryptionConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): CreateBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupEncryptionConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CreateBackupEncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateBackupEncryptionConfig]
  /**
    * Decodes a CreateBackupEncryptionConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateBackupEncryptionConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupEncryptionConfig]
  inline def decode(reader: Reader, length: Double): CreateBackupEncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateBackupEncryptionConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CreateBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupEncryptionConfig]
  /**
    * Decodes a CreateBackupEncryptionConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateBackupEncryptionConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupEncryptionConfig]
  
  /**
    * Encodes the specified CreateBackupEncryptionConfig message. Does not implicitly {@link google.spanner.admin.database.v1.CreateBackupEncryptionConfig.verify|verify} messages.
    * @param message CreateBackupEncryptionConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateBackupEncryptionConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateBackupEncryptionConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateBackupEncryptionConfig message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.CreateBackupEncryptionConfig.verify|verify} messages.
    * @param message CreateBackupEncryptionConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateBackupEncryptionConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateBackupEncryptionConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateBackupEncryptionConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateBackupEncryptionConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateBackupEncryptionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateBackupEncryptionConfig]
  
  /**
    * Gets the default type url for CreateBackupEncryptionConfig
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CreateBackupEncryptionConfig message. Also converts values to other types if specified.
    * @param message CreateBackupEncryptionConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateBackupEncryptionConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateBackupEncryptionConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CreateBackupEncryptionConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
