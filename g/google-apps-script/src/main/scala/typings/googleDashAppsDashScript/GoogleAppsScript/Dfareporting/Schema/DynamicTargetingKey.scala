package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKey extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var objectType: js.UndefOr[String] = js.undefined
}

object DynamicTargetingKey {
  @scala.inline
  def apply(kind: String = null, name: String = null, objectId: String = null, objectType: String = null): DynamicTargetingKey = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    __obj.asInstanceOf[DynamicTargetingKey]
  }
}

