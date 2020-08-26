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

@js.native
trait BaseLoggerOptions extends js.Object {
  var baseMeta: js.UndefOr[js.Object] = js.native
  var bodyBlacklist: js.UndefOr[js.Array[String]] = js.native
  var bodyWhitelist: js.UndefOr[js.Array[String]] = js.native
  var colorize: js.UndefOr[Boolean] = js.native
  var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.native
  var expressFormat: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[Format_] = js.native
  var headerBlacklist: js.UndefOr[js.Array[String]] = js.native
  var ignoreRoute: js.UndefOr[RouteFilter] = js.native
  var ignoredRoutes: js.UndefOr[js.Array[String]] = js.native
  var level: js.UndefOr[String | DynamicLevelFunction] = js.native
  var meta: js.UndefOr[Boolean] = js.native
  var metaField: js.UndefOr[String] = js.native
  var msg: js.UndefOr[MessageTemplate] = js.native
  var requestField: js.UndefOr[String] = js.native
  var requestFilter: js.UndefOr[RequestFilter] = js.native
  var requestWhitelist: js.UndefOr[js.Array[String]] = js.native
  var responseField: js.UndefOr[String] = js.native
  var responseFilter: js.UndefOr[ResponseFilter] = js.native
  var responseWhitelist: js.UndefOr[js.Array[String]] = js.native
  var skip: js.UndefOr[RouteFilter] = js.native
  var statusLevels: js.UndefOr[Boolean | StatusLevels] = js.native
}

object BaseLoggerOptions {
  @scala.inline
  def apply(): BaseLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLoggerOptions]
  }
  @scala.inline
  implicit class BaseLoggerOptionsOps[Self <: BaseLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseMeta(value: js.Object): Self = this.set("baseMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseMeta: Self = this.set("baseMeta", js.undefined)
    @scala.inline
    def setBodyBlacklistVarargs(value: String*): Self = this.set("bodyBlacklist", js.Array(value :_*))
    @scala.inline
    def setBodyBlacklist(value: js.Array[String]): Self = this.set("bodyBlacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyBlacklist: Self = this.set("bodyBlacklist", js.undefined)
    @scala.inline
    def setBodyWhitelistVarargs(value: String*): Self = this.set("bodyWhitelist", js.Array(value :_*))
    @scala.inline
    def setBodyWhitelist(value: js.Array[String]): Self = this.set("bodyWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyWhitelist: Self = this.set("bodyWhitelist", js.undefined)
    @scala.inline
    def setColorize(value: Boolean): Self = this.set("colorize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorize: Self = this.set("colorize", js.undefined)
    @scala.inline
    def setDynamicMeta(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => js.Object
    ): Self = this.set("dynamicMeta", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDynamicMeta: Self = this.set("dynamicMeta", js.undefined)
    @scala.inline
    def setExpressFormat(value: Boolean): Self = this.set("expressFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressFormat: Self = this.set("expressFormat", js.undefined)
    @scala.inline
    def setFormat(value: Format_): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeaderBlacklistVarargs(value: String*): Self = this.set("headerBlacklist", js.Array(value :_*))
    @scala.inline
    def setHeaderBlacklist(value: js.Array[String]): Self = this.set("headerBlacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBlacklist: Self = this.set("headerBlacklist", js.undefined)
    @scala.inline
    def setIgnoreRoute(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = this.set("ignoreRoute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIgnoreRoute: Self = this.set("ignoreRoute", js.undefined)
    @scala.inline
    def setIgnoredRoutesVarargs(value: String*): Self = this.set("ignoredRoutes", js.Array(value :_*))
    @scala.inline
    def setIgnoredRoutes(value: js.Array[String]): Self = this.set("ignoredRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoredRoutes: Self = this.set("ignoredRoutes", js.undefined)
    @scala.inline
    def setLevelFunction3(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => String
    ): Self = this.set("level", js.Any.fromFunction3(value))
    @scala.inline
    def setLevel(value: String | DynamicLevelFunction): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMeta(value: Boolean): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setMetaField(value: String): Self = this.set("metaField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaField: Self = this.set("metaField", js.undefined)
    @scala.inline
    def setMsgFunction2(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = this.set("msg", js.Any.fromFunction2(value))
    @scala.inline
    def setMsg(value: MessageTemplate): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    @scala.inline
    def setRequestField(value: String): Self = this.set("requestField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestField: Self = this.set("requestField", js.undefined)
    @scala.inline
    def setRequestFilter(value: (/* req */ FilterRequest, /* propName */ String) => js.Any): Self = this.set("requestFilter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRequestFilter: Self = this.set("requestFilter", js.undefined)
    @scala.inline
    def setRequestWhitelistVarargs(value: String*): Self = this.set("requestWhitelist", js.Array(value :_*))
    @scala.inline
    def setRequestWhitelist(value: js.Array[String]): Self = this.set("requestWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestWhitelist: Self = this.set("requestWhitelist", js.undefined)
    @scala.inline
    def setResponseField(value: String): Self = this.set("responseField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseField: Self = this.set("responseField", js.undefined)
    @scala.inline
    def setResponseFilter(value: (/* res */ FilterResponse, /* propName */ String) => js.Any): Self = this.set("responseFilter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponseFilter: Self = this.set("responseFilter", js.undefined)
    @scala.inline
    def setResponseWhitelistVarargs(value: String*): Self = this.set("responseWhitelist", js.Array(value :_*))
    @scala.inline
    def setResponseWhitelist(value: js.Array[String]): Self = this.set("responseWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseWhitelist: Self = this.set("responseWhitelist", js.undefined)
    @scala.inline
    def setSkip(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = this.set("skip", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setStatusLevels(value: Boolean | StatusLevels): Self = this.set("statusLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusLevels: Self = this.set("statusLevels", js.undefined)
  }
  
}

