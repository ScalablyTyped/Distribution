package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SetIamPolicyRequest. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest")
@js.native
/**
  * Constructs a new SetIamPolicyRequest.
  * @param [properties] Properties to set
  */
class SetIamPolicyRequest ()
  extends StObject
     with ISetIamPolicyRequest {
  def this(properties: ISetIamPolicyRequest) = this()
  
  /** SetIamPolicyRequest resource. */
  @JSName("resource")
  var resource_SetIamPolicyRequest: String = js.native
  
  /**
    * Converts this SetIamPolicyRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SetIamPolicyRequest {
  
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.SetIamPolicyRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SetIamPolicyRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SetIamPolicyRequest instance
    */
  /* static member */
  inline def create(): SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SetIamPolicyRequest]
  inline def create(properties: ISetIamPolicyRequest): SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SetIamPolicyRequest]
  
  /**
    * Decodes a SetIamPolicyRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SetIamPolicyRequest]
  inline def decode(reader: Reader, length: Double): SetIamPolicyRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SetIamPolicyRequest]
  inline def decode(reader: Uint8Array): SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SetIamPolicyRequest]
  inline def decode(reader: Uint8Array, length: Double): SetIamPolicyRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SetIamPolicyRequest]
  
  /**
    * Decodes a SetIamPolicyRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SetIamPolicyRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SetIamPolicyRequest]
  inline def decodeDelimited(reader: Uint8Array): SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SetIamPolicyRequest]
  
  /**
    * Encodes the specified SetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
    * @param message SetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISetIamPolicyRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISetIamPolicyRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
    * @param message SetIamPolicyRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISetIamPolicyRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISetIamPolicyRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SetIamPolicyRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): SetIamPolicyRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SetIamPolicyRequest]
  
  /**
    * Creates a plain object from a SetIamPolicyRequest message. Also converts values to other types if specified.
    * @param message SetIamPolicyRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SetIamPolicyRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: SetIamPolicyRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SetIamPolicyRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
