package typings
package easyDashXapiDashSupertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ares extends js.Object {
  var ares: java.lang.String
  var http_parser: java.lang.String
  var node: java.lang.String
  var openssl: java.lang.String
  var uv: java.lang.String
  var v8: java.lang.String
  var zlib: java.lang.String
}

object Anon_Ares {
  @scala.inline
  def apply(
    ares: java.lang.String,
    http_parser: java.lang.String,
    node: java.lang.String,
    openssl: java.lang.String,
    uv: java.lang.String,
    v8: java.lang.String,
    zlib: java.lang.String
  ): Anon_Ares = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ares")(ares)
    __obj.updateDynamic("http_parser")(http_parser)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("openssl")(openssl)
    __obj.updateDynamic("uv")(uv)
    __obj.updateDynamic("v8")(v8)
    __obj.updateDynamic("zlib")(zlib)
    __obj.asInstanceOf[Anon_Ares]
  }
}

