package typings.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Csp extends js.Object {
  var csp: js.Any = js.native
  var csrf: js.Any = js.native
  var defaultMiddleware: String = js.native
  var domainWhiteList: js.Array[String] = js.native
  var hsts: js.Any = js.native
  var methodnoallow: EnableBoolean = js.native
  var noopen: EnableBoolean = js.native
  var protocolWhiteList: js.Array[String] = js.native
  var xframe: Value = js.native
  var xssProtection: js.Any = js.native
}

object Csp {
  @scala.inline
  def apply(
    csp: js.Any,
    csrf: js.Any,
    defaultMiddleware: String,
    domainWhiteList: js.Array[String],
    hsts: js.Any,
    methodnoallow: EnableBoolean,
    noopen: EnableBoolean,
    protocolWhiteList: js.Array[String],
    xframe: Value,
    xssProtection: js.Any
  ): Csp = {
    val __obj = js.Dynamic.literal(csp = csp.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], defaultMiddleware = defaultMiddleware.asInstanceOf[js.Any], domainWhiteList = domainWhiteList.asInstanceOf[js.Any], hsts = hsts.asInstanceOf[js.Any], methodnoallow = methodnoallow.asInstanceOf[js.Any], noopen = noopen.asInstanceOf[js.Any], protocolWhiteList = protocolWhiteList.asInstanceOf[js.Any], xframe = xframe.asInstanceOf[js.Any], xssProtection = xssProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Csp]
  }
  @scala.inline
  implicit class CspOps[Self <: Csp] (val x: Self) extends AnyVal {
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
    def setCsp(value: js.Any): Self = this.set("csp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCsrf(value: js.Any): Self = this.set("csrf", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultMiddleware(value: String): Self = this.set("defaultMiddleware", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainWhiteListVarargs(value: String*): Self = this.set("domainWhiteList", js.Array(value :_*))
    @scala.inline
    def setDomainWhiteList(value: js.Array[String]): Self = this.set("domainWhiteList", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsts(value: js.Any): Self = this.set("hsts", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodnoallow(value: EnableBoolean): Self = this.set("methodnoallow", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoopen(value: EnableBoolean): Self = this.set("noopen", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolWhiteListVarargs(value: String*): Self = this.set("protocolWhiteList", js.Array(value :_*))
    @scala.inline
    def setProtocolWhiteList(value: js.Array[String]): Self = this.set("protocolWhiteList", value.asInstanceOf[js.Any])
    @scala.inline
    def setXframe(value: Value): Self = this.set("xframe", value.asInstanceOf[js.Any])
    @scala.inline
    def setXssProtection(value: js.Any): Self = this.set("xssProtection", value.asInstanceOf[js.Any])
  }
  
}

