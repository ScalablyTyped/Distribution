package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EventInput. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EventInput")
@js.native
/**
  * Constructs a new EventInput.
  * @param [properties] Properties to set
  */
open class EventInput ()
  extends StObject
     with IEventInput {
  def this(properties: IEventInput) = this()
  
  /** EventInput languageCode. */
  @JSName("languageCode")
  var languageCode_EventInput: String = js.native
  
  /** EventInput name. */
  @JSName("name")
  var name_EventInput: String = js.native
  
  /**
    * Converts this EventInput to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object EventInput {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EventInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new EventInput instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventInput instance
    */
  /* static member */
  inline def create(): EventInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EventInput]
  inline def create(properties: IEventInput): EventInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EventInput]
  
  inline def decode(reader: js.typedarray.Uint8Array): EventInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EventInput]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): EventInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EventInput]
  /**
    * Decodes an EventInput message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): EventInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EventInput]
  inline def decode(reader: Reader, length: Double): EventInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EventInput]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): EventInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EventInput]
  /**
    * Decodes an EventInput message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): EventInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EventInput]
  
  /**
    * Encodes the specified EventInput message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EventInput.verify|verify} messages.
    * @param message EventInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IEventInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEventInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EventInput message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EventInput.verify|verify} messages.
    * @param message EventInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IEventInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEventInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EventInput message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventInput
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): EventInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EventInput]
  
  /**
    * Creates a plain object from an EventInput message. Also converts values to other types if specified.
    * @param message EventInput
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: EventInput): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: EventInput, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an EventInput message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
