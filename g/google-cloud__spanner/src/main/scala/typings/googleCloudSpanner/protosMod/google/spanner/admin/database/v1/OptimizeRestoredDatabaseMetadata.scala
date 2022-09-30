package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OptimizeRestoredDatabaseMetadata. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata")
@js.native
/**
  * Constructs a new OptimizeRestoredDatabaseMetadata.
  * @param [properties] Properties to set
  */
open class OptimizeRestoredDatabaseMetadata ()
  extends StObject
     with IOptimizeRestoredDatabaseMetadata {
  def this(properties: IOptimizeRestoredDatabaseMetadata) = this()
  
  /** OptimizeRestoredDatabaseMetadata name. */
  @JSName("name")
  var name_OptimizeRestoredDatabaseMetadata: String = js.native
  
  /**
    * Converts this OptimizeRestoredDatabaseMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object OptimizeRestoredDatabaseMetadata {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new OptimizeRestoredDatabaseMetadata instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OptimizeRestoredDatabaseMetadata instance
    */
  /* static member */
  inline def create(): OptimizeRestoredDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[OptimizeRestoredDatabaseMetadata]
  inline def create(properties: IOptimizeRestoredDatabaseMetadata): OptimizeRestoredDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[OptimizeRestoredDatabaseMetadata]
  
  inline def decode(reader: js.typedarray.Uint8Array): OptimizeRestoredDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OptimizeRestoredDatabaseMetadata]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): OptimizeRestoredDatabaseMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OptimizeRestoredDatabaseMetadata]
  /**
    * Decodes an OptimizeRestoredDatabaseMetadata message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OptimizeRestoredDatabaseMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): OptimizeRestoredDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OptimizeRestoredDatabaseMetadata]
  inline def decode(reader: Reader, length: Double): OptimizeRestoredDatabaseMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OptimizeRestoredDatabaseMetadata]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): OptimizeRestoredDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OptimizeRestoredDatabaseMetadata]
  /**
    * Decodes an OptimizeRestoredDatabaseMetadata message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OptimizeRestoredDatabaseMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): OptimizeRestoredDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OptimizeRestoredDatabaseMetadata]
  
  /**
    * Encodes the specified OptimizeRestoredDatabaseMetadata message. Does not implicitly {@link google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata.verify|verify} messages.
    * @param message OptimizeRestoredDatabaseMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IOptimizeRestoredDatabaseMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IOptimizeRestoredDatabaseMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified OptimizeRestoredDatabaseMetadata message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata.verify|verify} messages.
    * @param message OptimizeRestoredDatabaseMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IOptimizeRestoredDatabaseMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IOptimizeRestoredDatabaseMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an OptimizeRestoredDatabaseMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OptimizeRestoredDatabaseMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): OptimizeRestoredDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OptimizeRestoredDatabaseMetadata]
  
  /**
    * Gets the default type url for OptimizeRestoredDatabaseMetadata
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an OptimizeRestoredDatabaseMetadata message. Also converts values to other types if specified.
    * @param message OptimizeRestoredDatabaseMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: OptimizeRestoredDatabaseMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: OptimizeRestoredDatabaseMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an OptimizeRestoredDatabaseMetadata message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
