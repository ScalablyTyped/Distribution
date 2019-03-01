package typings
package expressDashWinstonLib.expressDashWinstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseErrorLoggerOptions extends js.Object {
  var baseMeta: js.UndefOr[js.Object] = js.undefined
  var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.undefined
  var level: js.UndefOr[java.lang.String | DynamicLevelFunction] = js.undefined
  var metaField: js.UndefOr[java.lang.String] = js.undefined
  var msg: js.UndefOr[java.lang.String] = js.undefined
  var requestFilter: js.UndefOr[RequestFilter] = js.undefined
  var requestWhitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object BaseErrorLoggerOptions {
  @scala.inline
  def apply(
    baseMeta: js.Object = null,
    dynamicMeta: DynamicMetaFunction = null,
    level: java.lang.String | DynamicLevelFunction = null,
    metaField: java.lang.String = null,
    msg: java.lang.String = null,
    requestFilter: RequestFilter = null,
    requestWhitelist: js.Array[java.lang.String] = null
  ): BaseErrorLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta)
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(dynamicMeta)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (metaField != null) __obj.updateDynamic("metaField")(metaField)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(requestFilter)
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist)
    __obj.asInstanceOf[BaseErrorLoggerOptions]
  }
}

