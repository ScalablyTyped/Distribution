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
trait BaseErrorLoggerOptions extends js.Object {
  var baseMeta: js.UndefOr[js.Object] = js.native
  var blacklistedMetaFields: js.UndefOr[js.Array[String]] = js.native
  var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.native
  var exceptionToMeta: js.UndefOr[ExceptionToMetaFunction] = js.native
  var format: js.UndefOr[Format_] = js.native
  var headerBlacklist: js.UndefOr[js.Array[String]] = js.native
  var level: js.UndefOr[String | DynamicLevelFunction] = js.native
  var meta: js.UndefOr[Boolean] = js.native
  var metaField: js.UndefOr[String] = js.native
  var msg: js.UndefOr[MessageTemplate] = js.native
  var requestField: js.UndefOr[String] = js.native
  var requestFilter: js.UndefOr[RequestFilter] = js.native
  var requestWhitelist: js.UndefOr[js.Array[String]] = js.native
  var responseField: js.UndefOr[String] = js.native
  var skip: js.UndefOr[ErrorRouteFilter] = js.native
}

object BaseErrorLoggerOptions {
  @scala.inline
  def apply(): BaseErrorLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseErrorLoggerOptions]
  }
  @scala.inline
  implicit class BaseErrorLoggerOptionsOps[Self <: BaseErrorLoggerOptions] (val x: Self) extends AnyVal {
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
    def setBlacklistedMetaFieldsVarargs(value: String*): Self = this.set("blacklistedMetaFields", js.Array(value :_*))
    @scala.inline
    def setBlacklistedMetaFields(value: js.Array[String]): Self = this.set("blacklistedMetaFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklistedMetaFields: Self = this.set("blacklistedMetaFields", js.undefined)
    @scala.inline
    def setDynamicMeta(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => js.Object
    ): Self = this.set("dynamicMeta", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDynamicMeta: Self = this.set("dynamicMeta", js.undefined)
    @scala.inline
    def setExceptionToMeta(value: /* err */ Error => js.Object): Self = this.set("exceptionToMeta", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExceptionToMeta: Self = this.set("exceptionToMeta", js.undefined)
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
    def setSkip(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => Boolean
    ): Self = this.set("skip", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
  
}

