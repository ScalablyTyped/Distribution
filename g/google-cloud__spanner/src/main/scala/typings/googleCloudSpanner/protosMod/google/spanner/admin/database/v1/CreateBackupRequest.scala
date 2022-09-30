package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateBackupRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateBackupRequest")
@js.native
/**
  * Constructs a new CreateBackupRequest.
  * @param [properties] Properties to set
  */
open class CreateBackupRequest ()
  extends StObject
     with ICreateBackupRequest {
  def this(properties: ICreateBackupRequest) = this()
  
  /** CreateBackupRequest backupId. */
  @JSName("backupId")
  var backupId_CreateBackupRequest: String = js.native
  
  /** CreateBackupRequest parent. */
  @JSName("parent")
  var parent_CreateBackupRequest: String = js.native
  
  /**
    * Converts this CreateBackupRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateBackupRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CreateBackupRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateBackupRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateBackupRequest instance
    */
  /* static member */
  inline def create(): CreateBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateBackupRequest]
  inline def create(properties: ICreateBackupRequest): CreateBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateBackupRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): CreateBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CreateBackupRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateBackupRequest]
  /**
    * Decodes a CreateBackupRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateBackupRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupRequest]
  inline def decode(reader: Reader, length: Double): CreateBackupRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateBackupRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CreateBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupRequest]
  /**
    * Decodes a CreateBackupRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateBackupRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateBackupRequest]
  
  /**
    * Encodes the specified CreateBackupRequest message. Does not implicitly {@link google.spanner.admin.database.v1.CreateBackupRequest.verify|verify} messages.
    * @param message CreateBackupRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateBackupRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateBackupRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateBackupRequest message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.CreateBackupRequest.verify|verify} messages.
    * @param message CreateBackupRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateBackupRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateBackupRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateBackupRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateBackupRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateBackupRequest]
  
  /**
    * Gets the default type url for CreateBackupRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CreateBackupRequest message. Also converts values to other types if specified.
    * @param message CreateBackupRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateBackupRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateBackupRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CreateBackupRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
