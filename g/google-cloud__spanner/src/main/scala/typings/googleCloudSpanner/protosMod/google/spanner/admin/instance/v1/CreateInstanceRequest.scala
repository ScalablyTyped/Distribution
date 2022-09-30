package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateInstanceRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.CreateInstanceRequest")
@js.native
/**
  * Constructs a new CreateInstanceRequest.
  * @param [properties] Properties to set
  */
open class CreateInstanceRequest ()
  extends StObject
     with ICreateInstanceRequest {
  def this(properties: ICreateInstanceRequest) = this()
  
  /** CreateInstanceRequest instanceId. */
  @JSName("instanceId")
  var instanceId_CreateInstanceRequest: String = js.native
  
  /** CreateInstanceRequest parent. */
  @JSName("parent")
  var parent_CreateInstanceRequest: String = js.native
  
  /**
    * Converts this CreateInstanceRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateInstanceRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.CreateInstanceRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateInstanceRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateInstanceRequest instance
    */
  /* static member */
  inline def create(): CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateInstanceRequest]
  inline def create(properties: ICreateInstanceRequest): CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateInstanceRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateInstanceRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CreateInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateInstanceRequest]
  /**
    * Decodes a CreateInstanceRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateInstanceRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateInstanceRequest]
  inline def decode(reader: Reader, length: Double): CreateInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateInstanceRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateInstanceRequest]
  /**
    * Decodes a CreateInstanceRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateInstanceRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateInstanceRequest]
  
  /**
    * Encodes the specified CreateInstanceRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.CreateInstanceRequest.verify|verify} messages.
    * @param message CreateInstanceRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateInstanceRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.CreateInstanceRequest.verify|verify} messages.
    * @param message CreateInstanceRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateInstanceRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateInstanceRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateInstanceRequest]
  
  /**
    * Gets the default type url for CreateInstanceRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CreateInstanceRequest message. Also converts values to other types if specified.
    * @param message CreateInstanceRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateInstanceRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateInstanceRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CreateInstanceRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
