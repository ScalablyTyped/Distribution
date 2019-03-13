package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Csp extends js.Object {
  var csp: js.Any
  var csrf: js.Any
  var defaultMiddleware: java.lang.String
  var domainWhiteList: js.Array[java.lang.String]
  var hsts: js.Any
  var methodnoallow: Anon_EnableBoolean
  var noopen: Anon_EnableBoolean
  var protocolWhiteList: js.Array[java.lang.String]
  var xframe: Anon_ALLOWFROM
  var xssProtection: js.Any
}

object Anon_Csp {
  @scala.inline
  def apply(
    csp: js.Any,
    csrf: js.Any,
    defaultMiddleware: java.lang.String,
    domainWhiteList: js.Array[java.lang.String],
    hsts: js.Any,
    methodnoallow: Anon_EnableBoolean,
    noopen: Anon_EnableBoolean,
    protocolWhiteList: js.Array[java.lang.String],
    xframe: Anon_ALLOWFROM,
    xssProtection: js.Any
  ): Anon_Csp = {
    val __obj = js.Dynamic.literal(csp = csp, csrf = csrf, defaultMiddleware = defaultMiddleware, domainWhiteList = domainWhiteList, hsts = hsts, methodnoallow = methodnoallow, noopen = noopen, protocolWhiteList = protocolWhiteList, xframe = xframe, xssProtection = xssProtection)
  
    __obj.asInstanceOf[Anon_Csp]
  }
}

