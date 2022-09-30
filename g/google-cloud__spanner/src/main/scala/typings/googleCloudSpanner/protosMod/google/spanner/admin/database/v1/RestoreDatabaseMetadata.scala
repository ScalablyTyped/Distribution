package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.googleCloudSpannerStrings.backupInfo
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RestoreDatabaseMetadata. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.RestoreDatabaseMetadata")
@js.native
/**
  * Constructs a new RestoreDatabaseMetadata.
  * @param [properties] Properties to set
  */
open class RestoreDatabaseMetadata ()
  extends StObject
     with IRestoreDatabaseMetadata {
  def this(properties: IRestoreDatabaseMetadata) = this()
  
  /** RestoreDatabaseMetadata name. */
  @JSName("name")
  var name_RestoreDatabaseMetadata: String = js.native
  
  /** RestoreDatabaseMetadata optimizeDatabaseOperationName. */
  @JSName("optimizeDatabaseOperationName")
  var optimizeDatabaseOperationName_RestoreDatabaseMetadata: String = js.native
  
  /** RestoreDatabaseMetadata sourceInfo. */
  var sourceInfo: js.UndefOr[backupInfo] = js.native
  
  /** RestoreDatabaseMetadata sourceType. */
  @JSName("sourceType")
  var sourceType_RestoreDatabaseMetadata: RestoreSourceType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreSourceType * / any */ String) = js.native
  
  /**
    * Converts this RestoreDatabaseMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object RestoreDatabaseMetadata {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.RestoreDatabaseMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new RestoreDatabaseMetadata instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RestoreDatabaseMetadata instance
    */
  /* static member */
  inline def create(): RestoreDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RestoreDatabaseMetadata]
  inline def create(properties: IRestoreDatabaseMetadata): RestoreDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseMetadata]
  
  inline def decode(reader: js.typedarray.Uint8Array): RestoreDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseMetadata]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): RestoreDatabaseMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RestoreDatabaseMetadata]
  /**
    * Decodes a RestoreDatabaseMetadata message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RestoreDatabaseMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): RestoreDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseMetadata]
  inline def decode(reader: Reader, length: Double): RestoreDatabaseMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RestoreDatabaseMetadata]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): RestoreDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseMetadata]
  /**
    * Decodes a RestoreDatabaseMetadata message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RestoreDatabaseMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): RestoreDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseMetadata]
  
  /**
    * Encodes the specified RestoreDatabaseMetadata message. Does not implicitly {@link google.spanner.admin.database.v1.RestoreDatabaseMetadata.verify|verify} messages.
    * @param message RestoreDatabaseMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IRestoreDatabaseMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IRestoreDatabaseMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified RestoreDatabaseMetadata message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.RestoreDatabaseMetadata.verify|verify} messages.
    * @param message RestoreDatabaseMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IRestoreDatabaseMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IRestoreDatabaseMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RestoreDatabaseMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RestoreDatabaseMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): RestoreDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RestoreDatabaseMetadata]
  
  /**
    * Gets the default type url for RestoreDatabaseMetadata
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a RestoreDatabaseMetadata message. Also converts values to other types if specified.
    * @param message RestoreDatabaseMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RestoreDatabaseMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RestoreDatabaseMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a RestoreDatabaseMetadata message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
