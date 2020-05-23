package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchDeleteEntitiesRequest. */
trait IBatchDeleteEntitiesRequest extends js.Object {
  /** BatchDeleteEntitiesRequest entityValues */
  var entityValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** BatchDeleteEntitiesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** BatchDeleteEntitiesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IBatchDeleteEntitiesRequest {
  @scala.inline
  def apply(
    entityValues: js.UndefOr[Null | js.Array[String]] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IBatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entityValues)) __obj.updateDynamic("entityValues")(entityValues.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchDeleteEntitiesRequest]
  }
}

