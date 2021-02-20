package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.IAnswer
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a KnowledgeAnswers. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers")
@js.native
/**
  * Constructs a new KnowledgeAnswers.
  * @param [properties] Properties to set
  */
class KnowledgeAnswers () extends IKnowledgeAnswers {
  def this(properties: IKnowledgeAnswers) = this()
  
  /** KnowledgeAnswers answers. */
  @JSName("answers")
  var answers_KnowledgeAnswers: js.Array[IAnswer] = js.native
  
  /**
    * Converts this KnowledgeAnswers to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object KnowledgeAnswers {
  
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
    var matchConfidenceLevel_Answer: MatchConfidenceLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel * / any */ String) = js.native
    
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
  object Answer {
    
    @js.native
    sealed trait MatchConfidenceLevel extends StObject
    /** MatchConfidenceLevel enum. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel")
    @js.native
    object MatchConfidenceLevel extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[MatchConfidenceLevel with Double] = js.native
      
      @js.native
      sealed trait HIGH extends MatchConfidenceLevel
      /* 3 */ val HIGH: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel.HIGH with Double = js.native
      
      @js.native
      sealed trait LOW extends MatchConfidenceLevel
      /* 1 */ val LOW: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel.LOW with Double = js.native
      
      @js.native
      sealed trait MATCH_CONFIDENCE_LEVEL_UNSPECIFIED extends MatchConfidenceLevel
      /* 0 */ val MATCH_CONFIDENCE_LEVEL_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel.MATCH_CONFIDENCE_LEVEL_UNSPECIFIED with Double = js.native
      
      @js.native
      sealed trait MEDIUM extends MatchConfidenceLevel
      /* 2 */ val MEDIUM: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel.MEDIUM with Double = js.native
    }
    
    /**
      * Creates a new Answer instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Answer instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.create")
    @js.native
    def create(): Answer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.create")
    @js.native
    def create(properties: IAnswer): Answer = js.native
    
    /**
      * Decodes an Answer message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Answer
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.decode")
    @js.native
    def decode(reader: Reader): Answer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.decode")
    @js.native
    def decode(reader: Reader, length: Double): Answer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.decode")
    @js.native
    def decode(reader: Uint8Array): Answer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Answer = js.native
    
    /**
      * Decodes an Answer message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Answer
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Answer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Answer = js.native
    
    /**
      * Encodes the specified Answer message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.verify|verify} messages.
      * @param message Answer message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.encode")
    @js.native
    def encode(message: IAnswer): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.encode")
    @js.native
    def encode(message: IAnswer, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Answer message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.verify|verify} messages.
      * @param message Answer message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAnswer): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAnswer, writer: Writer): Writer = js.native
    
    /**
      * Creates an Answer message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Answer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Answer = js.native
    
    /**
      * Creates a plain object from an Answer message. Also converts values to other types if specified.
      * @param message Answer
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.toObject")
    @js.native
    def toObject(message: Answer): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.toObject")
    @js.native
    def toObject(message: Answer, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Answer message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new KnowledgeAnswers instance using the specified properties.
    * @param [properties] Properties to set
    * @returns KnowledgeAnswers instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.create")
  @js.native
  def create(): KnowledgeAnswers = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.create")
  @js.native
  def create(properties: IKnowledgeAnswers): KnowledgeAnswers = js.native
  
  /**
    * Decodes a KnowledgeAnswers message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns KnowledgeAnswers
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.decode")
  @js.native
  def decode(reader: Reader): KnowledgeAnswers = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.decode")
  @js.native
  def decode(reader: Reader, length: Double): KnowledgeAnswers = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.decode")
  @js.native
  def decode(reader: Uint8Array): KnowledgeAnswers = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): KnowledgeAnswers = js.native
  
  /**
    * Decodes a KnowledgeAnswers message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns KnowledgeAnswers
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): KnowledgeAnswers = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): KnowledgeAnswers = js.native
  
  /**
    * Encodes the specified KnowledgeAnswers message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeAnswers.verify|verify} messages.
    * @param message KnowledgeAnswers message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.encode")
  @js.native
  def encode(message: IKnowledgeAnswers): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.encode")
  @js.native
  def encode(message: IKnowledgeAnswers, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified KnowledgeAnswers message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeAnswers.verify|verify} messages.
    * @param message KnowledgeAnswers message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.encodeDelimited")
  @js.native
  def encodeDelimited(message: IKnowledgeAnswers): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.encodeDelimited")
  @js.native
  def encodeDelimited(message: IKnowledgeAnswers, writer: Writer): Writer = js.native
  
  /**
    * Creates a KnowledgeAnswers message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns KnowledgeAnswers
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): KnowledgeAnswers = js.native
  
  /**
    * Creates a plain object from a KnowledgeAnswers message. Also converts values to other types if specified.
    * @param message KnowledgeAnswers
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.toObject")
  @js.native
  def toObject(message: KnowledgeAnswers): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.toObject")
  @js.native
  def toObject(message: KnowledgeAnswers, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a KnowledgeAnswers message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of an Answer. */
  @js.native
  trait IAnswer extends StObject {
    
    /** Answer answer */
    var answer: js.UndefOr[String | Null] = js.native
    
    /** Answer faqQuestion */
    var faqQuestion: js.UndefOr[String | Null] = js.native
    
    /** Answer matchConfidence */
    var matchConfidence: js.UndefOr[Double | Null] = js.native
    
    /** Answer matchConfidenceLevel */
    var matchConfidenceLevel: js.UndefOr[
        MatchConfidenceLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel * / any */ String) | Null
      ] = js.native
    
    /** Answer source */
    var source: js.UndefOr[String | Null] = js.native
  }
  object IAnswer {
    
    @scala.inline
    def apply(): IAnswer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnswer]
    }
    
    @scala.inline
    implicit class IAnswerMutableBuilder[Self <: IAnswer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnswerNull: Self = StObject.set(x, "answer", null)
      
      @scala.inline
      def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
      
      @scala.inline
      def setFaqQuestion(value: String): Self = StObject.set(x, "faqQuestion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaqQuestionNull: Self = StObject.set(x, "faqQuestion", null)
      
      @scala.inline
      def setFaqQuestionUndefined: Self = StObject.set(x, "faqQuestion", js.undefined)
      
      @scala.inline
      def setMatchConfidence(value: Double): Self = StObject.set(x, "matchConfidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchConfidenceLevel(
        value: MatchConfidenceLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel * / any */ String)
      ): Self = StObject.set(x, "matchConfidenceLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchConfidenceLevelNull: Self = StObject.set(x, "matchConfidenceLevel", null)
      
      @scala.inline
      def setMatchConfidenceLevelUndefined: Self = StObject.set(x, "matchConfidenceLevel", js.undefined)
      
      @scala.inline
      def setMatchConfidenceNull: Self = StObject.set(x, "matchConfidence", null)
      
      @scala.inline
      def setMatchConfidenceUndefined: Self = StObject.set(x, "matchConfidence", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNull: Self = StObject.set(x, "source", null)
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
