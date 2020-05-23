package typings.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Csp extends js.Object {
  var csp: js.Any
  var csrf: js.Any
  var defaultMiddleware: String
  var domainWhiteList: js.Array[String]
  var hsts: js.Any
  var methodnoallow: EnableBoolean
  var noopen: EnableBoolean
  var protocolWhiteList: js.Array[String]
  var xframe: Value
  var xssProtection: js.Any
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
}

