package typings
package easyDashXDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clang extends js.Object {
  var clang: scala.Double
  var host_arch: java.lang.String
  var node_install_npm: scala.Boolean
  var node_install_waf: scala.Boolean
  var node_prefix: java.lang.String
  var node_shared_openssl: scala.Boolean
  var node_shared_v8: scala.Boolean
  var node_shared_zlib: scala.Boolean
  var node_use_dtrace: scala.Boolean
  var node_use_etw: scala.Boolean
  var node_use_openssl: scala.Boolean
  var target_arch: java.lang.String
  var v8_no_strict_aliasing: scala.Double
  var v8_use_snapshot: scala.Boolean
  var visibility: java.lang.String
}

object Anon_Clang {
  @scala.inline
  def apply(
    clang: scala.Double,
    host_arch: java.lang.String,
    node_install_npm: scala.Boolean,
    node_install_waf: scala.Boolean,
    node_prefix: java.lang.String,
    node_shared_openssl: scala.Boolean,
    node_shared_v8: scala.Boolean,
    node_shared_zlib: scala.Boolean,
    node_use_dtrace: scala.Boolean,
    node_use_etw: scala.Boolean,
    node_use_openssl: scala.Boolean,
    target_arch: java.lang.String,
    v8_no_strict_aliasing: scala.Double,
    v8_use_snapshot: scala.Boolean,
    visibility: java.lang.String
  ): Anon_Clang = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clang")(clang)
    __obj.updateDynamic("host_arch")(host_arch)
    __obj.updateDynamic("node_install_npm")(node_install_npm)
    __obj.updateDynamic("node_install_waf")(node_install_waf)
    __obj.updateDynamic("node_prefix")(node_prefix)
    __obj.updateDynamic("node_shared_openssl")(node_shared_openssl)
    __obj.updateDynamic("node_shared_v8")(node_shared_v8)
    __obj.updateDynamic("node_shared_zlib")(node_shared_zlib)
    __obj.updateDynamic("node_use_dtrace")(node_use_dtrace)
    __obj.updateDynamic("node_use_etw")(node_use_etw)
    __obj.updateDynamic("node_use_openssl")(node_use_openssl)
    __obj.updateDynamic("target_arch")(target_arch)
    __obj.updateDynamic("v8_no_strict_aliasing")(v8_no_strict_aliasing)
    __obj.updateDynamic("v8_use_snapshot")(v8_use_snapshot)
    __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[Anon_Clang]
  }
}

