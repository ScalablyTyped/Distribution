package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingRecognitionResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult")
@js.native
/**
  * Constructs a new StreamingRecognitionResult.
  * @param [properties] Properties to set
  */
class StreamingRecognitionResult () extends IStreamingRecognitionResult {
  def this(properties: IStreamingRecognitionResult) = this()
  
  /** StreamingRecognitionResult confidence. */
  @JSName("confidence")
  var confidence_StreamingRecognitionResult: Double = js.native
  
  /** StreamingRecognitionResult isFinal. */
  @JSName("isFinal")
  var isFinal_StreamingRecognitionResult: Boolean = js.native
  
  /** StreamingRecognitionResult messageType. */
  @JSName("messageType")
  var messageType_StreamingRecognitionResult: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType * / any */ String) = js.native
  
  /** StreamingRecognitionResult speechWordInfo. */
  @JSName("speechWordInfo")
  var speechWordInfo_StreamingRecognitionResult: js.Array[ISpeechWordInfo] = js.native
  
  /**
    * Converts this StreamingRecognitionResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** StreamingRecognitionResult transcript. */
  @JSName("transcript")
  var transcript_StreamingRecognitionResult: String = js.native
}
object StreamingRecognitionResult {
  
  @js.native
  sealed trait MessageType extends StObject
  /** MessageType enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType")
  @js.native
  object MessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
    
    @js.native
    sealed trait END_OF_SINGLE_UTTERANCE extends MessageType
    /* 2 */ val END_OF_SINGLE_UTTERANCE: typings.dialogflow.mod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.END_OF_SINGLE_UTTERANCE with Double = js.native
    
    @js.native
    sealed trait MESSAGE_TYPE_UNSPECIFIED extends MessageType
    /* 0 */ val MESSAGE_TYPE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.MESSAGE_TYPE_UNSPECIFIED with Double = js.native
    
    @js.native
    sealed trait TRANSCRIPT extends MessageType
    /* 1 */ val TRANSCRIPT: typings.dialogflow.mod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.TRANSCRIPT with Double = js.native
  }
  
  /**
    * Creates a new StreamingRecognitionResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingRecognitionResult instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.create")
  @js.native
  def create(): StreamingRecognitionResult = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.create")
  @js.native
  def create(properties: IStreamingRecognitionResult): StreamingRecognitionResult = js.native
  
  /**
    * Decodes a StreamingRecognitionResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingRecognitionResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.decode")
  @js.native
  def decode(reader: Reader): StreamingRecognitionResult = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.decode")
  @js.native
  def decode(reader: Reader, length: Double): StreamingRecognitionResult = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.decode")
  @js.native
  def decode(reader: Uint8Array): StreamingRecognitionResult = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): StreamingRecognitionResult = js.native
  
  /**
    * Decodes a StreamingRecognitionResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingRecognitionResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): StreamingRecognitionResult = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): StreamingRecognitionResult = js.native
  
  /**
    * Encodes the specified StreamingRecognitionResult message. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingRecognitionResult.verify|verify} messages.
    * @param message StreamingRecognitionResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.encode")
  @js.native
  def encode(message: IStreamingRecognitionResult): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.encode")
  @js.native
  def encode(message: IStreamingRecognitionResult, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StreamingRecognitionResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingRecognitionResult.verify|verify} messages.
    * @param message StreamingRecognitionResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingRecognitionResult): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingRecognitionResult, writer: Writer): Writer = js.native
  
  /**
    * Creates a StreamingRecognitionResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingRecognitionResult
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): StreamingRecognitionResult = js.native
  
  /**
    * Creates a plain object from a StreamingRecognitionResult message. Also converts values to other types if specified.
    * @param message StreamingRecognitionResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.toObject")
  @js.native
  def toObject(message: StreamingRecognitionResult): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.toObject")
  @js.native
  def toObject(message: StreamingRecognitionResult, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StreamingRecognitionResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
