package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateBackupMetadata. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateBackupMetadata")
@js.native
/**
  * Constructs a new CreateBackupMetadata.
  * @param [properties] Properties to set
  */
open class CreateBackupMetadata ()
  extends StObject
     with ICreateBackupMetadata {
  def this(properties: ICreateBackupMetadata) = this()
  
  /** CreateBackupMetadata database. */
  @JSName("database")
  var database_CreateBackupMetadata: String = js.native
  
  /** CreateBackupMetadata name. */
  @JSName("name")
  var name_CreateBackupMetadata: String = js.native
  
  /**
    * Converts this CreateBackupMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateBackupMetadata {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateBackupMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateBackupMetadata instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateBackupMetadata instance
    */
  /* static member */
  inline def create(): CreateBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateBackupMetadata]
  inline def create(properties: ICreateBackupMetadata): CreateBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateBackupMetadata]
  
  inline def decode(reader: js.typedarray.Uint8Array): CreateBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupMetadata]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CreateBackupMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateBackupMetadata]
  /**
    * Decodes a CreateBackupMetadata message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateBackupMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupMetadata]
  inline def decode(reader: Reader, length: Double): CreateBackupMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateBackupMetadata]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CreateBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupMetadata]
  /**
    * Decodes a CreateBackupMetadata message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateBackupMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupMetadata]
  
  /**
    * Encodes the specified CreateBackupMetadata message. Does not implicitly {@link google.spanner.admin.database.v1.CreateBackupMetadata.verify|verify} messages.
    * @param message CreateBackupMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateBackupMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateBackupMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateBackupMetadata message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.CreateBackupMetadata.verify|verify} messages.
    * @param message CreateBackupMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateBackupMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateBackupMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateBackupMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateBackupMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateBackupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateBackupMetadata]
  
  /**
    * Gets the default type url for CreateBackupMetadata
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CreateBackupMetadata message. Also converts values to other types if specified.
    * @param message CreateBackupMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateBackupMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateBackupMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CreateBackupMetadata message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
