package typings.googleGax.operationsMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CancelOperationRequest. */
@JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest")
@js.native
/**
  * Constructs a new CancelOperationRequest.
  * @param [properties] Properties to set
  */
class CancelOperationRequest () extends ICancelOperationRequest {
  def this(properties: ICancelOperationRequest) = this()
  
  /** CancelOperationRequest name. */
  @JSName("name")
  var name_CancelOperationRequest: String = js.native
  
  /**
    * Converts this CancelOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CancelOperationRequest {
  
  /**
    * Creates a new CancelOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CancelOperationRequest instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.create")
  @js.native
  def create(): CancelOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.create")
  @js.native
  def create(properties: ICancelOperationRequest): CancelOperationRequest = js.native
  
  /**
    * Decodes a CancelOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CancelOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.decode")
  @js.native
  def decode(reader: Reader): CancelOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): CancelOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.decode")
  @js.native
  def decode(reader: Uint8Array): CancelOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): CancelOperationRequest = js.native
  
  /**
    * Decodes a CancelOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CancelOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): CancelOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): CancelOperationRequest = js.native
  
  /**
    * Encodes the specified CancelOperationRequest message. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
    * @param message CancelOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.encode")
  @js.native
  def encode(message: ICancelOperationRequest): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.encode")
  @js.native
  def encode(message: ICancelOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CancelOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.CancelOperationRequest.verify|verify} messages.
    * @param message CancelOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICancelOperationRequest): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICancelOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a CancelOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CancelOperationRequest
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): CancelOperationRequest = js.native
  
  /**
    * Creates a plain object from a CancelOperationRequest message. Also converts values to other types if specified.
    * @param message CancelOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.toObject")
  @js.native
  def toObject(message: CancelOperationRequest): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.toObject")
  @js.native
  def toObject(message: CancelOperationRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CancelOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.CancelOperationRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
