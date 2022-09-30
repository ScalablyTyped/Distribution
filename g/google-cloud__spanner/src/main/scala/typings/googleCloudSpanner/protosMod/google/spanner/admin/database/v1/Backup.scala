package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Backup.State
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.long.mod.^
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Backup. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.Backup")
@js.native
/**
  * Constructs a new Backup.
  * @param [properties] Properties to set
  */
open class Backup ()
  extends StObject
     with IBackup {
  def this(properties: IBackup) = this()
  
  /** Backup databaseDialect. */
  @JSName("databaseDialect")
  var databaseDialect_Backup: DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) = js.native
  
  /** Backup database. */
  @JSName("database")
  var database_Backup: String = js.native
  
  /** Backup name. */
  @JSName("name")
  var name_Backup: String = js.native
  
  /** Backup referencingBackups. */
  @JSName("referencingBackups")
  var referencingBackups_Backup: js.Array[String] = js.native
  
  /** Backup referencingDatabases. */
  @JSName("referencingDatabases")
  var referencingDatabases_Backup: js.Array[String] = js.native
  
  /** Backup sizeBytes. */
  @JSName("sizeBytes")
  var sizeBytes_Backup: Double | ^ | String = js.native
  
  /** Backup state. */
  @JSName("state")
  var state_Backup: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Backup.State * / any */ String) = js.native
  
  /**
    * Converts this Backup to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Backup {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.Backup")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait State extends StObject
  /** State enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.Backup.State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State & Double] = js.native
    
    @js.native
    sealed trait CREATING
      extends StObject
         with State
    /* 1 */ val CREATING: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Backup.State.CREATING & Double = js.native
    
    @js.native
    sealed trait READY
      extends StObject
         with State
    /* 2 */ val READY: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Backup.State.READY & Double = js.native
    
    @js.native
    sealed trait STATE_UNSPECIFIED
      extends StObject
         with State
    /* 0 */ val STATE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Backup.State.STATE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new Backup instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Backup instance
    */
  /* static member */
  inline def create(): Backup = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Backup]
  inline def create(properties: IBackup): Backup = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Backup]
  
  inline def decode(reader: js.typedarray.Uint8Array): Backup = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Backup]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Backup = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Backup]
  /**
    * Decodes a Backup message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Backup
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Backup = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Backup]
  inline def decode(reader: Reader, length: Double): Backup = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Backup]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Backup = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Backup]
  /**
    * Decodes a Backup message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Backup
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Backup = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Backup]
  
  /**
    * Encodes the specified Backup message. Does not implicitly {@link google.spanner.admin.database.v1.Backup.verify|verify} messages.
    * @param message Backup message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBackup): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBackup, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Backup message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.Backup.verify|verify} messages.
    * @param message Backup message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBackup): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBackup, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Backup message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Backup
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Backup = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Backup]
  
  /**
    * Gets the default type url for Backup
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a Backup message. Also converts values to other types if specified.
    * @param message Backup
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Backup): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Backup, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Backup message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
