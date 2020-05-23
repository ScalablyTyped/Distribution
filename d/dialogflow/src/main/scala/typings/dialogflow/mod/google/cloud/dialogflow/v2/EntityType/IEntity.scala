package typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Entity. */
trait IEntity extends js.Object {
  /** Entity synonyms */
  var synonyms: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** Entity value */
  var value: js.UndefOr[String | Null] = js.undefined
}

object IEntity {
  @scala.inline
  def apply(
    synonyms: js.UndefOr[Null | js.Array[String]] = js.undefined,
    value: js.UndefOr[Null | String] = js.undefined
  ): IEntity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(synonyms)) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntity]
  }
}

