package typings.expressWinston.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressWinston.AnonError
import typings.logform.mod.Format_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptionsWithTransports
  extends BaseLoggerOptions
     with LoggerOptions {
  var transports: js.Array[typings.winstonTransport.mod.^]
}

object LoggerOptionsWithTransports {
  @scala.inline
  def apply(
    transports: js.Array[typings.winstonTransport.mod.^],
    baseMeta: js.Object = null,
    bodyBlacklist: js.Array[String] = null,
    bodyWhitelist: js.Array[String] = null,
    colorize: js.UndefOr[Boolean] = js.undefined,
    dynamicMeta: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => js.Object = null,
    expressFormat: js.UndefOr[Boolean] = js.undefined,
    format: Format_ = null,
    headerBlacklist: js.Array[String] = null,
    ignoreRoute: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean = null,
    ignoredRoutes: js.Array[String] = null,
    level: String | DynamicLevelFunction = null,
    meta: js.UndefOr[Boolean] = js.undefined,
    metaField: String = null,
    msg: MessageTemplate = null,
    requestField: String = null,
    requestFilter: (/* req */ FilterRequest, /* propName */ String) => js.Any = null,
    requestWhitelist: js.Array[String] = null,
    responseField: String = null,
    responseFilter: (/* res */ FilterResponse, /* propName */ String) => js.Any = null,
    responseWhitelist: js.Array[String] = null,
    skip: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean = null,
    statusLevels: AnonError = null
  ): LoggerOptionsWithTransports = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta.asInstanceOf[js.Any])
    if (bodyBlacklist != null) __obj.updateDynamic("bodyBlacklist")(bodyBlacklist.asInstanceOf[js.Any])
    if (bodyWhitelist != null) __obj.updateDynamic("bodyWhitelist")(bodyWhitelist.asInstanceOf[js.Any])
    if (!js.isUndefined(colorize)) __obj.updateDynamic("colorize")(colorize.asInstanceOf[js.Any])
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(js.Any.fromFunction3(dynamicMeta))
    if (!js.isUndefined(expressFormat)) __obj.updateDynamic("expressFormat")(expressFormat.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (headerBlacklist != null) __obj.updateDynamic("headerBlacklist")(headerBlacklist.asInstanceOf[js.Any])
    if (ignoreRoute != null) __obj.updateDynamic("ignoreRoute")(js.Any.fromFunction2(ignoreRoute))
    if (ignoredRoutes != null) __obj.updateDynamic("ignoredRoutes")(ignoredRoutes.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(meta)) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (metaField != null) __obj.updateDynamic("metaField")(metaField.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (requestField != null) __obj.updateDynamic("requestField")(requestField.asInstanceOf[js.Any])
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(js.Any.fromFunction2(requestFilter))
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist.asInstanceOf[js.Any])
    if (responseField != null) __obj.updateDynamic("responseField")(responseField.asInstanceOf[js.Any])
    if (responseFilter != null) __obj.updateDynamic("responseFilter")(js.Any.fromFunction2(responseFilter))
    if (responseWhitelist != null) __obj.updateDynamic("responseWhitelist")(responseWhitelist.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction2(skip))
    if (statusLevels != null) __obj.updateDynamic("statusLevels")(statusLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptionsWithTransports]
  }
}

