package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  def apply(entityValues: js.Array[String] = null, languageCode: String = null, parent: String = null): IBatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (entityValues != null) __obj.updateDynamic("entityValues")(entityValues)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IBatchDeleteEntitiesRequest]
  }
}

