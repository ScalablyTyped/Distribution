package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.audioConfig
import typings.dialogflow.dialogflowStrings.event
import typings.dialogflow.dialogflowStrings.text
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a QueryInput. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput")
@js.native
/**
  * Constructs a new QueryInput.
  * @param [properties] Properties to set
  */
class QueryInput () extends IQueryInput {
  def this(properties: IQueryInput) = this()
  
  /** QueryInput input. */
  var input: js.UndefOr[audioConfig | text | event] = js.native
  
  /**
    * Converts this QueryInput to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object QueryInput {
  
  /**
    * Creates a new QueryInput instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryInput instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.create")
  @js.native
  def create(): QueryInput = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.create")
  @js.native
  def create(properties: IQueryInput): QueryInput = js.native
  
  /**
    * Decodes a QueryInput message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.decode")
  @js.native
  def decode(reader: Reader): QueryInput = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.decode")
  @js.native
  def decode(reader: Reader, length: Double): QueryInput = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.decode")
  @js.native
  def decode(reader: Uint8Array): QueryInput = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): QueryInput = js.native
  
  /**
    * Decodes a QueryInput message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): QueryInput = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): QueryInput = js.native
  
  /**
    * Encodes the specified QueryInput message. Does not implicitly {@link google.cloud.dialogflow.v2.QueryInput.verify|verify} messages.
    * @param message QueryInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.encode")
  @js.native
  def encode(message: IQueryInput): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.encode")
  @js.native
  def encode(message: IQueryInput, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified QueryInput message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.QueryInput.verify|verify} messages.
    * @param message QueryInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.encodeDelimited")
  @js.native
  def encodeDelimited(message: IQueryInput): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.encodeDelimited")
  @js.native
  def encodeDelimited(message: IQueryInput, writer: Writer): Writer = js.native
  
  /**
    * Creates a QueryInput message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryInput
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): QueryInput = js.native
  
  /**
    * Creates a plain object from a QueryInput message. Also converts values to other types if specified.
    * @param message QueryInput
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.toObject")
  @js.native
  def toObject(message: QueryInput): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.toObject")
  @js.native
  def toObject(message: QueryInput, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a QueryInput message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
