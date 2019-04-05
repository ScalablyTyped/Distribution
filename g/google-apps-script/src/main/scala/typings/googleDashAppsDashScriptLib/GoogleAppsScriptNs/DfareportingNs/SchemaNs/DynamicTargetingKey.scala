package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKey extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var objectType: js.UndefOr[java.lang.String] = js.undefined
}

object DynamicTargetingKey {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    name: java.lang.String = null,
    objectId: java.lang.String = null,
    objectType: java.lang.String = null
  ): DynamicTargetingKey = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    __obj.asInstanceOf[DynamicTargetingKey]
  }
}

