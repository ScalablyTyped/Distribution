package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.UpdateIntentRequest")
@js.native
/**
  * Constructs a new UpdateIntentRequest.
  * @param [properties] Properties to set
  */
class UpdateIntentRequest ()
  extends StObject
     with IUpdateIntentRequest {
  def this(properties: IUpdateIntentRequest) = this()
  
  /** UpdateIntentRequest intentView. */
  @JSName("intentView")
  var intentView_UpdateIntentRequest: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) = js.native
  
  /** UpdateIntentRequest languageCode. */
  @JSName("languageCode")
  var languageCode_UpdateIntentRequest: String = js.native
  
  /**
    * Converts this UpdateIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UpdateIntentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.UpdateIntentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new UpdateIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateIntentRequest instance
    */
  /* static member */
  @scala.inline
  def create(): UpdateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UpdateIntentRequest]
  @scala.inline
  def create(properties: IUpdateIntentRequest): UpdateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UpdateIntentRequest]
  
  /**
    * Decodes an UpdateIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): UpdateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateIntentRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): UpdateIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateIntentRequest]
  @scala.inline
  def decode(reader: Uint8Array): UpdateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateIntentRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): UpdateIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateIntentRequest]
  
  /**
    * Decodes an UpdateIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): UpdateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateIntentRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): UpdateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateIntentRequest]
  
  /**
    * Encodes the specified UpdateIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.UpdateIntentRequest.verify|verify} messages.
    * @param message UpdateIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IUpdateIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IUpdateIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UpdateIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.UpdateIntentRequest.verify|verify} messages.
    * @param message UpdateIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IUpdateIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IUpdateIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UpdateIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateIntentRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): UpdateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateIntentRequest]
  
  /**
    * Creates a plain object from an UpdateIntentRequest message. Also converts values to other types if specified.
    * @param message UpdateIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: UpdateIntentRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: UpdateIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an UpdateIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
