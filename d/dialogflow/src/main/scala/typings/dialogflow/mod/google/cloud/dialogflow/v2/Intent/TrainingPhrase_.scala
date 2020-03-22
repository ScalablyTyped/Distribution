package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.IPart
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TrainingPhrase. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase")
@js.native
/**
  * Constructs a new TrainingPhrase.
  * @param [properties] Properties to set
  */
class TrainingPhrase_ () extends ITrainingPhrase {
  def this(properties: ITrainingPhrase) = this()
  /** TrainingPhrase name. */
  @JSName("name")
  var name_TrainingPhrase_ : String = js.native
  /** TrainingPhrase parts. */
  @JSName("parts")
  var parts_TrainingPhrase_ : js.Array[IPart] = js.native
  /** TrainingPhrase timesAddedCount. */
  @JSName("timesAddedCount")
  var timesAddedCount_TrainingPhrase_ : Double = js.native
  /** TrainingPhrase type. */
  @JSName("type")
  var type_TrainingPhrase_ : Type | String = js.native
  /**
    * Converts this TrainingPhrase to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

