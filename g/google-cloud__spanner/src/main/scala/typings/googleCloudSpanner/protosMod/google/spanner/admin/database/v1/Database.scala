package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Database.State
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Database. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.Database")
@js.native
/**
  * Constructs a new Database.
  * @param [properties] Properties to set
  */
open class Database ()
  extends StObject
     with IDatabase {
  def this(properties: IDatabase) = this()
  
  /** Database databaseDialect. */
  @JSName("databaseDialect")
  var databaseDialect_Database: DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) = js.native
  
  /** Database defaultLeader. */
  @JSName("defaultLeader")
  var defaultLeader_Database: String = js.native
  
  /** Database encryptionInfo. */
  @JSName("encryptionInfo")
  var encryptionInfo_Database: js.Array[IEncryptionInfo] = js.native
  
  /** Database name. */
  @JSName("name")
  var name_Database: String = js.native
  
  /** Database state. */
  @JSName("state")
  var state_Database: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Database.State * / any */ String) = js.native
  
  /**
    * Converts this Database to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Database versionRetentionPeriod. */
  @JSName("versionRetentionPeriod")
  var versionRetentionPeriod_Database: String = js.native
}
object Database {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.Database")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait State extends StObject
  /** State enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.Database.State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State & Double] = js.native
    
    @js.native
    sealed trait CREATING
      extends StObject
         with State
    /* 1 */ val CREATING: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Database.State.CREATING & Double = js.native
    
    @js.native
    sealed trait READY
      extends StObject
         with State
    /* 2 */ val READY: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Database.State.READY & Double = js.native
    
    @js.native
    sealed trait READY_OPTIMIZING
      extends StObject
         with State
    /* 3 */ val READY_OPTIMIZING: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Database.State.READY_OPTIMIZING & Double = js.native
    
    @js.native
    sealed trait STATE_UNSPECIFIED
      extends StObject
         with State
    /* 0 */ val STATE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Database.State.STATE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new Database instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Database instance
    */
  /* static member */
  inline def create(): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Database]
  inline def create(properties: IDatabase): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Database]
  
  inline def decode(reader: js.typedarray.Uint8Array): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Database]
  /**
    * Decodes a Database message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Database
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def decode(reader: Reader, length: Double): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Database]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Database]
  /**
    * Decodes a Database message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Database
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Database]
  
  /**
    * Encodes the specified Database message. Does not implicitly {@link google.spanner.admin.database.v1.Database.verify|verify} messages.
    * @param message Database message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDatabase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDatabase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Database message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.Database.verify|verify} messages.
    * @param message Database message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDatabase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDatabase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Database message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Database
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Database]
  
  /**
    * Gets the default type url for Database
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a Database message. Also converts values to other types if specified.
    * @param message Database
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Database): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Database, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Database message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
