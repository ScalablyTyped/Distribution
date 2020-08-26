package typings.egg.anon

import typings.egg.mod.Context
import typings.egg.mod.IgnoreItem
import typings.egg.mod.IgnoreOrMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enable extends js.Object {
  var enable: Boolean = js.native
  var enableTypes: js.Array[String] = js.native
  var encoding: String = js.native
  var extendTypes: Form = js.native
  var formLimit: String = js.native
  var ignore: IgnoreOrMatch = js.native
  var jsonLimit: String = js.native
  var `match`: IgnoreOrMatch = js.native
  var queryString: ArrayLimit = js.native
  var strict: Boolean = js.native
  var textLimit: String = js.native
}

object Enable {
  @scala.inline
  def apply(
    enable: Boolean,
    enableTypes: js.Array[String],
    encoding: String,
    extendTypes: Form,
    formLimit: String,
    ignore: IgnoreOrMatch,
    jsonLimit: String,
    `match`: IgnoreOrMatch,
    queryString: ArrayLimit,
    strict: Boolean,
    textLimit: String
  ): Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], enableTypes = enableTypes.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], extendTypes = extendTypes.asInstanceOf[js.Any], formLimit = formLimit.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], jsonLimit = jsonLimit.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], textLimit = textLimit.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
  @scala.inline
  implicit class EnableOps[Self <: Enable] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableTypesVarargs(value: String*): Self = this.set("enableTypes", js.Array(value :_*))
    @scala.inline
    def setEnableTypes(value: js.Array[String]): Self = this.set("enableTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendTypes(value: Form): Self = this.set("extendTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormLimit(value: String): Self = this.set("formLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreVarargs(value: IgnoreItem*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnoreFunction1(value: /* ctx */ Context => Boolean): Self = this.set("ignore", js.Any.fromFunction1(value))
    @scala.inline
    def setIgnore(value: IgnoreOrMatch): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsonLimit(value: String): Self = this.set("jsonLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchVarargs(value: IgnoreItem*): Self = this.set("match", js.Array(value :_*))
    @scala.inline
    def setMatchFunction1(value: /* ctx */ Context => Boolean): Self = this.set("match", js.Any.fromFunction1(value))
    @scala.inline
    def setMatch(value: IgnoreOrMatch): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryString(value: ArrayLimit): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextLimit(value: String): Self = this.set("textLimit", value.asInstanceOf[js.Any])
  }
  
}

