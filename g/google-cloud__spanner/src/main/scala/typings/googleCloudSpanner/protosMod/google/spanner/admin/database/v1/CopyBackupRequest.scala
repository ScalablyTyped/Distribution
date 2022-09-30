package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CopyBackupRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CopyBackupRequest")
@js.native
/**
  * Constructs a new CopyBackupRequest.
  * @param [properties] Properties to set
  */
open class CopyBackupRequest ()
  extends StObject
     with ICopyBackupRequest {
  def this(properties: ICopyBackupRequest) = this()
  
  /** CopyBackupRequest backupId. */
  @JSName("backupId")
  var backupId_CopyBackupRequest: String = js.native
  
  /** CopyBackupRequest parent. */
  @JSName("parent")
  var parent_CopyBackupRequest: String = js.native
  
  /** CopyBackupRequest sourceBackup. */
  @JSName("sourceBackup")
  var sourceBackup_CopyBackupRequest: String = js.native
  
  /**
    * Converts this CopyBackupRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CopyBackupRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.CopyBackupRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CopyBackupRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CopyBackupRequest instance
    */
  /* static member */
  inline def create(): CopyBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CopyBackupRequest]
  inline def create(properties: ICopyBackupRequest): CopyBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CopyBackupRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): CopyBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CopyBackupRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CopyBackupRequest]
  /**
    * Decodes a CopyBackupRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CopyBackupRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CopyBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupRequest]
  inline def decode(reader: Reader, length: Double): CopyBackupRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CopyBackupRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CopyBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupRequest]
  /**
    * Decodes a CopyBackupRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CopyBackupRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CopyBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CopyBackupRequest]
  
  /**
    * Encodes the specified CopyBackupRequest message. Does not implicitly {@link google.spanner.admin.database.v1.CopyBackupRequest.verify|verify} messages.
    * @param message CopyBackupRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICopyBackupRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICopyBackupRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CopyBackupRequest message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.CopyBackupRequest.verify|verify} messages.
    * @param message CopyBackupRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICopyBackupRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICopyBackupRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CopyBackupRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CopyBackupRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CopyBackupRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CopyBackupRequest]
  
  /**
    * Gets the default type url for CopyBackupRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CopyBackupRequest message. Also converts values to other types if specified.
    * @param message CopyBackupRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CopyBackupRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CopyBackupRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CopyBackupRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
