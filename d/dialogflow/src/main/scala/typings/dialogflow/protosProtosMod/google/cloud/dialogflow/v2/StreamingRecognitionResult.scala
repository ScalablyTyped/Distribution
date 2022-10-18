package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingRecognitionResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult")
@js.native
/**
  * Constructs a new StreamingRecognitionResult.
  * @param [properties] Properties to set
  */
open class StreamingRecognitionResult ()
  extends StObject
     with IStreamingRecognitionResult {
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
  def toJSON(): StringDictionary[Any] = js.native
  
  /** StreamingRecognitionResult transcript. */
  @JSName("transcript")
  var transcript_StreamingRecognitionResult: String = js.native
}
object StreamingRecognitionResult {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait MessageType extends StObject
  /** MessageType enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType")
  @js.native
  object MessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageType & Double] = js.native
    
    @js.native
    sealed trait END_OF_SINGLE_UTTERANCE
      extends StObject
         with MessageType
    /* 2 */ val END_OF_SINGLE_UTTERANCE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.END_OF_SINGLE_UTTERANCE & Double = js.native
    
    @js.native
    sealed trait MESSAGE_TYPE_UNSPECIFIED
      extends StObject
         with MessageType
    /* 0 */ val MESSAGE_TYPE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.MESSAGE_TYPE_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait TRANSCRIPT
      extends StObject
         with MessageType
    /* 1 */ val TRANSCRIPT: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.TRANSCRIPT & Double = js.native
  }
  
  /**
    * Creates a new StreamingRecognitionResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingRecognitionResult instance
    */
  /* static member */
  inline def create(): StreamingRecognitionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StreamingRecognitionResult]
  inline def create(properties: IStreamingRecognitionResult): StreamingRecognitionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StreamingRecognitionResult]
  
  inline def decode(reader: js.typedarray.Uint8Array): StreamingRecognitionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingRecognitionResult]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): StreamingRecognitionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingRecognitionResult]
  /**
    * Decodes a StreamingRecognitionResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingRecognitionResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): StreamingRecognitionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingRecognitionResult]
  inline def decode(reader: Reader, length: Double): StreamingRecognitionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingRecognitionResult]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): StreamingRecognitionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingRecognitionResult]
  /**
    * Decodes a StreamingRecognitionResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingRecognitionResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): StreamingRecognitionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingRecognitionResult]
  
  /**
    * Encodes the specified StreamingRecognitionResult message. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingRecognitionResult.verify|verify} messages.
    * @param message StreamingRecognitionResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IStreamingRecognitionResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStreamingRecognitionResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StreamingRecognitionResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.StreamingRecognitionResult.verify|verify} messages.
    * @param message StreamingRecognitionResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IStreamingRecognitionResult): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStreamingRecognitionResult, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StreamingRecognitionResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingRecognitionResult
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): StreamingRecognitionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StreamingRecognitionResult]
  
  /**
    * Creates a plain object from a StreamingRecognitionResult message. Also converts values to other types if specified.
    * @param message StreamingRecognitionResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: StreamingRecognitionResult): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: StreamingRecognitionResult, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a StreamingRecognitionResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
