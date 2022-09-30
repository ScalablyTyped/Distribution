package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateDatabaseRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateDatabaseRequest")
@js.native
/**
  * Constructs a new CreateDatabaseRequest.
  * @param [properties] Properties to set
  */
open class CreateDatabaseRequest ()
  extends StObject
     with ICreateDatabaseRequest {
  def this(properties: ICreateDatabaseRequest) = this()
  
  /** CreateDatabaseRequest createStatement. */
  @JSName("createStatement")
  var createStatement_CreateDatabaseRequest: String = js.native
  
  /** CreateDatabaseRequest databaseDialect. */
  @JSName("databaseDialect")
  var databaseDialect_CreateDatabaseRequest: DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) = js.native
  
  /** CreateDatabaseRequest extraStatements. */
  @JSName("extraStatements")
  var extraStatements_CreateDatabaseRequest: js.Array[String] = js.native
  
  /** CreateDatabaseRequest parent. */
  @JSName("parent")
  var parent_CreateDatabaseRequest: String = js.native
  
  /**
    * Converts this CreateDatabaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateDatabaseRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateDatabaseRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateDatabaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateDatabaseRequest instance
    */
  /* static member */
  inline def create(): CreateDatabaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateDatabaseRequest]
  inline def create(properties: ICreateDatabaseRequest): CreateDatabaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): CreateDatabaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CreateDatabaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateDatabaseRequest]
  /**
    * Decodes a CreateDatabaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateDatabaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateDatabaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseRequest]
  inline def decode(reader: Reader, length: Double): CreateDatabaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateDatabaseRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CreateDatabaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseRequest]
  /**
    * Decodes a CreateDatabaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateDatabaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateDatabaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseRequest]
  
  /**
    * Encodes the specified CreateDatabaseRequest message. Does not implicitly {@link google.spanner.admin.database.v1.CreateDatabaseRequest.verify|verify} messages.
    * @param message CreateDatabaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateDatabaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateDatabaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateDatabaseRequest message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.CreateDatabaseRequest.verify|verify} messages.
    * @param message CreateDatabaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateDatabaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateDatabaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateDatabaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateDatabaseRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateDatabaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateDatabaseRequest]
  
  /**
    * Gets the default type url for CreateDatabaseRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CreateDatabaseRequest message. Also converts values to other types if specified.
    * @param message CreateDatabaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateDatabaseRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateDatabaseRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CreateDatabaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
