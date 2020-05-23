package typings.expressWinston.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.logform.mod.Format_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLoggerOptionsWithTransports
  extends BaseErrorLoggerOptions
     with ErrorLoggerOptions {
  var transports: js.Array[typings.winstonTransport.mod.^]
}

object ErrorLoggerOptionsWithTransports {
  @scala.inline
  def apply(
    transports: js.Array[typings.winstonTransport.mod.^],
    baseMeta: js.Object = null,
    blacklistedMetaFields: js.Array[String] = null,
    dynamicMeta: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => js.Object = null,
    exceptionToMeta: /* err */ Error => js.Object = null,
    format: Format_ = null,
    headerBlacklist: js.Array[String] = null,
    level: String | DynamicLevelFunction = null,
    meta: js.UndefOr[Boolean] = js.undefined,
    metaField: String = null,
    msg: MessageTemplate = null,
    requestField: String = null,
    requestFilter: (/* req */ FilterRequest, /* propName */ String) => js.Any = null,
    requestWhitelist: js.Array[String] = null,
    responseField: String = null,
    skip: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => Boolean = null
  ): ErrorLoggerOptionsWithTransports = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    if (baseMeta != null) __obj.updateDynamic("baseMeta")(baseMeta.asInstanceOf[js.Any])
    if (blacklistedMetaFields != null) __obj.updateDynamic("blacklistedMetaFields")(blacklistedMetaFields.asInstanceOf[js.Any])
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(js.Any.fromFunction3(dynamicMeta))
    if (exceptionToMeta != null) __obj.updateDynamic("exceptionToMeta")(js.Any.fromFunction1(exceptionToMeta))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (headerBlacklist != null) __obj.updateDynamic("headerBlacklist")(headerBlacklist.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(meta)) __obj.updateDynamic("meta")(meta.get.asInstanceOf[js.Any])
    if (metaField != null) __obj.updateDynamic("metaField")(metaField.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (requestField != null) __obj.updateDynamic("requestField")(requestField.asInstanceOf[js.Any])
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(js.Any.fromFunction2(requestFilter))
    if (requestWhitelist != null) __obj.updateDynamic("requestWhitelist")(requestWhitelist.asInstanceOf[js.Any])
    if (responseField != null) __obj.updateDynamic("responseField")(responseField.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction3(skip))
    __obj.asInstanceOf[ErrorLoggerOptionsWithTransports]
  }
}

