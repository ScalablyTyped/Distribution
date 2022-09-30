package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.googleCloudSpannerStrings.singleUseTransaction
import typings.googleCloudSpanner.googleCloudSpannerStrings.transactionId
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommitRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.CommitRequest")
@js.native
/**
  * Constructs a new CommitRequest.
  * @param [properties] Properties to set
  */
open class CommitRequest ()
  extends StObject
     with ICommitRequest {
  def this(properties: ICommitRequest) = this()
  
  /** CommitRequest mutations. */
  @JSName("mutations")
  var mutations_CommitRequest: js.Array[IMutation] = js.native
  
  /** CommitRequest returnCommitStats. */
  @JSName("returnCommitStats")
  var returnCommitStats_CommitRequest: Boolean = js.native
  
  /** CommitRequest session. */
  @JSName("session")
  var session_CommitRequest: String = js.native
  
  /**
    * Converts this CommitRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** CommitRequest transaction. */
  var transaction: js.UndefOr[transactionId | singleUseTransaction] = js.native
}
object CommitRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.CommitRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CommitRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommitRequest instance
    */
  /* static member */
  inline def create(): CommitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommitRequest]
  inline def create(properties: ICommitRequest): CommitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommitRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): CommitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CommitRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommitRequest]
  /**
    * Decodes a CommitRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommitRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CommitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitRequest]
  inline def decode(reader: Reader, length: Double): CommitRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommitRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CommitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitRequest]
  /**
    * Decodes a CommitRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommitRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CommitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitRequest]
  
  /**
    * Encodes the specified CommitRequest message. Does not implicitly {@link google.spanner.v1.CommitRequest.verify|verify} messages.
    * @param message CommitRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICommitRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICommitRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommitRequest message, length delimited. Does not implicitly {@link google.spanner.v1.CommitRequest.verify|verify} messages.
    * @param message CommitRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICommitRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICommitRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommitRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommitRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CommitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommitRequest]
  
  /**
    * Gets the default type url for CommitRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CommitRequest message. Also converts values to other types if specified.
    * @param message CommitRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommitRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CommitRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CommitRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
