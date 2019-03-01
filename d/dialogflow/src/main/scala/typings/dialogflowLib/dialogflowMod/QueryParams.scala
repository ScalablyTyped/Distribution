package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParams extends js.Object {
  var contexts: js.UndefOr[js.Array[Context[java.lang.String, _]]] = js.undefined
  var geoLocation: js.UndefOr[LatLong] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var resetContexts: js.UndefOr[scala.Boolean] = js.undefined
  var sessionEntityTypes: js.UndefOr[js.Array[SessionEntityType]] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object QueryParams {
  @scala.inline
  def apply(
    contexts: js.Array[Context[java.lang.String, _]] = null,
    geoLocation: LatLong = null,
    payload: js.Any = null,
    resetContexts: js.UndefOr[scala.Boolean] = js.undefined,
    sessionEntityTypes: js.Array[SessionEntityType] = null,
    timeZone: java.lang.String = null
  ): QueryParams = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (geoLocation != null) __obj.updateDynamic("geoLocation")(geoLocation)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (!js.isUndefined(resetContexts)) __obj.updateDynamic("resetContexts")(resetContexts)
    if (sessionEntityTypes != null) __obj.updateDynamic("sessionEntityTypes")(sessionEntityTypes)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[QueryParams]
  }
}

