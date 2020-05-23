package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.IPart
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type
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
  var `type`: js.UndefOr[
    Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type * / any */ String) | Null
  ] = js.undefined
}

object ITrainingPhrase {
  @scala.inline
  def apply(
    name: js.UndefOr[Null | String] = js.undefined,
    parts: js.UndefOr[Null | js.Array[IPart]] = js.undefined,
    timesAddedCount: js.UndefOr[Null | Double] = js.undefined,
    `type`: js.UndefOr[
      Null | Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type * / any */ String)
    ] = js.undefined
  ): ITrainingPhrase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(parts)) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (!js.isUndefined(timesAddedCount)) __obj.updateDynamic("timesAddedCount")(timesAddedCount.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrainingPhrase]
  }
}

