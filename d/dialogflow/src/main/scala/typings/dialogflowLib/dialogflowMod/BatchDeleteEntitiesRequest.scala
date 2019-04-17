package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteEntitiesRequest extends js.Object {
  var entityValues: js.Array[java.lang.String]
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var parent: java.lang.String
}

object BatchDeleteEntitiesRequest {
  @scala.inline
  def apply(
    entityValues: js.Array[java.lang.String],
    parent: java.lang.String,
    languageCode: java.lang.String = null
  ): BatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal(entityValues = entityValues, parent = parent)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[BatchDeleteEntitiesRequest]
  }
}

