package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.IAnswer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a KnowledgeAnswers. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeAnswers")
@js.native
/**
  * Constructs a new KnowledgeAnswers.
  * @param [properties] Properties to set
  */
class KnowledgeAnswers_ () extends IKnowledgeAnswers {
  def this(properties: IKnowledgeAnswers) = this()
  /** KnowledgeAnswers answers. */
  @JSName("answers")
  var answers_KnowledgeAnswers_ : js.Array[IAnswer] = js.native
  /**
    * Converts this KnowledgeAnswers to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

