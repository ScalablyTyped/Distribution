package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteInstanceRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.DeleteInstanceRequest")
@js.native
/**
  * Constructs a new DeleteInstanceRequest.
  * @param [properties] Properties to set
  */
open class DeleteInstanceRequest ()
  extends StObject
     with IDeleteInstanceRequest {
  def this(properties: IDeleteInstanceRequest) = this()
  
  /** DeleteInstanceRequest name. */
  @JSName("name")
  var name_DeleteInstanceRequest: String = js.native
  
  /**
    * Converts this DeleteInstanceRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DeleteInstanceRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.DeleteInstanceRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeleteInstanceRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteInstanceRequest instance
    */
  /* static member */
  inline def create(): DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DeleteInstanceRequest]
  inline def create(properties: IDeleteInstanceRequest): DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DeleteInstanceRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteInstanceRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DeleteInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteInstanceRequest]
  /**
    * Decodes a DeleteInstanceRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteInstanceRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteInstanceRequest]
  inline def decode(reader: Reader, length: Double): DeleteInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteInstanceRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteInstanceRequest]
  /**
    * Decodes a DeleteInstanceRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteInstanceRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteInstanceRequest]
  
  /**
    * Encodes the specified DeleteInstanceRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.DeleteInstanceRequest.verify|verify} messages.
    * @param message DeleteInstanceRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDeleteInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDeleteInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeleteInstanceRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.DeleteInstanceRequest.verify|verify} messages.
    * @param message DeleteInstanceRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDeleteInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDeleteInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeleteInstanceRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteInstanceRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DeleteInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteInstanceRequest]
  
  /**
    * Gets the default type url for DeleteInstanceRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a DeleteInstanceRequest message. Also converts values to other types if specified.
    * @param message DeleteInstanceRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DeleteInstanceRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DeleteInstanceRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DeleteInstanceRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
