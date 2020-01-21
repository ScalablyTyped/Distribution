package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Answer. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer")
@js.native
/**
  * Constructs a new Answer.
  * @param [properties] Properties to set
  */
class Answer () extends IAnswer {
  def this(properties: IAnswer) = this()
  /** Answer answer. */
  @JSName("answer")
  var answer_Answer: String = js.native
  /** Answer faqQuestion. */
  @JSName("faqQuestion")
  var faqQuestion_Answer: String = js.native
  /** Answer matchConfidenceLevel. */
  @JSName("matchConfidenceLevel")
  var matchConfidenceLevel_Answer: MatchConfidenceLevel = js.native
  /** Answer matchConfidence. */
  @JSName("matchConfidence")
  var matchConfidence_Answer: Double = js.native
  /** Answer source. */
  @JSName("source")
  var source_Answer: String = js.native
  /**
    * Converts this Answer to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer")
@js.native
object Answer extends js.Object {
  @js.native
  sealed trait MatchConfidenceLevel extends js.Object
  
  /**
    * Creates a new Answer instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Answer instance
    */
  def create(): Answer = js.native
  def create(properties: IAnswer): Answer = js.native
  /**
    * Decodes an Answer message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Answer
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Answer = js.native
  def decode(reader: Reader, length: Double): Answer = js.native
  def decode(reader: Uint8Array): Answer = js.native
  def decode(reader: Uint8Array, length: Double): Answer = js.native
  /**
    * Decodes an Answer message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Answer
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Answer = js.native
  def decodeDelimited(reader: Uint8Array): Answer = js.native
  /**
    * Encodes the specified Answer message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.verify|verify} messages.
    * @param message Answer message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IAnswer): Writer = js.native
  def encode(message: IAnswer, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Answer message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.verify|verify} messages.
    * @param message Answer message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IAnswer): Writer = js.native
  def encodeDelimited(message: IAnswer, writer: Writer): Writer = js.native
  /**
    * Creates an Answer message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Answer
    */
  def fromObject(`object`: StringDictionary[js.Any]): Answer = js.native
  /**
    * Creates a plain object from an Answer message. Also converts values to other types if specified.
    * @param message Answer
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Answer): StringDictionary[js.Any] = js.native
  def toObject(message: Answer, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Answer message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** MatchConfidenceLevel enum. */
  @js.native
  object MatchConfidenceLevel extends js.Object {
    @js.native
    sealed trait HIGH extends MatchConfidenceLevel
    
    @js.native
    sealed trait LOW extends MatchConfidenceLevel
    
    @js.native
    sealed trait MATCH_CONFIDENCE_LEVEL_UNSPECIFIED extends MatchConfidenceLevel
    
    @js.native
    sealed trait MEDIUM extends MatchConfidenceLevel
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MatchConfidenceLevel with Double] = js.native
    /* 3 */ @js.native
    object HIGH extends TopLevel[HIGH with Double]
    
    /* 1 */ @js.native
    object LOW extends TopLevel[LOW with Double]
    
    /* 0 */ @js.native
    object MATCH_CONFIDENCE_LEVEL_UNSPECIFIED extends TopLevel[MATCH_CONFIDENCE_LEVEL_UNSPECIFIED with Double]
    
    /* 2 */ @js.native
    object MEDIUM extends TopLevel[MEDIUM with Double]
    
  }
  
}

