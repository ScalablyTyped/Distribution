package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.IPart
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TrainingPhrase. */
trait ITrainingPhrase extends js.Object {
  /** TrainingPhrase name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** TrainingPhrase parts */
  var parts: js.UndefOr[js.Array[IPart] | Null] = js.undefined
  /** TrainingPhrase timesAddedCount */
  var timesAddedCount: js.UndefOr[Double | Null] = js.undefined
  /** TrainingPhrase type */
  var `type`: js.UndefOr[Type | Null] = js.undefined
}

object ITrainingPhrase {
  @scala.inline
  def apply(
    name: String = null,
    parts: js.Array[IPart] = null,
    timesAddedCount: Int | Double = null,
    `type`: Type = null
  ): ITrainingPhrase = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (parts != null) __obj.updateDynamic("parts")(parts)
    if (timesAddedCount != null) __obj.updateDynamic("timesAddedCount")(timesAddedCount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITrainingPhrase]
  }
}

