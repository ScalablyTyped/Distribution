package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.audioConfig
import typings.dialogflow.dialogflowStrings.event
import typings.dialogflow.dialogflowStrings.text
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a QueryInput. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput")
@js.native
/**
  * Constructs a new QueryInput.
  * @param [properties] Properties to set
  */
open class QueryInput ()
  extends StObject
     with IQueryInput {
  def this(properties: IQueryInput) = this()
  
  /** QueryInput input. */
  var input: js.UndefOr[audioConfig | text | event] = js.native
  
  /**
    * Converts this QueryInput to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object QueryInput {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new QueryInput instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryInput instance
    */
  /* static member */
  inline def create(): QueryInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[QueryInput]
  inline def create(properties: IQueryInput): QueryInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[QueryInput]
  
  inline def decode(reader: js.typedarray.Uint8Array): QueryInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryInput]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): QueryInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryInput]
  /**
    * Decodes a QueryInput message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): QueryInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryInput]
  inline def decode(reader: Reader, length: Double): QueryInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryInput]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): QueryInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryInput]
  /**
    * Decodes a QueryInput message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): QueryInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryInput]
  
  /**
    * Encodes the specified QueryInput message. Does not implicitly {@link google.cloud.dialogflow.v2.QueryInput.verify|verify} messages.
    * @param message QueryInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IQueryInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IQueryInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified QueryInput message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.QueryInput.verify|verify} messages.
    * @param message QueryInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IQueryInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IQueryInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a QueryInput message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryInput
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): QueryInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[QueryInput]
  
  /**
    * Creates a plain object from a QueryInput message. Also converts values to other types if specified.
    * @param message QueryInput
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: QueryInput): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: QueryInput, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a QueryInput message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
