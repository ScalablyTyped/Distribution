package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreateEntitiesRequest extends js.Object {
  var entities: js.Array[Entity]
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var parent: java.lang.String
}

object BatchCreateEntitiesRequest {
  @scala.inline
  def apply(entities: js.Array[Entity], parent: java.lang.String, languageCode: java.lang.String = null): BatchCreateEntitiesRequest = {
    val __obj = js.Dynamic.literal(entities = entities, parent = parent)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[BatchCreateEntitiesRequest]
  }
}

