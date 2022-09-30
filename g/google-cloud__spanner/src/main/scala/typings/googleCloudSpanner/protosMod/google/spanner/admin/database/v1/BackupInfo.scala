package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BackupInfo. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.BackupInfo")
@js.native
/**
  * Constructs a new BackupInfo.
  * @param [properties] Properties to set
  */
open class BackupInfo ()
  extends StObject
     with IBackupInfo {
  def this(properties: IBackupInfo) = this()
  
  /** BackupInfo backup. */
  @JSName("backup")
  var backup_BackupInfo: String = js.native
  
  /** BackupInfo sourceDatabase. */
  @JSName("sourceDatabase")
  var sourceDatabase_BackupInfo: String = js.native
  
  /**
    * Converts this BackupInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BackupInfo {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.BackupInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BackupInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BackupInfo instance
    */
  /* static member */
  inline def create(): BackupInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BackupInfo]
  inline def create(properties: IBackupInfo): BackupInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BackupInfo]
  
  inline def decode(reader: js.typedarray.Uint8Array): BackupInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BackupInfo]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BackupInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BackupInfo]
  /**
    * Decodes a BackupInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BackupInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BackupInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BackupInfo]
  inline def decode(reader: Reader, length: Double): BackupInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BackupInfo]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BackupInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BackupInfo]
  /**
    * Decodes a BackupInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BackupInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BackupInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BackupInfo]
  
  /**
    * Encodes the specified BackupInfo message. Does not implicitly {@link google.spanner.admin.database.v1.BackupInfo.verify|verify} messages.
    * @param message BackupInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBackupInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBackupInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BackupInfo message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.BackupInfo.verify|verify} messages.
    * @param message BackupInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBackupInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBackupInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BackupInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BackupInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BackupInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BackupInfo]
  
  /**
    * Gets the default type url for BackupInfo
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a BackupInfo message. Also converts values to other types if specified.
    * @param message BackupInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BackupInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BackupInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BackupInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
