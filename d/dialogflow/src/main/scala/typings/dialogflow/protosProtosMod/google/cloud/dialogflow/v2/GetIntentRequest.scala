package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetIntentRequest")
@js.native
/**
  * Constructs a new GetIntentRequest.
  * @param [properties] Properties to set
  */
open class GetIntentRequest ()
  extends StObject
     with IGetIntentRequest {
  def this(properties: IGetIntentRequest) = this()
  
  /** GetIntentRequest intentView. */
  @JSName("intentView")
  var intentView_GetIntentRequest: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) = js.native
  
  /** GetIntentRequest languageCode. */
  @JSName("languageCode")
  var languageCode_GetIntentRequest: String = js.native
  
  /** GetIntentRequest name. */
  @JSName("name")
  var name_GetIntentRequest: String = js.native
  
  /**
    * Converts this GetIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetIntentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetIntentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetIntentRequest instance
    */
  /* static member */
  inline def create(): GetIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetIntentRequest]
  inline def create(properties: IGetIntentRequest): GetIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetIntentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): GetIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetIntentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GetIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetIntentRequest]
  /**
    * Decodes a GetIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GetIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetIntentRequest]
  inline def decode(reader: Reader, length: Double): GetIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetIntentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GetIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetIntentRequest]
  /**
    * Decodes a GetIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GetIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetIntentRequest]
  
  /**
    * Encodes the specified GetIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.GetIntentRequest.verify|verify} messages.
    * @param message GetIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGetIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.GetIntentRequest.verify|verify} messages.
    * @param message GetIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGetIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetIntentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetIntentRequest]
  
  /**
    * Creates a plain object from a GetIntentRequest message. Also converts values to other types if specified.
    * @param message GetIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetIntentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetIntentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GetIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
