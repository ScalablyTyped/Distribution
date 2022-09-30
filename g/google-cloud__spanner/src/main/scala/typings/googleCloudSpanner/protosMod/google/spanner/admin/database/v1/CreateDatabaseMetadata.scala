package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateDatabaseMetadata. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateDatabaseMetadata")
@js.native
/**
  * Constructs a new CreateDatabaseMetadata.
  * @param [properties] Properties to set
  */
open class CreateDatabaseMetadata ()
  extends StObject
     with ICreateDatabaseMetadata {
  def this(properties: ICreateDatabaseMetadata) = this()
  
  /** CreateDatabaseMetadata database. */
  @JSName("database")
  var database_CreateDatabaseMetadata: String = js.native
  
  /**
    * Converts this CreateDatabaseMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateDatabaseMetadata {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateDatabaseMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateDatabaseMetadata instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateDatabaseMetadata instance
    */
  /* static member */
  inline def create(): CreateDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateDatabaseMetadata]
  inline def create(properties: ICreateDatabaseMetadata): CreateDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseMetadata]
  
  inline def decode(reader: js.typedarray.Uint8Array): CreateDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseMetadata]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CreateDatabaseMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateDatabaseMetadata]
  /**
    * Decodes a CreateDatabaseMetadata message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateDatabaseMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseMetadata]
  inline def decode(reader: Reader, length: Double): CreateDatabaseMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateDatabaseMetadata]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CreateDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseMetadata]
  /**
    * Decodes a CreateDatabaseMetadata message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateDatabaseMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseMetadata]
  
  /**
    * Encodes the specified CreateDatabaseMetadata message. Does not implicitly {@link google.spanner.admin.database.v1.CreateDatabaseMetadata.verify|verify} messages.
    * @param message CreateDatabaseMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateDatabaseMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateDatabaseMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateDatabaseMetadata message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.CreateDatabaseMetadata.verify|verify} messages.
    * @param message CreateDatabaseMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateDatabaseMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateDatabaseMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateDatabaseMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateDatabaseMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseMetadata]
  
  /**
    * Gets the default type url for CreateDatabaseMetadata
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CreateDatabaseMetadata message. Also converts values to other types if specified.
    * @param message CreateDatabaseMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateDatabaseMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateDatabaseMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CreateDatabaseMetadata message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
