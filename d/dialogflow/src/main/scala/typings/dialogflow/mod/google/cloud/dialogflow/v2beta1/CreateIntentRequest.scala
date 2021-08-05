package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest")
@js.native
/**
  * Constructs a new CreateIntentRequest.
  * @param [properties] Properties to set
  */
class CreateIntentRequest ()
  extends StObject
     with ICreateIntentRequest {
  def this(properties: ICreateIntentRequest) = this()
  
  /** CreateIntentRequest intentView. */
  @JSName("intentView")
  var intentView_CreateIntentRequest: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String) = js.native
  
  /** CreateIntentRequest languageCode. */
  @JSName("languageCode")
  var languageCode_CreateIntentRequest: String = js.native
  
  /** CreateIntentRequest parent. */
  @JSName("parent")
  var parent_CreateIntentRequest: String = js.native
  
  /**
    * Converts this CreateIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateIntentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateIntentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateIntentRequest instance
    */
  /* static member */
  inline def create(): CreateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateIntentRequest]
  inline def create(properties: ICreateIntentRequest): CreateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateIntentRequest]
  
  /**
    * Decodes a CreateIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateIntentRequest]
  inline def decode(reader: Reader, length: Double): CreateIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateIntentRequest]
  inline def decode(reader: Uint8Array): CreateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateIntentRequest]
  inline def decode(reader: Uint8Array, length: Double): CreateIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateIntentRequest]
  
  /**
    * Decodes a CreateIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateIntentRequest]
  inline def decodeDelimited(reader: Uint8Array): CreateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateIntentRequest]
  
  /**
    * Encodes the specified CreateIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateIntentRequest.verify|verify} messages.
    * @param message CreateIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateIntentRequest.verify|verify} messages.
    * @param message CreateIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateIntentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): CreateIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateIntentRequest]
  
  /**
    * Creates a plain object from a CreateIntentRequest message. Also converts values to other types if specified.
    * @param message CreateIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateIntentRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: CreateIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CreateIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
