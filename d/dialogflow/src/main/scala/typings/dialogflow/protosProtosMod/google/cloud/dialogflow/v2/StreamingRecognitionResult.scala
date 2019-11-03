package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var messageType_StreamingRecognitionResult: MessageType = js.native
  /** StreamingRecognitionResult transcript. */
  @JSName("transcript")
  var transcript_StreamingRecognitionResult: String = js.native
  /**
    * Converts this StreamingRecognitionResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult")
@js.native
object StreamingRecognitionResult extends js.Object {
  @js.native
  sealed trait MessageType extends js.Object
  
  /**
    * Creates a new StreamingRecognitionResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingRecognitionResult instance
    */
  def create(): StreamingRecognitionResult = js.native
  def create(properties: IStreamingRecognitionResult): StreamingRecognitionResult = js.native
  /**
    * Decodes a StreamingRecognitionResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingRecognitionResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): StreamingRecognitionResult = js.native
  def decode(reader: Reader, length: Double): StreamingRecognitionResult = js.native
  def decode(reader: Uint8Array): StreamingRecognitionResult = js.native
  def decode(reader: Uint8Array, length: Double): StreamingRecognitionResult = js.native
  /**
    * Decodes a StreamingRecognitionResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingRecognitionResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): StreamingRecognitionResult = js.native
  def decodeDelimited(reader: Uint8Array): StreamingRecognitionResult = js.native
  /**
    * Encodes the specified StreamingRecognitionResult message. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingRecognitionResult.verify|verify} messages.
    * @param message StreamingRecognitionResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStreamingRecognitionResult): Writer = js.native
  def encode(message: IStreamingRecognitionResult, writer: Writer): Writer = js.native
  /**
    * Encodes the specified StreamingRecognitionResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingRecognitionResult.verify|verify} messages.
    * @param message StreamingRecognitionResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStreamingRecognitionResult): Writer = js.native
  def encodeDelimited(message: IStreamingRecognitionResult, writer: Writer): Writer = js.native
  /**
    * Creates a StreamingRecognitionResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingRecognitionResult
    */
  def fromObject(`object`: StringDictionary[js.Any]): StreamingRecognitionResult = js.native
  /**
    * Creates a plain object from a StreamingRecognitionResult message. Also converts values to other types if specified.
    * @param message StreamingRecognitionResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: StreamingRecognitionResult): StringDictionary[js.Any] = js.native
  def toObject(message: StreamingRecognitionResult, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a StreamingRecognitionResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** MessageType enum. */
  @js.native
  object MessageType extends js.Object {
    @js.native
    sealed trait END_OF_SINGLE_UTTERANCE extends MessageType
    
    @js.native
    sealed trait MESSAGE_TYPE_UNSPECIFIED extends MessageType
    
    @js.native
    sealed trait TRANSCRIPT extends MessageType
    
    /* 2 */ val END_OF_SINGLE_UTTERANCE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.END_OF_SINGLE_UTTERANCE with Double = js.native
    /* 0 */ val MESSAGE_TYPE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.MESSAGE_TYPE_UNSPECIFIED with Double = js.native
    /* 1 */ val TRANSCRIPT: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.TRANSCRIPT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
  }
  
}

