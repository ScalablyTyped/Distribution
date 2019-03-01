package typings
package expressDashWinstonLib.expressDashWinstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLoggerOptionsWithWinstonInstance
  extends BaseErrorLoggerOptions
     with ErrorLoggerOptions {
  var winstonInstance: winstonLib.winstonMod.winstonNs.Logger
}

object ErrorLoggerOptionsWithWinstonInstance {
  @scala.inline
  def apply(
    winstonInstance: winstonLib.winstonMod.winstonNs.Logger,
    baseMeta: js.Object = null,
    dynamicMeta: DynamicMetaFunction = null,
    level: java.lang.String | DynamicLevelFunction = null,
    metaField: java.lang.String = null,
    msg: java.lang.String = null,
    requestFilter: RequestFilter = null,
    requestWhitelist: js.Array[java.lang.String] = null
  ): ErrorLoggerOptionsWithWinstonInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("winstonInstance")(winstonInstance)
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta)
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(dynamicMeta)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (metaField != null) __obj.updateDynamic("metaField")(metaField)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(requestFilter)
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist)
    __obj.asInstanceOf[ErrorLoggerOptionsWithWinstonInstance]
  }
}

