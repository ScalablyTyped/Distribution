package typings.googleGax.operationsMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WaitOperationRequest. */
@JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest")
@js.native
/**
  * Constructs a new WaitOperationRequest.
  * @param [properties] Properties to set
  */
class WaitOperationRequest ()
  extends StObject
     with IWaitOperationRequest {
  def this(properties: IWaitOperationRequest) = this()
  
  /** WaitOperationRequest name. */
  @JSName("name")
  var name_WaitOperationRequest: String = js.native
  
  /**
    * Converts this WaitOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object WaitOperationRequest {
  
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new WaitOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns WaitOperationRequest instance
    */
  /* static member */
  inline def create(): WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[WaitOperationRequest]
  inline def create(properties: IWaitOperationRequest): WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[WaitOperationRequest]
  
  /**
    * Decodes a WaitOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns WaitOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[WaitOperationRequest]
  inline def decode(reader: Reader, length: Double): WaitOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[WaitOperationRequest]
  inline def decode(reader: Uint8Array): WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[WaitOperationRequest]
  inline def decode(reader: Uint8Array, length: Double): WaitOperationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[WaitOperationRequest]
  
  /**
    * Decodes a WaitOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns WaitOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[WaitOperationRequest]
  inline def decodeDelimited(reader: Uint8Array): WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[WaitOperationRequest]
  
  /**
    * Encodes the specified WaitOperationRequest message. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
    * @param message WaitOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IWaitOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IWaitOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified WaitOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
    * @param message WaitOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IWaitOperationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IWaitOperationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a WaitOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns WaitOperationRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): WaitOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[WaitOperationRequest]
  
  /**
    * Creates a plain object from a WaitOperationRequest message. Also converts values to other types if specified.
    * @param message WaitOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: WaitOperationRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: WaitOperationRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a WaitOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
