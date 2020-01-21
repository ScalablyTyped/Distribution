package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EntityTypeBatch. */
trait IEntityTypeBatch extends js.Object {
  /** EntityTypeBatch entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.undefined
}

object IEntityTypeBatch {
  @scala.inline
  def apply(entityTypes: js.Array[IEntityType] = null): IEntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityTypeBatch]
  }
}

