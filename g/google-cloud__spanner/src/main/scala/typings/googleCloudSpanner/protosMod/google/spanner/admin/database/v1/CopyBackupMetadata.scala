package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CopyBackupMetadata. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CopyBackupMetadata")
@js.native
/**
  * Constructs a new CopyBackupMetadata.
  * @param [properties] Properties to set
  */
open class CopyBackupMetadata ()
  extends StObject
     with ICopyBackupMetadata {
  def this(properties: ICopyBackupMetadata) = this()
  
  /** CopyBackupMetadata name. */
  @JSName("name")
  var name_CopyBackupMetadata: String = js.native
  
  /** CopyBackupMetadata sourceBackup. */
  @JSName("sourceBackup")
  var sourceBackup_CopyBackupMetadata: String = js.native
  
  /**
    * Converts this CopyBackupMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CopyBackupMetadata {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CopyBackupMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CopyBackupMetadata instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CopyBackupMetadata instance
    */
  /* static member */
  inline def create(): CopyBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CopyBackupMetadata]
  inline def create(properties: ICopyBackupMetadata): CopyBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CopyBackupMetadata]
  
  inline def decode(reader: js.typedarray.Uint8Array): CopyBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupMetadata]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CopyBackupMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CopyBackupMetadata]
  /**
    * Decodes a CopyBackupMetadata message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CopyBackupMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CopyBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupMetadata]
  inline def decode(reader: Reader, length: Double): CopyBackupMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CopyBackupMetadata]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CopyBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupMetadata]
  /**
    * Decodes a CopyBackupMetadata message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CopyBackupMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CopyBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupMetadata]
  
  /**
    * Encodes the specified CopyBackupMetadata message. Does not implicitly {@link google.spanner.admin.database.v1.CopyBackupMetadata.verify|verify} messages.
    * @param message CopyBackupMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICopyBackupMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICopyBackupMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CopyBackupMetadata message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.CopyBackupMetadata.verify|verify} messages.
    * @param message CopyBackupMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICopyBackupMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICopyBackupMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CopyBackupMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CopyBackupMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CopyBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CopyBackupMetadata]
  
  /**
    * Gets the default type url for CopyBackupMetadata
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CopyBackupMetadata message. Also converts values to other types if specified.
    * @param message CopyBackupMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CopyBackupMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CopyBackupMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CopyBackupMetadata message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
